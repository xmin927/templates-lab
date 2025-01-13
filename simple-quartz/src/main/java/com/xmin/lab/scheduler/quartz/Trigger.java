package com.xmin.lab.scheduler.quartz;

import java.util.Date;

/**
 * @author liminggangrs
 */
public interface Trigger {

    String getTriggerId();

    Date getStartTime();

    Date getEndTime();

    Date getNextFiredTime();

}
