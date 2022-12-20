package org.examples.aspectOrientedPrograming.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

/* @Aspect and @Component are required annotation for AOP */
@Aspect
@Component

/* Order indicates which aspect to execute first */
@Order(2)
public class LoggerAspect {
    private final Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    /* Around advice runs "around" a matched method execution. It has the opportunity to do work both
     * before and after the method runs and to determine when, how and even if the method actually gets to run at all */

    /* Join Point which defines the event that triggers the execution of an aspect.
     * Inside Spring, this event is always a method call.*/

    /* Execution Pattern:
    * execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern) throws-pattern?) */

    @Around("execution(* org.examples.aspectOrientedPrograming.services.*.*(..))")

    /* JoinPoint is used to control the flow of application */
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.getSignature().toString() + " METHOD: log, ANNOTATION: Around: method execution start");
        Instant start = Instant.now();
        /* Executes the actual method and gives the control back to AOP */
        joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : " + timeElapsed);
        logger.info(joinPoint.getSignature().toString() + " METHOD: log, ANNOTATION: Around: method execution end");
    }

    /* AfterThrowing advice runs when a matched method execution exits by throwing an exception */
    @AfterThrowing(value = "execution(* org.examples.aspectOrientedPrograming.services.*.*(..))", throwing = "exception")
    public void logException(JoinPoint joinPoint, Exception exception) {
        logger.log(Level.SEVERE, joinPoint.getSignature() + " An exception thrown with the help of" +
                " @AfterThrowing which happened due to : " + exception.getMessage());
    }

    /* AfterReturning advice runs when a matched method execution completes normally */
    @AfterReturning(value = "execution(* org.examples.aspectOrientedPrograming.services.*.*(..))", returning = "retVal")
    public void logStatus(JoinPoint joinPoint, Object retVal) {
        logger.log(Level.INFO, joinPoint.getSignature() + " METHOD: logStatus, ANNOTATION: AfterReturning: Method successfully processed with the status " +
                retVal.toString());
    }

    /* After (finally) advice runs no matter how a matched execution exits. */
    /*
    @After(value = "execution(* org.examples.aspectOrientedPrograming.services.*.*(..))")
    public void logAfter() {}
    */
}
