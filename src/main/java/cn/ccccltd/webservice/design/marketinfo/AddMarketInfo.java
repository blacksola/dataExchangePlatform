
package cn.ccccltd.webservice.design.marketinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>addMarketInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="addMarketInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="projectMarketInfo" type="{http://marketinfo.design.webservice.ccccltd.cn/}sjscxxVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addMarketInfo", propOrder = {
    "projectMarketInfo"
})
public class AddMarketInfo {

    protected SjscxxVO projectMarketInfo;

    /**
     * ��ȡprojectMarketInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SjscxxVO }
     *     
     */
    public SjscxxVO getProjectMarketInfo() {
        return projectMarketInfo;
    }

    /**
     * ����projectMarketInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SjscxxVO }
     *     
     */
    public void setProjectMarketInfo(SjscxxVO value) {
        this.projectMarketInfo = value;
    }

}
