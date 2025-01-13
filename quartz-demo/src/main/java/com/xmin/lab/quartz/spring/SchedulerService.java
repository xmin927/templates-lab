package com.xmin.lab.quartz.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
@Slf4j
public class SchedulerService {

    @Scheduled(fixedRate = 2000)
    public void run() {

        log.info("spring scheduled job is running...");

    }

}
