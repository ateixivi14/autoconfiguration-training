package com.example.autoconfiglib.auto;

import com.example.autoconfiglib.CustomMessageLib;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoMessageConfiguration {

    @Value("${message.auto}")
    private String message;

    @Bean("autoMessageBean")
    public CustomMessageLib autoMessageBean() {
        return new CustomMessageLib(message);
    }
}
