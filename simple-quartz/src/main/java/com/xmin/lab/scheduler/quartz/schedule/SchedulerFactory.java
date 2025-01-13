package com.xmin.lab.scheduler.quartz.schedule;

import com.xmin.lab.scheduler.quartz.Scheduler;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * 创建调度器的静态工厂方法，通过不同的方法来创建不同类型的工厂实例
 *
 * @author liminggangrs
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SchedulerFactory {

    public static Scheduler createDefaultSchedule() {

        return new DefaultScheduler();

    }
}
