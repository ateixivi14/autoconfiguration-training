package com.example.autoconfiglib.manual;

import com.example.autoconfiglib.CustomMessageLib;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ManualMessageConfiguration {
    
    @Value("${message.manual}")
    private String message;
    
    @Bean("manualMessageBean") 
    public CustomMessageLib manualMessageBean() {
        return new CustomMessageLib(message);
    }
}
