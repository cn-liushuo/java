package org.example.d_thread.a_create;

public class B_ThreadDemo_a {
    public static void main(String[] args) {
        // 目标：掌握多线程的创建方式二：使用 Runnable 接口的匿名内部类来创建
        // 3、创建线程任务类的对象代表一个线程任务。
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程一输出" + i);
                }
            }
        };
        // 4、把线程任务对象交给一个线程对象来处理
        Thread t = new Thread(r); // public Thread(Runnable r)
        // 5、启动线程
        t.start();

        // 4、把线程任务对象交给一个线程对象来处理
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程二输出" + i);
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("子线程三输出" + i);
            }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出" + i);
        }
    }
}
