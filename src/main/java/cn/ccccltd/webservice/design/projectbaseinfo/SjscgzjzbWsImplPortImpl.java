
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package cn.ccccltd.webservice.design.projectbaseinfo;

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
 * 2017-04-26T13:11:26.121+08:00
 * Generated source version: 3.1.8
 * 
 */

@javax.jws.WebService(
                      serviceName = "sjscgzjzbWsImpl",
                      portName = "SjscgzjzbWsImplPort",
                      targetNamespace = "http://projectbaseinfo.design.webservice.ccccltd.cn/",
                      wsdlLocation = "http://localhost:8060/waf/ws/design_productBaseInfo?wsdl",
                      endpointInterface = "cn.ccccltd.webservice.design.projectbaseinfo.SjscgzjzbWs")
                      
public class SjscgzjzbWsImplPortImpl implements SjscgzjzbWs {

    private static final Logger LOG = Logger.getLogger(SjscgzjzbWsImplPortImpl.class.getName());

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.design.projectbaseinfo.SjscgzjzbWs#queryBaseInfo(java.lang.String zzjg, java.lang.String zjhyfl, java.lang.String xmszd, java.lang.String xmmc, java.lang.String xmjd)*
     */
    public cn.ccccltd.webservice.design.projectbaseinfo.ReturnMessage queryBaseInfo(java.lang.String zzjg, java.lang.String zjhyfl, java.lang.String xmszd, java.lang.String xmmc, java.lang.String xmjd) { 
        LOG.info("Executing operation queryBaseInfo");
        System.out.println(zzjg);
        System.out.println(zjhyfl);
        System.out.println(xmszd);
        System.out.println(xmmc);
        System.out.println(xmjd);
        try {
            cn.ccccltd.webservice.design.projectbaseinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.design.projectbaseinfo.SjscgzjzbWs#deleteProjectAndContract(java.lang.String baserecid, java.lang.String contractrecid)*
     */
    public cn.ccccltd.webservice.design.projectbaseinfo.ReturnMessage deleteProjectAndContract(java.lang.String baserecid, java.lang.String contractrecid) { 
        LOG.info("Executing operation deleteProjectAndContract");
        System.out.println(baserecid);
        System.out.println(contractrecid);
        try {
            cn.ccccltd.webservice.design.projectbaseinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.design.projectbaseinfo.SjscgzjzbWs#queryBaseInfoById(java.lang.String zzjg, java.lang.String recid)*
     */
    public cn.ccccltd.webservice.design.projectbaseinfo.ReturnMessage queryBaseInfoById(java.lang.String zzjg, java.lang.String recid) { 
        LOG.info("Executing operation queryBaseInfoById");
        System.out.println(zzjg);
        System.out.println(recid);
        try {
            cn.ccccltd.webservice.design.projectbaseinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.design.projectbaseinfo.SjscgzjzbWs#addBaseInfo(cn.ccccltd.webservice.design.projectbaseinfo.SjscgzjzbVO projectBaseInfo)*
     */
    public cn.ccccltd.webservice.design.projectbaseinfo.ReturnMessage addBaseInfo(cn.ccccltd.webservice.design.projectbaseinfo.SjscgzjzbVO projectBaseInfo) { 
        LOG.info("Executing operation addBaseInfo");
        System.out.println(projectBaseInfo);
        try {
            cn.ccccltd.webservice.design.projectbaseinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.design.projectbaseinfo.SjscgzjzbWs#updateBaseInfo(cn.ccccltd.webservice.design.projectbaseinfo.SjscgzjzbVO projectBaseInfo)*
     */
    public cn.ccccltd.webservice.design.projectbaseinfo.ReturnMessage updateBaseInfo(cn.ccccltd.webservice.design.projectbaseinfo.SjscgzjzbVO projectBaseInfo) { 
        LOG.info("Executing operation updateBaseInfo");
        System.out.println(projectBaseInfo);
        try {
            cn.ccccltd.webservice.design.projectbaseinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}