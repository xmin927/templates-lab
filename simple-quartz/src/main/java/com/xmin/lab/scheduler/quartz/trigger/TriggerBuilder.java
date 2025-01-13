package com.xmin.lab.scheduler.quartz.trigger;

import com.xmin.lab.scheduler.quartz.Trigger;
import java.util.Date;
import java.util.Objects;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author liminggangrs
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter(AccessLevel.PRIVATE)
@Setter
public class TriggerBuilder {

    private String triggerId;

    private Date startTime;

    private Date endTime;

    public static TriggerBuilder builder() {
        return new TriggerBuilder();
    }

    public Trigger build() {
        SimpleTimedTrigger trigger = new SimpleTimedTrigger();
        trigger.setTriggerId(getTriggerId());
        trigger.setStartTime(Objects.requireNonNullElse(startTime, new Date()));
        trigger.setEndTime(endTime);
        return trigger;
    }
}
