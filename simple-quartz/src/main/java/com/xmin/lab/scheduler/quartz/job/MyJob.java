package com.xmin.lab.scheduler.quartz.job;

/**
 * @author liminggangrs
 */
public class MyJob implements Job {

    @Override
    public void run() {
        System.out.println("My job is running...");
    }
}
