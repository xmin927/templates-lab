package com.xmin.lab.scheduler.quartz;

import com.xmin.lab.scheduler.quartz.job.DefaultJobDetail;
import com.xmin.lab.scheduler.quartz.job.Job;
import com.xmin.lab.scheduler.quartz.job.JobDetail;
import java.util.TimeZone;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author liminggangrs
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter(AccessLevel.PRIVATE)
public class JobBuilder {

    private String jobId;

    private Class<? extends Job> jobClass;

    public static JobBuilder builder() {

        return new JobBuilder();
    }

    public JobBuilder jobId(String jobId) {
        this.setJobId(jobId);
        return this;
    }

    public JobBuilder jobClass(Class<? extends Job> job) {
        this.setJobClass(job);
        return this;
    }

    public JobDetail build() {
        DefaultJobDetail job = new DefaultJobDetail();
        job.setJobClass(getJobClass());
        job.setJobId(getJobId());
        return job;
    }

}
