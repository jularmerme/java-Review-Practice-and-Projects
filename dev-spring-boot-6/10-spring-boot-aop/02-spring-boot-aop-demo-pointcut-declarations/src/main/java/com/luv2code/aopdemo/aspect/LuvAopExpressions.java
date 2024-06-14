package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LuvAopExpressions {

    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    public void forDaoPackage() {}

    // Create a pointcut for getter methods
    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
    public void getter() {}

    // Create a pointcut for setter methods
    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
    public void setter() {}

    // Create a pointcut: include package .... exclude getter/setter
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter() {}

}
