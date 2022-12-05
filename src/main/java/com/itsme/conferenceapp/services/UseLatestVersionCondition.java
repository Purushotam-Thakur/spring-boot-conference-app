package com.itsme.conferenceapp.services;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


public class UseLatestVersionCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        try {
            String isFlagEnabled = context.getEnvironment().getProperty("test.use.latest");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
            return isFlagEnabled.equals("true");
        }
        catch (Exception ex){
            System.out.println("-------------------------------------------------------------");
            System.out.println(ex);
            return false;
        }
    }
}
