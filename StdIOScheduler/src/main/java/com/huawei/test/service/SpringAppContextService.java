package com.huawei.test.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppContextService implements Runnable {
    private final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

    private void scanPackage() {
        ctx.scan("com.huawei.test");
        ctx.refresh();
    }

    @Override
    public void run() {
        scanPackage();
        JobRouter jobRouter = ctx.getBean(JobRouter.class);
        jobRouter.blockingStart();
    }

    public void stop() {
        JobRouter jobRouter = ctx.getBean(JobRouter.class);
        jobRouter.stop();
    }
}
