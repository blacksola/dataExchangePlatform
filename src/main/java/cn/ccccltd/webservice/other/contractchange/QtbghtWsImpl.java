package cn.ccccltd.webservice.other.contractchange;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-03-17T17:52:41.802+08:00
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "QtbghtWsImpl", 
                  wsdlLocation = "http://10.17.16.33:7070/waf/ws/other_contractChange?wsdl",
                  targetNamespace = "http://contractchange.other.webservice.ccccltd.cn/") 
public class QtbghtWsImpl extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://contractchange.other.webservice.ccccltd.cn/", "QtbghtWsImpl");
    public final static QName QtbghtWsImplPort = new QName("http://contractchange.other.webservice.ccccltd.cn/", "QtbghtWsImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://10.17.16.33:7070/waf/ws/other_contractChange?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(QtbghtWsImpl.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://10.17.16.33:7070/waf/ws/other_contractChange?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public QtbghtWsImpl(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public QtbghtWsImpl(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public QtbghtWsImpl() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public QtbghtWsImpl(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public QtbghtWsImpl(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public QtbghtWsImpl(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns QtbghtWs
     */
    @WebEndpoint(name = "QtbghtWsImplPort")
    public QtbghtWs getQtbghtWsImplPort() {
        return super.getPort(QtbghtWsImplPort, QtbghtWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QtbghtWs
     */
    @WebEndpoint(name = "QtbghtWsImplPort")
    public QtbghtWs getQtbghtWsImplPort(WebServiceFeature... features) {
        return super.getPort(QtbghtWsImplPort, QtbghtWs.class, features);
    }

}