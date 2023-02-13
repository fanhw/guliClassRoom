package com.fhw.guliclassroom.common.practice.thread.ThreadPoolDemo;

import com.fhw.guliclassroom.common.practice.thread.MyThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.*;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-01 09:53
 */


public class WorkerPool {


    public static void main(String[] args) throws InterruptedException {
        RejectedExecutionHandlerImpl rejectedExecutionHandler = new RejectedExecutionHandlerImpl();
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 4,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2), threadFactory, rejectedExecutionHandler);
        MyMonitorThread myMonitorThread = new MyMonitorThread(threadPoolExecutor, 1);
        Thread thread = new Thread(myMonitorThread);
        thread.start();
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.execute(new WorkerThread("cmd" + i));
        }

        Thread.sleep(8000);
        //shut down the pool
        threadPoolExecutor.shutdown();
        //shut down the monitor thread
        Thread.sleep(5000);
        myMonitorThread.shutdown();

    }
}
