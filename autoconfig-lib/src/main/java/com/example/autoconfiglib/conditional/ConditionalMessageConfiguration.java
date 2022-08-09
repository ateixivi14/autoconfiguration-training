package com.example.autoconfiglib.conditional;

import com.example.autoconfiglib.CustomMessageLib;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;

@Configuration
@ConditionalOnMissingBean(type="com.example.autoconfigurationtraining.FirstBean")
public class ConditionalMessageConfiguration {

    @Value("${message.conditional}")
    private String message;

    @Bean("conditionalMessageBean")
    public CustomMessageLib conditionalMessageBean() {
        return new CustomMessageLib(message);
    }
}
