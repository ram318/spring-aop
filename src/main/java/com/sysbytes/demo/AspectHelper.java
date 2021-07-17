package com.sysbytes.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AdviceName;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class AspectHelper {
    //Point-cut: Where to execute the Advice

    @Before("execution(public void showMessage())")
    public void log(JoinPoint joinPoint){
        System.out.println("Method called");
        System.out.println(joinPoint.getTarget().getClass().getName());
    }
}
