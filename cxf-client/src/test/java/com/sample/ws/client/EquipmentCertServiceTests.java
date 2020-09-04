package com.sample.ws.client;

import cn.com.infosec.ra.webservice.CertIssueRequest;
import cn.com.infosec.ra.webservice.CertIssueResponse;
import cn.com.infosec.ra.webservice.EquipmentCertPort;
import cn.com.infosec.ra.webservice.Signature;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.jupiter.api.Test;

import java.time.Instant;

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
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(EquipmentCertPort.class);
        factory.setAddress("http://36.110.10.186:50072/NetCertRA6.3.0.1/equipmentCertService/");
        EquipmentCertPort equipmentCertService = (EquipmentCertPort) factory.create();

        CertIssueRequest certIssueRequest = new CertIssueRequest();

        // **交易流水号**
        certIssueRequest.setTransactionCode("test");

        // **参数信息**
        CertIssueRequest.Parameters parameters = new CertIssueRequest.Parameters();
        // CA标识：1-SM2算法CA 2-RSA算法CA
        parameters.setCaId("2");
        // 设备标识
        parameters.setUserName("");
        // 模板标识
        parameters.setTemplateID("");
        // 证书有效期长度，证书有效期长度
        parameters.setValidityLength("365");
        // 证书请求
        parameters.setP10("");
        // 时间戳
        parameters.setTimeStamp("" + Instant.now().toEpochMilli());
        // 证书扩展项
        parameters.setCertExtensions(null);

        certIssueRequest.setParameters(parameters);

        // **签名值**
        Signature signature = new Signature();
        // 签名值
        // 1.采用raw签名方式。
        // 2.使用接口管理员证书对userName、P10和timeStamp拼接成的字符串原文进行签名得到的Base64的值。
        // 3.签名原文使用UTF-8编码。
        signature.setSignDataBase64("");
        // 签名证书，Base64编码
        signature.setCertificateBase64("");

        certIssueRequest.setSignature(signature);

        CertIssueResponse certIssueResponse = equipmentCertService.certIssue(certIssueRequest);
        System.err.println(certIssueResponse);
    }
}
