
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package cn.ccccltd.webservice.construction.projectbaseinfo;

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
 * 2017-04-26T13:09:40.287+08:00
 * Generated source version: 3.1.8
 * 
 */

@javax.jws.WebService(
                      serviceName = "ghscgzjzbWsImpl",
                      portName = "GhscgzjzbWsImplPort",
                      targetNamespace = "http://projectbaseinfo.construction.webservice.ccccltd.cn/",
                      wsdlLocation = "http://localhost:8060/waf/ws/invest_productBaseInfo?wsdl",
                      endpointInterface = "cn.ccccltd.webservice.construction.projectbaseinfo.GhscgzjzbWs")
                      
public class GhscgzjzbWsImplPortImpl implements GhscgzjzbWs {

    private static final Logger LOG = Logger.getLogger(GhscgzjzbWsImplPortImpl.class.getName());

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.construction.projectbaseinfo.GhscgzjzbWs#deleteProjectAndContract(java.lang.String baserecid, java.lang.String contractrecid)*
     */
    public cn.ccccltd.webservice.construction.projectbaseinfo.ReturnMessage deleteProjectAndContract(java.lang.String baserecid, java.lang.String contractrecid) { 
        LOG.info("Executing operation deleteProjectAndContract");
        System.out.println(baserecid);
        System.out.println(contractrecid);
        try {
            cn.ccccltd.webservice.construction.projectbaseinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.construction.projectbaseinfo.GhscgzjzbWs#queryBaseInfo(java.lang.String zzjg, java.lang.String zjhyfl, java.lang.String xmszd, java.lang.String xmmc, java.lang.String xmjd)*
     */
    public cn.ccccltd.webservice.construction.projectbaseinfo.ReturnMessage queryBaseInfo(java.lang.String zzjg, java.lang.String zjhyfl, java.lang.String xmszd, java.lang.String xmmc, java.lang.String xmjd) { 
        LOG.info("Executing operation queryBaseInfo");
        System.out.println(zzjg);
        System.out.println(zjhyfl);
        System.out.println(xmszd);
        System.out.println(xmmc);
        System.out.println(xmjd);
        try {
            cn.ccccltd.webservice.construction.projectbaseinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.construction.projectbaseinfo.GhscgzjzbWs#updateBaseInfo(cn.ccccltd.webservice.construction.projectbaseinfo.GhscgzjzbVO projectBaseInfo)*
     */
    public cn.ccccltd.webservice.construction.projectbaseinfo.ReturnMessage updateBaseInfo(cn.ccccltd.webservice.construction.projectbaseinfo.GhscgzjzbVO projectBaseInfo) { 
        LOG.info("Executing operation updateBaseInfo");
        System.out.println(projectBaseInfo);
        try {
            cn.ccccltd.webservice.construction.projectbaseinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.construction.projectbaseinfo.GhscgzjzbWs#queryBaseInfoById(java.lang.String zzjg, java.lang.String recid)*
     */
    public cn.ccccltd.webservice.construction.projectbaseinfo.ReturnMessage queryBaseInfoById(java.lang.String zzjg, java.lang.String recid) { 
        LOG.info("Executing operation queryBaseInfoById");
        System.out.println(zzjg);
        System.out.println(recid);
        try {
            cn.ccccltd.webservice.construction.projectbaseinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.construction.projectbaseinfo.GhscgzjzbWs#addBaseInfo(cn.ccccltd.webservice.construction.projectbaseinfo.GhscgzjzbVO projectBaseInfo)*
     */
    public cn.ccccltd.webservice.construction.projectbaseinfo.ReturnMessage addBaseInfo(cn.ccccltd.webservice.construction.projectbaseinfo.GhscgzjzbVO projectBaseInfo) { 
        LOG.info("Executing operation addBaseInfo");
        System.out.println(projectBaseInfo);
        try {
            cn.ccccltd.webservice.construction.projectbaseinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
