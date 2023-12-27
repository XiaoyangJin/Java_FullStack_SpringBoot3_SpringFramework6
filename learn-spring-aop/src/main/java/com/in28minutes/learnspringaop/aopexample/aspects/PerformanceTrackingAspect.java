package com.in28minutes.learnspringaop.aopexample.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class PerformanceTrackingAspect {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

//	@Around("com.in28minutes.learnspringaop.aopexample.aspects.CommonPointcutConfig.businessAndDataPackageConfig()")
	@Around("com.in28minutes.learnspringaop.aopexample.aspects.CommonPointcutConfig.trackTimeAnnotation()")
	public Object findExecutionTime(ProceedingJoinPoint preceedingJoinPoint) throws Throwable {
		//Start a timer
		long startTimeMillis = System.currentTimeMillis();
		
		//Execute the method
		Object returnValue = preceedingJoinPoint.proceed();
		
		//Stop the timer
		long stopTimeMillis = System.currentTimeMillis();
		
		long executionDuration = stopTimeMillis - startTimeMillis;
		
		logger.info("Around Aspect - {} Method executed in {} ms",preceedingJoinPoint ,executionDuration);
		
		return returnValue;
	}
	
}
