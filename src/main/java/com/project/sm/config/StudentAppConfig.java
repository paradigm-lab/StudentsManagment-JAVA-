package com.project.sm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableWebMvc // This annotation will ensure all the Spring MVC features are activated
@ComponentScan(basePackages = {"com.project.sm"})
public class StudentAppConfig {

}
