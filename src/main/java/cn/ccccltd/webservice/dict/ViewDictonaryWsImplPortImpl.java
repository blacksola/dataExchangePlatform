
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package cn.ccccltd.webservice.dict;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-03-31T16:25:24.973+08:00
 * Generated source version: 3.1.8
 * 
 */

@javax.jws.WebService(
                      serviceName = "viewDictonaryWsImpl",
                      portName = "ViewDictonaryWsImplPort",
                      targetNamespace = "http://dict.webservice.ccccltd.cn/",
                      wsdlLocation = "http://192.168.0.138:8090/waf_ws/ws/dict?wsdl",
                      endpointInterface = "cn.ccccltd.webservice.dict.ViewDictonaryWs")
                      
public class ViewDictonaryWsImplPortImpl implements ViewDictonaryWs {

    private static final Logger LOG = Logger.getLogger(ViewDictonaryWsImplPortImpl.class.getName());

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.dict.ViewDictonaryWs#getDict(java.lang.String dictCode, java.lang.String dictName, java.lang.String dictType)*
     */
    public cn.ccccltd.webservice.dict.ReturnMessage getDict(java.lang.String dictCode, java.lang.String dictName, java.lang.String dictType) { 
        LOG.info("Executing operation getDict");
        System.out.println(dictCode);
        System.out.println(dictName);
        System.out.println(dictType);
        try {
            cn.ccccltd.webservice.dict.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
