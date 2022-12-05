package com.itsme.conferenceapp.services;


import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

@Service
public class TestConditionalImpl implements TestConditionalInterface {
    @Override
    public String testResponse(){
        return "Old Version";
    }
}
