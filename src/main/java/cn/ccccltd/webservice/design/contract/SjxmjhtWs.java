package cn.ccccltd.webservice.design.contract;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-04-22T14:53:24.371+08:00
 * Generated source version: 3.1.8
 * 
 */
@WebService(targetNamespace = "http://contract.design.webservice.ccccltd.cn/", name = "SjxmjhtWs")
@XmlSeeAlso({ObjectFactory.class})
public interface SjxmjhtWs {

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "queryContractInfo", targetNamespace = "http://contract.design.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.design.contract.QueryContractInfo")
    @WebMethod(action = "http://contract.design.webservice.ccccltd.cn/queryContractInfo")
    @ResponseWrapper(localName = "queryContractInfoResponse", targetNamespace = "http://contract.design.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.design.contract.QueryContractInfoResponse")
    public cn.ccccltd.webservice.design.contract.ReturnMessage queryContractInfo(
        @WebParam(name = "zzjg", targetNamespace = "")
        java.lang.String zzjg,
        @WebParam(name = "zjhyfl", targetNamespace = "")
        java.lang.String zjhyfl,
        @WebParam(name = "xmszd", targetNamespace = "")
        java.lang.String xmszd,
        @WebParam(name = "xmmc", targetNamespace = "")
        java.lang.String xmmc,
        @WebParam(name = "ssqy", targetNamespace = "")
        java.lang.String ssqy,
        @WebParam(name = "htmc", targetNamespace = "")
        java.lang.String htmc,
        @WebParam(name = "htqdfs", targetNamespace = "")
        java.lang.String htqdfs
    );

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "updateContractScInfo", targetNamespace = "http://contract.design.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.design.contract.UpdateContractScInfo")
    @WebMethod(action = "http://contract.design.webservice.ccccltd.cn/updateContractScInfo")
    @ResponseWrapper(localName = "updateContractScInfoResponse", targetNamespace = "http://contract.design.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.design.contract.UpdateContractScInfoResponse")
    public cn.ccccltd.webservice.design.contract.ReturnMessage updateContractScInfo(
        @WebParam(name = "xmid", targetNamespace = "")
        java.lang.String xmid,
        @WebParam(name = "htid", targetNamespace = "")
        java.lang.String htid,
        @WebParam(name = "scgzid", targetNamespace = "")
        java.lang.String scgzid,
        @WebParam(name = "cxmid", targetNamespace = "")
        java.lang.String cxmid,
        @WebParam(name = "chtid", targetNamespace = "")
        java.lang.String chtid,
        @WebParam(name = "cscgzid", targetNamespace = "")
        java.lang.String cscgzid
    );

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "queryContractInfoByContractCode", targetNamespace = "http://contract.design.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.design.contract.QueryContractInfoByContractCode")
    @WebMethod(action = "http://contract.design.webservice.ccccltd.cn/queryContractInfoByContractCode")
    @ResponseWrapper(localName = "queryContractInfoByContractCodeResponse", targetNamespace = "http://contract.design.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.design.contract.QueryContractInfoByContractCodeResponse")
    public cn.ccccltd.webservice.design.contract.ReturnMessage queryContractInfoByContractCode(
        @WebParam(name = "contractCode", targetNamespace = "")
        java.lang.String contractCode
    );

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "queryContractInfoById", targetNamespace = "http://contract.design.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.design.contract.QueryContractInfoById")
    @WebMethod(action = "http://contract.design.webservice.ccccltd.cn/queryContractInfoById")
    @ResponseWrapper(localName = "queryContractInfoByIdResponse", targetNamespace = "http://contract.design.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.design.contract.QueryContractInfoByIdResponse")
    public cn.ccccltd.webservice.design.contract.ReturnMessage queryContractInfoById(
        @WebParam(name = "zzjg", targetNamespace = "")
        java.lang.String zzjg,
        @WebParam(name = "recid", targetNamespace = "")
        java.lang.String recid
    );

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "addContractInfo", targetNamespace = "http://contract.design.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.design.contract.AddContractInfo")
    @WebMethod(action = "http://contract.design.webservice.ccccltd.cn/addContractInfo")
    @ResponseWrapper(localName = "addContractInfoResponse", targetNamespace = "http://contract.design.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.design.contract.AddContractInfoResponse")
    public cn.ccccltd.webservice.design.contract.ReturnMessage addContractInfo(
        @WebParam(name = "contractInfo", targetNamespace = "")
        cn.ccccltd.webservice.design.contract.SjxmjhtVO contractInfo
    );

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "updateContractInfo", targetNamespace = "http://contract.design.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.design.contract.UpdateContractInfo")
    @WebMethod(action = "http://contract.design.webservice.ccccltd.cn/updateContractInfo")
    @ResponseWrapper(localName = "updateContractInfoResponse", targetNamespace = "http://contract.design.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.design.contract.UpdateContractInfoResponse")
    public cn.ccccltd.webservice.design.contract.ReturnMessage updateContractInfo(
        @WebParam(name = "contractInfo", targetNamespace = "")
        cn.ccccltd.webservice.design.contract.SjxmjhtVO contractInfo
    );
}
