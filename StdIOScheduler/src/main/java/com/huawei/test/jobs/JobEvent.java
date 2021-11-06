package com.huawei.test.jobs;

import com.huawei.test.jobs.pojo.BaseJobEntity;
import org.springframework.context.ApplicationEvent;

public class JobEvent extends ApplicationEvent {

    private BaseJobEntity baseJobEntity;

    public JobEvent(BaseJobEntity source) {
        super(source);
        this.baseJobEntity = source;
    }

    public BaseJobEntity getBaseJobEntity() {
        return baseJobEntity;
    }
}
