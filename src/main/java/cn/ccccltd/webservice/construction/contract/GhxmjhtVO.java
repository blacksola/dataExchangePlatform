
package cn.ccccltd.webservice.construction.contract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ghxmjhtVO complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�����ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ghxmjhtVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://contract.construction.webservice.ccccltd.cn/}voSupport"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bghhtgq" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bghtedw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bghzhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bghzzcdhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bgsdh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bxList" type="{http://contract.construction.webservice.ccccltd.cn/}hwxmbxVO" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "zzcdhtermb",
    "sfhw"
})
public class GhxmjhtVO
    extends VoSupport
{

    protected double bghhtgq;
    protected String bghtedw;
    protected double bghzhte;
    protected double bghzzcdhte;
    protected String bgsdh;
    @XmlElement(nillable = true,name = "hwxmbxInfo")
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
    protected String sfhw;

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
     * ��ȡbghtedw���Ե�ֵ��
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
     * ����bghtedw���Ե�ֵ��
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
     * ��ȡbgsdh���Ե�ֵ��
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
     * ����bgsdh���Ե�ֵ��
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
    
    public void setBxList(List<HwxmbxVO> bxList) {
        this.bxList = bxList;
    }
    /**
     * ��ȡchtid���Ե�ֵ��
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
     * ����chtid���Ե�ֵ��
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
     * ��ȡdqhl���Ե�ֵ��
     * 
     */
    public double getDqhl() {
        return dqhl;
    }

    /**
     * ����dqhl���Ե�ֵ��
     * 
     */
    public void setDqhl(double value) {
        this.dqhl = value;
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
     * ��ȡgc���Ե�ֵ��
     * 
     */
    public double getGc() {
        return gc;
    }

    /**
     * ����gc���Ե�ֵ��
     * 
     */
    public void setGc(double value) {
        this.gc = value;
    }

    /**
     * ��ȡgltzxmgs���Ե�ֵ��
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
     * ����gltzxmgs���Ե�ֵ��
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
     * ��ȡgpszb���Ե�ֵ��
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
     * ����gpszb���Ե�ֵ��
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
     * ��ȡhetdw���Ե�ֵ��
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
     * ����hetdw���Ե�ֵ��
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
     * ��ȡhntl���Ե�ֵ��
     * 
     */
    public double getHntl() {
        return hntl;
    }

    /**
     * ����hntl���Ե�ֵ��
     * 
     */
    public void setHntl(double value) {
        this.hntl = value;
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
     * ��ȡhtermb���Ե�ֵ��
     * 
     */
    public double getHtermb() {
        return htermb;
    }

    /**
     * ����htermb���Ե�ֵ��
     * 
     */
    public void setHtermb(double value) {
        this.htermb = value;
    }

    /**
     * ��ȡhtewy���Ե�ֵ��
     * 
     */
    public double getHtewy() {
        return htewy;
    }

    /**
     * ����htewy���Ե�ֵ��
     * 
     */
    public void setHtewy(double value) {
        this.htewy = value;
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
     * ��ȡhtjgrq���Ե�ֵ��
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
     * ����htjgrq���Ե�ֵ��
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
     * ��ȡhwzdjk���Ե�ֵ��
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
     * ����hwzdjk���Ե�ֵ��
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
     * ��ȡjldw���Ե�ֵ��
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
     * ����jldw���Ե�ֵ��
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
     * ��ȡjldwlxdh���Ե�ֵ��
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
     * ����jldwlxdh���Ե�ֵ��
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
     * ��ȡjldwlxr���Ե�ֵ��
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
     * ����jldwlxr���Ե�ֵ��
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
     * ��ȡjtpp���Ե�ֵ��
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
     * ����jtpp���Ե�ֵ��
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
     * ��ȡmc���Ե�ֵ��
     * 
     */
    public double getMc() {
        return mc;
    }

    /**
     * ����mc���Ե�ֵ��
     * 
     */
    public void setMc(double value) {
        this.mc = value;
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
     * ��ȡqt���Ե�ֵ��
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
     * ����qt���Ե�ֵ��
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
     * ��ȡsfgltzxm���Ե�ֵ��
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
     * ����sfgltzxm���Ե�ֵ��
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
     * ��ȡsfl���Ե�ֵ��
     * 
     */
    public double getSfl() {
        return sfl;
    }

    /**
     * ����sfl���Ե�ֵ��
     * 
     */
    public void setSfl(double value) {
        this.sfl = value;
    }

    /**
     * ��ȡsggf���Ե�ֵ��
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
     * ����sggf���Ե�ֵ��
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
     * ��ȡsjgf���Ե�ֵ��
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
     * ����sjgf���Ե�ֵ��
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
     * ��ȡsn���Ե�ֵ��
     * 
     */
    public double getSn() {
        return sn;
    }

    /**
     * ����sn���Ե�ֵ��
     * 
     */
    public void setSn(double value) {
        this.sn = value;
    }

    /**
     * ��ȡssdwmc���Ե�ֵ��
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
     * ����ssdwmc���Ե�ֵ��
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
     * ��ȡtfl���Ե�ֵ��
     * 
     */
    public double getTfl() {
        return tfl;
    }

    /**
     * ����tfl���Ե�ֵ��
     * 
     */
    public void setTfl(double value) {
        this.tfl = value;
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
     * ��ȡtzxmlx���Ե�ֵ��
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
     * ����tzxmlx���Ե�ֵ��
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
     * ��ȡwqyyss���Ե�ֵ��
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
     * ����wqyyss���Ե�ֵ��
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
     * ��ȡxmgkjgm���Ե�ֵ��
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
     * ����xmgkjgm���Ե�ֵ��
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
     * ��ȡxmhtyy���Ե�ֵ��
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
     * ����xmhtyy���Ե�ֵ��
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
     * ��ȡxmjl���Ե�ֵ��
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
     * ����xmjl���Ե�ֵ��
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
     * ��ȡxmjldh���Ե�ֵ��
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
     * ����xmjldh���Ե�ֵ��
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
     * ��ȡxmjlyy���Ե�ֵ��
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
     * ����xmjlyy���Ե�ֵ��
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
     * ��ȡxmld���Ե�ֵ��
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
     * ����xmld���Ե�ֵ��
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
     * ��ȡxmxxtxdz���Ե�ֵ��
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
     * ����xmxxtxdz���Ե�ֵ��
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
     * ��ȡyfkbl���Ե�ֵ��
     * 
     */
    public double getYfkbl() {
        return yfkbl;
    }

    /**
     * ����yfkbl���Ե�ֵ��
     * 
     */
    public void setYfkbl(double value) {
        this.yfkbl = value;
    }

    /**
     * ��ȡysjdkzfbl���Ե�ֵ��
     * 
     */
    public double getYsjdkzfbl() {
        return ysjdkzfbl;
    }

    /**
     * ����ysjdkzfbl���Ե�ֵ��
     * 
     */
    public void setYsjdkzfbl(double value) {
        this.ysjdkzfbl = value;
    }

    /**
     * ��ȡyslybzfs���Ե�ֵ��
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
     * ����yslybzfs���Ե�ֵ��
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
     * ��ȡyslybzje���Ե�ֵ��
     * 
     */
    public double getYslybzje() {
        return yslybzje;
    }

    /**
     * ����yslybzje���Ե�ֵ��
     * 
     */
    public void setYslybzje(double value) {
        this.yslybzje = value;
    }

    /**
     * ��ȡysyfkbl���Ե�ֵ��
     * 
     */
    public double getYsyfkbl() {
        return ysyfkbl;
    }

    /**
     * ����ysyfkbl���Ե�ֵ��
     * 
     */
    public void setYsyfkbl(double value) {
        this.ysyfkbl = value;
    }

    /**
     * ��ȡyszbjbl���Ե�ֵ��
     * 
     */
    public double getYszbjbl() {
        return yszbjbl;
    }

    /**
     * ����yszbjbl���Ե�ֵ��
     * 
     */
    public void setYszbjbl(double value) {
        this.yszbjbl = value;
    }

    /**
     * ��ȡyszbjqx���Ե�ֵ��
     * 
     */
    public double getYszbjqx() {
        return yszbjqx;
    }

    /**
     * ����yszbjqx���Ե�ֵ��
     * 
     */
    public void setYszbjqx(double value) {
        this.yszbjqx = value;
    }

    /**
     * ��ȡyzbm���Ե�ֵ��
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
     * ����yzbm���Ե�ֵ��
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
     * ��ȡzbxmmcn���Ե�ֵ��
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
     * ����zbxmmcn���Ե�ֵ��
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
     * ��ȡzg���Ե�ֵ��
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
     * ����zg���Ե�ֵ��
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
     * ��ȡzglxdh���Ե�ֵ��
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
     * ����zglxdh���Ե�ֵ��
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
     * ��ȡztgcjg���Ե�ֵ��
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
     * ����ztgcjg���Ե�ֵ��
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
     * ��ȡzytkmsbz���Ե�ֵ��
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
     * ����zytkmsbz���Ե�ֵ��
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

    /**
     * ��ȡzzcdhtermb���Ե�ֵ��
     * 
     */
    public double getZzcdhtermb() {
        return zzcdhtermb;
    }

    /**
     * ����zzcdhtermb���Ե�ֵ��
     * 
     */
    public void setZzcdhtermb(double value) {
        this.zzcdhtermb = value;
    }

	public String getSfhw() {
		return sfhw;
	}

	public void setSfhw(String sfhw) {
		this.sfhw = sfhw;
	}
    
}
