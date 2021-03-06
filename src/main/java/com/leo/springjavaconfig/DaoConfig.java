package com.leo.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Dao dao() {
        return new Dao();
    }

}
