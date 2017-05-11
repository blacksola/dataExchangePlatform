
package cn.ccccltd.webservice.design.projectbaseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>sjscgzjzbVO complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="sjscgzjzbVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://projectbaseinfo.design.webservice.ccccltd.cn/}voSupport"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctyear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="basedatamarker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="ddckqk_hw" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="defineid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gjhylb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invalidtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isdraft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isleaf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="level_1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="modifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifytime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifyuser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifyuserid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qyzx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recver" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="resid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="schemeid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfcfwt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfgjcnhzxm_hw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfhw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfwjhnxm_gh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfzdjkxm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shortname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="swbxmlx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tsztyysm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tzly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="workflowstate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="xmbd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmhzfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmlx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmmcyw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmszd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmtszt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yjhtebz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yzdw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yzdwqt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yztze" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="zgcfbl_hw" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="zjhyflx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zjlydx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zygcnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sjscgzjzbVO", propOrder = {
    "acctyear",
    "basedatamarker",
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
    "ddckqkHw",
    "defineid",
    "gjhylb",
    "invalidtime",
    "isdraft",
    "isleaf",
    "level1",
    "modifier",
    "modifytime",
    "modifyuser",
    "modifyuserid",
    "objectid",
    "orgunit",
    "parents",
    "qyzx",
    "recid",
    "recver",
    "resid",
    "schemeid",
    "sfcfwt",
    "sfgjcnhzxmHw",
    "sfhw",
    "sfwjhnxmGh",
    "sfzdjkxm",
    "shortname",
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
    "swbxmlx",
    "tsztyysm",
    "tzly",
    "unitid",
    "validtime",
    "workflowstate",
    "xmbd",
    "xmhzfs",
    "xmlx",
    "xmmcyw",
    "xmszd",
    "xmtszt",
    "yjhtebz",
    "yzdw",
    "yzdwqt",
    "yztze",
    "zgcfblHw",
    "zjhyflx",
    "zjlydx",
    "zygcnr"
})
public class SjscgzjzbVO
    extends VoSupport
{

    protected int acctyear;
    protected String basedatamarker;
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
    @XmlElement(name = "ddckqk_hw")
    protected double ddckqkHw;
    protected String defineid;
    protected String gjhylb;
    protected String invalidtime;
    protected String isdraft;
    protected String isleaf;
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
    protected String recid;
    protected double recver;
    protected String resid;
    protected String schemeid;
    protected String sfcfwt;
    @XmlElement(name = "sfgjcnhzxm_hw")
    protected String sfgjcnhzxmHw;
    protected String sfhw;
    @XmlElement(name = "sfwjhnxm_gh")
    protected String sfwjhnxmGh;
    protected String sfzdjkxm;
    protected String shortname;
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
    protected String swbxmlx;
    protected String tsztyysm;
    protected String tzly;
    protected String unitid;
    protected String validtime;
    protected int workflowstate;
    protected String xmbd;
    protected String xmhzfs;
    protected String xmlx;
    protected String xmmcyw;
    protected String xmszd;
    protected String xmtszt;
    protected String yjhtebz;
    protected String yzdw;
    protected String yzdwqt;
    protected double yztze;
    @XmlElement(name = "zgcfbl_hw")
    protected double zgcfblHw;
    protected String zjhyflx;
    protected String zjlydx;
    protected String zygcnr;

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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasedatamarker() {
        return basedatamarker;
    }

    /**
     * ����basedatamarker���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasedatamarker(String value) {
        this.basedatamarker = value;
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
     * ��ȡddckqkHw���Ե�ֵ��
     * 
     */
    public double getDdckqkHw() {
        return ddckqkHw;
    }

    /**
     * ����ddckqkHw���Ե�ֵ��
     * 
     */
    public void setDdckqkHw(double value) {
        this.ddckqkHw = value;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsdraft() {
        return isdraft;
    }

    /**
     * ����isdraft���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsdraft(String value) {
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
     * ��ȡsfcfwt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfcfwt() {
        return sfcfwt;
    }

    /**
     * ����sfcfwt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfcfwt(String value) {
        this.sfcfwt = value;
    }

    /**
     * ��ȡsfgjcnhzxmHw���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfgjcnhzxmHw() {
        return sfgjcnhzxmHw;
    }

    /**
     * ����sfgjcnhzxmHw���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfgjcnhzxmHw(String value) {
        this.sfgjcnhzxmHw = value;
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
     * ��ȡsfwjhnxmGh���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfwjhnxmGh() {
        return sfwjhnxmGh;
    }

    /**
     * ����sfwjhnxmGh���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfwjhnxmGh(String value) {
        this.sfwjhnxmGh = value;
    }

    /**
     * ��ȡsfzdjkxm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfzdjkxm() {
        return sfzdjkxm;
    }

    /**
     * ����sfzdjkxm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfzdjkxm(String value) {
        this.sfzdjkxm = value;
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
     * ��ȡswbxmlx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwbxmlx() {
        return swbxmlx;
    }

    /**
     * ����swbxmlx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwbxmlx(String value) {
        this.swbxmlx = value;
    }

    /**
     * ��ȡtsztyysm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTsztyysm() {
        return tsztyysm;
    }

    /**
     * ����tsztyysm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTsztyysm(String value) {
        this.tsztyysm = value;
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
     * ��ȡxmtszt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmtszt() {
        return xmtszt;
    }

    /**
     * ����xmtszt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmtszt(String value) {
        this.xmtszt = value;
    }

    /**
     * ��ȡyjhtebz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYjhtebz() {
        return yjhtebz;
    }

    /**
     * ����yjhtebz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYjhtebz(String value) {
        this.yjhtebz = value;
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
     * ��ȡyzdwqt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYzdwqt() {
        return yzdwqt;
    }

    /**
     * ����yzdwqt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYzdwqt(String value) {
        this.yzdwqt = value;
    }

    /**
     * ��ȡyztze���Ե�ֵ��
     * 
     */
    public double getYztze() {
        return yztze;
    }

    /**
     * ����yztze���Ե�ֵ��
     * 
     */
    public void setYztze(double value) {
        this.yztze = value;
    }

    /**
     * ��ȡzgcfblHw���Ե�ֵ��
     * 
     */
    public double getZgcfblHw() {
        return zgcfblHw;
    }

    /**
     * ����zgcfblHw���Ե�ֵ��
     * 
     */
    public void setZgcfblHw(double value) {
        this.zgcfblHw = value;
    }

    /**
     * ��ȡzjhyflx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZjhyflx() {
        return zjhyflx;
    }

    /**
     * ����zjhyflx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZjhyflx(String value) {
        this.zjhyflx = value;
    }

    /**
     * ��ȡzjlydx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZjlydx() {
        return zjlydx;
    }

    /**
     * ����zjlydx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZjlydx(String value) {
        this.zjlydx = value;
    }

    /**
     * ��ȡzygcnr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZygcnr() {
        return zygcnr;
    }

    /**
     * ����zygcnr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZygcnr(String value) {
        this.zygcnr = value;
    }

}
