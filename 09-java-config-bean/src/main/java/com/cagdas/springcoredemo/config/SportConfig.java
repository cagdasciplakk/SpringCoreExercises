package com.cagdas.springcoredemo.config;

import com.cagdas.springcoredemo.common.Coach;
import com.cagdas.springcoredemo.common.SwimmCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimmCoach(){
        return new SwimmCoach();
    }
}
