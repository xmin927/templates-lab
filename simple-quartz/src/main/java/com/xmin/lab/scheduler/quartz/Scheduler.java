package com.xmin.lab.scheduler.quartz;

import com.xmin.lab.scheduler.quartz.job.JobDetail;

/**
 * @author liminggangrs
 */
public interface Scheduler {

    void start();

    void shutdown();

    void scheduled(JobDetail jobDetail, Trigger trigger);

}
