package org.example.d_thread.g_executorService;

import java.util.concurrent.*;

public class A_ExecutorServiceDemo {
    public static void main(String[] args) {
        // 目标：创建线程池对象来使用。
        // 1、使用线程池的实现类 ThreadPoolExecutor 声明七个参数来创建线程池对象。
        ExecutorService pool = new ThreadPoolExecutor(
                3,
                5,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        // 2、使用线程池处理任务！看会不会复用线程？
    }
}
