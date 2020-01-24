package com.spring.aspects;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspects {
	LocalTime startTime;
	
	@Before("execution(* com.spring.services.EmployeeService.getAllEmployees(..))")
	public void logBeforeV1(JoinPoint joinPoint) {
		this.startTime=LocalTime.now();

		System.out.println("EmployeeAspect.logBeforeV1 :"+joinPoint.getSignature().getName());
	}
	@After("execution(* com.spring.services.EmployeeService.getAllEmployees(..))")
	public void logAfterV2(JoinPoint joinPoint) {
		long total_time=ChronoUnit.MILLIS.between(this.startTime, LocalTime.now());
		System.out.println("Total Time for execution of getAllEmployees is :"+total_time+" milliseconds");
	}
}
