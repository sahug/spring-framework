package org.examples.aspectOrientedPrograming.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/* @Aspect and @Component are required annotation for AOP */
@Aspect
@Component

/* Order indicates which aspect to execute first */
@Order(1)
public class VehicleStartCheckAspect {
    private final Logger logger = Logger.getLogger(VehicleStartCheckAspect.class.getName());

    /* Before advice runs before a matched method execution */
    @Before("execution(* org.examples.aspectOrientedPrograming.services.*.*(..)) && args(vehicleStarted, ..)")

    /* JoinPoint is used to control the flow of application */
    public void checkVehicleStarted(JoinPoint joinPoint, boolean vehicleStarted) throws Throwable {
        if (!vehicleStarted) {
            throw new RuntimeException("Vehicle not started");
        }
    }
}
