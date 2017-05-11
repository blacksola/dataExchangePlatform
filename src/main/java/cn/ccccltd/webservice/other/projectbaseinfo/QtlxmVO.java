
package cn.ccccltd.webservice.other.projectbaseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>qtlxmVO complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="qtlxmVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://projectbaseinfo.other.webservice.ccccltd.cn/}voSupport"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctyear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="basedatamarker" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bghhtgq" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bghzhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bghzzcdhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="billcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billdefine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creater" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createuser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createuserid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cxmid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defineid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dwqypp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gddh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gddh1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gjhylb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htbh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="htgq" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="htjf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htjfnb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htkgrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htqdfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htqdrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htwgrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htyfid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invalidtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isdraft" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="isleaf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jedw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jedw_fz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="level_1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="modifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifytime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifyuser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifyuserid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qyzx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qyzzmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recver" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="resid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="schemeid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sffb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfhw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sftzxm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfwqyyss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shortname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sjkgrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sjwgrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sortorder" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ssqy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssyw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stdcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stdname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submittime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submitunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submituser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submituserid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tel1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tjgsyf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tzly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="workflowstate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="xmbd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmhzfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmlx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmmcyw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmszd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yzdw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yzzjly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zjhyfl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zzcdhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qtlxmVO", propOrder = {
    "acctyear",
    "basedatamarker",
    "bghhtgq",
    "bghzhte",
    "bghzzcdhte",
    "billcode",
    "billdate",
    "billdefine",
    "billtime",
    "creater",
    "createtime",
    "createunit",
    "createuser",
    "createuserid",
    "creator",
    "cxmid",
    "defineid",
    "dwqypp",
    "gddh",
    "gddh1",
    "gjhylb",
    "htbh",
    "hte",
    "htgq",
    "htjf",
    "htjfnb",
    "htkgrq",
    "htmc",
    "htqdfs",
    "htqdrq",
    "htwgrq",
    "htyfid",
    "invalidtime",
    "isdraft",
    "isleaf",
    "jedw",
    "jedwFz",
    "level1",
    "modifier",
    "modifytime",
    "modifyuser",
    "modifyuserid",
    "objectid",
    "orgunit",
    "parents",
    "qyzx",
    "qyzzmc",
    "recid",
    "recver",
    "resid",
    "schemeid",
    "sffb",
    "sfhw",
    "sftzxm",
    "sfwqyyss",
    "shortname",
    "sjkgrq",
    "sjwgrq",
    "sortorder",
    "ssqy",
    "ssyw",
    "startflag",
    "stdcode",
    "stdname",
    "submittime",
    "submitunit",
    "submituser",
    "submituserid",
    "tel",
    "tel1",
    "tjgsyf",
    "tzly",
    "unitid",
    "validtime",
    "workflowstate",
    "xmbd",
    "xmhzfs",
    "xmlx",
    "xmmcyw",
    "xmszd",
    "yzdw",
    "yzzjly",
    "zjhyfl",
    "zzcdhte"
})
public class QtlxmVO
    extends VoSupport
{

    protected int acctyear;
    protected int basedatamarker;
    protected double bghhtgq;
    protected double bghzhte;
    protected double bghzzcdhte;
    protected String billcode;
    protected String billdate;
    protected String billdefine;
    protected String billtime;
    protected String creater;
    protected String createtime;
    protected String createunit;
    protected String createuser;
    protected String createuserid;
    protected String creator;
    protected String cxmid;
    protected String defineid;
    protected String dwqypp;
    protected String gddh;
    protected String gddh1;
    protected String gjhylb;
    protected String htbh;
    protected double hte;
    protected double htgq;
    protected String htjf;
    protected String htjfnb;
    protected String htkgrq;
    protected String htmc;
    protected String htqdfs;
    protected String htqdrq;
    protected String htwgrq;
    protected String htyfid;
    protected String invalidtime;
    protected byte isdraft;
    protected String isleaf;
    protected String jedw;
    @XmlElement(name = "jedw_fz")
    protected String jedwFz;
    @XmlElement(name = "level_1")
    protected int level1;
    protected String modifier;
    protected String modifytime;
    protected String modifyuser;
    protected String modifyuserid;
    protected String objectid;
    protected String orgunit;
    protected String parents;
    protected String qyzx;
    protected String qyzzmc;
    protected String recid;
    protected double recver;
    protected String resid;
    protected String schemeid;
    protected String sffb;
    protected String sfhw;
    protected String sftzxm;
    protected String sfwqyyss;
    protected String shortname;
    protected String sjkgrq;
    protected String sjwgrq;
    protected int sortorder;
    protected String ssqy;
    protected String ssyw;
    protected String startflag;
    protected String stdcode;
    protected String stdname;
    protected String submittime;
    protected String submitunit;
    protected String submituser;
    protected String submituserid;
    protected String tel;
    protected String tel1;
    protected String tjgsyf;
    protected String tzly;
    protected String unitid;
    protected String validtime;
    protected int workflowstate;
    protected String xmbd;
    protected String xmhzfs;
    protected String xmlx;
    protected String xmmcyw;
    protected String xmszd;
    protected String yzdw;
    protected String yzzjly;
    protected String zjhyfl;
    protected double zzcdhte;

    /**
     * ��ȡacctyear���Ե�ֵ��
     * 
     */
    public int getAcctyear() {
        return acctyear;
    }

    /**
     * ����acctyear���Ե�ֵ��
     * 
     */
    public void setAcctyear(int value) {
        this.acctyear = value;
    }

    /**
     * ��ȡbasedatamarker���Ե�ֵ��
     * 
     */
    public int getBasedatamarker() {
        return basedatamarker;
    }

    /**
     * ����basedatamarker���Ե�ֵ��
     * 
     */
    public void setBasedatamarker(int value) {
        this.basedatamarker = value;
    }

    /**
     * ��ȡbghhtgq���Ե�ֵ��
     * 
     */
    public double getBghhtgq() {
        return bghhtgq;
    }

    /**
     * ����bghhtgq���Ե�ֵ��
     * 
     */
    public void setBghhtgq(double value) {
        this.bghhtgq = value;
    }

    /**
     * ��ȡbghzhte���Ե�ֵ��
     * 
     */
    public double getBghzhte() {
        return bghzhte;
    }

    /**
     * ����bghzhte���Ե�ֵ��
     * 
     */
    public void setBghzhte(double value) {
        this.bghzhte = value;
    }

    /**
     * ��ȡbghzzcdhte���Ե�ֵ��
     * 
     */
    public double getBghzzcdhte() {
        return bghzzcdhte;
    }

    /**
     * ����bghzzcdhte���Ե�ֵ��
     * 
     */
    public void setBghzzcdhte(double value) {
        this.bghzzcdhte = value;
    }

    /**
     * ��ȡbillcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillcode() {
        return billcode;
    }

    /**
     * ����billcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillcode(String value) {
        this.billcode = value;
    }

    /**
     * ��ȡbilldate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilldate() {
        return billdate;
    }

    /**
     * ����billdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilldate(String value) {
        this.billdate = value;
    }

    /**
     * ��ȡbilldefine���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilldefine() {
        return billdefine;
    }

    /**
     * ����billdefine���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilldefine(String value) {
        this.billdefine = value;
    }

    /**
     * ��ȡbilltime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilltime() {
        return billtime;
    }

    /**
     * ����billtime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilltime(String value) {
        this.billtime = value;
    }

    /**
     * ��ȡcreater���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreater() {
        return creater;
    }

    /**
     * ����creater���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreater(String value) {
        this.creater = value;
    }

    /**
     * ��ȡcreatetime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * ����createtime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatetime(String value) {
        this.createtime = value;
    }

    /**
     * ��ȡcreateunit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateunit() {
        return createunit;
    }

    /**
     * ����createunit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateunit(String value) {
        this.createunit = value;
    }

    /**
     * ��ȡcreateuser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * ����createuser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateuser(String value) {
        this.createuser = value;
    }

    /**
     * ��ȡcreateuserid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateuserid() {
        return createuserid;
    }

    /**
     * ����createuserid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateuserid(String value) {
        this.createuserid = value;
    }

    /**
     * ��ȡcreator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * ����creator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * ��ȡcxmid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxmid() {
        return cxmid;
    }

    /**
     * ����cxmid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxmid(String value) {
        this.cxmid = value;
    }

    /**
     * ��ȡdefineid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefineid() {
        return defineid;
    }

    /**
     * ����defineid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefineid(String value) {
        this.defineid = value;
    }

    /**
     * ��ȡdwqypp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDwqypp() {
        return dwqypp;
    }

    /**
     * ����dwqypp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDwqypp(String value) {
        this.dwqypp = value;
    }

    /**
     * ��ȡgddh���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGddh() {
        return gddh;
    }

    /**
     * ����gddh���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGddh(String value) {
        this.gddh = value;
    }

    /**
     * ��ȡgddh1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGddh1() {
        return gddh1;
    }

    /**
     * ����gddh1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGddh1(String value) {
        this.gddh1 = value;
    }

    /**
     * ��ȡgjhylb���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGjhylb() {
        return gjhylb;
    }

    /**
     * ����gjhylb���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGjhylb(String value) {
        this.gjhylb = value;
    }

    /**
     * ��ȡhtbh���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtbh() {
        return htbh;
    }

    /**
     * ����htbh���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtbh(String value) {
        this.htbh = value;
    }

    /**
     * ��ȡhte���Ե�ֵ��
     * 
     */
    public double getHte() {
        return hte;
    }

    /**
     * ����hte���Ե�ֵ��
     * 
     */
    public void setHte(double value) {
        this.hte = value;
    }

    /**
     * ��ȡhtgq���Ե�ֵ��
     * 
     */
    public double getHtgq() {
        return htgq;
    }

    /**
     * ����htgq���Ե�ֵ��
     * 
     */
    public void setHtgq(double value) {
        this.htgq = value;
    }

    /**
     * ��ȡhtjf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtjf() {
        return htjf;
    }

    /**
     * ����htjf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtjf(String value) {
        this.htjf = value;
    }

    /**
     * ��ȡhtjfnb���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtjfnb() {
        return htjfnb;
    }

    /**
     * ����htjfnb���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtjfnb(String value) {
        this.htjfnb = value;
    }

    /**
     * ��ȡhtkgrq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtkgrq() {
        return htkgrq;
    }

    /**
     * ����htkgrq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtkgrq(String value) {
        this.htkgrq = value;
    }

    /**
     * ��ȡhtmc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmc() {
        return htmc;
    }

    /**
     * ����htmc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmc(String value) {
        this.htmc = value;
    }

    /**
     * ��ȡhtqdfs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtqdfs() {
        return htqdfs;
    }

    /**
     * ����htqdfs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtqdfs(String value) {
        this.htqdfs = value;
    }

    /**
     * ��ȡhtqdrq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtqdrq() {
        return htqdrq;
    }

    /**
     * ����htqdrq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtqdrq(String value) {
        this.htqdrq = value;
    }

    /**
     * ��ȡhtwgrq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtwgrq() {
        return htwgrq;
    }

    /**
     * ����htwgrq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtwgrq(String value) {
        this.htwgrq = value;
    }

    /**
     * ��ȡhtyfid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtyfid() {
        return htyfid;
    }

    /**
     * ����htyfid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtyfid(String value) {
        this.htyfid = value;
    }

    /**
     * ��ȡinvalidtime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvalidtime() {
        return invalidtime;
    }

    /**
     * ����invalidtime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvalidtime(String value) {
        this.invalidtime = value;
    }

    /**
     * ��ȡisdraft���Ե�ֵ��
     * 
     */
    public byte getIsdraft() {
        return isdraft;
    }

    /**
     * ����isdraft���Ե�ֵ��
     * 
     */
    public void setIsdraft(byte value) {
        this.isdraft = value;
    }

    /**
     * ��ȡisleaf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsleaf() {
        return isleaf;
    }

    /**
     * ����isleaf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsleaf(String value) {
        this.isleaf = value;
    }

    /**
     * ��ȡjedw���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJedw() {
        return jedw;
    }

    /**
     * ����jedw���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJedw(String value) {
        this.jedw = value;
    }

    /**
     * ��ȡjedwFz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJedwFz() {
        return jedwFz;
    }

    /**
     * ����jedwFz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJedwFz(String value) {
        this.jedwFz = value;
    }

    /**
     * ��ȡlevel1���Ե�ֵ��
     * 
     */
    public int getLevel1() {
        return level1;
    }

    /**
     * ����level1���Ե�ֵ��
     * 
     */
    public void setLevel1(int value) {
        this.level1 = value;
    }

    /**
     * ��ȡmodifier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * ����modifier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifier(String value) {
        this.modifier = value;
    }

    /**
     * ��ȡmodifytime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifytime() {
        return modifytime;
    }

    /**
     * ����modifytime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifytime(String value) {
        this.modifytime = value;
    }

    /**
     * ��ȡmodifyuser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyuser() {
        return modifyuser;
    }

    /**
     * ����modifyuser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyuser(String value) {
        this.modifyuser = value;
    }

    /**
     * ��ȡmodifyuserid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyuserid() {
        return modifyuserid;
    }

    /**
     * ����modifyuserid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyuserid(String value) {
        this.modifyuserid = value;
    }

    /**
     * ��ȡobjectid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectid() {
        return objectid;
    }

    /**
     * ����objectid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectid(String value) {
        this.objectid = value;
    }

    /**
     * ��ȡorgunit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgunit() {
        return orgunit;
    }

    /**
     * ����orgunit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgunit(String value) {
        this.orgunit = value;
    }

    /**
     * ��ȡparents���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParents() {
        return parents;
    }

    /**
     * ����parents���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParents(String value) {
        this.parents = value;
    }

    /**
     * ��ȡqyzx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQyzx() {
        return qyzx;
    }

    /**
     * ����qyzx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQyzx(String value) {
        this.qyzx = value;
    }

    /**
     * ��ȡqyzzmc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQyzzmc() {
        return qyzzmc;
    }

    /**
     * ����qyzzmc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQyzzmc(String value) {
        this.qyzzmc = value;
    }

    /**
     * ��ȡrecid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecid() {
        return recid;
    }

    /**
     * ����recid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecid(String value) {
        this.recid = value;
    }

    /**
     * ��ȡrecver���Ե�ֵ��
     * 
     */
    public double getRecver() {
        return recver;
    }

    /**
     * ����recver���Ե�ֵ��
     * 
     */
    public void setRecver(double value) {
        this.recver = value;
    }

    /**
     * ��ȡresid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResid() {
        return resid;
    }

    /**
     * ����resid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResid(String value) {
        this.resid = value;
    }

    /**
     * ��ȡschemeid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeid() {
        return schemeid;
    }

    /**
     * ����schemeid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeid(String value) {
        this.schemeid = value;
    }

    /**
     * ��ȡsffb���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSffb() {
        return sffb;
    }

    /**
     * ����sffb���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSffb(String value) {
        this.sffb = value;
    }

    /**
     * ��ȡsfhw���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfhw() {
        return sfhw;
    }

    /**
     * ����sfhw���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfhw(String value) {
        this.sfhw = value;
    }

    /**
     * ��ȡsftzxm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSftzxm() {
        return sftzxm;
    }

    /**
     * ����sftzxm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSftzxm(String value) {
        this.sftzxm = value;
    }

    /**
     * ��ȡsfwqyyss���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfwqyyss() {
        return sfwqyyss;
    }

    /**
     * ����sfwqyyss���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfwqyyss(String value) {
        this.sfwqyyss = value;
    }

    /**
     * ��ȡshortname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * ����shortname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortname(String value) {
        this.shortname = value;
    }

    /**
     * ��ȡsjkgrq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSjkgrq() {
        return sjkgrq;
    }

    /**
     * ����sjkgrq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSjkgrq(String value) {
        this.sjkgrq = value;
    }

    /**
     * ��ȡsjwgrq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSjwgrq() {
        return sjwgrq;
    }

    /**
     * ����sjwgrq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSjwgrq(String value) {
        this.sjwgrq = value;
    }

    /**
     * ��ȡsortorder���Ե�ֵ��
     * 
     */
    public int getSortorder() {
        return sortorder;
    }

    /**
     * ����sortorder���Ե�ֵ��
     * 
     */
    public void setSortorder(int value) {
        this.sortorder = value;
    }

    /**
     * ��ȡssqy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsqy() {
        return ssqy;
    }

    /**
     * ����ssqy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsqy(String value) {
        this.ssqy = value;
    }

    /**
     * ��ȡssyw���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsyw() {
        return ssyw;
    }

    /**
     * ����ssyw���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsyw(String value) {
        this.ssyw = value;
    }

    /**
     * ��ȡstartflag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartflag() {
        return startflag;
    }

    /**
     * ����startflag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartflag(String value) {
        this.startflag = value;
    }

    /**
     * ��ȡstdcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdcode() {
        return stdcode;
    }

    /**
     * ����stdcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdcode(String value) {
        this.stdcode = value;
    }

    /**
     * ��ȡstdname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdname() {
        return stdname;
    }

    /**
     * ����stdname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdname(String value) {
        this.stdname = value;
    }

    /**
     * ��ȡsubmittime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmittime() {
        return submittime;
    }

    /**
     * ����submittime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmittime(String value) {
        this.submittime = value;
    }

    /**
     * ��ȡsubmitunit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitunit() {
        return submitunit;
    }

    /**
     * ����submitunit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitunit(String value) {
        this.submitunit = value;
    }

    /**
     * ��ȡsubmituser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmituser() {
        return submituser;
    }

    /**
     * ����submituser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmituser(String value) {
        this.submituser = value;
    }

    /**
     * ��ȡsubmituserid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmituserid() {
        return submituserid;
    }

    /**
     * ����submituserid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmituserid(String value) {
        this.submituserid = value;
    }

    /**
     * ��ȡtel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * ����tel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * ��ȡtel1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel1() {
        return tel1;
    }

    /**
     * ����tel1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel1(String value) {
        this.tel1 = value;
    }

    /**
     * ��ȡtjgsyf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTjgsyf() {
        return tjgsyf;
    }

    /**
     * ����tjgsyf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTjgsyf(String value) {
        this.tjgsyf = value;
    }

    /**
     * ��ȡtzly���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTzly() {
        return tzly;
    }

    /**
     * ����tzly���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTzly(String value) {
        this.tzly = value;
    }

    /**
     * ��ȡunitid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitid() {
        return unitid;
    }

    /**
     * ����unitid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitid(String value) {
        this.unitid = value;
    }

    /**
     * ��ȡvalidtime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidtime() {
        return validtime;
    }

    /**
     * ����validtime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidtime(String value) {
        this.validtime = value;
    }

    /**
     * ��ȡworkflowstate���Ե�ֵ��
     * 
     */
    public int getWorkflowstate() {
        return workflowstate;
    }

    /**
     * ����workflowstate���Ե�ֵ��
     * 
     */
    public void setWorkflowstate(int value) {
        this.workflowstate = value;
    }

    /**
     * ��ȡxmbd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmbd() {
        return xmbd;
    }

    /**
     * ����xmbd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmbd(String value) {
        this.xmbd = value;
    }

    /**
     * ��ȡxmhzfs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmhzfs() {
        return xmhzfs;
    }

    /**
     * ����xmhzfs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmhzfs(String value) {
        this.xmhzfs = value;
    }

    /**
     * ��ȡxmlx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlx() {
        return xmlx;
    }

    /**
     * ����xmlx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlx(String value) {
        this.xmlx = value;
    }

    /**
     * ��ȡxmmcyw���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmmcyw() {
        return xmmcyw;
    }

    /**
     * ����xmmcyw���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmmcyw(String value) {
        this.xmmcyw = value;
    }

    /**
     * ��ȡxmszd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmszd() {
        return xmszd;
    }

    /**
     * ����xmszd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmszd(String value) {
        this.xmszd = value;
    }

    /**
     * ��ȡyzdw���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYzdw() {
        return yzdw;
    }

    /**
     * ����yzdw���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYzdw(String value) {
        this.yzdw = value;
    }

    /**
     * ��ȡyzzjly���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYzzjly() {
        return yzzjly;
    }

    /**
     * ����yzzjly���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYzzjly(String value) {
        this.yzzjly = value;
    }

    /**
     * ��ȡzjhyfl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZjhyfl() {
        return zjhyfl;
    }

    /**
     * ����zjhyfl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZjhyfl(String value) {
        this.zjhyfl = value;
    }

    /**
     * ��ȡzzcdhte���Ե�ֵ��
     * 
     */
    public double getZzcdhte() {
        return zzcdhte;
    }

    /**
     * ����zzcdhte���Ե�ֵ��
     * 
     */
    public void setZzcdhte(double value) {
        this.zzcdhte = value;
    }

}
