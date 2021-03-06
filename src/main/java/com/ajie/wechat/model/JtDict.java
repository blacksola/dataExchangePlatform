package com.ajie.wechat.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "JT_DICT")
public class JtDict {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//如果这行不写，则需要保存时手动生成主键
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "DICT_TYPE_ID")
	private String dicttypeid;
	
	@Column(name = "DICT_ID")
	private String dictid;
	
	@Column(name = "DICT_NAME")
	private String dictname;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "SORTNO")
	private String sortno;
	
	@Column(name = "RANK")
	private String rank;
	
	@Column(name = "DICT_PARENT_ID")
	private String dictparentid;
	
	@Column(name = "SEQNO")
	private String seqno;
	
	@Column(name = "DICT_PARENT_NAME")
	private String dictparentname;
	
	@Column(name = "LASTUPDATETIME")
	private String lastupdatetime;
	
	@Column(name = "REMARKS")
	private String remarks;
	
	@Column(name = "RECID")
	private String recid;
	
	@Column(name = "PID")
	private String pid;
	
	@Column(name = "SSYW_CODE")
	private String ssywcode;
	
	@Column(name = "SSYW_NAME")
	private String ssywname;
	
	@Column(name = "ORGUNIT")
	private String orgunit;
	
	@Transient
	private List<JtDict> children;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDicttypeid() {
		return dicttypeid;
	}

	public void setDicttypeid(String dicttypeid) {
		this.dicttypeid = dicttypeid;
	}

	public String getDictid() {
		return dictid;
	}

	public void setDictid(String dictid) {
		this.dictid = dictid;
	}

	public String getDictname() {
		return dictname;
	}

	public void setDictname(String dictname) {
		this.dictname = dictname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSortno() {
		return sortno;
	}

	public void setSortno(String sortno) {
		this.sortno = sortno;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getDictparentid() {
		return dictparentid;
	}

	public void setDictparentid(String dictparentid) {
		this.dictparentid = dictparentid;
	}

	public String getSeqno() {
		return seqno;
	}

	public void setSeqno(String seqno) {
		this.seqno = seqno;
	}

	public String getDictparentname() {
		return dictparentname;
	}

	public void setDictparentname(String dictparentname) {
		this.dictparentname = dictparentname;
	}

	public String getLastupdatetime() {
		return lastupdatetime;
	}

	public void setLastupdatetime(String lastupdatetime) {
		this.lastupdatetime = lastupdatetime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRecid() {
		return recid;
	}

	public void setRecid(String recid) {
		this.recid = recid;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSsywcode() {
		return ssywcode;
	}

	public void setSsywcode(String ssywcode) {
		this.ssywcode = ssywcode;
	}

	public String getSsywname() {
		return ssywname;
	}

	public void setSsywname(String ssywname) {
		this.ssywname = ssywname;
	}

	public String getOrgunit() {
		return orgunit;
	}

	public void setOrgunit(String orgunit) {
		this.orgunit = orgunit;
	}

	public List<JtDict> getChildren() {
		return children;
	}

	public void setChildren(List<JtDict> children) {
		this.children = children;
	}
	
}
