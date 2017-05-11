package com.ajie.wechat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ajie.wechat.dao.JTDictDao;
import com.ajie.wechat.model.JtDict;
import com.ajie.wechat.util.DateUtil;

import cn.ccccltd.webservice.dict.ViewDictonaryVO;
import cn.ccccltd.webservice.dict.VoSupport;

@Service
@Transactional
public class JtDictService {
	@Autowired
    private JTDictDao jtdictdao;
	
	/**
	 * 删除中间表所有数据字典
	 */
	public void deleteAll(){
		jtdictdao.deleteAll();
	}
	
	/**
	 * 数据字典初始化
	 * @param vos
	 * @param jtdict
	 */
	public void getDict(List<VoSupport> vos){
		List<JtDict> dicts = new ArrayList<JtDict>();
		if(vos != null && vos.size()>0){
			for(VoSupport vo:vos){
				JtDict jtdict = new JtDict();
				ViewDictonaryVO viewdictonaryvo = (ViewDictonaryVO)vo;
				dictSet(viewdictonaryvo,jtdict);
				dicts.add(jtdict);
			}
			//批量存储
			jtdictdao.save(dicts);
		}
		
		
	}
	
	/**
	 * 数据字典属性值设置
	 * @param viewdictonaryvo
	 * @param jtdict
	 */
	private void dictSet(ViewDictonaryVO viewdictonaryvo,JtDict jtdict){
		jtdict.setDictid(viewdictonaryvo.getStdcode());
		jtdict.setDictname(viewdictonaryvo.getStdname());
		jtdict.setDicttypeid(viewdictonaryvo.getType());
		jtdict.setDictparentname(viewdictonaryvo.getParentname());
		jtdict.setDictparentid(viewdictonaryvo.getParentcode());
		jtdict.setRecid(viewdictonaryvo.getRecid());
		//目标日期格式
        String goalformat = "yyyy-MM-dd HH:mm:ss";//24小时制
        //源日期格式
        String srcformat = "yyyy-MM-dd.hh.mm. ss. SSSS";
        //日期格式转换
		String lastUpdateTime = DateUtil.dateStringToOtherString(viewdictonaryvo.getLastupdatetime(), srcformat, goalformat);
		jtdict.setLastupdatetime(lastUpdateTime);	
		jtdict.setSsywcode(viewdictonaryvo.getSsywcode());
		jtdict.setSsywname(viewdictonaryvo.getSsywname());
		jtdict.setOrgunit(viewdictonaryvo.getOrgunit());
	}
	
	/**
	 * 根据dicttypeid和dictid查询
	 * @param dicttypeid
	 * @param dictid
	 * @return
	 */
	public JtDict getdictByTypeAndId(String dicttypeid,String dictid){
		JtDict dict =jtdictdao.findByDicttypeidAndDictid(dicttypeid, dictid);
		return dict;
	}
}
