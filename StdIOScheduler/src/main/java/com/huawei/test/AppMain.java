package com.huawei.test;

import com.huawei.test.service.SpringAppContextService;
import com.huawei.test.util.LogUtil;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AppMain {
    public static void main(String[] args) {
        LogUtil.log("Starting service...");
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new SpringAppContextService());
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            LogUtil.log(ExceptionUtils.getStackTrace(e));
        }

    }
}
