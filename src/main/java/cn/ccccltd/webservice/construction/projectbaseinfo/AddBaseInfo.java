
package cn.ccccltd.webservice.construction.projectbaseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>addBaseInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="addBaseInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="projectBaseInfo" type="{http://projectbaseinfo.construction.webservice.ccccltd.cn/}ghscgzjzbVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addBaseInfo", propOrder = {
    "projectBaseInfo"
})
public class AddBaseInfo {

    protected GhscgzjzbVO projectBaseInfo;

    /**
     * ��ȡprojectBaseInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GhscgzjzbVO }
     *     
     */
    public GhscgzjzbVO getProjectBaseInfo() {
        return projectBaseInfo;
    }

    /**
     * ����projectBaseInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GhscgzjzbVO }
     *     
     */
    public void setProjectBaseInfo(GhscgzjzbVO value) {
        this.projectBaseInfo = value;
    }

}
