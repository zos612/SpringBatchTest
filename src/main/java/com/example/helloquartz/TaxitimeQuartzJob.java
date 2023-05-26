package com.example.helloquartz;

import lombok.Getter;
import lombok.Setter;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

@Getter
@Setter
public class TaxitimeQuartzJob extends QuartzJobBean {

    private String jobName;

    @Override
    protected void executeInternal(JobExecutionContext context) {
        System.out.println("TaxitimeQuartzJob.executeInternal");
    }
}
