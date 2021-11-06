package com.huawei.test.jobs;

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

    public void blockingStart() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String jobStrInfo = null;
            try {
                jobStrInfo = br.readLine();
            } catch (IOException ex) {
                LogUtil.log(ExceptionUtils.getStackTrace(ex));
                continue;
            }
            LogUtil.log(jobStrInfo);
            appContext.publishEvent(new JobEvent(new BaseJobEntity(jobStrInfo, JobType.CREATE_INSTANCE)));
        }
    }
}
