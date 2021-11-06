package com.huawei.scheduler.test;

import com.huawei.test.AppMain;
import com.huawei.test.service.SpringAppContextService;
import com.huawei.test.util.LogUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IOTest {

    @Before
    public void prepare() {
        ByteArrayInputStream in = new ByteArrayInputStream("input testString".getBytes());
        System.setIn(in);
    }

    @Test(timeout = 5000)
    public void TestIO() throws InterruptedException, IOException {
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        AppMain appMain = new AppMain();
//        AppMain.main(null);
//
//        InputStream sysInBackup = System.in; // backup System.in to restore it later
//
//        int read = System.in.read();
//
//        System.setIn(sysInBackup);
//        System.out.println(read);
    }

    @After
    public void stop() {
    }

}
