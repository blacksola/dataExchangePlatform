
package cn.ccccltd.webservice.org;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-03-31T16:35:24.775+08:00
 * Generated source version: 3.1.8
 * 
 */
 
public class MdorgWs_MdorgWsImplPort_Server{

    protected MdorgWs_MdorgWsImplPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new MdorgWsImplPortImpl();
        String address = "http://192.168.0.138:8090/waf_ws/ws/org";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new MdorgWs_MdorgWsImplPort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
