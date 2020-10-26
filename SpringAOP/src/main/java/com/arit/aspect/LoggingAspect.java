package com.arit.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.arit.employee.Trainee;

@Aspect
public class LoggingAspect {
	/* @Before("execution(public String setName(..))") */
	// not sure if there are arguments available or not
	/* @Before("execution(public String getName(*))") */ // when there are arguments available
	/* @Before("execution(public * get*())") */
	/* @Before("execution(public String getName())") */
	/* @Before("execution(public String com.arit.employee.Trainee.getName())") */

	/*
	 * @Before("execution(public * setName(..))") public void loggingBeforeAdvice(){
	 * System.out.println("1. Logging Advice Before...."); }
	 * 
	 * @After("execution(public * setName(..))") public void loggingAfterAdvice(){
	 * System.out.println("2. Logging Advice After...."); }
	 * 
	 * @AfterReturning("execution(public * setName(..))") public void
	 * loggingAfterReturningAdvice(){
	 * System.out.println("3. Logging Advice After Returning...."); }
	 * 
	 * @AfterThrowing("execution(public * setName(..))") public void
	 * loggingAfterThrowingAdvice(){
	 * System.out.println("4. Logging Advice After Throwing...."); }
	 */

	/*
	 * @Around("execution(public String getName())") public void
	 * loggingBeforeAdvice(ProceedingJoinPoint pjp){
	 * 
	 * System.out.println("1.1. Logging Advice Before Around...."); try {
	 * pjp.proceed(); System.out.println("1.2. Logging Advice after Around....");
	 * }catch(Throwable e) { System.out.println("1.3. Logging Advice in Throw....");
	 * } System.out.println("1.1. Logging Advice After try Around...."); }
	 */

	/*
	 * @Before("allGetNames()") public void loggingBeforeAdvice(){
	 * System.out.println("1. Logging Advice Before...."); }
	 * 
	 * @After("allGetNames()") public void loggingAfterAdvice(){
	 * System.out.println("2. Logging Advice After...."); }
	 * 
	 * @AfterReturning("allGetNames()") public void loggingAfterReturningAdvice(){
	 * System.out.println("3. Logging Advice After Returning...."); }
	 * 
	 * @AfterThrowing("allGetNames()") public void loggingAfterThrowingAdvice(){
	 * System.out.println("4. Logging Advice After Throwing...."); }
	 * 
	 * 
	 * @Pointcut("execution(public String getName())") public void allGetNames() {}
	 * 
	 * @Pointcut("within(com.arit.employee.Trainee)") public void allGetNames() {}
	 */

	
	
	/*
	 * @Before("execution(public String getName())") public void
	 * loggingBeforeAdvice(JoinPoint jp){
	 * 
	 * System.out.println("1.1. Logging Advice Before ...");
	 * System.out.println(jp.toString()); }
	 * 
	 * @Pointcut("within(com.arit.employee.Trainee)") public void allGetNames() {}
	 */
	
	
	
	  @Before("execution(public String getName())") 
	  public void loggingBeforeAdvice(JoinPoint jp){
	  
	  System.out.println("1.1. Logging Advice Before ...");
	  Trainee tr = (Trainee)jp.getTarget();
	  System.out.println(tr.toString());
	  }
	  @Pointcut("within(com.arit.employee.Trainee)")
	  public void allGetNames() {}
	 
	
}
