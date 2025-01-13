package com.xmin.lab.quartz.controller;

import com.xmin.lab.quartz.demo.JobService;
import lombok.RequiredArgsConstructor;
import org.quartz.SchedulerException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JobController {

    private final JobService jobService;

    @GetMapping(value = "/addJob")
    public void addJob() throws SchedulerException {
        jobService.scheduleJob();
    }

    @GetMapping(value = "/removeJob")
    public void removeJob() throws SchedulerException {
        jobService.removeJob();
    }


}
