package com.ajie.wechat.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ajie.wechat.service.JtOrgService;
import com.ajie.wechat.util.KettleUtil;

import cn.ccccltd.webservice.org.MdorgWs;
import cn.ccccltd.webservice.org.ReturnMessage;

@Controller
@RequestMapping(value = "/org")
public class JtOrgIntegrateController {
	
	private final Log logger = LogFactory.getLog(JtContractIntegrateController.class);
	
	@Autowired
	private JtOrgService jtorgservice;
	
	@RequestMapping(value = "/getorg/{orgcode}",method = RequestMethod.GET)
	public @ResponseBody String getOrg(@PathVariable String orgcode){
		logger.info("数据字典同步开始...");
		String resultstr = "2";
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:cxf-Security.xml");
		MdorgWs mdorgws = (MdorgWs)ctx.getBean("orgclient");
		
		ReturnMessage returnmessage = null;
		returnmessage = mdorgws.getOrg(orgcode, null, null, null);
		//组织机构数据清除
		jtorgservice.deleteAll();
		
		//组织机构批量数据录入
		jtorgservice.getOrg(returnmessage.getResultList());
		//kettle调用
		String jobpath = KettleUtil.getPropertiesByName("kettle_file.properties", "orgjobpath");
		// kettle执行
		try {
			Map<String, String> paramap = new HashMap<String, String>();
			paramap.put("sendTime",KettleUtil.getDate());
			KettleUtil.runTrans(jobpath, paramap);
			resultstr = "1";
		} catch (Exception e) {
			resultstr = "2";// 同步失败
			logger.error(e.getLocalizedMessage());
		}
		return resultstr;
	}
	
}
