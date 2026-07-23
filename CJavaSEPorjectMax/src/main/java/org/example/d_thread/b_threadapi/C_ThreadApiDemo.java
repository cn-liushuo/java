package org.example.d_thread.b_threadapi;

public class C_ThreadApiDemo {
    public static void main(String[] args) {
        // 目标：搞清楚线程的 join 方法：线程插队，让调用这个方法的线程先执行完毕
        MyThread2 t1 = new MyThread2();
        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "输出" + i);
            if (i == 1) {
                try {
                    t1.join(); // 插队，让 t1 线程先执行完毕，然后继续执行主线程
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

// 1、定义一个子类继承 Thread 类，成为一个线程类。
class MyThread2 extends Thread {
    // 2、重写 Thread 类的 run 方法
    @Override
    public void run() {
        // 3、在 run 方法中编写线程的任务代码(线程要干的活)
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "输出" + i);
        }
    }
}