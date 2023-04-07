package com.example.demo;

import org.springframework.web.servlet.config.annotation.CorsRegistry;

public interface WebMvcConfigurer {
    public void addCorsMappings(CorsRegistry registry);
}
