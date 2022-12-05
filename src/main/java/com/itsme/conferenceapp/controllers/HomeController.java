package com.itsme.conferenceapp.controllers;

import com.itsme.conferenceapp.services.TestConditionalInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @Value("${app.version}")
    private String appVersion;

    @Autowired
    TestConditionalInterface testConditionalInterface;

    @GetMapping
    @RequestMapping("/")
    public Map<String, String> getStatus(){
        Map<String, String> map = new HashMap<>();
        map.put("app-version", appVersion);
        return map;
    }
    @GetMapping
    @RequestMapping("/version")
    public String getVersion(){
        String response = testConditionalInterface.testResponse();
        return response;
    }

}
