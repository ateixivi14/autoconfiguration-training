package com.example.autoconfiglib.annotation;

import com.example.autoconfiglib.CustomMessageLib;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationMessageConfiguration {

    @Value("${message.annotation}")
    private String message;

    @Bean("annotationMessageBean")
    public CustomMessageLib annotationMessageBean() {
        return new CustomMessageLib(message);
    }
}