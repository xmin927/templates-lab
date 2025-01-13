package com.xmin.lab.scheduler.quartz.jobstore;

import com.xmin.lab.scheduler.quartz.Trigger;
import com.xmin.lab.scheduler.quartz.job.JobDetail;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author liminggangrs
 */
public class RamJobStore implements JobStore {

    private final Map<String, JobDetail> jobs = new ConcurrentHashMap<>();

    @Override
    public void add(JobDetail job, Trigger trigger) {
        jobs.put(job.getJobId(), job);
    }

    @Override
    public void update(JobDetail job, Trigger trigger) {

    }

    @Override
    public void del(String jobId) {

    }

    @Override
    public JobDetail retrieveJob(String jobId) {
        return null;
    }

    @Override
    public Map<String, JobDetail> retrieveAll() {
        return jobs;
    }
}
