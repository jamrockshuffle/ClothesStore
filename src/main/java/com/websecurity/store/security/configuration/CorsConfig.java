package com.websecurity.store.security.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class CorsConfig extends WebMvcConfigurationSupport {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/*") // /**
                .allowedOrigins("http://localhost:4444/")
                .allowedMethods("GET", "POST")
                .allowedHeaders("*")
                .maxAge(3600)
                .allowCredentials(true);
    }
}
