
package cn.ccccltd.webservice.other.contractchange;

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
 *         &lt;element name="qtbghtInfo" type="{http://contractchange.other.webservice.ccccltd.cn/}qtbghtVO" minOccurs="0"/&gt;
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
    "qtbghtInfo"
})
public class UpdateContractChange {

    protected QtbghtVO qtbghtInfo;

    /**
     * ��ȡqtbghtInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link QtbghtVO }
     *     
     */
    public QtbghtVO getQtbghtInfo() {
        return qtbghtInfo;
    }

    /**
     * ����qtbghtInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link QtbghtVO }
     *     
     */
    public void setQtbghtInfo(QtbghtVO value) {
        this.qtbghtInfo = value;
    }

}
