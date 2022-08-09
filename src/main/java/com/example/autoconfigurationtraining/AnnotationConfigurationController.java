package com.example.autoconfigurationtraining;


import com.example.autoconfiglib.CustomMessageLib;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AnnotationConfigurationController {

    @Autowired(required = false)
    @Qualifier("annotationMessageBean")
    private CustomMessageLib annotationMessage;


    @GetMapping("/annotation")
    public String getAnnotationMessage() {
        return annotationMessage!= null ? annotationMessage.getMessage() : "NO_BEAN";
    }
}
