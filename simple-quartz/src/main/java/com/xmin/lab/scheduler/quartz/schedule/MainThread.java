package com.xmin.lab.scheduler.quartz.schedule;


import com.xmin.lab.scheduler.quartz.job.JobDetail;
import com.xmin.lab.scheduler.quartz.jobstore.JobStore;
import com.xmin.lab.scheduler.quartz.jobstore.JobStoreFactory;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import lombok.extern.slf4j.Slf4j;

/**
 * @author liminggangrs
 */
@Slf4j
public class MainThread extends Thread {

    private final AtomicBoolean stop;

    private final Object lock = new Object();

    public MainThread() {

        stop = new AtomicBoolean(false);
    }

    @Override
    public void run() {
        long now = System.currentTimeMillis();
        while (!stop.get()) {
            synchronized (lock) {
                //从JobStore里面获取所有的可用的任务
                JobStore defaultJobStore = JobStoreFactory.createDefaultJobStore();
                Map<String, JobDetail> jobDetails = defaultJobStore.retrieveAll();

                jobDetails.forEach((jobId, job) -> {


                });

                log.info("running...");
            }
            log.info("Main thread stop");

        }
    }

    public void shutdown() {
        stop.set(true);
    }
}
