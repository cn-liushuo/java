package org.example.d_thread.a_create;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class C_ThreadDemo {
    public static void main(String[] args) {
        // 目标：掌握多线程的创建方式三：实现 Callable 接口，方式三的优势：可以获取线程执行完毕后的结果的。
        // 3、创建 Callable 接口的实现类对象
        Callable<String> c1 = new MyCallable(100);
        // 4、把 Callable 对象封装成一个真正的线程任务对象 FutureTask 对象。
        /**
         * 未来任务对象的作用：
         *   a. 本质是一个 Runnable 线程任务对象，可以交给 Thread 线程对象处理。
         *   b. 可以获取线程执行完毕后的结果。
         */
        FutureTask<String> f1 = new FutureTask<>(c1); // public FutureTask(Callable<V> callable)
        // 5、把 FutureTask 对象作为参数传给 Thread 线程对象。
        Thread t1 = new Thread(f1);
        // 6、启动线程
        t1.start();

        Callable<String> c2 = new MyCallable(50);

        FutureTask<String> f2 = new FutureTask<>(c2);
        Thread t2 = new Thread(f2);
        t2.start();

        // 获取线程执行完毕后返回的结果。
        try {
            // 如果发现第一个线程还没有执行完毕，会让出 CPU ，等第一个线程执行完毕后，才会往下执行！
            System.out.println(f1.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            // 如果发现第二个线程还没有执行完毕，会让出 CPU ，等第二个线程执行完毕后，才会往下执行！
            System.out.println(f2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 1、定义一个实现类实现 Callable 接口
class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    // 2、实现 call 方法，定义线程执行体
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "子线程1-" + n + "的和是：" + sum;
    }
}

