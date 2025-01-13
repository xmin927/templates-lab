package com.xmin.lab.scheduler.quartz.jobstore;

import com.xmin.lab.scheduler.quartz.Trigger;
import com.xmin.lab.scheduler.quartz.job.JobDetail;
import java.util.Map;

/**
 * @author liminggangrs
 */
public interface JobStore {

    void add(JobDetail job, Trigger trigger);

    void update(JobDetail job, Trigger trigger);

    void del(String jobId);

    JobDetail retrieveJob(String jobId);

    Map<String, JobDetail> retrieveAll();

}
