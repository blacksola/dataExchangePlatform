
package cn.ccccltd.webservice.construction.monthreport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>updateMonthReport complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="updateMonthReport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="monthReportInfo" type="{http://monthreport.construction.webservice.ccccltd.cn/}ghxmzxfdVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateMonthReport", propOrder = {
    "monthReportInfo"
})
public class UpdateMonthReport {

    protected GhxmzxfdVO monthReportInfo;

    /**
     * ��ȡmonthReportInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GhxmzxfdVO }
     *     
     */
    public GhxmzxfdVO getMonthReportInfo() {
        return monthReportInfo;
    }

    /**
     * ����monthReportInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GhxmzxfdVO }
     *     
     */
    public void setMonthReportInfo(GhxmzxfdVO value) {
        this.monthReportInfo = value;
    }

}
