package com.beltran.factura;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MvcConfig implements WebMvcConfigurer {

    //private final Logger log = loggerFactory.get(getClass());

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){

        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
