package com.example.autoconfigurationtraining;

import com.example.autoconfiglib.annotation.EnableAnnotationMessage;
import com.example.autoconfiglib.manual.ManualMessageConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ManualMessageConfiguration.class)
@EnableAnnotationMessage
public class AutoconfigurationTrainingApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoconfigurationTrainingApplication.class, args);
    }

}
