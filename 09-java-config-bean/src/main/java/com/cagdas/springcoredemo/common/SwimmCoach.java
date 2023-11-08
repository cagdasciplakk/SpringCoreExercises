package com.cagdas.springcoredemo.common;

import org.springframework.stereotype.Component;


public class SwimmCoach implements Coach{


    public SwimmCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName());

    }

    @Override
    public String getDailyWorkout() {
        return "Swimm 1000 meters as a warm up";
    }
}
