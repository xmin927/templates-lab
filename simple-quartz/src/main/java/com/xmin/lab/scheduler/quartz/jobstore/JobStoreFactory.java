package com.xmin.lab.scheduler.quartz.jobstore;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author liminggangrs
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JobStoreFactory {

    public static JobStore createDefaultJobStore() {
        return new RamJobStore();
    }

}
