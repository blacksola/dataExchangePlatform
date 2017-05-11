package com.ajie.wechat.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "JT_CONTRACT")
public class JTContract {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)//如果这行不写，则需要保存时手动生成主键
	@Column(name = "JT_CONTRACT_ID")
	private Long jtcontractid;
	
	@Column(name = "CONTRACT_ID")
	private int contractid;
	
	@Column(name = "GROUP_CONTRACT_TYPE")
	private int groupcontracttype;
	
	@Column(name = "PROJECT_CODE")
	private String contractcode;
	
	@Column(name = "ENGLISH_PROJECT_NAME")
	private String englishprojectname;
	
	@Column(name = "PROJECT_BID")
	private String projectbid;
	
	@Column(name = "BUSINESS_TYPE",length = 50)
	private String businesstype;
	
	@Column(name = "GROUP_INDUSTRY_TYPE",length = 50)
	private String groupindustrytype;
	
	@Column(name = "TOTAL_INVEST_AMOUNT")
	private double totalinvestamount;
	
	@Column(name = "TOTAL_INVEST_AMOUNT_CURRENCY",length = 50)
	private String totalinvestamountcurrency;
	
	@Column(name = "PROJECT_TYPE",length = 50)
	private String projecttype;
	
	@Column(name = "PROJECT_COOPERATION_TYPE",length = 50)
	private String projectcooperationtype;
	
	@Column(name = "INVEST_PROJECT_FUNDS_TYPE",length = 50)
	private String investprojectfundstype;
	
	@Column(name = "INVEST_TYPE",length = 50)
	private String investtype;
	
	@Column(name = "NATION_ECONOMY_INDUSTRY_TYPE",length = 50)
	private String nationeconomyindustrytype;
	
	@Column(name = "COMMERCE_MINISTRY_PROJECT_TYPE",length = 50)
	private String commerceministryprojecttype;
	
	@Column(name = "PROJECT_FUNDS_SOURCE",length = 50)
	private String projectfundssource;
	
	@Column(name = "PROJECT_LOCATION",length = 50)
	private String projectlocation;
	
	@Column(name = "PROJECT_STATUS",length = 50)
	private String projectstatus;
	
	@Lob
	@Column(name = "SPECIAL_STATUS_COMMENTS")
	private String specialstatuscomments;
	
	@Column(name = "CUSTOMER_ID")
	private String customerid;
	
	@Column(name = "CUSTOMER_NAME")
	private String customername;
	
	@Column(name = "OTHER_CUSTOMER_NAME")
	private String othercustomername;
	
	@Column(name = "DESIGN_COMPANY_ID")
	private String designcompanyid;
	
	@Column(name = "DESIGN_COMPANY_NAME")
	private String designcompanyname;
	
	@Column(name = "OTHER_DESIGN_COMPANY")
	private String otherdesigncompany;
	
	@Lob
	@Column(name = "PROJECT_SCALE")
	private String projectscale;
	
	@Lob
	@Column(name = "PROJECT_MAIN_CONTENT")
	private String projectmaincontent;
	
	@Lob
	@Column(name = "MAIN_CONDITION")
	private String maincondition;
	
	@Column(name = "PROJECT_CONSTRACTION_TYPE")
	private String projectconstractiontype;
	
	@Column(name = "INVEST_DIRECTION")
	private String investdirection;
	
	@Column(name = "ATTRACT_INVEST_COMPANY")
	private String attractinvestcompany;
	
	@Column(name = "AUDIT_TOTAL_INVEST_AMOUNT")
	private double audittotalinvestamount;
	
	@Column(name = "AUDIT_TOTAL_INVEST_AMOUNT_CURRENCY",length = 50)
	private String audittotalinvestamountcurrency;
	
	@Column(name = "AUDIT_DATE",length = 50)
	private String auditdate;
	
	@Column(name = "AUDIT_CODE",length = 150)
	private String auditcode;
	
	@Column(name = "AUDIT_PLAN_AMOUNT")
	private double auditplanamount;
	
	@Column(name = "AUDIT_PLAN_AMOUNT_CURRENCY")
	private String auditplanamountcurrency;
	
	@Column(name = "GZW_CODE")
	private String gzwcode;
	
	@Column(name = "FGW_CODE")
	private String fgwcode;
	
	@Column(name = "SWB_CODE")
	private String swbcode;
	
	@Column(name = "WGJ_CODE")
	private String wgjcode;
	
	@Column(name = "IS_ADJUST_PROJECT",length = 50)
	private String isadjustproject;
	
	@Column(name = "IS_PLAN_PROJECT",length = 50)
	private String isplanproject;
	
	@Column(name = "IS_ENSURE_PROJECT",length = 50)
	private String isensureproject;
	
	@Column(name = "START_TRACKING_TIME",length = 50)
	private String starttrackingtime;
	
	@Column(name = "PLAN_CONTRACT_BRANK",length = 50)
	private String plancontractbrank;
	
	@Column(name = "PLAN_CONTRACT_BRANK_NAME")
	private String plancontractbrankname;
	
	@Column(name = "PLAN_IMPLEMENT_COMPANY_NAME")
	private String planimplementcompanyname;
	
	@Column(name = "FORCAST_CONTRACT_AMOUNT")
	private double forcastcontractamount;
	
	@Column(name = "FORCAST_CURRENCY",length = 50)
	private String forcastcurrency;
	
	@Column(name = "FORCAST_CONTRACT_DURATION")
	private double forcastcontractduration;
	
	@Column(name = "IS_NEW_FOREIGN_SPV_COMPANY",length = 50)
	private String isnewforeignspvcompany;
	
	@Column(name = "CURRENT_EXCHANGE_RATE")
	private double currentexchangerate;
	
	@Column(name = "FORCAST_CONTRACT_AMOUNT_RMB")
	private double forcastcontractamountrmb;
	
	@Column(name = "CONTRACT_SIGN_TYPE",length = 50)
	private String contractsigntype;
	
	@Column(name = "IS_KEY_TRACKING_PROJECT",length = 50)
	private String iskeytrackingproject;
	
	@Lob
	@Column(name = "TRACKING_INFO")
	private String trackinginfo;
	
	@Column(name = "QUALIFICATE_CHECK_DATE",length = 50)
	private String qualificatecheckdate;
	
	@Column(name = "QUALIFICATE_CHECK_RESULT",length = 50)
	private String qualificatecheckresult;
	
	@Column(name = "TENDER_DATE",length = 50)
	private String tenderdate;
	
	@Column(name = "TENDER_END_DATE",length = 50)
	private String tenderenddate;
	
	@Column(name = "TENDER_COMPANY_NAME")
	private String tendercompanyname;
	
	@Column(name = "TENDER_COMPANY_CONTACT_NAME")
	private String tendercompanycontactname;
	
	@Column(name = "TENDER_COMPANY_CONTACT_PHONE")
	private String tendercompanycontactphone;
	
	@Column(name = "BID_ORGINAZATION_MODE",length = 50)
	private String bidorginazationmode;
	
	@Column(name = "BID_COMPANY_NAME",length = 50)
	private String bidcompanyname;
	
	@Column(name = "BID_OFFER_DATE",length = 50)
	private String bidofferdate;
	
	@Column(name = "BID_OFFER_AMOUNT")
	private double bidofferamount;
	
	@Column(name = "BID_OFFER_AMOUNT_CURRENCY",length = 50)
	private String bidofferamountcurrency;
	
	@Column(name = "IS_BID",length = 50)
	private String isbid;
	
	@Column(name = "BID_AMOUNT")
	private double bidamount;
	
	@Column(name = "BID_AMOUNT_CURRENCY",length = 50)
	private String bidamountcurrency;
	
	@Lob
	@Column(name = "IS_BID_COMMENTS")
	private String isbidcomments;
	
	@Column(name = "BID_DATE",length = 50)
	private String biddate;
	
	@Column(name = "SUPERVISOR_COMPANY_NAME")
	private String supervisorcompanyname;
	
	@Column(name = "SUPERVISOR_COMPANY_CONTACT_NAME")
	private String supervisorcompanycontactname;
	
	@Column(name = "SUPERVISOR_COMPANY_CONTACT_PHONE")
	private String supervisorcompanycontactphone;
	
	@Column(name = "PROJECT_ACTUAL_START_DATE",length = 50)
	private String projectactualstartdate;
	
	@Column(name = "PROJECT_ACUTAL_END_DATE",length = 50)
	private String projectacutalenddate;
	
	@Column(name = "IS_RALATION_INVEST_PROJECT",length = 50)
	private String isralationinvestproject;
	
	@Column(name = "INVEST_PROJECT_TYPE",length = 50)
	private String investprojecttype;
	
	@Column(name = "RELATION_INVEST_PROJECT_COMPANY",length = 50)
	private String relationinvestprojectcompany;
	
	@Lob
	@Column(name = "PROJECT_HIGNLIGHTS")
	private String projecthignlights;
	
	@Lob
	@Column(name = "PROJECT_MAIN_STRUCTURE")
	private String projectmainstructure;
	
	@Column(name = "STEEL_PRODUCTS")
	private double steelproducts;
	
	@Column(name = "CEMENT")
	private double cement;
	
	@Column(name = "WOOD")
	private double wood;
	
	@Column(name = "CONCRETE")
	private double concrete;
	
	@Column(name = "EARTHWORK")
	private double earthwork;
	
	@Column(name = "ROCK")
	private double rock;
	
	@Lob
	@Column(name = "OTHER",length = 50)
	private String other;
	
	@Column(name = "IS_MIAN_CONTRACT",length = 50)
	private String ismiancontract;
	
	@Column(name = "IS_START_NO_SIGNED",length = 50)
	private String isstartnosigned;
	
	@Column(name = "MAIN_CONTRACT_AMOUNT")
	private double maincontractamount;
	
	@Column(name = "CHANGED_MAIN_CONTRACT_AMOUNT")
	private double changedmaincontractamount;
	
	@Column(name = "CONTRACT_DURATION")
	private double contractduration;
	
	@Column(name = "CONTRACT_START_DATE",length = 50)
	private String contractstartdate;
	
	@Column(name = "ACTUAL_START_DATE",length = 50)
	private String actualstartdate;
	
	@Column(name = "CONTRACT_END_DATE",length = 50)
	private String contractenddate;
	
	@Column(name = "ACTUAL_END_DATE",length = 50)
	private String actualenddate;
	
	@Column(name = "IS_INNER_SUBCONTRACT",length = 50)
	private String isinnersubcontract;
	
	@Column(name = "CONSTRUCTRUTE_FEE")
	private double constructrutefee;
	
	@Column(name = "BUY_BACK_DURATION")
	private double buybackduration;
	
	@Column(name = "CONTRACT_BRANK",length = 50)
	private String contractbrank;
	
	@Column(name = "CONTRACT_BRANK_NAME",length = 50)
	private String contractbrankname;
	
	@Column(name = "IMPLEMENT_COMPANY_NAME",length = 50)
	private String implementcompanyname;
	
	@Column(name = "ADVANCE_PAYMENT_RATIO")
	private double advancepaymentratio;
	
	@Column(name = "COLLECTED_AMOUNT_RATIO")
	private double collectedamountratio;
	
	@Column(name = "QUALITY_ASSURANCE_RATIO")
	private double qualityassuranceratio;
	
	@Column(name = "QUALITY_ASSURANCE_TIME")
	private double qualityassurancetime;
	
	@Column(name = "PERFORMANCE_TYPE",length = 50)
	private String performancetype;
	
	@Column(name = "PERFORMANCE_AMOUNT")
	private double performanceamount;
	
	@Column(name = "PERFORMANCE_CURRENCY",length = 50)
	private String performancecurrency;
	
	@Column(name = "PM",length = 50)
	private String pm;
	
	@Column(name = "PM_CONTACT_PHONE",length = 50)
	private String pmcontactphone;
	
	@Column(name = "CHIEF_ENGINEER",length = 50)
	private String chiefengineer;
	
	@Column(name = "CHIEF_ENGINEER_CONTACTPHONE",length = 50)
	private String chiefengineercontactphone;
	
	@Column(name = "ZIP_CODE",length = 50)
	private String zipcode;
	
	@Column(name = "OFFICE_PHONE",length = 50)
	private String officephone;
	
	@Column(name = "PROJECT_ADDRESS")
	private String projectaddress;
	
	@Column(name = "PROJECT_GPS")
	private String projectgps;
	
	@Column(name = "DISIGN_STANDARD")
	private String disignstandard;
	
	@Column(name = "PROJECT_CONTRACT_LANGUAGE")
	private String projectcontractlanguage;
	
	@Column(name = "PROJECT_COMMUNICATE_LANGUAGE")
	private String projectcommunicatelanguage;
	
	@Column(name = "PROJECT_ADVANCE_PAYMENT_AMOUNT")
	private double projectadvancepaymentamount;
	
	@Column(name = "FOREIGN_ADVANCE_PAYMENT_RATIO")
	private double foreignadvancepaymentratio;
	
	@Column(name = "BASE_STATUS",length = 50)
	private String basestatus;
	
	@Column(name = "TRACK_STATUS",length = 50)
	private String trackstatus;
	
	@Column(name = "CONTRACT_STATUS",length = 50)
	private String contractstatus;
	
	@Column(name = "IF_SYNCHRONIZE",length = 50)
	private String ifsynchronize;
	
	@Column(name = "PLATFORM_ID",length = 50)
	private String platformid;
	
	@Column(name = "BASE_LASTUPDATETIME",length = 50)
	private String baselastupdatetime;
	
	@Column(name = "TRACK_LASTUPDATETIME",length = 50)
	private String tracklastupdatetime;
	
	@Column(name = "CONTRACT_LASTUPDATETIME",length = 50)
	private String contractlastupdatetime;
	
	@Column(name = "BASE_RECID")
	private String baserecid;
	
	@Column(name = "TRACK_RECID")
	private String trackrecid;
	
	@Column(name = "CONTRACT_RECID")
	private String contractrecid;
	
	@Column(name = "DATASTATUS")
	private String datastatus;
	
	@Column(name = "CONTRACT_CHANGE_RECID")
	private String contractchangerecid;
	
	@Column(name = "IS_NATOINCOOPERPROJECT")
	private String isnatoincooperproject;
	
	@Column(name = "CHINARANGE")
	private double chinarange;
	
	@Column(name = "DRIVE_EXPORT_CONDITION")
	private double driveexportcondition;
	
	@Column(name = "RELATION_INVEST_PROJECT_COMPANY_NAME")
	private String relationinvestprojectcompanyname;
	
	@Column(name = "sg_standard")
	private String sgstandard;
	
	@Column(name = "bid_area_hq")
	private String bidareahq;
	
	@Column(name = "bid_business_unit")
	private String bidbusinessunit;
	
	@Column(name = "JT_STATISTICS_YEAR")
	private String jtstatisticsyear;
	
	@Column(name = "JT_STATISTICS_MONTH")
	private String jtstatisticsmonth;
	
	@Transient  
	private List<JtOtherCompanyBid> jtothercompanybids;
	
	@Transient  
	private List<JtProjectInsurance> projectinsurances;

	public Long getJtcontractid() {
		return jtcontractid;
	}

	public void setJtcontractid(Long jtcontractid) {
		this.jtcontractid = jtcontractid;
	}

	public int getContractid() {
		return contractid;
	}

	public void setContractid(int contractid) {
		this.contractid = contractid;
	}

	public int getGroupcontracttype() {
		return groupcontracttype;
	}

	public void setGroupcontracttype(int groupcontracttype) {
		this.groupcontracttype = groupcontracttype;
	}

	public String getContractcode() {
		return contractcode;
	}

	public void setContractcode(String contractcode) {
		this.contractcode = contractcode;
	}

	public String getEnglishprojectname() {
		return englishprojectname;
	}

	public void setEnglishprojectname(String englishprojectname) {
		this.englishprojectname = englishprojectname;
	}

	public String getProjectbid() {
		return projectbid;
	}

	public void setProjectbid(String projectbid) {
		this.projectbid = projectbid;
	}

	public String getBusinesstype() {
		return businesstype;
	}

	public void setBusinesstype(String businesstype) {
		this.businesstype = businesstype;
	}

	public String getGroupindustrytype() {
		return groupindustrytype;
	}

	public void setGroupindustrytype(String groupindustrytype) {
		this.groupindustrytype = groupindustrytype;
	}

	public double getTotalinvestamount() {
		return totalinvestamount;
	}

	public void setTotalinvestamount(double totalinvestamount) {
		this.totalinvestamount = totalinvestamount;
	}

	public String getTotalinvestamountcurrency() {
		return totalinvestamountcurrency;
	}

	public void setTotalinvestamountcurrency(String totalinvestamountcurrency) {
		this.totalinvestamountcurrency = totalinvestamountcurrency;
	}

	public String getProjecttype() {
		return projecttype;
	}

	public void setProjecttype(String projecttype) {
		this.projecttype = projecttype;
	}

	public String getProjectcooperationtype() {
		return projectcooperationtype;
	}

	public void setProjectcooperationtype(String projectcooperationtype) {
		this.projectcooperationtype = projectcooperationtype;
	}

	public String getInvestprojectfundstype() {
		return investprojectfundstype;
	}

	public void setInvestprojectfundstype(String investprojectfundstype) {
		this.investprojectfundstype = investprojectfundstype;
	}

	public String getInvesttype() {
		return investtype;
	}

	public void setInvesttype(String investtype) {
		this.investtype = investtype;
	}

	public String getNationeconomyindustrytype() {
		return nationeconomyindustrytype;
	}

	public void setNationeconomyindustrytype(String nationeconomyindustrytype) {
		this.nationeconomyindustrytype = nationeconomyindustrytype;
	}

	public String getCommerceministryprojecttype() {
		return commerceministryprojecttype;
	}

	public void setCommerceministryprojecttype(String commerceministryprojecttype) {
		this.commerceministryprojecttype = commerceministryprojecttype;
	}

	public String getProjectfundssource() {
		return projectfundssource;
	}

	public void setProjectfundssource(String projectfundssource) {
		this.projectfundssource = projectfundssource;
	}

	public String getProjectlocation() {
		return projectlocation;
	}

	public void setProjectlocation(String projectlocation) {
		this.projectlocation = projectlocation;
	}

	public String getProjectstatus() {
		return projectstatus;
	}

	public void setProjectstatus(String projectstatus) {
		this.projectstatus = projectstatus;
	}

	public String getSpecialstatuscomments() {
		return specialstatuscomments;
	}

	public void setSpecialstatuscomments(String specialstatuscomments) {
		this.specialstatuscomments = specialstatuscomments;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getOthercustomername() {
		return othercustomername;
	}

	public void setOthercustomername(String othercustomername) {
		this.othercustomername = othercustomername;
	}

	public String getDesigncompanyid() {
		return designcompanyid;
	}

	public void setDesigncompanyid(String designcompanyid) {
		this.designcompanyid = designcompanyid;
	}

	public String getDesigncompanyname() {
		return designcompanyname;
	}

	public void setDesigncompanyname(String designcompanyname) {
		this.designcompanyname = designcompanyname;
	}

	public String getOtherdesigncompany() {
		return otherdesigncompany;
	}

	public void setOtherdesigncompany(String otherdesigncompany) {
		this.otherdesigncompany = otherdesigncompany;
	}

	public String getProjectscale() {
		return projectscale;
	}

	public void setProjectscale(String projectscale) {
		this.projectscale = projectscale;
	}

	public String getProjectmaincontent() {
		return projectmaincontent;
	}

	public void setProjectmaincontent(String projectmaincontent) {
		this.projectmaincontent = projectmaincontent;
	}

	public String getMaincondition() {
		return maincondition;
	}

	public void setMaincondition(String maincondition) {
		this.maincondition = maincondition;
	}

	public String getProjectconstractiontype() {
		return projectconstractiontype;
	}

	public void setProjectconstractiontype(String projectconstractiontype) {
		this.projectconstractiontype = projectconstractiontype;
	}

	public String getInvestdirection() {
		return investdirection;
	}

	public void setInvestdirection(String investdirection) {
		this.investdirection = investdirection;
	}

	public String getAttractinvestcompany() {
		return attractinvestcompany;
	}

	public void setAttractinvestcompany(String attractinvestcompany) {
		this.attractinvestcompany = attractinvestcompany;
	}

	public double getAudittotalinvestamount() {
		return audittotalinvestamount;
	}

	public void setAudittotalinvestamount(double audittotalinvestamount) {
		this.audittotalinvestamount = audittotalinvestamount;
	}

	public String getAudittotalinvestamountcurrency() {
		return audittotalinvestamountcurrency;
	}

	public void setAudittotalinvestamountcurrency(
			String audittotalinvestamountcurrency) {
		this.audittotalinvestamountcurrency = audittotalinvestamountcurrency;
	}

	public String getAuditdate() {
		return auditdate;
	}

	public void setAuditdate(String auditdate) {
		this.auditdate = auditdate;
	}

	public String getAuditcode() {
		return auditcode;
	}

	public void setAuditcode(String auditcode) {
		this.auditcode = auditcode;
	}

	public double getAuditplanamount() {
		return auditplanamount;
	}

	public void setAuditplanamount(double auditplanamount) {
		this.auditplanamount = auditplanamount;
	}

	public String getAuditplanamountcurrency() {
		return auditplanamountcurrency;
	}

	public void setAuditplanamountcurrency(String auditplanamountcurrency) {
		this.auditplanamountcurrency = auditplanamountcurrency;
	}

	public String getGzwcode() {
		return gzwcode;
	}

	public void setGzwcode(String gzwcode) {
		this.gzwcode = gzwcode;
	}

	public String getFgwcode() {
		return fgwcode;
	}

	public void setFgwcode(String fgwcode) {
		this.fgwcode = fgwcode;
	}

	public String getSwbcode() {
		return swbcode;
	}

	public void setSwbcode(String swbcode) {
		this.swbcode = swbcode;
	}

	public String getWgjcode() {
		return wgjcode;
	}

	public void setWgjcode(String wgjcode) {
		this.wgjcode = wgjcode;
	}

	public String getIsadjustproject() {
		return isadjustproject;
	}

	public void setIsadjustproject(String isadjustproject) {
		this.isadjustproject = isadjustproject;
	}

	public String getIsplanproject() {
		return isplanproject;
	}

	public void setIsplanproject(String isplanproject) {
		this.isplanproject = isplanproject;
	}

	public String getIsensureproject() {
		return isensureproject;
	}

	public void setIsensureproject(String isensureproject) {
		this.isensureproject = isensureproject;
	}

	public String getStarttrackingtime() {
		return starttrackingtime;
	}

	public void setStarttrackingtime(String starttrackingtime) {
		this.starttrackingtime = starttrackingtime;
	}

	public String getPlancontractbrank() {
		return plancontractbrank;
	}

	public void setPlancontractbrank(String plancontractbrank) {
		this.plancontractbrank = plancontractbrank;
	}

	public String getPlancontractbrankname() {
		return plancontractbrankname;
	}

	public void setPlancontractbrankname(String plancontractbrankname) {
		this.plancontractbrankname = plancontractbrankname;
	}

	public String getPlanimplementcompanyname() {
		return planimplementcompanyname;
	}

	public void setPlanimplementcompanyname(String planimplementcompanyname) {
		this.planimplementcompanyname = planimplementcompanyname;
	}

	public double getForcastcontractamount() {
		return forcastcontractamount;
	}

	public void setForcastcontractamount(double forcastcontractamount) {
		this.forcastcontractamount = forcastcontractamount;
	}

	public String getForcastcurrency() {
		return forcastcurrency;
	}

	public void setForcastcurrency(String forcastcurrency) {
		this.forcastcurrency = forcastcurrency;
	}

	public double getForcastcontractduration() {
		return forcastcontractduration;
	}

	public void setForcastcontractduration(double forcastcontractduration) {
		this.forcastcontractduration = forcastcontractduration;
	}

	public String getIsnewforeignspvcompany() {
		return isnewforeignspvcompany;
	}

	public void setIsnewforeignspvcompany(String isnewforeignspvcompany) {
		this.isnewforeignspvcompany = isnewforeignspvcompany;
	}

	public double getCurrentexchangerate() {
		return currentexchangerate;
	}

	public void setCurrentexchangerate(double currentexchangerate) {
		this.currentexchangerate = currentexchangerate;
	}

	public double getForcastcontractamountrmb() {
		return forcastcontractamountrmb;
	}

	public void setForcastcontractamountrmb(double forcastcontractamountrmb) {
		this.forcastcontractamountrmb = forcastcontractamountrmb;
	}

	public String getContractsigntype() {
		return contractsigntype;
	}

	public void setContractsigntype(String contractsigntype) {
		this.contractsigntype = contractsigntype;
	}

	public String getIskeytrackingproject() {
		return iskeytrackingproject;
	}

	public void setIskeytrackingproject(String iskeytrackingproject) {
		this.iskeytrackingproject = iskeytrackingproject;
	}

	public String getTrackinginfo() {
		return trackinginfo;
	}

	public void setTrackinginfo(String trackinginfo) {
		this.trackinginfo = trackinginfo;
	}

	public String getQualificatecheckdate() {
		return qualificatecheckdate;
	}

	public void setQualificatecheckdate(String qualificatecheckdate) {
		this.qualificatecheckdate = qualificatecheckdate;
	}

	public String getQualificatecheckresult() {
		return qualificatecheckresult;
	}

	public void setQualificatecheckresult(String qualificatecheckresult) {
		this.qualificatecheckresult = qualificatecheckresult;
	}

	public String getTenderdate() {
		return tenderdate;
	}

	public void setTenderdate(String tenderdate) {
		this.tenderdate = tenderdate;
	}

	public String getTenderenddate() {
		return tenderenddate;
	}

	public void setTenderenddate(String tenderenddate) {
		this.tenderenddate = tenderenddate;
	}

	public String getTendercompanyname() {
		return tendercompanyname;
	}

	public void setTendercompanyname(String tendercompanyname) {
		this.tendercompanyname = tendercompanyname;
	}

	public String getTendercompanycontactname() {
		return tendercompanycontactname;
	}

	public void setTendercompanycontactname(String tendercompanycontactname) {
		this.tendercompanycontactname = tendercompanycontactname;
	}

	public String getTendercompanycontactphone() {
		return tendercompanycontactphone;
	}

	public void setTendercompanycontactphone(String tendercompanycontactphone) {
		this.tendercompanycontactphone = tendercompanycontactphone;
	}

	public String getBidorginazationmode() {
		return bidorginazationmode;
	}

	public void setBidorginazationmode(String bidorginazationmode) {
		this.bidorginazationmode = bidorginazationmode;
	}

	public String getBidcompanyname() {
		return bidcompanyname;
	}

	public void setBidcompanyname(String bidcompanyname) {
		this.bidcompanyname = bidcompanyname;
	}

	public String getBidofferdate() {
		return bidofferdate;
	}

	public void setBidofferdate(String bidofferdate) {
		this.bidofferdate = bidofferdate;
	}

	public double getBidofferamount() {
		return bidofferamount;
	}

	public void setBidofferamount(double bidofferamount) {
		this.bidofferamount = bidofferamount;
	}

	public String getBidofferamountcurrency() {
		return bidofferamountcurrency;
	}

	public void setBidofferamountcurrency(String bidofferamountcurrency) {
		this.bidofferamountcurrency = bidofferamountcurrency;
	}

	public String getIsbid() {
		return isbid;
	}

	public void setIsbid(String isbid) {
		this.isbid = isbid;
	}

	public double getBidamount() {
		return bidamount;
	}

	public void setBidamount(double bidamount) {
		this.bidamount = bidamount;
	}

	public String getBidamountcurrency() {
		return bidamountcurrency;
	}

	public void setBidamountcurrency(String bidamountcurrency) {
		this.bidamountcurrency = bidamountcurrency;
	}

	public String getIsbidcomments() {
		return isbidcomments;
	}

	public void setIsbidcomments(String isbidcomments) {
		this.isbidcomments = isbidcomments;
	}

	public String getBiddate() {
		return biddate;
	}

	public void setBiddate(String biddate) {
		this.biddate = biddate;
	}

	public String getSupervisorcompanyname() {
		return supervisorcompanyname;
	}

	public void setSupervisorcompanyname(String supervisorcompanyname) {
		this.supervisorcompanyname = supervisorcompanyname;
	}

	public String getSupervisorcompanycontactname() {
		return supervisorcompanycontactname;
	}

	public void setSupervisorcompanycontactname(String supervisorcompanycontactname) {
		this.supervisorcompanycontactname = supervisorcompanycontactname;
	}

	public String getSupervisorcompanycontactphone() {
		return supervisorcompanycontactphone;
	}

	public void setSupervisorcompanycontactphone(
			String supervisorcompanycontactphone) {
		this.supervisorcompanycontactphone = supervisorcompanycontactphone;
	}

	public String getProjectactualstartdate() {
		return projectactualstartdate;
	}

	public void setProjectactualstartdate(String projectactualstartdate) {
		this.projectactualstartdate = projectactualstartdate;
	}

	public String getProjectacutalenddate() {
		return projectacutalenddate;
	}

	public void setProjectacutalenddate(String projectacutalenddate) {
		this.projectacutalenddate = projectacutalenddate;
	}

	public String getIsralationinvestproject() {
		return isralationinvestproject;
	}

	public void setIsralationinvestproject(String isralationinvestproject) {
		this.isralationinvestproject = isralationinvestproject;
	}

	public String getInvestprojecttype() {
		return investprojecttype;
	}

	public void setInvestprojecttype(String investprojecttype) {
		this.investprojecttype = investprojecttype;
	}

	public String getRelationinvestprojectcompany() {
		return relationinvestprojectcompany;
	}

	public void setRelationinvestprojectcompany(String relationinvestprojectcompany) {
		this.relationinvestprojectcompany = relationinvestprojectcompany;
	}

	public String getProjecthignlights() {
		return projecthignlights;
	}

	public void setProjecthignlights(String projecthignlights) {
		this.projecthignlights = projecthignlights;
	}

	public String getProjectmainstructure() {
		return projectmainstructure;
	}

	public void setProjectmainstructure(String projectmainstructure) {
		this.projectmainstructure = projectmainstructure;
	}

	public double getSteelproducts() {
		return steelproducts;
	}

	public void setSteelproducts(double steelproducts) {
		this.steelproducts = steelproducts;
	}

	public double getCement() {
		return cement;
	}

	public void setCement(double cement) {
		this.cement = cement;
	}

	public double getWood() {
		return wood;
	}

	public void setWood(double wood) {
		this.wood = wood;
	}

	public double getConcrete() {
		return concrete;
	}

	public void setConcrete(double concrete) {
		this.concrete = concrete;
	}

	public double getEarthwork() {
		return earthwork;
	}

	public void setEarthwork(double earthwork) {
		this.earthwork = earthwork;
	}

	public double getRock() {
		return rock;
	}

	public void setRock(double rock) {
		this.rock = rock;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getIsmiancontract() {
		return ismiancontract;
	}

	public void setIsmiancontract(String ismiancontract) {
		this.ismiancontract = ismiancontract;
	}

	public String getIsstartnosigned() {
		return isstartnosigned;
	}

	public void setIsstartnosigned(String isstartnosigned) {
		this.isstartnosigned = isstartnosigned;
	}

	public double getMaincontractamount() {
		return maincontractamount;
	}

	public void setMaincontractamount(double maincontractamount) {
		this.maincontractamount = maincontractamount;
	}

	public double getChangedmaincontractamount() {
		return changedmaincontractamount;
	}

	public void setChangedmaincontractamount(double changedmaincontractamount) {
		this.changedmaincontractamount = changedmaincontractamount;
	}

	public double getContractduration() {
		return contractduration;
	}

	public void setContractduration(double contractduration) {
		this.contractduration = contractduration;
	}

	public String getContractstartdate() {
		return contractstartdate;
	}

	public void setContractstartdate(String contractstartdate) {
		this.contractstartdate = contractstartdate;
	}

	public String getActualstartdate() {
		return actualstartdate;
	}

	public void setActualstartdate(String actualstartdate) {
		this.actualstartdate = actualstartdate;
	}

	public String getContractenddate() {
		return contractenddate;
	}

	public void setContractenddate(String contractenddate) {
		this.contractenddate = contractenddate;
	}

	public String getActualenddate() {
		return actualenddate;
	}

	public void setActualenddate(String actualenddate) {
		this.actualenddate = actualenddate;
	}

	public String getIsinnersubcontract() {
		return isinnersubcontract;
	}

	public void setIsinnersubcontract(String isinnersubcontract) {
		this.isinnersubcontract = isinnersubcontract;
	}

	public double getConstructrutefee() {
		return constructrutefee;
	}

	public void setConstructrutefee(double constructrutefee) {
		this.constructrutefee = constructrutefee;
	}

	public double getBuybackduration() {
		return buybackduration;
	}

	public void setBuybackduration(double buybackduration) {
		this.buybackduration = buybackduration;
	}

	public String getContractbrank() {
		return contractbrank;
	}

	public void setContractbrank(String contractbrank) {
		this.contractbrank = contractbrank;
	}

	public String getContractbrankname() {
		return contractbrankname;
	}

	public void setContractbrankname(String contractbrankname) {
		this.contractbrankname = contractbrankname;
	}

	public String getImplementcompanyname() {
		return implementcompanyname;
	}

	public void setImplementcompanyname(String implementcompanyname) {
		this.implementcompanyname = implementcompanyname;
	}

	public double getAdvancepaymentratio() {
		return advancepaymentratio;
	}

	public void setAdvancepaymentratio(double advancepaymentratio) {
		this.advancepaymentratio = advancepaymentratio;
	}

	public double getCollectedamountratio() {
		return collectedamountratio;
	}

	public void setCollectedamountratio(double collectedamountratio) {
		this.collectedamountratio = collectedamountratio;
	}

	public double getQualityassuranceratio() {
		return qualityassuranceratio;
	}

	public void setQualityassuranceratio(double qualityassuranceratio) {
		this.qualityassuranceratio = qualityassuranceratio;
	}

	public double getQualityassurancetime() {
		return qualityassurancetime;
	}

	public void setQualityassurancetime(double qualityassurancetime) {
		this.qualityassurancetime = qualityassurancetime;
	}

	public String getPerformancetype() {
		return performancetype;
	}

	public void setPerformancetype(String performancetype) {
		this.performancetype = performancetype;
	}

	public double getPerformanceamount() {
		return performanceamount;
	}

	public void setPerformanceamount(double performanceamount) {
		this.performanceamount = performanceamount;
	}

	public String getPerformancecurrency() {
		return performancecurrency;
	}

	public void setPerformancecurrency(String performancecurrency) {
		this.performancecurrency = performancecurrency;
	}

	public String getPm() {
		return pm;
	}

	public void setPm(String pm) {
		this.pm = pm;
	}

	public String getPmcontactphone() {
		return pmcontactphone;
	}

	public void setPmcontactphone(String pmcontactphone) {
		this.pmcontactphone = pmcontactphone;
	}

	public String getChiefengineer() {
		return chiefengineer;
	}

	public void setChiefengineer(String chiefengineer) {
		this.chiefengineer = chiefengineer;
	}

	public String getChiefengineercontactphone() {
		return chiefengineercontactphone;
	}

	public void setChiefengineercontactphone(String chiefengineercontactphone) {
		this.chiefengineercontactphone = chiefengineercontactphone;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getOfficephone() {
		return officephone;
	}

	public void setOfficephone(String officephone) {
		this.officephone = officephone;
	}

	public String getProjectaddress() {
		return projectaddress;
	}

	public void setProjectaddress(String projectaddress) {
		this.projectaddress = projectaddress;
	}

	public String getProjectgps() {
		return projectgps;
	}

	public void setProjectgps(String projectgps) {
		this.projectgps = projectgps;
	}

	public String getDisignstandard() {
		return disignstandard;
	}

	public void setDisignstandard(String disignstandard) {
		this.disignstandard = disignstandard;
	}

	public String getProjectcontractlanguage() {
		return projectcontractlanguage;
	}

	public void setProjectcontractlanguage(String projectcontractlanguage) {
		this.projectcontractlanguage = projectcontractlanguage;
	}

	public String getProjectcommunicatelanguage() {
		return projectcommunicatelanguage;
	}

	public void setProjectcommunicatelanguage(String projectcommunicatelanguage) {
		this.projectcommunicatelanguage = projectcommunicatelanguage;
	}

	public double getProjectadvancepaymentamount() {
		return projectadvancepaymentamount;
	}

	public void setProjectadvancepaymentamount(double projectadvancepaymentamount) {
		this.projectadvancepaymentamount = projectadvancepaymentamount;
	}

	public double getForeignadvancepaymentratio() {
		return foreignadvancepaymentratio;
	}

	public void setForeignadvancepaymentratio(double foreignadvancepaymentratio) {
		this.foreignadvancepaymentratio = foreignadvancepaymentratio;
	}

	public String getBasestatus() {
		return basestatus;
	}

	public void setBasestatus(String basestatus) {
		this.basestatus = basestatus;
	}

	public String getTrackstatus() {
		return trackstatus;
	}

	public void setTrackstatus(String trackstatus) {
		this.trackstatus = trackstatus;
	}

	public String getContractstatus() {
		return contractstatus;
	}

	public void setContractstatus(String contractstatus) {
		this.contractstatus = contractstatus;
	}

	public String getIfsynchronize() {
		return ifsynchronize;
	}

	public void setIfsynchronize(String ifsynchronize) {
		this.ifsynchronize = ifsynchronize;
	}

	public String getPlatformid() {
		return platformid;
	}

	public void setPlatformid(String platformid) {
		this.platformid = platformid;
	}

	public String getBaselastupdatetime() {
		return baselastupdatetime;
	}

	public void setBaselastupdatetime(String baselastupdatetime) {
		this.baselastupdatetime = baselastupdatetime;
	}

	public String getTracklastupdatetime() {
		return tracklastupdatetime;
	}

	public void setTracklastupdatetime(String tracklastupdatetime) {
		this.tracklastupdatetime = tracklastupdatetime;
	}

	public String getContractlastupdatetime() {
		return contractlastupdatetime;
	}

	public void setContractlastupdatetime(String contractlastupdatetime) {
		this.contractlastupdatetime = contractlastupdatetime;
	}

	public String getBaserecid() {
		return baserecid;
	}

	public void setBaserecid(String baserecid) {
		this.baserecid = baserecid;
	}

	public String getTrackrecid() {
		return trackrecid;
	}

	public void setTrackrecid(String trackrecid) {
		this.trackrecid = trackrecid;
	}

	public String getContractrecid() {
		return contractrecid;
	}

	public void setContractrecid(String contractrecid) {
		this.contractrecid = contractrecid;
	}

	public String getDatastatus() {
		return datastatus;
	}

	public void setDatastatus(String datastatus) {
		this.datastatus = datastatus;
	}

	public String getContractchangerecid() {
		return contractchangerecid;
	}

	public void setContractchangerecid(String contractchangerecid) {
		this.contractchangerecid = contractchangerecid;
	}

	public String getIsnatoincooperproject() {
		return isnatoincooperproject;
	}

	public void setIsnatoincooperproject(String isnatoincooperproject) {
		this.isnatoincooperproject = isnatoincooperproject;
	}

	public double getChinarange() {
		return chinarange;
	}

	public void setChinarange(double chinarange) {
		this.chinarange = chinarange;
	}

	public double getDriveexportcondition() {
		return driveexportcondition;
	}

	public void setDriveexportcondition(double driveexportcondition) {
		this.driveexportcondition = driveexportcondition;
	}

	public String getRelationinvestprojectcompanyname() {
		return relationinvestprojectcompanyname;
	}

	public void setRelationinvestprojectcompanyname(
			String relationinvestprojectcompanyname) {
		this.relationinvestprojectcompanyname = relationinvestprojectcompanyname;
	}

	public String getSgstandard() {
		return sgstandard;
	}

	public void setSgstandard(String sgstandard) {
		this.sgstandard = sgstandard;
	}

	public String getBidareahq() {
		return bidareahq;
	}

	public void setBidareahq(String bidareahq) {
		this.bidareahq = bidareahq;
	}

	public String getBidbusinessunit() {
		return bidbusinessunit;
	}

	public void setBidbusinessunit(String bidbusinessunit) {
		this.bidbusinessunit = bidbusinessunit;
	}

	public String getJtstatisticsyear() {
		return jtstatisticsyear;
	}

	public void setJtstatisticsyear(String jtstatisticsyear) {
		this.jtstatisticsyear = jtstatisticsyear;
	}

	public String getJtstatisticsmonth() {
		return jtstatisticsmonth;
	}

	public void setJtstatisticsmonth(String jtstatisticsmonth) {
		this.jtstatisticsmonth = jtstatisticsmonth;
	}

	public List<JtOtherCompanyBid> getJtothercompanybids() {
		return jtothercompanybids;
	}

	public void setJtothercompanybids(List<JtOtherCompanyBid> jtothercompanybids) {
		this.jtothercompanybids = jtothercompanybids;
	}

	public List<JtProjectInsurance> getProjectinsurances() {
		return projectinsurances;
	}

	public void setProjectinsurances(List<JtProjectInsurance> projectinsurances) {
		this.projectinsurances = projectinsurances;
	}
	
	
	
	
}
