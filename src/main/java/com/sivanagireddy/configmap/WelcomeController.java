package com.sivanagireddy.configmap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @Value("${message:Hello Controller}")
    private String message;

    @GetMapping
    public Map<String,String> getWelcome() {
        return Collections.singletonMap("welcome",message);
    }
}
