package com.avenuecode.configuration;

import com.avenuecode.services.ImageService;
import com.avenuecode.services.ImageServiceImpl;
import com.avenuecode.services.ProductService;
import com.avenuecode.services.ProductServiceImpl;
import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by cod- on 7/6/2017.
 */
@Configuration
public class WebConfiguration {
    @Bean
    ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }

    @Bean
    ProductService productService() {

        return new ProductServiceImpl();
    }

    @Bean
    ImageService imageService() {

        return new ImageServiceImpl();
    }
}
