package com.example.helloquartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class HelloQuartzApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(HelloQuartzApplication2.class, args);
    }

}
