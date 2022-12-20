package org.examples.customAdviceInsideAOP.aspects;

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
public class LoggerAspect {
    private final Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    /* Around advice runs "around" a matched method execution. It has the opportunity to do work both
     * before and after the method runs and to determine when, how and even if the method actually gets to run at all */

    /* Join Point which defines the event that triggers the execution of an aspect.
     * Inside Spring, this event is always a method call.*/

    /* Execution Pattern:
    * execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern) throws-pattern?) */

    @Around("@annotation(org.examples.customAdviceInsideAOP.interfaces.LogAspect)")
    public void logWithAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.toString() + " METHOD: logWithAnnotation, ANNOTATION: Around: method execution start");
        Instant start = Instant.now();
        /* Executes the actual method and gives the control back to AOP */
        joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : " + timeElapsed);
        logger.info(joinPoint.getSignature().toString() + " METHOD: logWithAnnotation, ANNOTATION: Around: method execution end");
    }

    /* AfterThrowing advice runs when a matched method execution exits by throwing an exception */
    @AfterThrowing(value = "@annotation(org.examples.customAdviceInsideAOP.interfaces.LogAspect)", throwing = "exception")
    public void logExceptionWithAnnotation(JoinPoint joinPoint, Exception exception) {
        logger.log(Level.SEVERE, joinPoint.getSignature() + " An exception thrown with the help of" +
                " @AfterThrowing which happened due to : " + exception.getMessage());
    }

    /* AfterReturning advice runs when a matched method execution completes normally */
    @AfterReturning(value = "@annotation(org.examples.customAdviceInsideAOP.interfaces.LogAspect)", returning = "retVal")
    public void logStatusWithAnnotation(JoinPoint joinPoint, Object retVal) {
        logger.log(Level.INFO, joinPoint.getSignature() + " METHOD: logStatusWithAnnotation, ANNOTATION: AfterReturning: Method successfully processed with the status " +
                retVal.toString());
    }

    /* Before advice runs before a matched method execution */
    @Before("@annotation(org.examples.customAdviceInsideAOP.interfaces.LogAspect) && args(vehicleStarted, ..)")

    /* JoinPoint is used to control the flow of application */
    public void checkVehicleStarted(JoinPoint joinPoint, boolean vehicleStarted) throws Throwable {
        if (!vehicleStarted) {
            throw new RuntimeException("Vehicle not started");
        }
    }

}
