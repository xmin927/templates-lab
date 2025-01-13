package com.xmin.lab.scheduler.quartz.trigger;

import com.xmin.lab.scheduler.quartz.Trigger;
import java.util.Date;
import lombok.Data;

/**
 * @author liminggangrs
 */
@Data
public class SimpleTimedTrigger implements Trigger {

    private String triggerId;

    private Date startTime;

    private Date endTime;

    @Override
    public Date getNextFiredTime() {
        return null;
    }
}
