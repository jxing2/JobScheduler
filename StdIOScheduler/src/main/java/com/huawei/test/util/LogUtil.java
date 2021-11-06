package com.huawei.test.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {
    private static final Logger logger = LoggerFactory.getLogger(LogUtil.class);

    public static void log(String logStr) {
        logger.info(logStr);
    }

    public static void log(String logStr, Object... args) {
        logger.info(logStr, args);
    }
}
