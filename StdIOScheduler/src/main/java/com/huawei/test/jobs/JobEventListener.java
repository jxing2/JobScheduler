package com.huawei.test.jobs;

import com.huawei.test.jobs.pojo.BaseJobEntity;
import com.huawei.test.util.LogUtil;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class JobEventListener implements ApplicationListener<JobEvent> {

    @Async
    @Override
    public void onApplicationEvent(JobEvent event) {
        BaseJobEntity baseJobEntity = event.getBaseJobEntity();
        LogUtil.log("JobId : {}", baseJobEntity.getJobId());
    }
}
