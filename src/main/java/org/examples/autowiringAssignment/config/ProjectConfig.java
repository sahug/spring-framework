package org.examples.autowiringAssignment.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.examples.autowiringAssignment.services", "org.examples.autowiringAssignment.implementation"})
@ComponentScan(basePackageClasses = {org.examples.autowiringAssignment.beans.PersonPOJO.class,
        org.examples.autowiringAssignment.beans.VehiclePOJO.class})
public class ProjectConfig {
}
