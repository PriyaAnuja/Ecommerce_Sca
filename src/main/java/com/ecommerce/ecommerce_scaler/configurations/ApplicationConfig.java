package com.ecommerce.ecommerce_scaler.configurations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/*
THis is a configuration class in SpringBoot application, it is annotated with the annotation
@configuration
indicating that this provides bean definitions and configuration for the application context
 */


@Configuration       //provides spring beans
public class ApplicationConfig {

    @Bean    //denotes this method is a bean producer.
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
