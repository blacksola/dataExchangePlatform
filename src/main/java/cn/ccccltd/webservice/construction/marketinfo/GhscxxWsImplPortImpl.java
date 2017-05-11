
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package cn.ccccltd.webservice.construction.marketinfo;

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
 * 2017-03-15T16:13:53.378+08:00
 * Generated source version: 3.1.8
 * 
 */

@javax.jws.WebService(
                      serviceName = "ghscxxWsImpl",
                      portName = "GhscxxWsImplPort",
                      targetNamespace = "http://marketinfo.construction.webservice.ccccltd.cn/",
                      wsdlLocation = "http://localhost:8060/waf/ws/invest_productMarektInfo?wsdl",
                      endpointInterface = "cn.ccccltd.webservice.construction.marketinfo.GhscxxWs")
                      
public class GhscxxWsImplPortImpl implements GhscxxWs {

    private static final Logger LOG = Logger.getLogger(GhscxxWsImplPortImpl.class.getName());

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.construction.marketinfo.GhscxxWs#updateMarketInfo(cn.ccccltd.webservice.construction.marketinfo.GhscxxVO projectMarketInfo)*
     */
    public cn.ccccltd.webservice.construction.marketinfo.ReturnMessage updateMarketInfo(cn.ccccltd.webservice.construction.marketinfo.GhscxxVO projectMarketInfo) { 
        LOG.info("Executing operation updateMarketInfo");
        System.out.println(projectMarketInfo);
        try {
            cn.ccccltd.webservice.construction.marketinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.construction.marketinfo.GhscxxWs#queryMarketInfoById(java.lang.String zzjg, java.lang.String recid)*
     */
    public cn.ccccltd.webservice.construction.marketinfo.ReturnMessage queryMarketInfoById(java.lang.String zzjg, java.lang.String recid) { 
        LOG.info("Executing operation queryMarketInfoById");
        System.out.println(zzjg);
        System.out.println(recid);
        try {
            cn.ccccltd.webservice.construction.marketinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.construction.marketinfo.GhscxxWs#addMarketInfo(cn.ccccltd.webservice.construction.marketinfo.GhscxxVO projectMarketInfo)*
     */
    public cn.ccccltd.webservice.construction.marketinfo.ReturnMessage addMarketInfo(cn.ccccltd.webservice.construction.marketinfo.GhscxxVO projectMarketInfo) { 
        LOG.info("Executing operation addMarketInfo");
        System.out.println(projectMarketInfo);
        try {
            cn.ccccltd.webservice.construction.marketinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}