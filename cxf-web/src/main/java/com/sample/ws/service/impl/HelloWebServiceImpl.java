package com.sample.ws.service.impl;

import com.sample.ws.service.HelloWebService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * HelloWebServiceImpl
 *
 * @author Aaric, created on 2020-09-04T09:31.
 * @version 0.1.0-SNAPSHOT
 */
@Component
@WebService(serviceName = "helloWebService",
        targetNamespace = "http://service.ws.sample.com/",
        endpointInterface = "com.sample.ws.service.HelloWebService")
public class HelloWebServiceImpl implements HelloWebService {

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public String user(long id) {
        //return new User(id, "Aaric");
        return "Hello World";
    }
}
