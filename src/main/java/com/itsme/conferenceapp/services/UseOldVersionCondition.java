package com.itsme.conferenceapp.services;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


public class UseOldVersionCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        String isFlagEnabled = context.getEnvironment().getProperty("test.use.latest");
        return !isFlagEnabled.equals("true");
    }
}
