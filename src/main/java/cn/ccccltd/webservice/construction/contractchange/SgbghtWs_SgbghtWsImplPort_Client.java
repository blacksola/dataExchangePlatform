
package cn.ccccltd.webservice.construction.contractchange;

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
 * 2017-03-17T17:50:20.943+08:00
 * Generated source version: 3.1.8
 * 
 */
public final class SgbghtWs_SgbghtWsImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://contractchange.construction.webservice.ccccltd.cn/", "sgbghtWsImpl");

    private SgbghtWs_SgbghtWsImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SgbghtWsImpl.WSDL_LOCATION;
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
      
        SgbghtWsImpl ss = new SgbghtWsImpl(wsdlURL, SERVICE_NAME);
        SgbghtWs port = ss.getSgbghtWsImplPort();  
        
        {
        System.out.println("Invoking addContractChange...");
        cn.ccccltd.webservice.construction.contractchange.SgbghtVO _addContractChange_sgbghtInfo = null;
        cn.ccccltd.webservice.construction.contractchange.ReturnMessage _addContractChange__return = port.addContractChange(_addContractChange_sgbghtInfo);
        System.out.println("addContractChange.result=" + _addContractChange__return);


        }
        {
        System.out.println("Invoking updateContractChange...");
        cn.ccccltd.webservice.construction.contractchange.SgbghtVO _updateContractChange_sgbghtInfo = null;
        cn.ccccltd.webservice.construction.contractchange.ReturnMessage _updateContractChange__return = port.updateContractChange(_updateContractChange_sgbghtInfo);
        System.out.println("updateContractChange.result=" + _updateContractChange__return);


        }

        System.exit(0);
    }

}
