package org.examples.aspectOrientedPrograming.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.examples.aspectOrientedPrograming.services",
        "org.examples.aspectOrientedPrograming.implementation",
        "org.examples.aspectOrientedPrograming.aspects"})

/* Enables AOP inside our Spring application */
@EnableAspectJAutoProxy
public class ProjectConfig {
}
