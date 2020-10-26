package com.sivanagireddy.configmap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WelcomeScheduler {

    @Value("${welcome.message:Hello world!}")
    private String welcomeMsg;

    @Scheduled(fixedDelay = 3000L)
    public void printWelcomeMessage(){
        System.out.println(welcomeMsg);
    }
}
