package com.luv2code.aopdemo.aspect;

import com.luv2code.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

    @Around("execution(* com.luv2code.aopdemo.service.*.getFortune(..))")
    public Object aroundGetFortune (
            ProceedingJoinPoint theProceedingJoinPoint
    ) throws Throwable {
        // Print out method we are advising on
        String method = theProceedingJoinPoint.getSignature().toShortString();
        System.out.println("\n==========> Executing @Around on method: " + method);

        // Get begin timestamp
        long begin = System.currentTimeMillis();

        // now, let's execute the method
        Object result = null;

        try {
            result = theProceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // result = "Major accident!!! But no worries, your private AOP Helicopter is on the way!!!";

            // Rethrow Exception
            throw e;
        }

        // Get end timestamp
        long end = System.currentTimeMillis();

        // Compute duration and display
        long duration = end - begin;
        System.out.println("\n==========> Duration: " + duration / 1000 + " seconds <=========");

        return result;
    }

    @After("execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))")
    public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint) {
        // Print out which method we are advising on
        String method = theJoinPoint.getSignature().toShortString();
        System.out.println("\n==========> Executing @After(Finally) on method: " + method + " <=========");

    }

    @AfterThrowing(
            pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
            throwing = "theExc"
    )
    public void afterThrowingFindAccountsAdvice(
            JoinPoint theJoinPoint, Throwable theExc
    ) {
        // Print out which method we are advising on
        String method = theJoinPoint.getSignature().toShortString();
        System.out.println("\n==========> Executing @AfterThrowing on method: " + method);

        // Log the exception
        System.out.println("\n==========> The exception is: " + theExc);

    }

    @Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
        System.out.println("\n=======>>>> Executing inside @Before Advice on AddAccount() <<<<<========\n");

        // Display the method Signature
        MethodSignature methodSignature = (MethodSignature) theJoinPoint.getSignature();
        System.out.println("Method: " + methodSignature);

        // Display method arguments

        Object[] args = theJoinPoint.getArgs();

        for(Object tempArg : args) {
            System.out.println(tempArg);

            if(tempArg instanceof Account) {
                Account theAccount = (Account) tempArg;

                System.out.println("account name: " + theAccount.getName());
                System.out.println("account level: " + theAccount.getLevel());
            }
        }
    }

    @AfterReturning(
            pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
            returning = "result")
    public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result) {

        // Print out which method we are advising on
        String method = theJoinPoint.getSignature().toShortString();
        System.out.println("\n==========> Executing @AfterReturning on method: " + method);

        // Print out the results of the method call
        System.out.println("\n==========> The Results are: " + result);

        // Let's post-process the data ... let's modify it :-)


        // Convert the account names to uppercase
        convertAccountNameToUpperCase(result);

        System.out.println("\n=========>After Modification: " + result);

    }

    private void convertAccountNameToUpperCase(List<Account> result) {

        // Loop through accounts
        for(Account tempAccount : result) {

            // Get uppercase version of name
            String theUpperName = tempAccount.getName().toUpperCase();

            // Update the name on hte account
            tempAccount.setName(theUpperName);
        }
    }
}
