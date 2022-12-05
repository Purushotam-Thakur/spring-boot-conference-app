package com.itsme.conferenceapp.services;


import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@Conditional(UseLatestVersionCondition.class)
public class TestConditionalV2Impl implements TestConditionalInterface {
    @Override
    public String testResponse(){
        return "New Version";
    }
}
