package com.astontech.hr.configuration;



import org.h2.server.web.WebServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {


    // proper login for JDBC jdbc:h2:mem:testdb     if mem is swapped to memfs it will save db after closing





    @Bean
    ServletRegistrationBean h2servletRegistration() {  //h2servletRegistration method returns a ServletRegistrationBean

        //Create Servlet registration bean called registration bean. Passes an instance of WebServlet(h2 database) in
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());

        //Set the url of our h2 database to http://localhost:8080/console
        registrationBean.addUrlMappings("/console/*");

        return registrationBean;
    }
}