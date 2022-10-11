package com.websecurity.store.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class CorsConfiguration extends WebMvcConfigurationSupport {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/*") // /**
                .allowedOrigins("http://localhost:4444/")
                .allowedMethods("GET", "POST")
                .maxAge(3600)
                .allowCredentials(true);
    }
}
