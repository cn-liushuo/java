package org.example.d_thread.a_create;

public class A_ThreadDemo {
    // main 方法本身是由一条主线程负责推进执行的。
    public static void main(String[] args) {
        // 目标：认识多线程，掌握创建线程的方式一：继承 Thread 类来实现
        // 4、创建线程类的对象，代表线程。
        Thread t1 = new MyThread();
        // 5、调用 start 方法，启动线程，还是调用 run 方法执行的
        t1.start(); // 启动线程，让线程执行 run 方法

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出" + i);
        }
    }
}

// 1、定义一个子类继承 Thread 类，成为一个线程类。
class MyThread extends Thread {
    // 2、重写 Thread 类的 run 方法
    @Override
    public void run() {
        // 3、在 run 方法中编写线程的任务代码(线程要干的活)
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出" + i);
        }
    }
}
