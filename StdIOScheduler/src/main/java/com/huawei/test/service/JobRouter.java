package com.huawei.test.service;

import com.huawei.test.jobs.JobEvent;
import com.huawei.test.jobs.JobType;
import com.huawei.test.jobs.pojo.BaseJobEntity;
import com.huawei.test.util.LogUtil;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
public class JobRouter {

    @Autowired
    private ApplicationContext appContext;

    private volatile boolean isRunning = true;

    public void blockingStart() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (isRunning) {
            String jobStrInfo = null;
            try {
                jobStrInfo = br.readLine();
                if(jobStrInfo == null) {
                    Thread.sleep(100);
                    continue;
                }
            } catch (IOException | InterruptedException ex) {
                LogUtil.log(ExceptionUtils.getStackTrace(ex));
                continue;
            }
            LogUtil.log(jobStrInfo);
            appContext.publishEvent(new JobEvent(new BaseJobEntity(jobStrInfo, JobType.CREATE_INSTANCE)));
        }
    }

    public void stop() {
        isRunning = false;
    }
}
