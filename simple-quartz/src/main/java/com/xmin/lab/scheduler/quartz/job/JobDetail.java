package com.xmin.lab.scheduler.quartz.job;

/**
 * @author liminggangrs
 */
public interface JobDetail {

    String getJobId();

    Class<? extends Job> getJobClass();


}
