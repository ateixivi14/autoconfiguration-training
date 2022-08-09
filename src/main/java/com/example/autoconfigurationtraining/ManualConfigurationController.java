package com.example.autoconfigurationtraining;

import com.example.autoconfiglib.CustomMessageLib;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ManualConfigurationController {

    @Autowired(required = false)
    @Qualifier("manualMessageBean2")
    private CustomMessageLib manualMessage;

    @GetMapping("/manual")
    public String getManualMessage() {
        return manualMessage!= null ? manualMessage.getMessage() : "NO_BEAN";
    }
}
