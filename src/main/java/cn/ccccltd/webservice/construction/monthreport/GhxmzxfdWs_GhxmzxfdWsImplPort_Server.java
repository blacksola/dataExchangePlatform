
package cn.ccccltd.webservice.construction.monthreport;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-04-17T09:29:10.103+08:00
 * Generated source version: 3.1.8
 * 
 */
 
public class GhxmzxfdWs_GhxmzxfdWsImplPort_Server{

    protected GhxmzxfdWs_GhxmzxfdWsImplPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new GhxmzxfdWsImplPortImpl();
        String address = "http://192.168.0.174:8090/waf/ws/construction_monthReport";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new GhxmzxfdWs_GhxmzxfdWsImplPort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
