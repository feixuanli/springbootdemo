package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
// Configuration
@Aspect
@Configuration
public class AfterAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@AfterReturning(
			value="com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()",
			returning="result"
	)
	public void afterReturning(JoinPoint joinpoint, Object result) {
		logger.info("{}return with value {}", joinpoint, result);
	}


	@AfterThrowing(
			value="com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()",
			throwing="exception"
	)
	public void afterThrowing(JoinPoint joinpoint, Exception exception) {
		logger.info("{}return with value {}", joinpoint, exception);
	}

	@After(value="com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void after(JoinPoint joinpoint) {
		logger.info("after execution of {}", joinpoint);
	}

}
