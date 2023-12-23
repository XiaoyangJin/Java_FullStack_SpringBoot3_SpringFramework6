package com.in28minutes.learnspringaop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
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
	public void logMethosCall(JoinPoint joinPoint) {
		//Logic - What?
		logger.info("Before Aspect - Method is called - {} is called with arguments:{}",
				joinPoint, joinPoint.getArgs());
		
	}

}
