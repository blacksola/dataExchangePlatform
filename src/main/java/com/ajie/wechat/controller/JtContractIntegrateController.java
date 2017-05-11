package com.ajie.wechat.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ccccltd.webservice.construction.contract.GhxmjhtVO;
import cn.ccccltd.webservice.construction.contract.GhxmjhtWs;
import cn.ccccltd.webservice.construction.contract.HwxmbxVO;
import cn.ccccltd.webservice.construction.contractchange.SgbghtVO;
import cn.ccccltd.webservice.construction.contractchange.SgbghtWs;
import cn.ccccltd.webservice.construction.marketinfo.Ghscgzjzbzb;
import cn.ccccltd.webservice.construction.marketinfo.GhscxxVO;
import cn.ccccltd.webservice.construction.marketinfo.GhscxxWs;
import cn.ccccltd.webservice.construction.projectbaseinfo.GhscgzjzbVO;
import cn.ccccltd.webservice.construction.projectbaseinfo.GhscgzjzbWs;
import cn.ccccltd.webservice.construction.projectbaseinfo.ReturnMessage;
import cn.ccccltd.webservice.design.contract.HwxmbcxxVO;
import cn.ccccltd.webservice.design.contract.SjxmjhtVO;
import cn.ccccltd.webservice.design.contract.SjxmjhtWs;
import cn.ccccltd.webservice.design.contractchange.SjbghtVO;
import cn.ccccltd.webservice.design.contractchange.SjbghtWs;
import cn.ccccltd.webservice.design.marketinfo.SjscgzjzbzbVO;
import cn.ccccltd.webservice.design.marketinfo.SjscxxVO;
import cn.ccccltd.webservice.design.marketinfo.SjscxxWs;
import cn.ccccltd.webservice.design.projectbaseinfo.SjscgzjzbVO;
import cn.ccccltd.webservice.design.projectbaseinfo.SjscgzjzbWs;
import cn.ccccltd.webservice.other.contractchange.QtbghtVO;
import cn.ccccltd.webservice.other.contractchange.QtbghtWs;
import cn.ccccltd.webservice.other.projectbaseinfo.QtlxmVO;
import cn.ccccltd.webservice.other.projectbaseinfo.QtlxmWs;

import com.ajie.wechat.dao.CommonDao;
import com.ajie.wechat.model.GroupContractInfo;
import com.ajie.wechat.model.JTContract;
import com.ajie.wechat.model.JtDict;
import com.ajie.wechat.model.JtOtherCompanyBid;
import com.ajie.wechat.model.JtProjectInsurance;
import com.ajie.wechat.service.JTContractService;
import com.ajie.wechat.service.JtDictService;
import com.ajie.wechat.service.QtMonthReportService;
import com.ajie.wechat.service.SgMonthReportService;
import com.ajie.wechat.service.SjMonthReportService;
import com.ajie.wechat.util.DateUtil;
import com.ajie.wechat.util.JtConstant;
import com.ajie.wechat.util.KettleUtil;

@Controller
@RequestMapping(value = "/integrate")
public class JtContractIntegrateController {
	
	private final Log logger = LogFactory.getLog(JtContractIntegrateController.class);
	
	@Autowired
    private CommonDao commondao;
	@Autowired
	private JTContractService jtservice;
	@Autowired
	private SgMonthReportService sgmonthreportservice;
	@Autowired
	private SjMonthReportService sjmonthreportservice;
	@Autowired
	private QtMonthReportService qtmonthreportservice;
	@Autowired
	private JtDictService jtdictservice;
	
	/**
	 * 根据服务端合同编号查询服务端合同信息
	 * @Title: queryContractByCode   
	 * @Description: 
	 * @param grouptype
	 * @param contractcode
	 * @return
	 */
	@RequestMapping(value = "/querycontractbycode/{grouptype}/{contractcode}",method = RequestMethod.GET)
	public @ResponseBody String queryContractByCode(@PathVariable String grouptype,@PathVariable String contractcode){
		String resultstr = JtConstant.FAILURE_CODE;
		try {
			System.out.println(URLDecoder.decode(contractcode, "UTF-8"));
			contractcode = URLDecoder.decode(contractcode, "UTF-8");
			ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:cxf-Security.xml"); 
			List<GroupContractInfo> groupContracts = new ArrayList<GroupContractInfo>();
			ObjectMapper mapper = new ObjectMapper(); 
			if (JtConstant.DESIGN_PROJECT_TYPE.equals(grouptype)){//设计
				SjxmjhtWs client = (SjxmjhtWs)ctx.getBean("sjcontractclient");
				cn.ccccltd.webservice.design.contract.ReturnMessage returnMessage = client.queryContractInfoByContractCode(contractcode);
				if (returnMessage != null && returnMessage.getResultList() != null && returnMessage.getResultList().size() > 0) {
					for (cn.ccccltd.webservice.design.contract.VoSupport voSupprt : returnMessage.getResultList()) {
						SjxmjhtVO vo = (SjxmjhtVO) voSupprt;
						GroupContractInfo groupContract = new GroupContractInfo();
						groupContract.setGroupContractId(vo.getRecid());
						groupContract.setGroupContractCode(URLEncoder.encode(vo.getHtbh(), "UTF-8"));
						groupContract.setGroupContractName(URLEncoder.encode(vo.getHtmc(), "UTF-8"));
						groupContract.setGroupContractType(JtConstant.DESIGN_PROJECT_TYPE);
						groupContract.setGroupProjectId(vo.getZbxmmc());
						groupContract.setGroupMarketId(vo.getZbxmmc());
						groupContracts.add(groupContract);
					}
				}
			} else if (JtConstant.CONSTRUCTION_PROJECT_TYPE.equals(grouptype)){//施工
				GhxmjhtWs client = (GhxmjhtWs)ctx.getBean("sgcontractclient");
				cn.ccccltd.webservice.construction.contract.ReturnMessage returnMessage = client.queryContractInfoByContractCode(contractcode);
				if (returnMessage != null && returnMessage.getResultList() != null && returnMessage.getResultList().size() > 0) {
					for (cn.ccccltd.webservice.construction.contract.VoSupport voSupprt : returnMessage.getResultList()) {
						GhxmjhtVO vo = (GhxmjhtVO) voSupprt;
						GroupContractInfo groupContract = new GroupContractInfo();
						groupContract.setGroupContractId(vo.getRecid());
						groupContract.setGroupContractCode(URLEncoder.encode(vo.getHtbh(), "UTF-8"));
						groupContract.setGroupContractName(URLEncoder.encode(vo.getHtmc(), "UTF-8"));
						groupContract.setGroupContractType(JtConstant.CONSTRUCTION_PROJECT_TYPE);
						groupContract.setGroupProjectId(vo.getZbxmmcn());
						groupContract.setGroupMarketId(vo.getZbxmmcn());
						groupContracts.add(groupContract);
					}
				}
			} else if (JtConstant.OTHER_PROJECT_TYPE.equals(grouptype)){//其它
				QtlxmWs client = (QtlxmWs)ctx.getBean("qtbasecontractclient");
				cn.ccccltd.webservice.other.projectbaseinfo.ReturnMessage returnMessage = client.queryContractInfoByContractCode(contractcode);;
				if (returnMessage != null && returnMessage.getResultList() != null && returnMessage.getResultList().size() > 0) {
					for (cn.ccccltd.webservice.other.projectbaseinfo.VoSupport voSupprt : returnMessage.getResultList()) {
						QtlxmVO vo = (QtlxmVO) voSupprt;
						GroupContractInfo groupContract = new GroupContractInfo();
						groupContract.setGroupContractId(vo.getRecid());
						groupContract.setGroupContractCode(URLEncoder.encode(vo.getHtbh(), "UTF-8"));
						groupContract.setGroupContractName(URLEncoder.encode(vo.getHtmc(), "UTF-8"));
						groupContract.setGroupContractType(JtConstant.OTHER_PROJECT_TYPE);
						groupContract.setGroupProjectId(vo.getRecid());
						groupContract.setGroupMarketId(vo.getRecid());
						groupContracts.add(groupContract);
					}
				}
			}
			resultstr = mapper.writeValueAsString(groupContracts);
		} catch (Exception e) {
			logger.error(e.getMessage());
			resultstr = new StringBuffer(resultstr).append(",").append(e.getMessage()).toString();
		}
		
		return resultstr;
	}
	
	/**
	 * 初始化服务端合同关联表
	 * @Title: queryContractByCode   
	 * @Description: 
	 * @param xmid
	 * @param htid
	 * @param scgzid
	 * @param cxmid
	 * @param chtid
	 * @param cscgzid
	 * @return
	 */
	@RequestMapping(value = "/initsccontract/{grouptype}/{xmid}/{htid}/{scgzid}/{cxmid}/{chtid}/{cscgzid}",method = RequestMethod.GET)
	public @ResponseBody String queryContractByCode(@PathVariable String xmid, @PathVariable String grouptype, @PathVariable String htid
			,@PathVariable String scgzid, @PathVariable String cxmid, @PathVariable String chtid, @PathVariable String cscgzid){
		String resultstr = JtConstant.FAILURE_CODE;
		if (xmid == null || "".equals(xmid.trim()) || "null".equals(xmid) || "0".equals(xmid)) {
			xmid = "";
		}
		if (htid == null || "".equals(htid.trim()) || "null".equals(htid) || "0".equals(htid)) {
			htid = "";
		}
		if (scgzid == null || "".equals(scgzid.trim()) || "null".equals(scgzid) || "0".equals(scgzid)) {
			scgzid = "";
		}
		if (cxmid == null || "".equals(cxmid.trim()) || "null".equals(cxmid) || "0".equals(cxmid)) {
			cxmid = "";
		}
		if (chtid == null || "".equals(chtid.trim()) || "null".equals(chtid) || "0".equals(chtid)) {
			chtid = "";
		}
		if (cscgzid == null || "".equals(cscgzid.trim()) || "null".equals(cscgzid) || "0".equals(cscgzid)) {
			cscgzid = "";
		}
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:cxf-Security.xml");
			if (JtConstant.DESIGN_PROJECT_TYPE.equals(grouptype)){//设计
				SjxmjhtWs client = (SjxmjhtWs)ctx.getBean("sjcontractclient");
				cn.ccccltd.webservice.design.contract.ReturnMessage returnMessage = client.updateContractScInfo(xmid, htid, scgzid, cxmid, chtid, cscgzid);
				if (returnMessage != null) {
					resultstr = new StringBuffer(returnMessage.getStatusCode()).append(",").append(returnMessage.getMessage()).toString();
				}
			} else if (JtConstant.CONSTRUCTION_PROJECT_TYPE.equals(grouptype)){//施工
				GhxmjhtWs client = (GhxmjhtWs)ctx.getBean("sgcontractclient");
				cn.ccccltd.webservice.construction.contract.ReturnMessage returnMessage = client.updateContractScInfo(xmid, htid, scgzid, cxmid, chtid, cscgzid);
				if (returnMessage != null) {
					resultstr = new StringBuffer(returnMessage.getStatusCode()).append(",").append(returnMessage.getMessage()).toString();
				}
			} else if (JtConstant.OTHER_PROJECT_TYPE.equals(grouptype)){//其它
				QtlxmWs client = (QtlxmWs)ctx.getBean("qtbasecontractclient");
				cn.ccccltd.webservice.other.projectbaseinfo.ReturnMessage returnMessage = client.updateContractScInfo(xmid, cxmid);
				if (returnMessage != null) {
					resultstr = new StringBuffer(returnMessage.getStatusCode()).append(",").append(returnMessage.getMessage()).toString();
				}
			}
			
		} catch (Exception e) {
			logger.error(e.getMessage());
			resultstr = new StringBuffer(resultstr).append(",").append(e.getMessage()).toString();
		}
		
		return resultstr;		
	}
	
	@RequestMapping(value = "/jtcontractdelete/{baserecid}/{contractrecid}/{grouptype}",method = RequestMethod.GET)
	public @ResponseBody String jtContractDelete(@PathVariable String baserecid,@PathVariable String contractrecid
			,@PathVariable String grouptype){
		String renstr = "SUCCESS";
		String rencode = "";
		//id为空直接返回删除失败
		if(baserecid == null || "".equals(baserecid) || contractrecid == null || "".equals(contractrecid)){
			return "REPEAT";
		}
		
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:cxf-Security.xml");
			GhscgzjzbWs sgclient = (GhscgzjzbWs)ctx.getBean("sgbaseclient");
			SjscgzjzbWs sjclient = (SjscgzjzbWs)ctx.getBean("sjbaseclient");
			QtlxmWs qtclient = (QtlxmWs)ctx.getBean("qtbasecontractclient");
			if("1".equals(grouptype)){
				cn.ccccltd.webservice.design.projectbaseinfo.ReturnMessage returnMessage = 
						sjclient.deleteProjectAndContract(baserecid, contractrecid);
				rencode = returnMessage.getStatusCode();
			}else if("2".equals(grouptype)){
				ReturnMessage returnMessage = 
						sgclient.deleteProjectAndContract(baserecid, contractrecid);
				rencode = returnMessage.getStatusCode();
			}else if("4".equals(grouptype)){
				cn.ccccltd.webservice.other.projectbaseinfo.ReturnMessage returnMessage = 
						qtclient.deleteProject(baserecid);
				rencode = returnMessage.getStatusCode();
			}
		} catch (Exception e) {
			logger.error(e.getLocalizedMessage());
			return "REPEAT";
		}
		if("2".equals(rencode)){
			renstr = "REPEAT";
		}
		return renstr;
	}
	
	/**
	 * 合同同步中间服务器kettle调用
	 * @param grouptype
	 * @param jtcontractid
	 * @return
	 */
	@RequestMapping(value = "/jtkettle/{grouptype}/{jtcontractid}/{actiontype}",method = RequestMethod.GET)
	public @ResponseBody String jtKettleIntegrate(@PathVariable String grouptype,@PathVariable String jtcontractid,
			@PathVariable String actiontype){
		logger.info("合同同步开始...");
		//返回结果
		String resultstr = "1";//成功
		String jobpath = "";
		
		//集团数据同步，kettle调用
		if(grouptype.equals("1")){//设计类项目
			if("add".equals(actiontype)){//增加
				jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "sjsyncjobpath_add");
			}else{//更新
				jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "sjsyncjobpath_update");
//				if("base".equals(type)){//基本信息
//					jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "sjsyncjobpath_update_base");					
//				}else if("market".equals(type)){//市场信息
//					jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "sjsyncjobpath_update_market");	
//				}else if("contract".equals(type)){//合同信息
//					jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "sjsyncjobpath_update_contract");
//				}
			}			
		}else if(grouptype.equals("2")){//施工类项目
			if("add".equals(actiontype)){//增加
				jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "sgsyncjobpath_add");
			}else{//更新
				jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "sgsyncjobpath_update");
//				if("base".equals(type)){//基本信息
//					jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "sgsyncjobpath_update_base");				
//				}else if("market".equals(type)){//市场信息
//					jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "sgsyncjobpath_update_market");
//				}else if("contract".equals(type)){//合同信息
//					jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "sgsyncjobpath_update_contract");
//				}
			}			
		}else if(grouptype.equals("4")){//其它类项目
			if("add".equals(actiontype)){//增加
				jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "qtsyncjobpath_add");
			}else{//更新
				jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "qtsyncjobpath_update");
			}
		}
		
		//kettle执行
		try {			
			Map<String,String> paramap = new HashMap<String,String>();
			
			paramap.put("jtcontractid", jtcontractid);
			paramap.put("sendTime",KettleUtil.getDate());
			KettleUtil.runJob(jobpath,paramap);
		} catch (Exception e) {
			resultstr = "2";//同步失败
			logger.error(e.getLocalizedMessage());
		}
		logger.info("resultstr:"+resultstr);
		return resultstr;
	}
	
	/**
	 * 集团合同同步webservice调用
	 * @param recid
	 * @param grouptype
	 * @param datatype
	 * @param actiontype
	 * @return
	 */
	@RequestMapping(value = "/intdata/{recid}/{grouptype}/{datatype}/{actiontype}",method = RequestMethod.GET)
    public @ResponseBody String jtIntegrateAdd(@PathVariable String recid,@PathVariable String grouptype
    		,@PathVariable String datatype,@PathVariable String actiontype){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:cxf-Security.xml");  
        String resultstr = "";
        //合同信息上报
		if(grouptype.equals("1")){//设计类项目
			if(datatype.equals("base")){//基本信息
				resultstr = sjBaseIntegrate(recid,actiontype,ctx);
			}else if(datatype.equals("market")){//市场信息
				resultstr = sjMarketIntegrate(recid,actiontype,ctx);
			}else if(datatype.equals("contract")){//合同信息
				resultstr = sjContractIntegrate(recid,actiontype,ctx);
			}else if(datatype.equals("monthreport")){//月报信息
				resultstr = sjmonthreportservice.sjMonthReportIntegrate(recid, actiontype, ctx);
			}
		}else if(grouptype.equals("2")){//施工类项目
			if(datatype.equals("base")){//基本信息
				resultstr = sgBaseIntegrate(recid,actiontype,ctx);
			}else if(datatype.equals("market")){//市场信息
				resultstr = sgMarketIntegrate(recid,actiontype,ctx);
			}else if(datatype.equals("contract")){//合同信息
				resultstr = sgContractIntegrate(recid,actiontype,ctx);
			}else if(datatype.equals("monthreport")){//月报信息
				resultstr = sgmonthreportservice.sgMonthReportIntegrate(recid, actiontype, ctx);
			}
		}else if(grouptype.equals("4")){//其它类项目
			if(datatype.equals("base")){//基本信息和合同信息
				resultstr = qtBaseAndContractIntegrate(recid,actiontype,ctx);//其它类基本信息及合同信息
			}else if(datatype.equals("monthreport")){//月报信息
				resultstr = qtmonthreportservice.qtMonthReportIntegrate(recid, actiontype, ctx);
			}
		}
        System.out.println(resultstr);
        return resultstr;
    }
	
	/**
	 * 集团信息查询接口
	 * @param grouptype
	 * @param recid
	 * @param zzjg
	 * @param baserecid
	 * @param contractrecid
	 * @return
	 */
	@RequestMapping(value = "/contractquery/{grouptype}/{zzjg}/{baserecid}/{contractrecid}/{contractid}/{jtcontractid}/{bidcompanyid}/{contractinsuraceid}",method = RequestMethod.GET)
    public @ResponseBody String jtIntegrateQuery(@PathVariable String grouptype,@PathVariable String zzjg
    		,@PathVariable String baserecid,@PathVariable String contractrecid
    		,@PathVariable String contractid,@PathVariable String jtcontractid
    		,@PathVariable String bidcompanyid,@PathVariable String contractinsuraceid){
		logger.info("grouptype:"+grouptype+"  zzjg:"+zzjg+"  baserecid:"+baserecid+"  contractrecid:"+contractrecid);
		String resultstr = "1";//同步成功
		//其它投标、保险数量初始化
		int otherbidnum = 0;int insurancenum = 0;
		
		JTContract jt = new JTContract();
		//设置合同ID
		if(contractid != null && !"".equals(contractid)){
			jt.setContractid(Integer.parseInt(contractid));
		}
		if(jtcontractid != null && !"".equals(jtcontractid)){
			jt.setJtcontractid(Long.parseLong(jtcontractid));
		}
		
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:cxf-Security.xml");
			//合同信息查询录入
			if(grouptype.equals("1")){//设计类基本信息
				sjProjectBaseQuery(zzjg, baserecid, ctx, jt);
				sjMarketBaseQuery(zzjg, baserecid, ctx, jt,Integer.parseInt(bidcompanyid));
				sjcontractBaseQuery(zzjg, contractrecid, ctx, jt,Integer.parseInt(contractinsuraceid));
				
			}else if(grouptype.equals("2")){//施工类基本型
				sgProjectBaseQuery(zzjg, baserecid, ctx, jt);
				sgMarketBaseQuery(zzjg, baserecid, ctx, jt,Integer.parseInt(bidcompanyid));
				sgContractBaseQuery(zzjg, contractrecid, ctx, jt,Integer.parseInt(contractinsuraceid));
				
			}else if(grouptype.equals("4")){//其它类基本信息
				qtProjectBaseQuery(zzjg, baserecid, ctx, jt);
			}
			
			//删除中间表jtcontract数据
			String sql = "delete from jt_contract where jt_contract_id= '" + jt.getJtcontractid() + "'";
			commondao.excuteBySql(sql);
			//删除中间表jt_other_company_bid数据
			String otherbidsql = "delete from jt_other_company_bid where cxmid= '" + jt.getJtcontractid()+ "'";
			commondao.excuteBySql(otherbidsql);
			//删除中间表jt_project_insurance数据
			String insurancesql = "delete from jt_project_insurance where chtid= '" + jt.getJtcontractid()+ "'";
			commondao.excuteBySql(insurancesql);
			
			//获取其它投标、保险信息，并取其它投标、保险信息的数量
			List<JtOtherCompanyBid> otherbids = jt.getJtothercompanybids();
			if(otherbids != null && otherbids.size()>0){
				otherbidnum = otherbids.size();
			}
			List<JtProjectInsurance> projectinsurances = jt.getProjectinsurances();
			if(projectinsurances != null && projectinsurances.size()>0){
				insurancenum = projectinsurances.size();
			}
			//集团数据初始化
			jtcontractInit(jt);
			
			//jtcontract合同数据录入,并返回主键
			String jtcid = jtservice.add(jt);
			//kettle调用把数据录入到生产经营库
			String jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "contractqueryjobpath");
			Map<String, String> paramap = new HashMap<String,String>();
			paramap.put("jtcontractid", jtcid);
			KettleUtil.runJob(jobpath,paramap);
			
		} catch (Exception e) {
			e.printStackTrace();
			resultstr = "2"+","+otherbidnum+","+insurancenum;//同步失败
		}
		logger.info("中间服务器返回值:"+resultstr);
		return resultstr+","+otherbidnum+","+insurancenum;
    }
	
	/**
	 * 集团合同数据初始化
	 * @param jt
	 */
	private void jtcontractInit(JTContract jt){
		
		//设置同步状态为已同步
		jt.setBasestatus("3");
		jt.setTrackstatus("3");
		jt.setContractstatus("3");
		//设置合同统计年、月
		
		//设置业主单位的名称
		JtDict jtdict = null;
		if(jt.getGroupcontracttype() == 1){
			jtdict = jtdictservice.getdictByTypeAndId("SJYZ",jt.getCustomerid());
		}else if(jt.getGroupcontracttype() == 2){
			jtdict = jtdictservice.getdictByTypeAndId("GHYZ",jt.getCustomerid());
		}else if(jt.getGroupcontracttype() == 4){
			jtdict = jtdictservice.getdictByTypeAndId("GHYZ",jt.getCustomerid());
		}
		if(jtdict != null){
			jt.setCustomername(jtdict.getDictname());
		}
		//设置设计单位的名称
		JtDict jtdictsjdw = null;
		if(jt.getGroupcontracttype() == 1){
//			jtdictsjdw = jtdictservice.getdictByTypeAndId("GHSJDW",jt.getDesigncompanyid());
		}else if(jt.getGroupcontracttype() == 2){
			jtdictsjdw = jtdictservice.getdictByTypeAndId("GHSJDW",jt.getDesigncompanyid());
		}
		if(jtdictsjdw != null){
			jt.setDesigncompanyname(jtdictsjdw.getDictname());
		}
		
		//设置关联投资公司的名称
		JtDict jtdictgl = null;
		jtdictgl = jtdictservice.getdictByTypeAndId("GLTZXMGS",jt.getRelationinvestprojectcompany());
		if(jtdictgl != null){
			jt.setRelationinvestprojectcompanyname(jtdictgl.getDictname());
		}
		
	}
	
	/**
	 * 合同变更信息同步
	 * @param grouptype
	 * @param jtcontractid
	 * @return
	 */
	@RequestMapping(value = "/contractchange/{grouptype}/{changeid}",method = RequestMethod.GET)
	public @ResponseBody String jtContractChange(@PathVariable String grouptype,@PathVariable String changeid){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:cxf-Security.xml");
		String resultstr = "";
		if(grouptype.equals("1")){//设计类基本信息
			resultstr = sjContractChage(changeid,ctx);
		}else if(grouptype.equals("2")){//施工类基本型
			resultstr = sgContractChage(changeid,ctx);
		}else if(grouptype.equals("4")){//其它类基本信息
			resultstr = qtContractChage(changeid,ctx);
		}
		
		return resultstr;
	}
	
	/**
	 * 施工合同变更同步
	 * @param jtcontractid
	 * @return
	 */
	private String sgContractChage(String sgchangeid,ApplicationContext ctx){
		SgbghtWs client = (SgbghtWs)ctx.getBean("sgcontractchangeclient");
		cn.ccccltd.webservice.construction.contractchange.ReturnMessage returnmessage = null;
		String sql = "select * from jt_sg_contract_change where sgchangeid="+sgchangeid;
		List<SgbghtVO> sgbgs = (List<SgbghtVO>)commondao.queryListEntity(sql, null, SgbghtVO.class);
		if(sgbgs != null && sgbgs.size()>0){
			SgbghtVO sgbghtvo = sgbgs.get(0);
			returnmessage = client.addContractChange(sgbghtvo);
			//得到的对象 存到返回数据里面 用于存到日志表
	        returnmessage.setReturnInitData(sgbgs);
		}
		JSONObject jsonObject = JSONObject.fromObject(returnmessage);
		String resultstr = "";
        try {
        	resultstr = URLEncoder.encode(jsonObject.toString(),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return resultstr;
	}
	
	/**
	 * 设计合同变更同步
	 * @param jtcontractid
	 * @return
	 */
	private String sjContractChage(String sjchangeid,ApplicationContext ctx){
		SjbghtWs client = (SjbghtWs)ctx.getBean("sjcontractchangeclient");
		cn.ccccltd.webservice.design.contractchange.ReturnMessage returnmessage = null;
		String sql = "select * from jt_sj_contract_change where sjchangeid="+sjchangeid;
		List<SjbghtVO> sbgs = (List<SjbghtVO>)commondao.queryListEntity(sql, null, SjbghtVO.class);
		if(sbgs != null && sbgs.size()>0){
			SjbghtVO sjbghtvo = sbgs.get(0);
			returnmessage = client.addContractChange(sjbghtvo);
			//得到的对象 存到返回数据里面 用于存到日志表
	        returnmessage.setReturnInitData(sbgs);
		}
		JSONObject jsonObject = JSONObject.fromObject(returnmessage);
		String resultstr = "";
        try {
        	resultstr = URLEncoder.encode(jsonObject.toString(),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return resultstr;
	}
	
	/**
	 * 其它合同变更同步
	 * @param jtcontractid
	 * @return
	 */
	private String qtContractChage(String qtchangeid,ApplicationContext ctx){
		QtbghtWs client = (QtbghtWs)ctx.getBean("qtcontractchangeclient");
		cn.ccccltd.webservice.other.contractchange.ReturnMessage returnmessage = null;
		String sql = "select * from jt_qt_contract_change where qtchangeid="+qtchangeid;
		List<QtbghtVO> qtbgs = (List<QtbghtVO>)commondao.queryListEntity(sql, null, QtbghtVO.class);
		if(qtbgs != null && qtbgs.size()>0){
			QtbghtVO qtbghtvo = qtbgs.get(0);
			returnmessage = client.addContractChange(qtbghtvo);
			//得到的对象 存到返回数据里面 用于存到日志表
	        returnmessage.setReturnInitData(qtbgs);
		}
		JSONObject jsonObject = JSONObject.fromObject(returnmessage);
		String resultstr = "";
        try {
        	resultstr = URLEncoder.encode(jsonObject.toString(),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return resultstr;
	}
	
	
	/**
	 * 施工基本信息接口同步
	 * @param recid
	 * @return
	 */
	private String sgBaseIntegrate(String sgbaseid,String actiontype,ApplicationContext ctx){
		GhscgzjzbWs client = (GhscgzjzbWs)ctx.getBean("sgbaseclient");
		System.out.println("sgbaseid:"+sgbaseid);
		ReturnMessage returnmessage = null;
		if("add".equals(actiontype)){//施工基本信息增加接口
	        String sql = "select * from jt_sg_project_base where sgbaseid="+sgbaseid;
	        List<GhscgzjzbVO> ghbases = (List<GhscgzjzbVO>) commondao.queryListEntity(sql, null, GhscgzjzbVO.class);
	        if(ghbases != null && ghbases.size()>0){
	        	GhscgzjzbVO projectBaseInfo = ghbases.get(0);
	        	//客户端设置项目阶段为“合同已签”
//	        	projectBaseInfo.setXmzt("446D01A3E0000001CC2C00EA2626720C");
	        	System.out.println("stdname:"+projectBaseInfo.getStdname());
	        	returnmessage = client.addBaseInfo(projectBaseInfo);
	        	//得到的对象 存到返回数据里面 用于存到日志表
		        returnmessage.setReturnInitData(ghbases);
	            System.out.println("message:"+returnmessage.getMessage());
	            System.out.println("statuscod:"+returnmessage.getStatusCode());
	            System.out.println("resultlist:"+returnmessage.getResultList());
	        }
	        
		}else if("update".equals(actiontype)){//施工基本信息更新接口
			String sql = "select * from jt_sg_project_base where sgbaseid="+sgbaseid;
	        List<GhscgzjzbVO> ghbases = (List<GhscgzjzbVO>) commondao.queryListEntity(sql, null, GhscgzjzbVO.class);
	        if(ghbases != null && ghbases.size()>0){
	        	GhscgzjzbVO projectBaseInfo = ghbases.get(0);
	        	System.out.println("stdname:"+projectBaseInfo.getStdname());
	        	returnmessage = client.updateBaseInfo(projectBaseInfo);
	        	//得到的对象 存到返回数据里面 用于存到日志表
		        returnmessage.setReturnInitData(ghbases);
	            System.out.println("message:"+returnmessage.getMessage());
	            System.out.println("statuscod:"+returnmessage.getStatusCode());
	            System.out.println("resultlist:"+returnmessage.getResultList());
	        }
		}
		
		JSONObject jsonObject = JSONObject.fromObject(returnmessage);
		String resultstr = "";
        try {
        	resultstr = URLEncoder.encode(jsonObject.toString(),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        logger.info("同步信息:");
        logger.info(jsonObject.toString());
        logger.info(resultstr);
        return resultstr;
	}
	
	/**
	 * 施工市场信息接口同步
	 * @param recid
	 * @return
	 */
	private String sgMarketIntegrate(String recid,String actiontype,ApplicationContext ctx){
		GhscxxWs client = (GhscxxWs)ctx.getBean("sgmarketclient");
		System.out.println("recid:"+recid);
		cn.ccccltd.webservice.construction.marketinfo.ReturnMessage returnmessage = null;
		//查询市场信息关联的其它投标信息
		String qitbsql = "select * from jt_other_company_bid where trackrecid="+recid;
    	List<Ghscgzjzbzb> zbzbs = (List<Ghscgzjzbzb>) commondao.queryListEntity(qitbsql, null, Ghscgzjzbzb.class);
		
		if("add".equals(actiontype)){//施工市场信息增加接口
	        String sql = "select * from jt_sg_project_track where sgtrackid="+recid;
	        List<GhscxxVO> ghbases = (List<GhscxxVO>) commondao.queryListEntity(sql, null, GhscxxVO.class);
	        if(ghbases != null && ghbases.size()>0){
	        	GhscxxVO projectMarketInfo = ghbases.get(0);
	        	if(zbzbs != null && zbzbs.size()>0){
	        		projectMarketInfo.setOtherBidList(zbzbs);
	        	}
	        	//日期格式转换
	        	DateFormat format1= new SimpleDateFormat("yyyy-MM-dd");
	        	DateFormat format= new SimpleDateFormat("dd-MM月-yy hh.mm.ss.SSSS a");
	        	try {
	        		if(projectMarketInfo.getKsgzsj() != null && !"".equals(projectMarketInfo.getKsgzsj())){
	        			projectMarketInfo.setKsgzsj(dateUtil(format.format(format1.parse(projectMarketInfo.getKsgzsj()))));
	        		}
	        		if(projectMarketInfo.getZsrq() != null && !"".equals(projectMarketInfo.getZsrq())){
	        			projectMarketInfo.setZsrq(dateUtil(format.format(format1.parse(projectMarketInfo.getZsrq()))));
	        		}
	        		if(projectMarketInfo.getZbrqi() != null && !"".equals(projectMarketInfo.getZbrqi())){
	        			projectMarketInfo.setZbrqi(dateUtil(format.format(format1.parse(projectMarketInfo.getZbrqi()))));
	        		}
	        		if(projectMarketInfo.getZbjzrq() != null && !"".equals(projectMarketInfo.getZbjzrq())){
	        			projectMarketInfo.setZbjzrq(dateUtil(format.format(format1.parse(projectMarketInfo.getZbjzrq()))));
	        		}
	        		if(projectMarketInfo.getTbrq() != null && !"".equals(projectMarketInfo.getTbrq())){
	        			projectMarketInfo.setTbrq(dateUtil(format.format(format1.parse(projectMarketInfo.getTbrq()))));
	        		}
	        		if(projectMarketInfo.getZbrq() != null && !"".equals(projectMarketInfo.getZbrq())){
	        			projectMarketInfo.setZbrq(dateUtil(format.format(format1.parse(projectMarketInfo.getZbrq()))));
	        		}
	        	} catch (Exception e) {
					e.printStackTrace();
				}
	        	
	        	returnmessage = client.addMarketInfo(projectMarketInfo);
	        	//得到的对象 存到返回数据里面 用于存到日志表
		        returnmessage.setReturnInitData(ghbases);
	        	List<cn.ccccltd.webservice.construction.marketinfo.VoSupport> list = 
	    				(List<cn.ccccltd.webservice.construction.marketinfo.VoSupport>)returnmessage.getResultList();
	    		if(list != null && list.size()>0){
	    			GhscxxVO sjsc = (GhscxxVO)list.get(0);
	    			List<Ghscgzjzbzb> listvo =(List<Ghscgzjzbzb>) sjsc.getOtherBidList();
	    			for(Ghscgzjzbzb vo:listvo){
	    				if(vo != null){
	    					String sqlq ="update jt_other_company_bid set recid= '"+vo.getRecid()+"' where cqttbid ="+vo.getCqttbid();
	    					commondao.excuteBySql(sqlq);
	    				}
	    			}
	    		}
	            System.out.println("message:"+returnmessage.getMessage());
	            System.out.println("statuscod:"+returnmessage.getStatusCode());
	            System.out.println("resultlist:"+returnmessage.getResultList());
	        }
	        
		}else if("update".equals(actiontype)){//施工市场信息更新接口
			String sql = "select * from jt_sg_project_track where sgtrackid="+recid;
	        List<GhscxxVO> ghbases = (List<GhscxxVO>) commondao.queryListEntity(sql, null, GhscxxVO.class);
	        if(ghbases != null && ghbases.size()>0){
	        	GhscxxVO projectMarketInfo = ghbases.get(0);
	        	if(zbzbs != null && zbzbs.size()>0){
	        		projectMarketInfo.setOtherBidList(zbzbs);
	        	}
	        	//日期格式转换
	        	DateFormat format1= new SimpleDateFormat("yyyy-MM-dd");
	        	DateFormat format= new SimpleDateFormat("dd-MM月-yy hh.mm.ss.SSSS a");
	        	try {
	        		if(projectMarketInfo.getKsgzsj() != null && !"".equals(projectMarketInfo.getKsgzsj())){
	        			projectMarketInfo.setKsgzsj(dateUtil(format.format(format1.parse(projectMarketInfo.getKsgzsj()))));
	        		}
	        		if(projectMarketInfo.getZsrq() != null && !"".equals(projectMarketInfo.getZsrq())){
	        			projectMarketInfo.setZsrq(dateUtil(format.format(format1.parse(projectMarketInfo.getZsrq()))));
	        		}
	        		if(projectMarketInfo.getZbrqi() != null && !"".equals(projectMarketInfo.getZbrqi())){
	        			projectMarketInfo.setZbrqi(dateUtil(format.format(format1.parse(projectMarketInfo.getZbrqi()))));
	        		}
	        		if(projectMarketInfo.getZbjzrq() != null && !"".equals(projectMarketInfo.getZbjzrq())){
	        			projectMarketInfo.setZbjzrq(dateUtil(format.format(format1.parse(projectMarketInfo.getZbjzrq()))));
	        		}
	        		if(projectMarketInfo.getTbrq() != null && !"".equals(projectMarketInfo.getTbrq())){
	        			projectMarketInfo.setTbrq(dateUtil(format.format(format1.parse(projectMarketInfo.getTbrq()))));
	        		}
	        		if(projectMarketInfo.getZbrq() != null && !"".equals(projectMarketInfo.getZbrq())){
	        			projectMarketInfo.setZbrq(dateUtil(format.format(format1.parse(projectMarketInfo.getZbrq()))));
	        		}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        	
	        	
	        	returnmessage = client.updateMarketInfo(projectMarketInfo);
	        	//得到的对象 存到返回数据里面 用于存到日志表
		        returnmessage.setReturnInitData(ghbases);
	            System.out.println("message:"+returnmessage.getMessage());
	            System.out.println("statuscod:"+returnmessage.getStatusCode());
	            System.out.println("resultlist:"+returnmessage.getResultList());
	        }
		}
		
		JSONObject jsonObject = JSONObject.fromObject(returnmessage);
		String resultstr = "";
        try {
        	resultstr = URLEncoder.encode(jsonObject.toString(),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        return resultstr;
	}
	
	/**
	 * 施工合同信息接口同步
	 * @param recid
	 * @return
	 */
	private String sgContractIntegrate(String recid,String actiontype,ApplicationContext ctx){
		GhxmjhtWs client = (GhxmjhtWs)ctx.getBean("sgcontractclient");
		System.out.println("recid:"+recid);
		cn.ccccltd.webservice.construction.contract.ReturnMessage returnmessage = null;
		//设置合同关联的保险信息
    	String bxsql = "select * from jt_project_insurance where contractrecid="+recid;
    	List<HwxmbxVO> bxList = (List<HwxmbxVO>) commondao.queryListEntity(bxsql, null, HwxmbxVO.class);
		
		if("add".equals(actiontype)){//施工合同信息增加接口
	        String sql = "select * from jt_sg_project_contract where sgcontractid="+recid;
	        List<GhxmjhtVO> ghbases = (List<GhxmjhtVO>) commondao.queryListEntity(sql, null, GhxmjhtVO.class);
	        if(ghbases != null && ghbases.size()>0){
	        	GhxmjhtVO projectBaseInfo = ghbases.get(0);
	        	System.out.println("*****************"+projectBaseInfo.getHtqdrq());
	        	if(bxList != null && bxList.size()>0){
	        		projectBaseInfo.setBxList(bxList);
	        	}
	        	//日期格式转换
	        	DateFormat format1= new SimpleDateFormat("yyyy-MM-dd");
	        	DateFormat format= new SimpleDateFormat("dd-MM月-yy hh.mm.ss.SSSS a");
	        	try {
	        		if(projectBaseInfo.getSjkgrq() != null && !"".equals(projectBaseInfo.getSjkgrq())){
	        			projectBaseInfo.setSjkgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getSjkgrq()))));
	        		}
	        		if(projectBaseInfo.getHtqdrq() != null && !"".equals(projectBaseInfo.getHtqdrq())){
	        			projectBaseInfo.setHtqdrq(dateUtil(format.format(format1.parse(projectBaseInfo.getHtqdrq()))));
	        		}
	        		if(projectBaseInfo.getHtkgrq() != null && !"".equals(projectBaseInfo.getHtkgrq())){
	        			projectBaseInfo.setHtkgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getHtkgrq()))));
	        		}
	        		if(projectBaseInfo.getHtjgrq() != null && !"".equals(projectBaseInfo.getHtjgrq())){
	        			projectBaseInfo.setHtjgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getHtjgrq()))));
	        		}
		        	System.out.println("*****************"+projectBaseInfo.getHtqdrq());
				} catch (Exception e) {
					e.printStackTrace();
				}
	        	//设置纳入系统管理时间
	        	projectBaseInfo.setTjgsyf(DateUtil.getTjgsyf("dd-M月-yy hh.mm.ss.SSSS a"));
	        	
	        	//调用施工合同信息增加接口
	        	returnmessage = client.addContractInfo(projectBaseInfo);
	        	//得到的对象 存到返回数据里面 用于存到日志表
		        returnmessage.setReturnInitData(ghbases);
	        	List<cn.ccccltd.webservice.construction.contract.VoSupport> listvo 
        			= (List<cn.ccccltd.webservice.construction.contract.VoSupport>)returnmessage.getResultList();
	        	if(listvo != null && listvo.size()>0){
	        		GhxmjhtVO ghhtvo = (GhxmjhtVO)listvo.get(0);
		        	List<HwxmbxVO> hwxmbxlist = ghhtvo.getBxList();
		        	for(HwxmbxVO hwxmbx : hwxmbxlist){
		        		if(hwxmbx != null){
		        			String sqlhw ="update jt_project_insurance set recid = '"+hwxmbx.getRecid()+
			        				"' where cbxid ="+hwxmbx.getCbxid();
			        		commondao.excuteBySql(sqlhw);
		        		}		        		
		        	}
	        	}	        	
	            System.out.println("message:"+returnmessage.getMessage());
	            System.out.println("statuscod:"+returnmessage.getStatusCode());
	            System.out.println("resultlist:"+returnmessage.getResultList());
	        }
	        
		}else if("update".equals(actiontype)){//施工合同信息更新接口
			String sql = "select * from jt_sg_project_contract where sgcontractid="+recid;
	        List<GhxmjhtVO> ghbases = (List<GhxmjhtVO>) commondao.queryListEntity(sql, null, GhxmjhtVO.class);
	        if(ghbases != null && ghbases.size()>0){
	        	GhxmjhtVO projectBaseInfo = ghbases.get(0);
	        	if(bxList != null && bxList.size()>0){
	        		projectBaseInfo.setBxList(bxList);
	        	}
	        	//日期格式转换
	        	DateFormat format1= new SimpleDateFormat("yyyy-MM-dd");
	        	DateFormat format= new SimpleDateFormat("dd-MM月-yy hh.mm.ss.SSSS a");
	        	try {
	        		if(projectBaseInfo.getSjkgrq() != null && !"".equals(projectBaseInfo.getSjkgrq())){
	        			projectBaseInfo.setSjkgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getSjkgrq()))));
	        		}
	        		if(projectBaseInfo.getHtqdrq() != null && !"".equals(projectBaseInfo.getHtqdrq())){
	        			projectBaseInfo.setHtqdrq(dateUtil(format.format(format1.parse(projectBaseInfo.getHtqdrq()))));
	        		}
	        		if(projectBaseInfo.getHtkgrq() != null && !"".equals(projectBaseInfo.getHtkgrq())){
	        			projectBaseInfo.setHtkgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getHtkgrq()))));
	        		}
	        		if(projectBaseInfo.getHtjgrq() != null && !"".equals(projectBaseInfo.getHtjgrq())){
	        			projectBaseInfo.setHtjgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getHtjgrq()))));
	        		}
				} catch (Exception e) {
					e.printStackTrace();
				}
	        	
	        	//调用施工合同信息更新接口
	        	returnmessage = client.updateContractInfo(projectBaseInfo);
	        	//得到的对象 存到返回数据里面 用于存到日志表
		        returnmessage.setReturnInitData(ghbases);
	            System.out.println("message:"+returnmessage.getMessage());
	            System.out.println("statuscod:"+returnmessage.getStatusCode());
	            System.out.println("resultlist:"+returnmessage.getResultList());
	        }
		}
		
		JSONObject jsonObject = JSONObject.fromObject(returnmessage);
		String resultstr = "";
        try {
        	resultstr = URLEncoder.encode(jsonObject.toString(),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        return resultstr;
	}
	
	/**
	 * 设计基本信息接口同步
	 * @param recid
	 * @return
	 */
	private String sjBaseIntegrate(String sjbaseid,String actiontype,ApplicationContext ctx){
		SjscgzjzbWs client = (SjscgzjzbWs)ctx.getBean("sjbaseclient");
		System.out.println("sjbaseid:"+sjbaseid);
		cn.ccccltd.webservice.design.projectbaseinfo.ReturnMessage returnmessage = null;
		if("add".equals(actiontype)){//设计基本信息增加接口
	        String sql = "select * from jt_sj_project_base where sjbaseid="+sjbaseid;
	        List<SjscgzjzbVO> ghbases = (List<SjscgzjzbVO>) commondao.queryListEntity(sql, null, SjscgzjzbVO.class);
	        if(ghbases != null && ghbases.size()>0){
	        	SjscgzjzbVO projectBaseInfo = ghbases.get(0);
	        	//客户端设置项目阶段为“合同已签”
//	        	projectBaseInfo.setXmzt("446D01A3E0000001CC2C00EA2626720C");
	        	returnmessage = client.addBaseInfo(projectBaseInfo);
	        	//得到的对象 存到返回数据里面 用于存到日志表
		        returnmessage.setReturnInitData(ghbases);
	            System.out.println("message:"+returnmessage.getMessage());
	            System.out.println("statuscod:"+returnmessage.getStatusCode());
	            System.out.println("resultlist:"+returnmessage.getResultList());
	        }
	        
		}else if("update".equals(actiontype)){//设计基本信息更新接口
			String sql = "select * from jt_sj_project_base where sjbaseid="+sjbaseid;
	        List<SjscgzjzbVO> ghbases = (List<SjscgzjzbVO>) commondao.queryListEntity(sql, null, SjscgzjzbVO.class);
	        if(ghbases != null && ghbases.size()>0){
	        	SjscgzjzbVO projectBaseInfo = ghbases.get(0);
	        	returnmessage = client.updateBaseInfo(projectBaseInfo);
	        	//得到的对象 存到返回数据里面 用于存到日志表
		        returnmessage.setReturnInitData(ghbases);
	            System.out.println("message:"+returnmessage.getMessage());
	            System.out.println("statuscod:"+returnmessage.getStatusCode());
	            System.out.println("resultlist:"+returnmessage.getResultList());
	        }
		}		
		JSONObject jsonObject = JSONObject.fromObject(returnmessage);
		String resultstr = "";
        try {
        	resultstr = URLEncoder.encode(jsonObject.toString(),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        return resultstr;
	}
	
	/**
	 * 设计市场信息接口同步
	 * @param recid
	 * @return
	 */
	private String sjMarketIntegrate(String recid,String actiontype,ApplicationContext ctx){
		SjscxxWs client = (SjscxxWs)ctx.getBean("sjmarketclient");
		System.out.println("recid:"+recid);
		cn.ccccltd.webservice.design.marketinfo.ReturnMessage returnmessage = null;
		//查询设计市场信息关联的其它投标信息
		String qitbsql = "select * from jt_other_company_bid where trackrecid="+recid;
		List<SjscgzjzbzbVO> zbzbs = (List<SjscgzjzbzbVO>) commondao.queryListEntity(qitbsql, null, SjscgzjzbzbVO.class);
		
		if("add".equals(actiontype)){//设计市场信息增加接口
	        String sql = "select * from jt_sj_project_track where trackid="+recid;
	        List<SjscxxVO> ghbases = (List<SjscxxVO>) commondao.queryListEntity(sql, null, SjscxxVO.class);
	        if(ghbases != null && ghbases.size()>0){
	        	SjscxxVO projectBaseInfo = ghbases.get(0);
	        	if(zbzbs != null && zbzbs.size()>0){
	        		projectBaseInfo.setSjscgzjzbzbvos(zbzbs);
	        	}
	        	//日期格式转换
	        	DateFormat format1= new SimpleDateFormat("yyyy-MM-dd");
	        	DateFormat format= new SimpleDateFormat("dd-MM月-yy hh.mm.ss.SSSS a");
	        	try {
	        		if(projectBaseInfo.getKsgzsj() != null && !"".equals(projectBaseInfo.getKsgzsj())){
	        			projectBaseInfo.setKsgzsj(dateUtil(format.format(format1.parse(projectBaseInfo.getKsgzsj()))));
	        		}
	        		if(projectBaseInfo.getTbrq() != null && !"".equals(projectBaseInfo.getTbrq())){
	        			projectBaseInfo.setTbrq(dateUtil(format.format(format1.parse(projectBaseInfo.getTbrq()))));
	        		}
	        		if(projectBaseInfo.getNrxtglsjZb() != null && !"".equals(projectBaseInfo.getNrxtglsjZb())){
	        			projectBaseInfo.setNrxtglsjZb(dateUtil(format.format(format1.parse(projectBaseInfo.getNrxtglsjZb()))));
	        		}
					
		        	
				} catch (Exception e) {
					e.printStackTrace();
				}
	
	        	
	        	returnmessage = client.addMarketInfo(projectBaseInfo);
	        	//得到的对象 存到返回数据里面 用于存到日志表
		        returnmessage.setReturnInitData(ghbases);
	    		List<cn.ccccltd.webservice.design.marketinfo.VoSupport> list = 
	    				(List<cn.ccccltd.webservice.design.marketinfo.VoSupport>)returnmessage.getResultList();
	    		if(list != null && list.size()>0){
	    			SjscxxVO sjsc = (SjscxxVO)list.get(0);
	    			List<SjscgzjzbzbVO> listvo =(List<SjscgzjzbzbVO>) sjsc.getSjscgzjzbzbvos();
	    			for(SjscgzjzbzbVO vo:listvo){
	    				if(vo != null){
	    					String sqlq ="update jt_other_company_bid set recid= '"+vo.getRecid()+"' where cqttbid ="+vo.getCqttbid();
	    					commondao.excuteBySql(sqlq);
	    				}
	    			}
	    		}
	            System.out.println("message:"+returnmessage.getMessage());
	            System.out.println("statuscod:"+returnmessage.getStatusCode());
	            System.out.println("resultlist:"+returnmessage.getResultList());
	        }
	        
		}else if("update".equals(actiontype)){//设计市场信息更新接口
			String sql = "select * from jt_sj_project_track where trackid="+recid;
	        List<SjscxxVO> ghbases = (List<SjscxxVO>) commondao.queryListEntity(sql, null, SjscxxVO.class);
	        if(ghbases != null && ghbases.size()>0){
	        	SjscxxVO projectBaseInfo = ghbases.get(0);
	        	if(zbzbs != null && zbzbs.size()>0){
	        		projectBaseInfo.setSjscgzjzbzbvos(zbzbs);
	        	}
	        	//日期格式转换
	        	DateFormat format1= new SimpleDateFormat("yyyy-MM-dd");
	        	DateFormat format= new SimpleDateFormat("dd-MM月-yy hh.mm.ss.SSSS a");
	        	try {
	        		if(projectBaseInfo.getKsgzsj() != null && !"".equals(projectBaseInfo.getKsgzsj())){
	        			projectBaseInfo.setKsgzsj(dateUtil(format.format(format1.parse(projectBaseInfo.getKsgzsj()))));
	        		}
	        		if(projectBaseInfo.getTbrq() != null && !"".equals(projectBaseInfo.getTbrq())){
	        			projectBaseInfo.setTbrq(dateUtil(format.format(format1.parse(projectBaseInfo.getTbrq()))));
	        		}
	        		if(projectBaseInfo.getNrxtglsjZb() != null && !"".equals(projectBaseInfo.getNrxtglsjZb())){
	        			projectBaseInfo.setNrxtglsjZb(dateUtil(format.format(format1.parse(projectBaseInfo.getNrxtglsjZb()))));
	        		}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	
	        	returnmessage = client.updateMarketInfo(projectBaseInfo);
	        	//得到的对象 存到返回数据里面 用于存到日志表
		        returnmessage.setReturnInitData(ghbases);
	            System.out.println("message:"+returnmessage.getMessage());
	            System.out.println("statuscod:"+returnmessage.getStatusCode());
	            System.out.println("resultlist:"+returnmessage.getResultList());
	        }
		}
		
		JSONObject jsonObject = JSONObject.fromObject(returnmessage);
		String resultstr = "";
        try {
        	resultstr = URLEncoder.encode(jsonObject.toString(),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        return resultstr;
	}
	
	
	public static void main(String[] args) {
//		String str = "2016-02-02";
//		DateFormat format1= new SimpleDateFormat("yyyy-MM-dd");
//    	DateFormat format= new SimpleDateFormat("dd-MM月-yy hh.mm.ss.SSSS a");
//    	JtContractIntegrateController aa = new JtContractIntegrateController();
//    	
//    	try {
//			System.out.println(aa.dateUtil(format.format(format1.parse(str))));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
    	
//		String[] params = {"1483"};
//		KettleUtil.runJob("D:\\kettle\\scjy_data_syc\\syncContract_add\\sg\\sg.kjb",params);
		
//		try {
//			runTrans("D:\\kettle\\scjy_data_syc\\syncContract_add\\sg\\sg_trans.ktr");
//		} catch (KettleException e) {
//			e.printStackTrace();
//		}
		
		String str = KettleUtil.getPropertiesByName("kettle_file.properties", "sgsyncjobpath");
		System.out.println(str);
	}
	
	
	/**
	 * 设计合同信息接口同步
	 * @param recid
	 * @return
	 */
	private String sjContractIntegrate(String recid,String actiontype,ApplicationContext ctx){
		SjxmjhtWs client = (SjxmjhtWs)ctx.getBean("sjcontractclient");
		System.out.println("recid:"+recid);
		cn.ccccltd.webservice.design.contract.ReturnMessage returnmessage = null;
		//设置合同关联的保险信息
    	String bxsql = "select * from jt_project_insurance where contractrecid="+recid;
    	List<HwxmbcxxVO> bxList = (List<HwxmbcxxVO>) commondao.queryListEntity(bxsql, null, HwxmbcxxVO.class);
    	
		if("add".equals(actiontype)){//设计合同信息增加接口
	        String sql = "select * from jt_sj_project_contract where sj_contract_id="+recid;
	        List<SjxmjhtVO> ghbases = (List<SjxmjhtVO>) commondao.queryListEntity(sql, null, SjxmjhtVO.class);
	        if(ghbases != null && ghbases.size()>0){
	        	SjxmjhtVO projectBaseInfo = ghbases.get(0);
	        	if(bxList != null && bxList.size()>0){
	        		projectBaseInfo.setBxList(bxList);
	        	}
	        	//日期格式转换
	        	DateFormat format1= new SimpleDateFormat("yyyy-MM-dd");
	        	DateFormat format= new SimpleDateFormat("dd-MM月-yy hh.mm.ss.SSSS a");
	        	try {
	        		if(projectBaseInfo.getSjwgrq() != null && !"".equals(projectBaseInfo.getSjwgrq())){
	        			projectBaseInfo.setSjwgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getSjwgrq()))));
	        		}
	        		if(projectBaseInfo.getSjkgrq() != null && !"".equals(projectBaseInfo.getSjkgrq())){
	        			projectBaseInfo.setSjkgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getSjkgrq()))));
	        		}
					if(projectBaseInfo.getHtqdrq() != null && !"".equals(projectBaseInfo.getHtqdrq())){
						projectBaseInfo.setHtqdrq(dateUtil(format.format(format1.parse(projectBaseInfo.getHtqdrq()))));
					}
					if(projectBaseInfo.getHtkgrq() != null && !"".equals(projectBaseInfo.getHtkgrq())){
						projectBaseInfo.setHtkgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getHtkgrq()))));
					}
					if(projectBaseInfo.getHtwgrq() != null && !"".equals(projectBaseInfo.getHtwgrq())){
						projectBaseInfo.setHtwgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getHtwgrq()))));
					}
		        	
				} catch (Exception e) {
					e.printStackTrace();
				}
	        	//设置纳入系统管理时间
	        	projectBaseInfo.setTjgsyf(DateUtil.getTjgsyf("dd-M月-yy hh.mm.ss.SSSS a"));
	        	
	        	returnmessage = client.addContractInfo(projectBaseInfo);
	        	//得到的对象 存到返回数据里面 用于存到日志表
		        returnmessage.setReturnInitData(ghbases);
	        	List<cn.ccccltd.webservice.design.contract.VoSupport> listvo 
	        		= (List<cn.ccccltd.webservice.design.contract.VoSupport>)returnmessage.getResultList();
	        	if(listvo != null && listvo.size()>0){
	        		SjxmjhtVO sjhtvo = (SjxmjhtVO)listvo.get(0);
		        	List<HwxmbcxxVO> hwxmbxlist = sjhtvo.getBxList();
		        	for(HwxmbcxxVO hwxmbx : hwxmbxlist){
		        		if(hwxmbx != null){
		        			String sqlhw ="update jt_project_insurance set recid = '"+hwxmbx.getRecid()+
			        				"' where cbxid ="+hwxmbx.getCbxid();
			        		commondao.excuteBySql(sqlhw);
		        		}		        		
		        	}
	        	}	        	
	            System.out.println("message:"+returnmessage.getMessage());
	            System.out.println("statuscod:"+returnmessage.getStatusCode());
	            System.out.println("resultlist:"+returnmessage.getResultList());
	        }
	        
		}else if("update".equals(actiontype)){//设计合同信息更新接口
			String sql = "select * from jt_sj_project_contract where sj_contract_id="+recid;
	        List<SjxmjhtVO> ghbases = (List<SjxmjhtVO>) commondao.queryListEntity(sql, null, SjxmjhtVO.class);
	        if(ghbases != null && ghbases.size()>0){
	        	SjxmjhtVO projectBaseInfo = ghbases.get(0);
	        	if(bxList != null && bxList.size()>0){
	        		projectBaseInfo.setBxList(bxList);
	        	}
	        	//日期格式转换
	        	DateFormat format1= new SimpleDateFormat("yyyy-MM-dd");
	        	DateFormat format= new SimpleDateFormat("dd-MM月-yy hh.mm.ss.SSSS a");
	        	try {
	        		if(projectBaseInfo.getSjwgrq() != null && !"".equals(projectBaseInfo.getSjwgrq())){
	        			projectBaseInfo.setSjwgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getSjwgrq()))));
	        		}
	        		if(projectBaseInfo.getSjkgrq() != null && !"".equals(projectBaseInfo.getSjkgrq())){
	        			projectBaseInfo.setSjkgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getSjkgrq()))));
	        		}
					if(projectBaseInfo.getHtqdrq() != null && !"".equals(projectBaseInfo.getHtqdrq())){
						projectBaseInfo.setHtqdrq(dateUtil(format.format(format1.parse(projectBaseInfo.getHtqdrq()))));
					}
					if(projectBaseInfo.getHtkgrq() != null && !"".equals(projectBaseInfo.getHtkgrq())){
						projectBaseInfo.setHtkgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getHtkgrq()))));
					}
					if(projectBaseInfo.getHtwgrq() != null && !"".equals(projectBaseInfo.getHtwgrq())){
						projectBaseInfo.setHtwgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getHtwgrq()))));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
	        	
	        	returnmessage = client.updateContractInfo(projectBaseInfo);
	        	//得到的对象 存到返回数据里面 用于存到日志表
		        returnmessage.setReturnInitData(ghbases);
	            System.out.println("message:"+returnmessage.getMessage());
	            System.out.println("statuscod:"+returnmessage.getStatusCode());
	            System.out.println("resultlist:"+returnmessage.getResultList());
	        }
		}
		
		JSONObject jsonObject = JSONObject.fromObject(returnmessage);
		String resultstr = "";
        try {
        	resultstr = URLEncoder.encode(jsonObject.toString(),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        return resultstr;
	}
	
	/**
	 * 其它基本信息及合同信息接口同步
	 * @param recid
	 * @return
	 */
	private String qtBaseAndContractIntegrate(String recid,String actiontype,ApplicationContext ctx){
		QtlxmWs client = (QtlxmWs)ctx.getBean("qtbasecontractclient");
		System.out.println("recid:"+recid);
		cn.ccccltd.webservice.other.projectbaseinfo.ReturnMessage returnmessage = null;
		if("add".equals(actiontype)){//设计基本信息增加接口
	        String sql = "select * from jt_qt_projectandcontract where otherid="+recid;
	        List<QtlxmVO> ghbases = (List<QtlxmVO>) commondao.queryListEntity(sql, null, QtlxmVO.class);
	        if(ghbases != null && ghbases.size()>0){
	        	QtlxmVO projectBaseInfo = ghbases.get(0);
	        	//日期格式转换
	        	DateFormat format1= new SimpleDateFormat("yyyy-MM-dd");
	        	DateFormat format= new SimpleDateFormat("dd-MM月-yy hh.mm.ss.SSSS a");
	        	try {
	        		if(projectBaseInfo.getSjwgrq() != null && !"".equals(projectBaseInfo.getSjwgrq())){
	        			projectBaseInfo.setSjwgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getSjwgrq()))));
	        		}
	        		if(projectBaseInfo.getSjkgrq() != null && !"".equals(projectBaseInfo.getSjkgrq())){
	        			projectBaseInfo.setSjkgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getSjkgrq()))));
	        		}
					if(projectBaseInfo.getHtqdrq() != null && !"".equals(projectBaseInfo.getHtqdrq())){
						projectBaseInfo.setHtqdrq(dateUtil(format.format(format1.parse(projectBaseInfo.getHtqdrq()))));
					}
					if(projectBaseInfo.getHtkgrq() != null && !"".equals(projectBaseInfo.getHtkgrq())){
						projectBaseInfo.setHtkgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getHtkgrq()))));
					}
					if(projectBaseInfo.getHtwgrq() != null && !"".equals(projectBaseInfo.getHtwgrq())){
						projectBaseInfo.setHtwgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getHtwgrq()))));
					}
		        	
				} catch (Exception e) {
					e.printStackTrace();
				}
	        	//设置纳入系统管理时间
	        	projectBaseInfo.setTjgsyf(DateUtil.getTjgsyf("dd-M月-yy hh.mm.ss.SSSS a"));
	        	
	        	returnmessage = client.addBaseInfo(projectBaseInfo);
	        	//得到的对象 存到返回数据里面 用于存到日志表
		        returnmessage.setReturnInitData(ghbases);
	            System.out.println("message:"+returnmessage.getMessage());
	            System.out.println("statuscod:"+returnmessage.getStatusCode());
	            System.out.println("resultlist:"+returnmessage.getResultList());
	        }
	        
		}else if("update".equals(actiontype)){//设计基本信息更新接口
			String sql = "select * from jt_qt_projectandcontract where otherid="+recid;
	        List<QtlxmVO> ghbases = (List<QtlxmVO>) commondao.queryListEntity(sql, null, QtlxmVO.class);

	        if(ghbases != null && ghbases.size()>0){
	        	QtlxmVO projectBaseInfo = ghbases.get(0);
	        	//日期格式转换
	        	DateFormat format1= new SimpleDateFormat("yyyy-MM-dd");
	        	DateFormat format= new SimpleDateFormat("dd-MM月-yy hh.mm.ss.SSSS a");
	        	try {
	        		if(projectBaseInfo.getSjwgrq() != null && !"".equals(projectBaseInfo.getSjwgrq())){
	        			projectBaseInfo.setSjwgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getSjwgrq()))));
	        		}
	        		if(projectBaseInfo.getSjkgrq() != null && !"".equals(projectBaseInfo.getSjkgrq())){
	        			projectBaseInfo.setSjkgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getSjkgrq()))));
	        		}
					if(projectBaseInfo.getHtqdrq() != null && !"".equals(projectBaseInfo.getHtqdrq())){
						projectBaseInfo.setHtqdrq(dateUtil(format.format(format1.parse(projectBaseInfo.getHtqdrq()))));
					}
					if(projectBaseInfo.getHtkgrq() != null && !"".equals(projectBaseInfo.getHtkgrq())){
						projectBaseInfo.setHtkgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getHtkgrq()))));
					}
					if(projectBaseInfo.getHtwgrq() != null && !"".equals(projectBaseInfo.getHtwgrq())){
						projectBaseInfo.setHtwgrq(dateUtil(format.format(format1.parse(projectBaseInfo.getHtwgrq()))));
					}
		        	
				} catch (Exception e) {
					e.printStackTrace();
				}
	        	returnmessage = client.updateBaseInfo(projectBaseInfo);
		        //得到的对象 存到返回数据里面 用于存到日志表
		        returnmessage.setReturnInitData(ghbases);
	            System.out.println("message:"+returnmessage.getMessage());
	            System.out.println("statuscod:"+returnmessage.getStatusCode());
	            System.out.println("resultlist:"+returnmessage.getResultList());
	            System.out.println("returnInitData:"+returnmessage.getReturnInitData());
	        }
		}
		
		JSONObject jsonObject = JSONObject.fromObject(returnmessage);
		String resultstr = "";
        try {
        	resultstr = URLEncoder.encode(jsonObject.toString(),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        return resultstr;
	}
	
	/**
	 * 施工基本信息写入
	 * @param zzjg
	 * @param baserecid
	 * @param contractrecid
	 * @param ctx
	 * @param jt
	 */
	private void sgProjectBaseQuery(String zzjg,String baserecid,ApplicationContext ctx,JTContract jt){
		GhscgzjzbWs client = (GhscgzjzbWs)ctx.getBean("sgbaseclient");
		ReturnMessage returnmessage = null;
		returnmessage = client.queryBaseInfoById(zzjg, baserecid);
		//施工基本信息写入
		jtservice.sgBaseToJtContract(returnmessage.getResultList(),jt);
	}
	
	/**
	 * 施工市场信息写入
	 * @param zzjg
	 * @param baserecid
	 * @param contractrecid
	 * @param ctx
	 * @param jt
	 */
	private void sgMarketBaseQuery(String zzjg,String baserecid,ApplicationContext ctx
			,JTContract jt,int bidcompanyid){
		GhscxxWs client = (GhscxxWs)ctx.getBean("sgmarketclient");
		cn.ccccltd.webservice.construction.marketinfo.ReturnMessage returnmessage = null;
		returnmessage = client.queryMarketInfoById(zzjg, baserecid);
		//施工市场信息写入
		jtservice.sgMarketToJtContract(returnmessage.getResultList(), jt,bidcompanyid);
	}
	
	/**
	 * 施工合同信息写入
	 * @param zzjg
	 * @param baserecid
	 * @param contractrecid
	 * @param ctx
	 * @param jt
	 */
	private void sgContractBaseQuery(String zzjg,String contractrecid,ApplicationContext ctx
			,JTContract jt,int contractinsuraceid){
		GhxmjhtWs client = (GhxmjhtWs)ctx.getBean("sgcontractclient");
		cn.ccccltd.webservice.construction.contract.ReturnMessage returnmessage = null;
		returnmessage = client.queryContractInfoById(zzjg, contractrecid);
		//施工市场信息写入
		jtservice.sgContractToJtContract(returnmessage.getResultList(), jt,contractinsuraceid);
	}
	
	/**
	 * 设计基本信息写入
	 * @param zzjg
	 * @param baserecid
	 * @param ctx
	 * @param jt
	 */
	private void sjProjectBaseQuery(String zzjg,String baserecid,ApplicationContext ctx,JTContract jt){
		SjscgzjzbWs client = (SjscgzjzbWs)ctx.getBean("sjbaseclient");
		cn.ccccltd.webservice.design.projectbaseinfo.ReturnMessage returnmessage = null;
		returnmessage = client.queryBaseInfoById(zzjg, baserecid);
		//设计基本信息写入
		jtservice.sjBaseToJtContract(returnmessage.getResultList(), jt);
	}
	
	/**
	 * 设计市场新写入
	 * @param zzjg
	 * @param contractrecid
	 * @param ctx
	 * @param jt
	 */
	private void sjMarketBaseQuery(String zzjg,String baserecid,ApplicationContext ctx
			,JTContract jt,int bidcompanyid){
		SjscxxWs client = (SjscxxWs)ctx.getBean("sjmarketclient");
		cn.ccccltd.webservice.design.marketinfo.ReturnMessage returnmessage = null;
		returnmessage = client.queryMarketInfoById(zzjg, baserecid);
		//设计市场新写入
		jtservice.sjMarketToJtContract(returnmessage.getResultList(), jt,bidcompanyid);
		
	}
	
	/**
	 * 设计合同信息写入
	 * @param zzjg
	 * @param contractrecid
	 * @param ctx
	 * @param jt
	 */
	private void sjcontractBaseQuery(String zzjg,String contractrecid,ApplicationContext ctx
			,JTContract jt,int contractinsuraceid){
		SjxmjhtWs client = (SjxmjhtWs)ctx.getBean("sjcontractclient");
		cn.ccccltd.webservice.design.contract.ReturnMessage returnmessage = null;
		returnmessage = client.queryContractInfoById(zzjg, contractrecid);
		//设计合同信息写入
		jtservice.sjContractToJtContract(returnmessage.getResultList(), jt,contractinsuraceid);
	}
	
	/**
	 * 其它信息写入
	 * @param zzjg
	 * @param baserecid
	 * @param ctx
	 * @param jt
	 */
	private void qtProjectBaseQuery(String zzjg,String baserecid,ApplicationContext ctx,JTContract jt){
		QtlxmWs client = (QtlxmWs)ctx.getBean("qtbasecontractclient");
		cn.ccccltd.webservice.other.projectbaseinfo.ReturnMessage returnmessage = null;
		returnmessage = client.queryBaseInfoById(zzjg, baserecid);
		//其它信息写入
		jtservice.qtBaseToJtContract(returnmessage.getResultList(), jt);
	}
	
	private String dateUtil(String datestr){
		String month = Integer.parseInt(datestr.substring(3, 5))+"";
		
		StringBuffer sb = new StringBuffer();
		sb.append(datestr.substring(0,3));
		sb.append(month);
		sb.append(datestr.substring(5,26));
		String datestrresult = sb.toString();
		
		return datestrresult;
	}
	
	@RequestMapping(value = "/savejtcontract",method = RequestMethod.GET)
	public void savejtcontract(){
		JTContract jt = new JTContract();
		jt.setContractid(2345);
		jt.setContractcode("hhYYYII-00");
		jtservice.add(jt);
	}
}
