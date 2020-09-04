package com.sample.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.4.0
 * 2020-09-04T16:20:52.772+08:00
 * Generated source version: 3.4.0
 *
 */
@WebService(targetNamespace = "http://service.ws.sample.com/", name = "HelloWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWebService {

    @WebMethod
    @RequestWrapper(localName = "add", targetNamespace = "http://service.ws.sample.com/", className = "com.sample.ws.service.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://service.ws.sample.com/", className = "com.sample.ws.service.AddResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int add(

        @WebParam(name = "x", targetNamespace = "")
        int x,
        @WebParam(name = "y", targetNamespace = "")
        int y
    );

    @WebMethod
    @RequestWrapper(localName = "user", targetNamespace = "http://service.ws.sample.com/", className = "com.sample.ws.service.User")
    @ResponseWrapper(localName = "userResponse", targetNamespace = "http://service.ws.sample.com/", className = "com.sample.ws.service.UserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String user(

        @WebParam(name = "id", targetNamespace = "")
        long id
    );
}
