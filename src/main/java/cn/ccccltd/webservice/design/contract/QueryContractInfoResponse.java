
package cn.ccccltd.webservice.design.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>queryContractInfoResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="queryContractInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="result" type="{http://contract.design.webservice.ccccltd.cn/}returnMessage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryContractInfoResponse", propOrder = {
    "result"
})
public class QueryContractInfoResponse {

    protected ReturnMessage result;

    /**
     * 获取result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReturnMessage }
     *     
     */
    public ReturnMessage getResult() {
        return result;
    }

    /**
     * 设置result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnMessage }
     *     
     */
    public void setResult(ReturnMessage value) {
        this.result = value;
    }

}
