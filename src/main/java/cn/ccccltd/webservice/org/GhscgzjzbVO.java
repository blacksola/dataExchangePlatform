
package cn.ccccltd.webservice.org;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ghscgzjzbVO complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ghscgzjzbVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://org.webservice.ccccltd.cn/}voSupport"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bdmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cxmid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ddckqk_hw" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="gjhylb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htedw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfcfwt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfgjcnhzxm_hw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfwjhnxm_gh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfzdjkxm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sjdw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sjdwqt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssyw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stdname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="swbxmlx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tsztyysm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tzly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmhzfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmlx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmmcyw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmszd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmtszt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ghscgzjzbVO", propOrder = {
    "bdmc",
    "cxmid",
    "ddckqkHw",
    "gjhylb",
    "htedw",
    "orgunit",
    "recid",
    "sfcfwt",
    "sfgjcnhzxmHw",
    "sfwjhnxmGh",
    "sfzdjkxm",
    "sjdw",
    "sjdwqt",
    "ssyw",
    "stdname",
    "swbxmlx",
    "tsztyysm",
    "tzly",
    "xmhzfs",
    "xmlx",
    "xmmcyw",
    "xmszd",
    "xmtszt",
    "yzdw",
    "yzdwqt",
    "yztze",
    "zgcfblHw",
    "zjhyflx",
    "zjlydx",
    "zygcnr"
})
public class GhscgzjzbVO
    extends VoSupport
{

    protected String bdmc;
    protected String cxmid;
    @XmlElement(name = "ddckqk_hw")
    protected double ddckqkHw;
    protected String gjhylb;
    protected String htedw;
    protected String orgunit;
    protected String recid;
    protected String sfcfwt;
    @XmlElement(name = "sfgjcnhzxm_hw")
    protected String sfgjcnhzxmHw;
    @XmlElement(name = "sfwjhnxm_gh")
    protected String sfwjhnxmGh;
    protected String sfzdjkxm;
    protected String sjdw;
    protected String sjdwqt;
    protected String ssyw;
    protected String stdname;
    protected String swbxmlx;
    protected String tsztyysm;
    protected String tzly;
    protected String xmhzfs;
    protected String xmlx;
    protected String xmmcyw;
    protected String xmszd;
    protected String xmtszt;
    protected String yzdw;
    protected String yzdwqt;
    protected double yztze;
    @XmlElement(name = "zgcfbl_hw")
    protected double zgcfblHw;
    protected String zjhyflx;
    protected String zjlydx;
    protected String zygcnr;

    /**
     * ��ȡbdmc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBdmc() {
        return bdmc;
    }

    /**
     * ����bdmc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBdmc(String value) {
        this.bdmc = value;
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
     * ��ȡhtedw���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtedw() {
        return htedw;
    }

    /**
     * ����htedw���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtedw(String value) {
        this.htedw = value;
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
     * ��ȡsjdw���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSjdw() {
        return sjdw;
    }

    /**
     * ����sjdw���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSjdw(String value) {
        this.sjdw = value;
    }

    /**
     * ��ȡsjdwqt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSjdwqt() {
        return sjdwqt;
    }

    /**
     * ����sjdwqt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSjdwqt(String value) {
        this.sjdwqt = value;
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
