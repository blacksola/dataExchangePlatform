
package cn.ccccltd.webservice.construction.contractchange;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>updateContractChange complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="updateContractChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sgbghtInfo" type="{http://contractchange.construction.webservice.ccccltd.cn/}sgbghtVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateContractChange", propOrder = {
    "sgbghtInfo"
})
public class UpdateContractChange {

    protected SgbghtVO sgbghtInfo;

    /**
     * ��ȡsgbghtInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SgbghtVO }
     *     
     */
    public SgbghtVO getSgbghtInfo() {
        return sgbghtInfo;
    }

    /**
     * ����sgbghtInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SgbghtVO }
     *     
     */
    public void setSgbghtInfo(SgbghtVO value) {
        this.sgbghtInfo = value;
    }

}
