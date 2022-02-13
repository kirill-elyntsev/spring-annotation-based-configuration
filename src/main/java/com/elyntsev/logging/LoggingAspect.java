package com.elyntsev.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.elyntsev.dao.PersonDaoSimple.*(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("Вызова метода:  " + joinPoint.getSignature().getName());
    }
}
