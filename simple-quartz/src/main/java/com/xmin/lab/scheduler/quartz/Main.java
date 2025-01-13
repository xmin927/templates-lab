package com.xmin.lab.scheduler.quartz;

import com.xmin.lab.scheduler.quartz.job.JobDetail;
import com.xmin.lab.scheduler.quartz.job.MyJob;
import com.xmin.lab.scheduler.quartz.schedule.SchedulerFactory;

/**
 * @author liminggangrs
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scheduler schedule = SchedulerFactory.createDefaultSchedule();
        schedule.start();
        JobDetail jobDetail = JobBuilder.builder()
            .jobId("newJob")
            .jobClass(MyJob.class)
            .build();
        schedule.scheduled(jobDetail, null);
        Thread.sleep(10000);
        //do sth
        schedule.shutdown();
    }

}
