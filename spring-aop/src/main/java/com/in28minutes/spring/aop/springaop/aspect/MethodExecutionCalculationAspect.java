package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
// Configuration
@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Around("com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
	public void around(ProceedingJoinPoint joinpoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		joinpoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("timeTaken by {} is {}", joinpoint, timeTaken);
	}
}
