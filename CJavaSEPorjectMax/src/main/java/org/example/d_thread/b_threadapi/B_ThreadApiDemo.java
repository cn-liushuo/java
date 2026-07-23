package org.example.d_thread.b_threadapi;

public class B_ThreadApiDemo {
    public static void main(String[] args) {
        // 目标：搞清楚 Thread 类的 Sleep 方法（线程休眠）
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            try {
                // 让当前执行的线程进入休眠状态，直到时间到了，才会继续执行。
                // 项目经理让我加上这行代码，如果用户交钱了，我就注释掉。
                Thread.sleep(1000); // 1000ms = 1s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
