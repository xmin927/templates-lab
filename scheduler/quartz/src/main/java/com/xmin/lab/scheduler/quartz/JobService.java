package com.xmin.lab.scheduler.quartz;

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

    private static final JobKey JOB_KEY = JobKey.jobKey("testName", "testGroup");

    private static final TriggerKey TRIGGER_KEY = TriggerKey.triggerKey("testName", "testGroup");


    public void scheduleJob() throws SchedulerException {

        JobDetail job = JobBuilder.newJob(MyJob.class)
                .withIdentity(JOB_KEY)
                .build();

        Trigger trigger = newTrigger()
                .withIdentity(TRIGGER_KEY)
                .startNow()
                .withSchedule(simpleSchedule()
                        .withIntervalInSeconds(1)
                        .withMisfireHandlingInstructionNowWithRemainingCount()
                        .repeatForever())
                .build();

        scheduler.scheduleJob(job, trigger);
    }

    public void removeJob() throws SchedulerException {
        scheduler.deleteJob(JOB_KEY);
    }


}
