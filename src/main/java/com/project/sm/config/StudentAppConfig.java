package com.project.sm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;


@Configuration
@EnableWebMvc // This annotation will ensure all the Spring MVC features are activated
@ComponentScan(basePackages = {"com.project.sm"})
public class StudentAppConfig implements WebMvcConfigurer {

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/views/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());

        return jdbcTemplate;
    }

    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        // Set the DB info to the dataSource object
        dataSource.setUsername("student");
        dataSource.setPassword("student");
        dataSource.setUrl("jdbc:postgresql://postgres-standalone:5432/student?useSSL=false");
        dataSource.setDriverClassName("org.postgresql.Driver");

        return dataSource;
    }

    // Adding the Static resources by registry the Handler and Locations
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/URLToReachResourcesFolder/**")
                .addResourceLocations("/resources/");

        registry
                .addResourceHandler("/URLToReachImagesFolder/**")
                .addResourceLocations("/resources/images/");
    }
}
