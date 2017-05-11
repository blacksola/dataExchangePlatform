package com.ajie.wechat.service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ccccltd.webservice.construction.contract.GhxmjhtVO;
import cn.ccccltd.webservice.construction.monthreport.GhxmzxfdVO;
import cn.ccccltd.webservice.construction.monthreport.GhxmzxfdWs;
import cn.ccccltd.webservice.construction.monthreport.ReturnMessage;
import cn.ccccltd.webservice.construction.monthreport.ScghybVO;
import cn.ccccltd.webservice.design.contract.SjxmjhtVO;
import cn.ccccltd.webservice.design.monthreport.ScsjybVO;
import net.sf.json.JSONObject;

import com.ajie.wechat.dao.CommonDao;

@Service
@Transactional
public class SgMonthReportService {
	
	@Autowired
    private CommonDao commondao;
	/**
	 * 施工月报信息接口同步
	 */
	public String sgMonthReportIntegrate(String recid,String actiontype,ApplicationContext ctx){
		String sql = "select * from jt_sg_monthreport where sgmonthreportid = '"+recid+"'";
		List<GhxmzxfdVO> ghmonthreport = (List<GhxmzxfdVO>) commondao.queryListEntity(sql, null, GhxmzxfdVO.class);
		List<ScghybVO> scghybs = (List<ScghybVO>) commondao.queryListEntity(sql, null, ScghybVO.class);
		
		GhxmzxfdWs  client = (GhxmzxfdWs)ctx.getBean("sgmonthreportclient");
		ReturnMessage returnmessage = null;
		if("add".equals(actiontype)){
			if(ghmonthreport != null && ghmonthreport.size()>0){
				GhxmzxfdVO monthReportInfo = ghmonthreport.get(0);
				if(scghybs != null && scghybs.size()>0){
					ScghybVO scghyb = scghybs.get(0);
					//服务端合同ID
//					String htsql = "select * from jt_sg_project_contract where cxmid="+scghyb.getChtid();
//					List<GhxmjhtVO> sjvos = (List<GhxmjhtVO>)commondao.queryListEntity(htsql, null, GhxmjhtVO.class);
//					if(sjvos != null && sjvos.size()>0){
//						scghyb.setHtid(sjvos.get(0).getRecid());
//					}
					scghyb.setHtid(monthReportInfo.getGhxmzx001001f());
					monthReportInfo.setScghyb(scghyb);
				}
				returnmessage = client.addMonthReport(monthReportInfo);
			}
		}else if("update".equals(actiontype)){
			if(ghmonthreport != null && ghmonthreport.size()>0){
				GhxmzxfdVO monthReportInfo = ghmonthreport.get(0);
				if(scghybs != null && scghybs.size()>0){
					ScghybVO scghyb = scghybs.get(0);
					//服务端合同ID
//					String htsql = "select * from jt_sg_project_contract where cxmid="+scghyb.getChtid();
//					List<GhxmjhtVO> sjvos = (List<GhxmjhtVO>)commondao.queryListEntity(htsql, null, GhxmjhtVO.class);
//					if(sjvos != null && sjvos.size()>0){
//						scghyb.setHtid(sjvos.get(0).getRecid());
//						scghyb.setYbid(monthReportInfo.getRecid());
//					}
					scghyb.setHtid(monthReportInfo.getGhxmzx001001f());
					scghyb.setYbid(monthReportInfo.getRecid());
					monthReportInfo.setScghyb(scghyb);
				}
				returnmessage = client.updateMonthReport(monthReportInfo);
			}
		}
		//得到的对象 存到返回数据里面 用于存到日志表
        returnmessage.setReturnInitData(ghmonthreport);
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
