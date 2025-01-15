package com.xmin.lab.scheduler.quartz;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

public class StandaloneQuartzMain {

    public static void main(String[] args) throws InterruptedException, SchedulerException {

        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

        scheduler.start();

        //定义一个具体的任务，在MyJob中实现
        JobDetail job = newJob(MyJob.class).withIdentity("job1", "group1").build();

        //定义触发器以及具体的触发规则
        Trigger trigger = newTrigger().withIdentity("trigger1", "group1")
                .startNow()
                .withSchedule(simpleSchedule()
                        .withIntervalInSeconds(3)
                        .repeatForever())
                .build();

        //开始进行任务调度
        scheduler.scheduleJob(job, trigger);

        //用于阻塞主线程
        Thread.sleep(60 * 1000);

        //关闭调度实例
        scheduler.shutdown();
    }
}
