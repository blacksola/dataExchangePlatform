package com.ajie.wechat.service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ccccltd.webservice.design.contract.SjxmjhtVO;
import cn.ccccltd.webservice.design.monthreport.ReturnMessage;
import cn.ccccltd.webservice.design.monthreport.ScsjybVO;
import cn.ccccltd.webservice.design.monthreport.SjxmzxfdVO;
import cn.ccccltd.webservice.design.monthreport.SjxmzxfdWs;
import net.sf.json.JSONObject;

import com.ajie.wechat.dao.CommonDao;

@Service
@Transactional
public class SjMonthReportService {
	
	@Autowired
    private CommonDao commondao;
	
	/**
	 * 设计月报信息接口同步
	 */
	
	public String sjMonthReportIntegrate(String recid,String actiontype,ApplicationContext ctx){
		String sql = "select * from jt_sj_monthreport where sjmonthreportid = '"+recid+"'";
		List<SjxmzxfdVO> sjmonthreport = (List<SjxmzxfdVO>) commondao.queryListEntity(sql, null, SjxmzxfdVO.class);
		List<ScsjybVO> scsjybs = (List<ScsjybVO>)commondao.queryListEntity(sql, null, ScsjybVO.class);
		
		SjxmzxfdWs  client = (SjxmzxfdWs)ctx.getBean("sjmonthreportclient");
		ReturnMessage returnmessage = null;
		if("add".equals(actiontype)){
			if(sjmonthreport != null && sjmonthreport.size()>0){
				SjxmzxfdVO monthReportInfo = sjmonthreport.get(0);
				//关联表
				if(scsjybs != null && scsjybs.size()>0){
					ScsjybVO scsjyb = scsjybs.get(0);
					//服务端合同ID
//					String htsql = "select * from jt_sj_project_contract where cxmid="+scsjyb.getChtid();
//					List<SjxmjhtVO> sjvos = (List<SjxmjhtVO>)commondao.queryListEntity(htsql, null, SjxmjhtVO.class);
//					if(sjvos != null && sjvos.size()>0){
//						scsjyb.setHtid(sjvos.get(0).getRecid());
//					}else {
						scsjyb.setHtid(monthReportInfo.getSjxmzx001001f());
//					}
					monthReportInfo.setScsjyb(scsjyb);
				}
				
				
				returnmessage = client.addMonthReport(monthReportInfo);
			}
		}else if("update".equals(actiontype)){
			if(sjmonthreport != null && sjmonthreport.size()>0){
				SjxmzxfdVO monthReportInfo = sjmonthreport.get(0);
				if(scsjybs != null && scsjybs.size()>0){
					ScsjybVO scsjyb = scsjybs.get(0);
					//服务端合同ID
//					String htsql = "select * from jt_sj_project_contract where cxmid="+scsjyb.getChtid();
//					List<SjxmjhtVO> sjvos = (List<SjxmjhtVO>)commondao.queryListEntity(htsql, null, SjxmjhtVO.class);
//					if(sjvos != null && sjvos.size()>0){
//						scsjyb.setHtid(sjvos.get(0).getRecid());
//						scsjyb.setYbid(monthReportInfo.getRecid());
//					}
					scsjyb.setHtid(monthReportInfo.getSjxmzx001001f());
					scsjyb.setYbid(monthReportInfo.getRecid());
					monthReportInfo.setScsjyb(scsjyb);
				}
				returnmessage = client.updateMonthReport(monthReportInfo);
			}
		}
		//得到的对象 存到返回数据里面 用于存到日志表
        returnmessage.setReturnInitData(sjmonthreport);
        System.out.println("message:"+returnmessage.getMessage());
        System.out.println("statuscod:"+returnmessage.getStatusCode());
        System.out.println("resultlist:"+returnmessage.getResultList());
        JSONObject jsonObject = JSONObject.fromObject(returnmessage);
		String resultstr = "";
        try {
        	resultstr = URLEncoder.encode(jsonObject.toString(),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        return resultstr;
	}
}
