package com.sample.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * HelloWebService
 *
 * @author Aaric, created on 2020-09-04T09:29.
 * @version 0.1.0-SNAPSHOT
 */
@WebService
public interface HelloWebService {

    @WebMethod(operationName = "add")
    int add(@WebParam(name = "x") int x, @WebParam(name = "y") int y);
}
