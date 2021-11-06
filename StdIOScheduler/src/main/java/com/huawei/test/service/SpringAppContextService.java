package com.huawei.test.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppContextService {
    private final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

    public void start() {
        ctx.scan("com.huawei.test");
        ctx.refresh();
    }

    public ApplicationContext getApplicationContext() {
        return ctx;
    }
}
