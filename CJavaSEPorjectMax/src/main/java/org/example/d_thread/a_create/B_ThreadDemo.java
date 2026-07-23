package org.example.d_thread.a_create;

public class B_ThreadDemo {
    public static void main(String[] args) {
        // 目标：掌握多线程的创建方式二：实现 Runnable 接口
        // 1、定义一个线程任务类实现 Runnable 接口

        // 3、创建线程任务类的对象代表一个线程任务。
        Runnable r = new MyRunnable();
        // 4、把线程任务对象交给一个线程对象来处理
        Thread t = new Thread(r); // public Thread(Runnable r)
        // Thread t = new Thread(r, "1号子线程"); // public Thread(Runnable r, String name)
        // 5、启动线程
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出" + i);
        }
    }
}

// 1、定义一个线程任务类实现 Runnable 接口
class MyRunnable implements Runnable {
    // 2、重写 Runnable 接口的 run 方法，设置线程任务
    @Override
    public void run() {
        // 3、在 run 方法中编写线程的任务代码(线程要干的活)
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出" + i);
        }
    }
}
