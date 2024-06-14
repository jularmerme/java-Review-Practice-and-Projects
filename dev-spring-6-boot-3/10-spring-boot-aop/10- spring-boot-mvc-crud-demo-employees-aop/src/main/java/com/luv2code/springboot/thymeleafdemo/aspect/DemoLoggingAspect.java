package com.luv2code.springboot.thymeleafdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.hibernate.mapping.Join;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class DemoLoggingAspect {

    // Set Up Logger
    private Logger myLogger = Logger.getLogger(getClass().getName());

    // Setup pointcut declarations
    @Pointcut("execution(* com.luv2code.springboot.thymeleafdemo.controller.*.*(..))")
    private void forControllerPackage() {}

    @Pointcut("execution(* com.luv2code.springboot.thymeleafdemo.service.*.*(..))")
    private void forServicePackage() {}

    @Pointcut("execution(* com.luv2code.springboot.thymeleafdemo.dao.*.*(..))")
    private void forDaoPackage() {}

    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
    private void forAppFlow() {}

    // Add Before Advice
    @Before("forAppFlow()")
    public void before(JoinPoint theJoinPoint) {

        // Display method we are calling
        String theMethod = theJoinPoint.getSignature().toShortString();
        myLogger.info("=====> in @Before: calling method: " + theMethod);

        // Display the arguments to the method


        // Get the arguments
        Object[] args = theJoinPoint.getArgs();

        // Loop thru and display args
        for (Object tempArg : args) {
            myLogger.info("=====> argument: " + tempArg);
        }

    }

    @AfterReturning(
            pointcut = "forAppFlow()",
            returning = "theResult"
    )
    public void afterReturning(JoinPoint theJoinPoint, Object theResult) {

        // Display method we are returning from
        String theMethod = theJoinPoint.getSignature().toShortString();
        myLogger.info("=====> in @AfterReturning: calling method: " + theMethod);

        // Display data returned
        myLogger.info("=====> Result: " + theResult);
    }

}
