
package cn.ccccltd.webservice.other.projectbaseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>queryBaseInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="queryBaseInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="zzjg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zjhyfl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmszd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssqy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dwqypp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sftz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryBaseInfo", propOrder = {
    "zzjg",
    "zjhyfl",
    "xmszd",
    "xmmc",
    "ssqy",
    "htmc",
    "dwqypp",
    "sftz"
})
public class QueryBaseInfo {

    protected String zzjg;
    protected String zjhyfl;
    protected String xmszd;
    protected String xmmc;
    protected String ssqy;
    protected String htmc;
    protected String dwqypp;
    protected String sftz;

    /**
     * ��ȡzzjg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZzjg() {
        return zzjg;
    }

    /**
     * ����zzjg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZzjg(String value) {
        this.zzjg = value;
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
     * ��ȡxmmc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmmc() {
        return xmmc;
    }

    /**
     * ����xmmc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmmc(String value) {
        this.xmmc = value;
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
     * ��ȡsftz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSftz() {
        return sftz;
    }

    /**
     * ����sftz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSftz(String value) {
        this.sftz = value;
    }

}
