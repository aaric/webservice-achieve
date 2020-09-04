package com.sample.ws.config;

import com.sample.ws.service.HelloWebService;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * WebService配置
 *
 * @author Aaric, created on 2020-09-04T09:39.
 * @version 0.1.0-SNAPSHOT
 */
@Configuration
public class WebServiceConfig {

    @Autowired
    private SpringBus springBus;

    @Autowired
    private HelloWebService helloWebService;

    @Bean
    @SuppressWarnings("unchecked")
    public ServletRegistrationBean dispatcherCXFServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/ws/*");
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus, helloWebService);
        endpoint.publish("/helloWebService");
        return endpoint;
    }
}
