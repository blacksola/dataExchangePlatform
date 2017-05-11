package cn.ccccltd.webservice.design.marketinfo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-03-14T16:55:50.926+08:00
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "sjscxxWsImpl", 
                  wsdlLocation = "http://localhost:8060/waf/ws/design_productMarektInfo?wsdl",
                  targetNamespace = "http://marketinfo.design.webservice.ccccltd.cn/") 
public class SjscxxWsImpl extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://marketinfo.design.webservice.ccccltd.cn/", "sjscxxWsImpl");
    public final static QName SjscxxWsImplPort = new QName("http://marketinfo.design.webservice.ccccltd.cn/", "SjscxxWsImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8060/waf/ws/design_productMarektInfo?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SjscxxWsImpl.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8060/waf/ws/design_productMarektInfo?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SjscxxWsImpl(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SjscxxWsImpl(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SjscxxWsImpl() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SjscxxWsImpl(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SjscxxWsImpl(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SjscxxWsImpl(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SjscxxWs
     */
    @WebEndpoint(name = "SjscxxWsImplPort")
    public SjscxxWs getSjscxxWsImplPort() {
        return super.getPort(SjscxxWsImplPort, SjscxxWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SjscxxWs
     */
    @WebEndpoint(name = "SjscxxWsImplPort")
    public SjscxxWs getSjscxxWsImplPort(WebServiceFeature... features) {
        return super.getPort(SjscxxWsImplPort, SjscxxWs.class, features);
    }

}
