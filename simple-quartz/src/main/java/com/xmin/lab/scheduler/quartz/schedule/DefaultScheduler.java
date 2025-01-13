package com.xmin.lab.scheduler.quartz.schedule;

import com.xmin.lab.scheduler.quartz.Scheduler;
import com.xmin.lab.scheduler.quartz.Trigger;
import com.xmin.lab.scheduler.quartz.job.JobDetail;

/**
 * @author liminggangrs
 */
public class DefaultScheduler implements Scheduler {

    private final MainThread thread = new MainThread();

    @Override
    public void start() {
        thread.start();
    }

    @Override
    public void shutdown() {
        thread.shutdown();
    }

    @Override
    public void scheduled(JobDetail jobDetail, Trigger trigger) {

    }
}
