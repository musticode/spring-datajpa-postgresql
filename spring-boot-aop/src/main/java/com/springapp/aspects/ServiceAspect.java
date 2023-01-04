package com.springapp.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.springapp.service.*.*(..))")
    public void beforeMessageMethod(JoinPoint joinPoint){

        System.out.println("mesaj ver metodundan önce param yakalandı: "+ joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.springapp.service.*.*(..))")
    public void afterMessageMethod(JoinPoint joinPoint){
        System.out.println("mesaj ver metodundan sonra param yakalandı: "+ joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

}
