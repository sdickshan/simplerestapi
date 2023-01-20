package com.org.samplerestapi;

import com.org.samplerestapi.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(WebConfig.class)

@SpringBootApplication
public class SampleRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleRestApiApplication.class, args);
    }

}
