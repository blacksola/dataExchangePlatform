
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package cn.ccccltd.webservice.construction.contractchange;

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
 * 2017-03-17T17:50:20.970+08:00
 * Generated source version: 3.1.8
 * 
 */

@javax.jws.WebService(
                      serviceName = "sgbghtWsImpl",
                      portName = "SgbghtWsImplPort",
                      targetNamespace = "http://contractchange.construction.webservice.ccccltd.cn/",
                      wsdlLocation = "http://10.17.16.33:7070/waf/ws/invest_contractChange?wsdl",
                      endpointInterface = "cn.ccccltd.webservice.construction.contractchange.SgbghtWs")
                      
public class SgbghtWsImplPortImpl implements SgbghtWs {

    private static final Logger LOG = Logger.getLogger(SgbghtWsImplPortImpl.class.getName());

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.construction.contractchange.SgbghtWs#addContractChange(cn.ccccltd.webservice.construction.contractchange.SgbghtVO sgbghtInfo)*
     */
    public cn.ccccltd.webservice.construction.contractchange.ReturnMessage addContractChange(cn.ccccltd.webservice.construction.contractchange.SgbghtVO sgbghtInfo) { 
        LOG.info("Executing operation addContractChange");
        System.out.println(sgbghtInfo);
        try {
            cn.ccccltd.webservice.construction.contractchange.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.construction.contractchange.SgbghtWs#updateContractChange(cn.ccccltd.webservice.construction.contractchange.SgbghtVO sgbghtInfo)*
     */
    public cn.ccccltd.webservice.construction.contractchange.ReturnMessage updateContractChange(cn.ccccltd.webservice.construction.contractchange.SgbghtVO sgbghtInfo) { 
        LOG.info("Executing operation updateContractChange");
        System.out.println(sgbghtInfo);
        try {
            cn.ccccltd.webservice.construction.contractchange.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
