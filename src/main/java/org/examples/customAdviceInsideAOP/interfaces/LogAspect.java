package org.examples.customAdviceInsideAOP.interfaces;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)

/* Target object is the bean that declares the method/pointcut which is intercepted by an aspect */
@Target(ElementType.METHOD)
public @interface LogAspect {}
