package com.example.autoconfigurationtraining;

import com.example.autoconfiglib.CustomMessageLib;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AutoConfigurationController {

    @Autowired(required = false)
    @Qualifier("autoMessageBean")
    private CustomMessageLib autoMessage;


    @GetMapping("/auto")
    public String getAutoMessage() {
        return autoMessage!= null ? autoMessage.getMessage() : "NO_BEAN";
    }
}
