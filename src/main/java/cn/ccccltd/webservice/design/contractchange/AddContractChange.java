
package cn.ccccltd.webservice.design.contractchange;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>addContractChange complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="addContractChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sjbghtInfo" type="{http://contractchange.design.webservice.ccccltd.cn/}sjbghtVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addContractChange", propOrder = {
    "sjbghtInfo"
})
public class AddContractChange {

    protected SjbghtVO sjbghtInfo;

    /**
     * ��ȡsjbghtInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SjbghtVO }
     *     
     */
    public SjbghtVO getSjbghtInfo() {
        return sjbghtInfo;
    }

    /**
     * ����sjbghtInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SjbghtVO }
     *     
     */
    public void setSjbghtInfo(SjbghtVO value) {
        this.sjbghtInfo = value;
    }

}
