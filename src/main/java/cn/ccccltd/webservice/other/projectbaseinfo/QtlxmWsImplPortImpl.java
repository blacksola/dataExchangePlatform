
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package cn.ccccltd.webservice.other.projectbaseinfo;

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
 * 2017-04-26T13:12:45.438+08:00
 * Generated source version: 3.1.8
 * 
 */

@javax.jws.WebService(
                      serviceName = "qtlxmWsImpl",
                      portName = "QtlxmWsImplPort",
                      targetNamespace = "http://projectbaseinfo.other.webservice.ccccltd.cn/",
                      wsdlLocation = "http://localhost:8060/waf/ws/other_productBaseInfo?wsdl",
                      endpointInterface = "cn.ccccltd.webservice.other.projectbaseinfo.QtlxmWs")
                      
public class QtlxmWsImplPortImpl implements QtlxmWs {

    private static final Logger LOG = Logger.getLogger(QtlxmWsImplPortImpl.class.getName());

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.other.projectbaseinfo.QtlxmWs#queryBaseInfo(java.lang.String zzjg, java.lang.String zjhyfl, java.lang.String xmszd, java.lang.String xmmc, java.lang.String ssqy, java.lang.String htmc, java.lang.String dwqypp, java.lang.String sftz)*
     */
    public cn.ccccltd.webservice.other.projectbaseinfo.ReturnMessage queryBaseInfo(java.lang.String zzjg, java.lang.String zjhyfl, java.lang.String xmszd, java.lang.String xmmc, java.lang.String ssqy, java.lang.String htmc, java.lang.String dwqypp, java.lang.String sftz) { 
        LOG.info("Executing operation queryBaseInfo");
        System.out.println(zzjg);
        System.out.println(zjhyfl);
        System.out.println(xmszd);
        System.out.println(xmmc);
        System.out.println(ssqy);
        System.out.println(htmc);
        System.out.println(dwqypp);
        System.out.println(sftz);
        try {
            cn.ccccltd.webservice.other.projectbaseinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.other.projectbaseinfo.QtlxmWs#queryContractInfoByContractCode(java.lang.String contractCode)*
     */
    public cn.ccccltd.webservice.other.projectbaseinfo.ReturnMessage queryContractInfoByContractCode(java.lang.String contractCode) { 
        LOG.info("Executing operation queryContractInfoByContractCode");
        System.out.println(contractCode);
        try {
            cn.ccccltd.webservice.other.projectbaseinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.other.projectbaseinfo.QtlxmWs#updateContractScInfo(java.lang.String xmid, java.lang.String cxmid)*
     */
    public cn.ccccltd.webservice.other.projectbaseinfo.ReturnMessage updateContractScInfo(java.lang.String xmid, java.lang.String cxmid) { 
        LOG.info("Executing operation updateContractScInfo");
        System.out.println(xmid);
        System.out.println(cxmid);
        try {
            cn.ccccltd.webservice.other.projectbaseinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.other.projectbaseinfo.QtlxmWs#deleteProject(java.lang.String baserecid)*
     */
    public cn.ccccltd.webservice.other.projectbaseinfo.ReturnMessage deleteProject(java.lang.String baserecid) { 
        LOG.info("Executing operation deleteProject");
        System.out.println(baserecid);
        try {
            cn.ccccltd.webservice.other.projectbaseinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.other.projectbaseinfo.QtlxmWs#addBaseInfo(cn.ccccltd.webservice.other.projectbaseinfo.QtlxmVO projectBaseInfo)*
     */
    public cn.ccccltd.webservice.other.projectbaseinfo.ReturnMessage addBaseInfo(cn.ccccltd.webservice.other.projectbaseinfo.QtlxmVO projectBaseInfo) { 
        LOG.info("Executing operation addBaseInfo");
        System.out.println(projectBaseInfo);
        try {
            cn.ccccltd.webservice.other.projectbaseinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.other.projectbaseinfo.QtlxmWs#updateBaseInfo(cn.ccccltd.webservice.other.projectbaseinfo.QtlxmVO projectBaseInfo)*
     */
    public cn.ccccltd.webservice.other.projectbaseinfo.ReturnMessage updateBaseInfo(cn.ccccltd.webservice.other.projectbaseinfo.QtlxmVO projectBaseInfo) { 
        LOG.info("Executing operation updateBaseInfo");
        System.out.println(projectBaseInfo);
        try {
            cn.ccccltd.webservice.other.projectbaseinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.other.projectbaseinfo.QtlxmWs#queryBaseInfoById(java.lang.String zzjg, java.lang.String recid)*
     */
    public cn.ccccltd.webservice.other.projectbaseinfo.ReturnMessage queryBaseInfoById(java.lang.String zzjg, java.lang.String recid) { 
        LOG.info("Executing operation queryBaseInfoById");
        System.out.println(zzjg);
        System.out.println(recid);
        try {
            cn.ccccltd.webservice.other.projectbaseinfo.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}