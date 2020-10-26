package com.sivanagireddy.configmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringK8sConfigmapApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringK8sConfigmapApplication.class, args);
    }

}
