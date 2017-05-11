
package cn.ccccltd.webservice.design.marketinfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>sjscxxVO complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�����ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="sjscxxVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://marketinfo.design.webservice.ccccltd.cn/}voSupport"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cscgzid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cxmid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dqhl" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="gzjzqk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htermb" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="htqdfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ksgzsj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nrxtglsj_zb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nssdwmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nyqypp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nyqyzzmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtdwmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtqyzb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtsyb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfzb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfzdgzxm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sjscgzjzbzbvos" type="{http://marketinfo.design.webservice.ccccltd.cn/}sjscgzjzbzbVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tbbj" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tbbjbz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tbrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yjhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="yjhtgq" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="zbbz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zbe" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="zbebz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zbsm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zztbfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sjscxxVO", propOrder = {
    "cscgzid",
    "cxmid",
    "dqhl",
    "gzjzqk",
    "htermb",
    "htqdfs",
    "ksgzsj",
    "nrxtglsjZb",
    "nssdwmc",
    "nyqypp",
    "nyqyzzmc",
    "qtdwmc",
    "qtqyzb",
    "qtsyb",
    "recid",
    "sfzb",
    "sfzdgzxm",
    "sjscgzjzbzbvos",
    "tbbj",
    "tbbjbz",
    "tbrq",
    "yjhte",
    "yjhtgq",
    "zbbz",
    "zbe",
    "zbebz",
    "zbsm",
    "zztbfs"
})
public class SjscxxVO
    extends VoSupport
{

    protected String cscgzid;
    protected String cxmid;
    protected double dqhl;
    protected String gzjzqk;
    protected double htermb;
    protected String htqdfs;
    protected String ksgzsj;
    @XmlElement(name = "nrxtglsj_zb")
    protected String nrxtglsjZb;
    protected String nssdwmc;
    protected String nyqypp;
    protected String nyqyzzmc;
    protected String qtdwmc;
    protected String qtqyzb;
    protected String qtsyb;
    protected String recid;
    protected String sfzb;
    protected String sfzdgzxm;
    @XmlElement(nillable = true,name = "otherbidInfo")
    protected List<SjscgzjzbzbVO> sjscgzjzbzbvos;
    protected double tbbj;
    protected String tbbjbz;
    protected String tbrq;
    protected double yjhte;
    protected double yjhtgq;
    protected String zbbz;
    protected double zbe;
    protected String zbebz;
    protected String zbsm;
    protected String zztbfs;

    /**
     * ��ȡcscgzid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCscgzid() {
        return cscgzid;
    }

    /**
     * ����cscgzid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCscgzid(String value) {
        this.cscgzid = value;
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
     * ��ȡgzjzqk���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGzjzqk() {
        return gzjzqk;
    }

    /**
     * ����gzjzqk���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGzjzqk(String value) {
        this.gzjzqk = value;
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
     * ��ȡksgzsj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKsgzsj() {
        return ksgzsj;
    }

    /**
     * ����ksgzsj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKsgzsj(String value) {
        this.ksgzsj = value;
    }

    /**
     * ��ȡnrxtglsjZb���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrxtglsjZb() {
        return nrxtglsjZb;
    }

    /**
     * ����nrxtglsjZb���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrxtglsjZb(String value) {
        this.nrxtglsjZb = value;
    }

    /**
     * ��ȡnssdwmc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNssdwmc() {
        return nssdwmc;
    }

    /**
     * ����nssdwmc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNssdwmc(String value) {
        this.nssdwmc = value;
    }

    /**
     * ��ȡnyqypp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNyqypp() {
        return nyqypp;
    }

    /**
     * ����nyqypp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNyqypp(String value) {
        this.nyqypp = value;
    }

    /**
     * ��ȡnyqyzzmc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNyqyzzmc() {
        return nyqyzzmc;
    }

    /**
     * ����nyqyzzmc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNyqyzzmc(String value) {
        this.nyqyzzmc = value;
    }

    /**
     * ��ȡqtdwmc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtdwmc() {
        return qtdwmc;
    }

    /**
     * ����qtdwmc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdwmc(String value) {
        this.qtdwmc = value;
    }

    /**
     * ��ȡqtqyzb���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtqyzb() {
        return qtqyzb;
    }

    /**
     * ����qtqyzb���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtqyzb(String value) {
        this.qtqyzb = value;
    }

    /**
     * ��ȡqtsyb���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtsyb() {
        return qtsyb;
    }

    /**
     * ����qtsyb���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtsyb(String value) {
        this.qtsyb = value;
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
     * ��ȡsfzb���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfzb() {
        return sfzb;
    }

    /**
     * ����sfzb���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfzb(String value) {
        this.sfzb = value;
    }

    /**
     * ��ȡsfzdgzxm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfzdgzxm() {
        return sfzdgzxm;
    }

    /**
     * ����sfzdgzxm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfzdgzxm(String value) {
        this.sfzdgzxm = value;
    }

    /**
     * Gets the value of the sjscgzjzbzbvos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sjscgzjzbzbvos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSjscgzjzbzbvos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SjscgzjzbzbVO }
     * 
     * 
     */
    public List<SjscgzjzbzbVO> getSjscgzjzbzbvos() {
        if (sjscgzjzbzbvos == null) {
            sjscgzjzbzbvos = new ArrayList<SjscgzjzbzbVO>();
        }
        return this.sjscgzjzbzbvos;
    }
    
    public void setSjscgzjzbzbvos(List<SjscgzjzbzbVO> sjscgzjzbzbvos) {
        this.sjscgzjzbzbvos = sjscgzjzbzbvos;
    }
    /**
     * ��ȡtbbj���Ե�ֵ��
     * 
     */
    public double getTbbj() {
        return tbbj;
    }

    /**
     * ����tbbj���Ե�ֵ��
     * 
     */
    public void setTbbj(double value) {
        this.tbbj = value;
    }

    /**
     * ��ȡtbbjbz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTbbjbz() {
        return tbbjbz;
    }

    /**
     * ����tbbjbz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTbbjbz(String value) {
        this.tbbjbz = value;
    }

    /**
     * ��ȡtbrq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTbrq() {
        return tbrq;
    }

    /**
     * ����tbrq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTbrq(String value) {
        this.tbrq = value;
    }

    /**
     * ��ȡyjhte���Ե�ֵ��
     * 
     */
    public double getYjhte() {
        return yjhte;
    }

    /**
     * ����yjhte���Ե�ֵ��
     * 
     */
    public void setYjhte(double value) {
        this.yjhte = value;
    }

    /**
     * ��ȡyjhtgq���Ե�ֵ��
     * 
     */
    public double getYjhtgq() {
        return yjhtgq;
    }

    /**
     * ����yjhtgq���Ե�ֵ��
     * 
     */
    public void setYjhtgq(double value) {
        this.yjhtgq = value;
    }

    /**
     * ��ȡzbbz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbbz() {
        return zbbz;
    }

    /**
     * ����zbbz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbbz(String value) {
        this.zbbz = value;
    }

    /**
     * ��ȡzbe���Ե�ֵ��
     * 
     */
    public double getZbe() {
        return zbe;
    }

    /**
     * ����zbe���Ե�ֵ��
     * 
     */
    public void setZbe(double value) {
        this.zbe = value;
    }

    /**
     * ��ȡzbebz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbebz() {
        return zbebz;
    }

    /**
     * ����zbebz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbebz(String value) {
        this.zbebz = value;
    }

    /**
     * ��ȡzbsm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbsm() {
        return zbsm;
    }

    /**
     * ����zbsm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbsm(String value) {
        this.zbsm = value;
    }

    /**
     * ��ȡzztbfs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZztbfs() {
        return zztbfs;
    }

    /**
     * ����zztbfs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZztbfs(String value) {
        this.zztbfs = value;
    }

}
