package com.springcourse.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcourse.springcoredemo.common.Coach;

@RestController

public class DemoController {

    private Coach myCoach;

    @Autowired
    public void setCoach(@Qualifier("aquatic") Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return myCoach.getDailyFortune();
    }
}
