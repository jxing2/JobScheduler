package com.huawei.test;

import com.huawei.test.jobs.JobRouter;
import com.huawei.test.service.SpringAppContextService;
import com.huawei.test.util.LogUtil;

public class AppMain {
    public static void main(String[] args) {
        LogUtil.log("Starting service...");
        SpringAppContextService springAppContextService = new SpringAppContextService();
        springAppContextService.start();

        JobRouter jobRouter = springAppContextService.getApplicationContext().getBean(JobRouter.class);
        jobRouter.blockingStart();
    }
}
