
package cn.ccccltd.webservice.design.projectbaseinfo;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-04-26T13:11:26.085+08:00
 * Generated source version: 3.1.8
 * 
 */
public final class SjscgzjzbWs_SjscgzjzbWsImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://projectbaseinfo.design.webservice.ccccltd.cn/", "sjscgzjzbWsImpl");

    private SjscgzjzbWs_SjscgzjzbWsImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SjscgzjzbWsImpl.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        SjscgzjzbWsImpl ss = new SjscgzjzbWsImpl(wsdlURL, SERVICE_NAME);
        SjscgzjzbWs port = ss.getSjscgzjzbWsImplPort();  
        
        {
        System.out.println("Invoking queryBaseInfo...");
        java.lang.String _queryBaseInfo_zzjg = "";
        java.lang.String _queryBaseInfo_zjhyfl = "";
        java.lang.String _queryBaseInfo_xmszd = "";
        java.lang.String _queryBaseInfo_xmmc = "";
        java.lang.String _queryBaseInfo_xmjd = "";
        cn.ccccltd.webservice.design.projectbaseinfo.ReturnMessage _queryBaseInfo__return = port.queryBaseInfo(_queryBaseInfo_zzjg, _queryBaseInfo_zjhyfl, _queryBaseInfo_xmszd, _queryBaseInfo_xmmc, _queryBaseInfo_xmjd);
        System.out.println("queryBaseInfo.result=" + _queryBaseInfo__return);


        }
        {
        System.out.println("Invoking deleteProjectAndContract...");
        java.lang.String _deleteProjectAndContract_baserecid = "";
        java.lang.String _deleteProjectAndContract_contractrecid = "";
        cn.ccccltd.webservice.design.projectbaseinfo.ReturnMessage _deleteProjectAndContract__return = port.deleteProjectAndContract(_deleteProjectAndContract_baserecid, _deleteProjectAndContract_contractrecid);
        System.out.println("deleteProjectAndContract.result=" + _deleteProjectAndContract__return);


        }
        {
        System.out.println("Invoking queryBaseInfoById...");
        java.lang.String _queryBaseInfoById_zzjg = "";
        java.lang.String _queryBaseInfoById_recid = "";
        cn.ccccltd.webservice.design.projectbaseinfo.ReturnMessage _queryBaseInfoById__return = port.queryBaseInfoById(_queryBaseInfoById_zzjg, _queryBaseInfoById_recid);
        System.out.println("queryBaseInfoById.result=" + _queryBaseInfoById__return);


        }
        {
        System.out.println("Invoking addBaseInfo...");
        cn.ccccltd.webservice.design.projectbaseinfo.SjscgzjzbVO _addBaseInfo_projectBaseInfo = null;
        cn.ccccltd.webservice.design.projectbaseinfo.ReturnMessage _addBaseInfo__return = port.addBaseInfo(_addBaseInfo_projectBaseInfo);
        System.out.println("addBaseInfo.result=" + _addBaseInfo__return);


        }
        {
        System.out.println("Invoking updateBaseInfo...");
        cn.ccccltd.webservice.design.projectbaseinfo.SjscgzjzbVO _updateBaseInfo_projectBaseInfo = null;
        cn.ccccltd.webservice.design.projectbaseinfo.ReturnMessage _updateBaseInfo__return = port.updateBaseInfo(_updateBaseInfo_projectBaseInfo);
        System.out.println("updateBaseInfo.result=" + _updateBaseInfo__return);


        }

        System.exit(0);
    }

}
