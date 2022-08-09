package com.example.autoconfigurationtraining;

import com.example.autoconfiglib.CustomMessageLib;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConditionalConfigurationController {

    @Autowired(required = false)
    @Qualifier("conditionalMessageBean")
    private CustomMessageLib conditionalMessage;


    @GetMapping("/conditional")
    public String getConditionalMessage() {
        return conditionalMessage != null ? conditionalMessage.getMessage() : "NO_BEAN";
    }   
}
