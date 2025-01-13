package com.xmin.lab.scheduler.quartz.job;

import lombok.Data;

/**
 * JobDetail的默认实现.
 *
 * @author liminggangrs
 */
@Data
public class DefaultJobDetail implements JobDetail {

    private String JobId;

    private Class<? extends Job> jobClass;


}
