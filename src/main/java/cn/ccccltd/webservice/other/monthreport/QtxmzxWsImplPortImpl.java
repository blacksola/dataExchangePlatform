
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package cn.ccccltd.webservice.other.monthreport;

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
 * 2017-04-17T09:32:34.076+08:00
 * Generated source version: 3.1.8
 * 
 */

@javax.jws.WebService(
                      serviceName = "qtxmzxWsImpl",
                      portName = "QtxmzxWsImplPort",
                      targetNamespace = "http://monthreport.other.webservice.ccccltd.cn/",
                      wsdlLocation = "http://192.168.0.174:8090/waf/ws/other_monthReport?wsdl",
                      endpointInterface = "cn.ccccltd.webservice.other.monthreport.QtxmzxWs")
                      
public class QtxmzxWsImplPortImpl implements QtxmzxWs {

    private static final Logger LOG = Logger.getLogger(QtxmzxWsImplPortImpl.class.getName());

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.other.monthreport.QtxmzxWs#updateMonthReport(cn.ccccltd.webservice.other.monthreport.QtxmzxVO monthReportInfo)*
     */
    public cn.ccccltd.webservice.other.monthreport.ReturnMessage updateMonthReport(cn.ccccltd.webservice.other.monthreport.QtxmzxVO monthReportInfo) { 
        LOG.info("Executing operation updateMonthReport");
        System.out.println(monthReportInfo);
        try {
            cn.ccccltd.webservice.other.monthreport.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.other.monthreport.QtxmzxWs#queryMonthReport(java.lang.String zzjg, java.lang.String datatime)*
     */
    public cn.ccccltd.webservice.other.monthreport.ReturnMessage queryMonthReport(java.lang.String zzjg, java.lang.String datatime) { 
        LOG.info("Executing operation queryMonthReport");
        System.out.println(zzjg);
        System.out.println(datatime);
        try {
            cn.ccccltd.webservice.other.monthreport.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.other.monthreport.QtxmzxWs#queryMonthReportById(java.lang.String zzjg, java.lang.String jtRevenueId, java.lang.String jtContractId)*
     */
    public cn.ccccltd.webservice.other.monthreport.ReturnMessage queryMonthReportById(java.lang.String zzjg, java.lang.String jtRevenueId, java.lang.String jtContractId) { 
        LOG.info("Executing operation queryMonthReportById");
        System.out.println(zzjg);
        System.out.println(jtRevenueId);
        System.out.println(jtContractId);
        try {
            cn.ccccltd.webservice.other.monthreport.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.other.monthreport.QtxmzxWs#addMonthReport(cn.ccccltd.webservice.other.monthreport.QtxmzxVO monthReportInfo)*
     */
    public cn.ccccltd.webservice.other.monthreport.ReturnMessage addMonthReport(cn.ccccltd.webservice.other.monthreport.QtxmzxVO monthReportInfo) { 
        LOG.info("Executing operation addMonthReport");
        System.out.println(monthReportInfo);
        try {
            cn.ccccltd.webservice.other.monthreport.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
