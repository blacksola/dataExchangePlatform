package cn.ccccltd.webservice.design.contractchange;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-03-17T17:21:50.197+08:00
 * Generated source version: 3.1.8
 * 
 */
@WebService(targetNamespace = "http://contractchange.design.webservice.ccccltd.cn/", name = "SjbghtWs")
@XmlSeeAlso({ObjectFactory.class})
public interface SjbghtWs {

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "addContractChange", targetNamespace = "http://contractchange.design.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.design.contractchange.AddContractChange")
    @WebMethod(action = "http://contractchange.design.webservice.ccccltd.cn/addContractChange")
    @ResponseWrapper(localName = "addContractChangeResponse", targetNamespace = "http://contractchange.design.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.design.contractchange.AddContractChangeResponse")
    public cn.ccccltd.webservice.design.contractchange.ReturnMessage addContractChange(
        @WebParam(name = "sjbghtInfo", targetNamespace = "")
        cn.ccccltd.webservice.design.contractchange.SjbghtVO sjbghtInfo
    );

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "updateContractChange", targetNamespace = "http://contractchange.design.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.design.contractchange.UpdateContractChange")
    @WebMethod(action = "http://contractchange.design.webservice.ccccltd.cn/updateContractChange")
    @ResponseWrapper(localName = "updateContractChangeResponse", targetNamespace = "http://contractchange.design.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.design.contractchange.UpdateContractChangeResponse")
    public cn.ccccltd.webservice.design.contractchange.ReturnMessage updateContractChange(
        @WebParam(name = "sjbghtInfo", targetNamespace = "")
        cn.ccccltd.webservice.design.contractchange.SjbghtVO sjbghtInfo
    );
}