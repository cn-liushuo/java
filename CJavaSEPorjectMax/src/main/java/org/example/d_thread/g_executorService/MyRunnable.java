package org.example.d_thread.g_executorService;

// 1、定义一个线程任务类实现 Runnable 接口
public class MyRunnable implements Runnable {
    // 2、重写 Runnable 接口的 run 方法，设置线程任务
    @Override
    public void run() {
        // 3、在 run 方法中编写线程的任务代码(线程要干的活)
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "输出" + i);
            try {
                Thread.sleep(Integer.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
