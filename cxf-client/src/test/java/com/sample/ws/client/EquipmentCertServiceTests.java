package com.sample.ws.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.jupiter.api.Test;

/**
 * EquipmentCertServiceTests
 *
 * @author Aaric, created on 2020-09-04T11:22.
 * @version 0.1.0-SNAPSHOT
 */
public class EquipmentCertServiceTests {

    @Test
    public void testCertIssue() throws Exception {
        //cn.com.infosec:ISFJ:V2.0.139.15
        //cn.com.infosec:NetSignAgent:V5.5.40.12
        String wsdlUrl = "http://36.110.10.186:50072/NetCertRA6.3.0.1/equipmentCertService.wsdl";
        JaxWsDynamicClientFactory dynamicClientFactory = JaxWsDynamicClientFactory.newInstance();
        Client client = dynamicClientFactory.createClient(wsdlUrl);
        Object[] msg = client.invoke("certFreeze", 1, 2);
        System.err.println(msg);
    }
}
