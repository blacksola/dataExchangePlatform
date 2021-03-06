
package cn.ccccltd.webservice.construction.contractchange;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ghxmjhtVO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ghxmjhtVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://contractchange.construction.webservice.ccccltd.cn/}voSupport"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bghhtgq" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bghtedw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bghzhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bghzzcdhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bgsdh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bxList" type="{http://contractchange.construction.webservice.ccccltd.cn/}hwxmbxVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="chtid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cxmid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dqhl" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="dwqypp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gc" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="gltzxmgs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gpszb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hetdw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hntl" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="htbh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htermb" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="htewy" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="htgq" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="htjf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htjfnb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htjgrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htkgrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htqdfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htqdrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htyfid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hwzdjk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jldw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jldwlxdh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jldwlxr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jtpp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mc" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="orgunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sffb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfgltzxm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfl" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="sggf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sjgf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sjkgrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sn" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ssdwmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tfl" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tjgsyf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tzxmlx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wqyyss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmgkjgm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmhtyy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmjl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmjldh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmjlyy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmld" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmxxtxdz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yfkbl" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ysjdkzfbl" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="yslybzfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yslybzje" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ysyfkbl" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="yszbjbl" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="yszbjqx" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="yzbm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zbxmmcn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zglxdh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ztgcjg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zytkmsbz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zzcdhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="zzcdhtermb" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ghxmjhtVO", propOrder = {
    "bghhtgq",
    "bghtedw",
    "bghzhte",
    "bghzzcdhte",
    "bgsdh",
    "bxList",
    "chtid",
    "cxmid",
    "dqhl",
    "dwqypp",
    "gc",
    "gltzxmgs",
    "gpszb",
    "hetdw",
    "hntl",
    "htbh",
    "htermb",
    "htewy",
    "htgq",
    "htjf",
    "htjfnb",
    "htjgrq",
    "htkgrq",
    "htmc",
    "htqdfs",
    "htqdrq",
    "htyfid",
    "hwzdjk",
    "jldw",
    "jldwlxdh",
    "jldwlxr",
    "jtpp",
    "mc",
    "orgunit",
    "qt",
    "recid",
    "sffb",
    "sfgltzxm",
    "sfl",
    "sggf",
    "sjgf",
    "sjkgrq",
    "sn",
    "ssdwmc",
    "tfl",
    "tjgsyf",
    "tzxmlx",
    "wqyyss",
    "xmgkjgm",
    "xmhtyy",
    "xmjl",
    "xmjldh",
    "xmjlyy",
    "xmld",
    "xmxxtxdz",
    "yfkbl",
    "ysjdkzfbl",
    "yslybzfs",
    "yslybzje",
    "ysyfkbl",
    "yszbjbl",
    "yszbjqx",
    "yzbm",
    "zbxmmcn",
    "zg",
    "zglxdh",
    "ztgcjg",
    "zytkmsbz",
    "zzcdhte",
    "zzcdhtermb"
})
public class GhxmjhtVO
    extends VoSupport
{

    protected double bghhtgq;
    protected String bghtedw;
    protected double bghzhte;
    protected double bghzzcdhte;
    protected String bgsdh;
    @XmlElement(nillable = true)
    protected List<HwxmbxVO> bxList;
    protected String chtid;
    protected String cxmid;
    protected double dqhl;
    protected String dwqypp;
    protected double gc;
    protected String gltzxmgs;
    protected String gpszb;
    protected String hetdw;
    protected double hntl;
    protected String htbh;
    protected double htermb;
    protected double htewy;
    protected double htgq;
    protected String htjf;
    protected String htjfnb;
    protected String htjgrq;
    protected String htkgrq;
    protected String htmc;
    protected String htqdfs;
    protected String htqdrq;
    protected String htyfid;
    protected String hwzdjk;
    protected String jldw;
    protected String jldwlxdh;
    protected String jldwlxr;
    protected String jtpp;
    protected double mc;
    protected String orgunit;
    protected String qt;
    protected String recid;
    protected String sffb;
    protected String sfgltzxm;
    protected double sfl;
    protected String sggf;
    protected String sjgf;
    protected String sjkgrq;
    protected double sn;
    protected String ssdwmc;
    protected double tfl;
    protected String tjgsyf;
    protected String tzxmlx;
    protected String wqyyss;
    protected String xmgkjgm;
    protected String xmhtyy;
    protected String xmjl;
    protected String xmjldh;
    protected String xmjlyy;
    protected String xmld;
    protected String xmxxtxdz;
    protected double yfkbl;
    protected double ysjdkzfbl;
    protected String yslybzfs;
    protected double yslybzje;
    protected double ysyfkbl;
    protected double yszbjbl;
    protected double yszbjqx;
    protected String yzbm;
    protected String zbxmmcn;
    protected String zg;
    protected String zglxdh;
    protected String ztgcjg;
    protected String zytkmsbz;
    protected double zzcdhte;
    protected double zzcdhtermb;

    /**
     * 获取bghhtgq属性的值。
     * 
     */
    public double getBghhtgq() {
        return bghhtgq;
    }

    /**
     * 设置bghhtgq属性的值。
     * 
     */
    public void setBghhtgq(double value) {
        this.bghhtgq = value;
    }

    /**
     * 获取bghtedw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBghtedw() {
        return bghtedw;
    }

    /**
     * 设置bghtedw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBghtedw(String value) {
        this.bghtedw = value;
    }

    /**
     * 获取bghzhte属性的值。
     * 
     */
    public double getBghzhte() {
        return bghzhte;
    }

    /**
     * 设置bghzhte属性的值。
     * 
     */
    public void setBghzhte(double value) {
        this.bghzhte = value;
    }

    /**
     * 获取bghzzcdhte属性的值。
     * 
     */
    public double getBghzzcdhte() {
        return bghzzcdhte;
    }

    /**
     * 设置bghzzcdhte属性的值。
     * 
     */
    public void setBghzzcdhte(double value) {
        this.bghzzcdhte = value;
    }

    /**
     * 获取bgsdh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBgsdh() {
        return bgsdh;
    }

    /**
     * 设置bgsdh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgsdh(String value) {
        this.bgsdh = value;
    }

    /**
     * Gets the value of the bxList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bxList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBxList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HwxmbxVO }
     * 
     * 
     */
    public List<HwxmbxVO> getBxList() {
        if (bxList == null) {
            bxList = new ArrayList<HwxmbxVO>();
        }
        return this.bxList;
    }

    /**
     * 获取chtid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChtid() {
        return chtid;
    }

    /**
     * 设置chtid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChtid(String value) {
        this.chtid = value;
    }

    /**
     * 获取cxmid属性的值。
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
     * 设置cxmid属性的值。
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
     * 获取dqhl属性的值。
     * 
     */
    public double getDqhl() {
        return dqhl;
    }

    /**
     * 设置dqhl属性的值。
     * 
     */
    public void setDqhl(double value) {
        this.dqhl = value;
    }

    /**
     * 获取dwqypp属性的值。
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
     * 设置dwqypp属性的值。
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
     * 获取gc属性的值。
     * 
     */
    public double getGc() {
        return gc;
    }

    /**
     * 设置gc属性的值。
     * 
     */
    public void setGc(double value) {
        this.gc = value;
    }

    /**
     * 获取gltzxmgs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGltzxmgs() {
        return gltzxmgs;
    }

    /**
     * 设置gltzxmgs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGltzxmgs(String value) {
        this.gltzxmgs = value;
    }

    /**
     * 获取gpszb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpszb() {
        return gpszb;
    }

    /**
     * 设置gpszb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpszb(String value) {
        this.gpszb = value;
    }

    /**
     * 获取hetdw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHetdw() {
        return hetdw;
    }

    /**
     * 设置hetdw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHetdw(String value) {
        this.hetdw = value;
    }

    /**
     * 获取hntl属性的值。
     * 
     */
    public double getHntl() {
        return hntl;
    }

    /**
     * 设置hntl属性的值。
     * 
     */
    public void setHntl(double value) {
        this.hntl = value;
    }

    /**
     * 获取htbh属性的值。
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
     * 设置htbh属性的值。
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
     * 获取htermb属性的值。
     * 
     */
    public double getHtermb() {
        return htermb;
    }

    /**
     * 设置htermb属性的值。
     * 
     */
    public void setHtermb(double value) {
        this.htermb = value;
    }

    /**
     * 获取htewy属性的值。
     * 
     */
    public double getHtewy() {
        return htewy;
    }

    /**
     * 设置htewy属性的值。
     * 
     */
    public void setHtewy(double value) {
        this.htewy = value;
    }

    /**
     * 获取htgq属性的值。
     * 
     */
    public double getHtgq() {
        return htgq;
    }

    /**
     * 设置htgq属性的值。
     * 
     */
    public void setHtgq(double value) {
        this.htgq = value;
    }

    /**
     * 获取htjf属性的值。
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
     * 设置htjf属性的值。
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
     * 获取htjfnb属性的值。
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
     * 设置htjfnb属性的值。
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
     * 获取htjgrq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtjgrq() {
        return htjgrq;
    }

    /**
     * 设置htjgrq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtjgrq(String value) {
        this.htjgrq = value;
    }

    /**
     * 获取htkgrq属性的值。
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
     * 设置htkgrq属性的值。
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
     * 获取htmc属性的值。
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
     * 设置htmc属性的值。
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
     * 获取htqdfs属性的值。
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
     * 设置htqdfs属性的值。
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
     * 获取htqdrq属性的值。
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
     * 设置htqdrq属性的值。
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
     * 获取htyfid属性的值。
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
     * 设置htyfid属性的值。
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
     * 获取hwzdjk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHwzdjk() {
        return hwzdjk;
    }

    /**
     * 设置hwzdjk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHwzdjk(String value) {
        this.hwzdjk = value;
    }

    /**
     * 获取jldw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJldw() {
        return jldw;
    }

    /**
     * 设置jldw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJldw(String value) {
        this.jldw = value;
    }

    /**
     * 获取jldwlxdh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJldwlxdh() {
        return jldwlxdh;
    }

    /**
     * 设置jldwlxdh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJldwlxdh(String value) {
        this.jldwlxdh = value;
    }

    /**
     * 获取jldwlxr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJldwlxr() {
        return jldwlxr;
    }

    /**
     * 设置jldwlxr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJldwlxr(String value) {
        this.jldwlxr = value;
    }

    /**
     * 获取jtpp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJtpp() {
        return jtpp;
    }

    /**
     * 设置jtpp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJtpp(String value) {
        this.jtpp = value;
    }

    /**
     * 获取mc属性的值。
     * 
     */
    public double getMc() {
        return mc;
    }

    /**
     * 设置mc属性的值。
     * 
     */
    public void setMc(double value) {
        this.mc = value;
    }

    /**
     * 获取orgunit属性的值。
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
     * 设置orgunit属性的值。
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
     * 获取qt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQt() {
        return qt;
    }

    /**
     * 设置qt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQt(String value) {
        this.qt = value;
    }

    /**
     * 获取recid属性的值。
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
     * 设置recid属性的值。
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
     * 获取sffb属性的值。
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
     * 设置sffb属性的值。
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
     * 获取sfgltzxm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfgltzxm() {
        return sfgltzxm;
    }

    /**
     * 设置sfgltzxm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfgltzxm(String value) {
        this.sfgltzxm = value;
    }

    /**
     * 获取sfl属性的值。
     * 
     */
    public double getSfl() {
        return sfl;
    }

    /**
     * 设置sfl属性的值。
     * 
     */
    public void setSfl(double value) {
        this.sfl = value;
    }

    /**
     * 获取sggf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSggf() {
        return sggf;
    }

    /**
     * 设置sggf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSggf(String value) {
        this.sggf = value;
    }

    /**
     * 获取sjgf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSjgf() {
        return sjgf;
    }

    /**
     * 设置sjgf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSjgf(String value) {
        this.sjgf = value;
    }

    /**
     * 获取sjkgrq属性的值。
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
     * 设置sjkgrq属性的值。
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
     * 获取sn属性的值。
     * 
     */
    public double getSn() {
        return sn;
    }

    /**
     * 设置sn属性的值。
     * 
     */
    public void setSn(double value) {
        this.sn = value;
    }

    /**
     * 获取ssdwmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsdwmc() {
        return ssdwmc;
    }

    /**
     * 设置ssdwmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsdwmc(String value) {
        this.ssdwmc = value;
    }

    /**
     * 获取tfl属性的值。
     * 
     */
    public double getTfl() {
        return tfl;
    }

    /**
     * 设置tfl属性的值。
     * 
     */
    public void setTfl(double value) {
        this.tfl = value;
    }

    /**
     * 获取tjgsyf属性的值。
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
     * 设置tjgsyf属性的值。
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
     * 获取tzxmlx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTzxmlx() {
        return tzxmlx;
    }

    /**
     * 设置tzxmlx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTzxmlx(String value) {
        this.tzxmlx = value;
    }

    /**
     * 获取wqyyss属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWqyyss() {
        return wqyyss;
    }

    /**
     * 设置wqyyss属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWqyyss(String value) {
        this.wqyyss = value;
    }

    /**
     * 获取xmgkjgm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmgkjgm() {
        return xmgkjgm;
    }

    /**
     * 设置xmgkjgm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmgkjgm(String value) {
        this.xmgkjgm = value;
    }

    /**
     * 获取xmhtyy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmhtyy() {
        return xmhtyy;
    }

    /**
     * 设置xmhtyy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmhtyy(String value) {
        this.xmhtyy = value;
    }

    /**
     * 获取xmjl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmjl() {
        return xmjl;
    }

    /**
     * 设置xmjl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmjl(String value) {
        this.xmjl = value;
    }

    /**
     * 获取xmjldh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmjldh() {
        return xmjldh;
    }

    /**
     * 设置xmjldh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmjldh(String value) {
        this.xmjldh = value;
    }

    /**
     * 获取xmjlyy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmjlyy() {
        return xmjlyy;
    }

    /**
     * 设置xmjlyy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmjlyy(String value) {
        this.xmjlyy = value;
    }

    /**
     * 获取xmld属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmld() {
        return xmld;
    }

    /**
     * 设置xmld属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmld(String value) {
        this.xmld = value;
    }

    /**
     * 获取xmxxtxdz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmxxtxdz() {
        return xmxxtxdz;
    }

    /**
     * 设置xmxxtxdz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmxxtxdz(String value) {
        this.xmxxtxdz = value;
    }

    /**
     * 获取yfkbl属性的值。
     * 
     */
    public double getYfkbl() {
        return yfkbl;
    }

    /**
     * 设置yfkbl属性的值。
     * 
     */
    public void setYfkbl(double value) {
        this.yfkbl = value;
    }

    /**
     * 获取ysjdkzfbl属性的值。
     * 
     */
    public double getYsjdkzfbl() {
        return ysjdkzfbl;
    }

    /**
     * 设置ysjdkzfbl属性的值。
     * 
     */
    public void setYsjdkzfbl(double value) {
        this.ysjdkzfbl = value;
    }

    /**
     * 获取yslybzfs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYslybzfs() {
        return yslybzfs;
    }

    /**
     * 设置yslybzfs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYslybzfs(String value) {
        this.yslybzfs = value;
    }

    /**
     * 获取yslybzje属性的值。
     * 
     */
    public double getYslybzje() {
        return yslybzje;
    }

    /**
     * 设置yslybzje属性的值。
     * 
     */
    public void setYslybzje(double value) {
        this.yslybzje = value;
    }

    /**
     * 获取ysyfkbl属性的值。
     * 
     */
    public double getYsyfkbl() {
        return ysyfkbl;
    }

    /**
     * 设置ysyfkbl属性的值。
     * 
     */
    public void setYsyfkbl(double value) {
        this.ysyfkbl = value;
    }

    /**
     * 获取yszbjbl属性的值。
     * 
     */
    public double getYszbjbl() {
        return yszbjbl;
    }

    /**
     * 设置yszbjbl属性的值。
     * 
     */
    public void setYszbjbl(double value) {
        this.yszbjbl = value;
    }

    /**
     * 获取yszbjqx属性的值。
     * 
     */
    public double getYszbjqx() {
        return yszbjqx;
    }

    /**
     * 设置yszbjqx属性的值。
     * 
     */
    public void setYszbjqx(double value) {
        this.yszbjqx = value;
    }

    /**
     * 获取yzbm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYzbm() {
        return yzbm;
    }

    /**
     * 设置yzbm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYzbm(String value) {
        this.yzbm = value;
    }

    /**
     * 获取zbxmmcn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbxmmcn() {
        return zbxmmcn;
    }

    /**
     * 设置zbxmmcn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbxmmcn(String value) {
        this.zbxmmcn = value;
    }

    /**
     * 获取zg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZg() {
        return zg;
    }

    /**
     * 设置zg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZg(String value) {
        this.zg = value;
    }

    /**
     * 获取zglxdh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZglxdh() {
        return zglxdh;
    }

    /**
     * 设置zglxdh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZglxdh(String value) {
        this.zglxdh = value;
    }

    /**
     * 获取ztgcjg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZtgcjg() {
        return ztgcjg;
    }

    /**
     * 设置ztgcjg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZtgcjg(String value) {
        this.ztgcjg = value;
    }

    /**
     * 获取zytkmsbz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZytkmsbz() {
        return zytkmsbz;
    }

    /**
     * 设置zytkmsbz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZytkmsbz(String value) {
        this.zytkmsbz = value;
    }

    /**
     * 获取zzcdhte属性的值。
     * 
     */
    public double getZzcdhte() {
        return zzcdhte;
    }

    /**
     * 设置zzcdhte属性的值。
     * 
     */
    public void setZzcdhte(double value) {
        this.zzcdhte = value;
    }

    /**
     * 获取zzcdhtermb属性的值。
     * 
     */
    public double getZzcdhtermb() {
        return zzcdhtermb;
    }

    /**
     * 设置zzcdhtermb属性的值。
     * 
     */
    public void setZzcdhtermb(double value) {
        this.zzcdhtermb = value;
    }

}
