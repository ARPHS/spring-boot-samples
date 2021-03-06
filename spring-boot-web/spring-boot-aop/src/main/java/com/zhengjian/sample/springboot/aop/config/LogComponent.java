package com.zhengjian.sample.springboot.aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author cxy35
 * @Date 2019-07-26 7:36
 */
@Component
@Aspect
public class LogComponent {
    @Pointcut("execution(* com.zhengjian.sample.springboot.aop.service.*.*(..))")
    public void pc1() {
    }

    @Before(value = "pc1()")
    public void before(JoinPoint jp) {
        String name = jp.getSignature().getName();
        System.out.println("before--" + name);
    }

    @After(value = "pc1()")
    public void after(JoinPoint jp) {
        String name = jp.getSignature().getName();
        System.out.println("after--" + name);
    }

    @AfterReturning(value = "pc1()", returning = "result")
    public void afterReturning(JoinPoint jp, Object result) {
        String name = jp.getSignature().getName();
        System.out.println("afterReturning----" + name + "-----" + result);
    }

    @AfterThrowing(value = "pc1()",throwing = "e")
    public void afterThrowing(JoinPoint jp,Exception e) {
        String name = jp.getSignature().getName();
        System.out.println("afterThrowing---"+name+"----"+e.getMessage());
    }

    @Around("pc1()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        // 执行对应的方法
        Object proceed = pjp.proceed();
        return proceed;

        // 改变所有方法的返回值
        // return "https://cxy35.com";
    }
}
