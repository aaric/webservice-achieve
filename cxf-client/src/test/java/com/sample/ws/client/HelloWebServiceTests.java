package com.sample.ws.client;

import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * HelloWebServiceTests
 *
 * @author Aaric, created on 2020-09-04T10:38.
 * @version 0.1.0-SNAPSHOT
 */
@Slf4j
public class HelloWebServiceTests {

    @Test
    @Disabled
    public void testAdd() throws Exception {
        String wsdlUrl = "http://localhost:8080/ws/helloWebService?wsdl";
        JaxWsDynamicClientFactory dynamicClientFactory = JaxWsDynamicClientFactory.newInstance();
        Client client = dynamicClientFactory.createClient(wsdlUrl);
        Object[] msg = client.invoke("add", 1, 2);
        log.info("result: {}", msg[0]);
        Assertions.assertEquals(3, msg[0]);
    }
}
