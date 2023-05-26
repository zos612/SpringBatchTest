package com.example.helloquartz;

import lombok.RequiredArgsConstructor;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class TaxitimeQuartzJobConfig {

    @Bean
    public JobDetail departureTaxitimeJobDetail() {
        //Set Job data map
        JobDataMap jobDataMap = new JobDataMap();
//        jobDataMap.put("jobName", TaxitimeJobConfig.JOB_NAME);
//        jobDataMap.put("jobLauncher", jobLauncher);
//        jobDataMap.put("jobLocator", jobLocator);
//        jobDataMap.put("airportRepository", airportRepository);

        return JobBuilder.newJob(TaxitimeQuartzJob.class)
                .setJobData(jobDataMap)
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger departureTaxitimeJobTrigger()
    {
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder
                .simpleSchedule();

        return TriggerBuilder
                .newTrigger()
                .forJob(departureTaxitimeJobDetail())
                .withSchedule(scheduleBuilder)
                .build();
    }
}
