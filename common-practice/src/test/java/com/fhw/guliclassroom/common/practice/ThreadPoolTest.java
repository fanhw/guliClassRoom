package com.fhw.guliclassroom.common.practice;

import com.fhw.guliclassroom.common.practice.config.UserMonitorThread;
import com.fhw.guliclassroom.common.practice.thread.ThreadPoolDemo.MyMonitorThread;
import com.fhw.guliclassroom.common.practice.thread.ThreadPoolDemo.WorkerThread;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-02 10:01
 */

@SpringBootTest
public class ThreadPoolTest {
    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Test
    public void test() throws InterruptedException {
        UserMonitorThread myMonitorThread = new UserMonitorThread(threadPoolTaskExecutor, 1);
        myMonitorThread.setExecutor(threadPoolTaskExecutor.getThreadPoolExecutor());
        Thread thread = new Thread(myMonitorThread);
        thread.start();
        for (int i = 0; i < 10; i++) {
            threadPoolTaskExecutor.execute(new WorkerThread("cmd" + i));
        }
        Thread.sleep(8000);
        //shut down the pool
        threadPoolTaskExecutor.shutdown();
        //shut down the monitor thread
        Thread.sleep(5000);
        myMonitorThread.shutdown();
    }
}
