package com.xmin.lab.quartz.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.springframework.stereotype.Component;

import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

@Component
@RequiredArgsConstructor
@Slf4j
public class JobService {

    private final Scheduler scheduler;


    public void scheduleJob() throws SchedulerException {
        JobDetail job = JobBuilder.newJob(MyJob.class)
                .withIdentity("testName", "group1")
                .build();
        Trigger trigger = newTrigger()
                .withIdentity("trigger1", "group1")
                .startNow()
                .withSchedule(simpleSchedule()
                        .withIntervalInSeconds(1)
                        .withMisfireHandlingInstructionNowWithRemainingCount()
                        .repeatForever())
                .build();
        scheduler.scheduleJob(job, trigger);
    }

    public void removeJob() throws SchedulerException {
        scheduler.deleteJob(JobKey.jobKey("testName", "group1"));
    }


    public static class MyJob implements Job {

        @Override
        public void execute(JobExecutionContext jobExecutionContext) {

            log.info("quartz job is running...");
        }
    }

}
