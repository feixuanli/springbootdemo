package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
// Configuration
@Aspect
@Configuration
public class BeforeAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// what kind of method calls to intercept
	// execution(RETURN_TYPE PACKAGE.CLASS.METHOD(ARGUMENTS))
	@Before("com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void before(JoinPoint joinpoint) {
		// what to do
		logger.info("checking for data layer {}", joinpoint);
	}
}


/***
 * Spring AOP: aspect oriented programming, logging, security, performance, etc. cross cutting concerns
 * Pointcut: RETURN_TYPE PACKAGE.CLASS.METHOD(ARGUMENTS)//  expression defines what methods to intercept
 * Advice: logger.info("intercepted method calls {}", joinpoint)// what to do with interception
 * Aspect: combination of Pointcut and advice
 * Join Point: each specific interception of a method call, a specific execution instance
 * Weaving/ weaver: this process of implementing AOP around the method calls , the framework which does this
 ***/