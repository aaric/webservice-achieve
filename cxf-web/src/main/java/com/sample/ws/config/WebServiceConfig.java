package com.sample.ws.config;

import com.sample.ws.service.HelloWebService;
import com.sample.ws.service.impl.HelloWebServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
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

    @Bean
    @SuppressWarnings("unchecked")
    public ServletRegistrationBean dispatcherServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/ws/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public HelloWebService helloWebService() {
        return new HelloWebServiceImpl();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), helloWebService());
        endpoint.publish("/hello");
        return endpoint;
    }
}
