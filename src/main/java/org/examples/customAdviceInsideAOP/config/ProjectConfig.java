package org.examples.customAdviceInsideAOP.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.examples.customAdviceInsideAOP.services",
        "org.examples.customAdviceInsideAOP.implementation",
        "org.examples.customAdviceInsideAOP.aspects"})

/* Enables AOP inside our Spring application */
@EnableAspectJAutoProxy
public class ProjectConfig {
}
