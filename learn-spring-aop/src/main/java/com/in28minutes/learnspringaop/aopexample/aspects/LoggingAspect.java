package com.in28minutes.learnspringaop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//Configuration class
//AOP
@Configuration
@Aspect
public class LoggingAspect {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	//Pointcur - When?
	// execution(* com.in28minutes.learnspringaop.aopexample.business.**(..))
	@Before("execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))")
	public void logMethodCallBeforeExecution(JoinPoint joinPoint) {
		//Logic - What?
		logger.info("Before Aspect - Method is called - {} is called with arguments:{}",
				joinPoint, joinPoint.getArgs());
	}
	
	@After("execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))")
	public void logMethodCallAfterExecution(JoinPoint joinPoint) {
		logger.info("After Aspect - Method is called - {} has executed", joinPoint);
	}
	
	@AfterThrowing(
			pointcut = "execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))",
			throwing = "exception")
	public void logMethodCallAfterException(JoinPoint joinPoint, Exception exception) {
		logger.info("AfterThrowing Aspect - {} has throw an exception {}"
				, joinPoint, exception);
	}
	
	@AfterReturning(
			pointcut = "execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))",
			returning = "resultValue")
	public void logMethodCallAfterSuccessExecution(JoinPoint joinPoint, Object resultValue) {
		logger.info("AfterReturning Aspect - {} has returned {}"
				, joinPoint, resultValue);
	}

}
