package org.example.d_thread.h_test;

import java.util.List;

public class PeopleGetRedPacket extends Thread {
    private List<Integer> redPacket;

    public PeopleGetRedPacket(List<Integer> redPacket, String name) {
        super(name);
        this.redPacket = redPacket;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            // 100 个人来抢 redPacket 集合中的钱。
            synchronized (redPacket) {
                if (redPacket.size() == 0) {
                    break;
                }
                // 随机一个索引得到红包。
                int index = (int) (Math.random() * redPacket.size());
                Integer money = redPacket.remove(index);
                System.out.println(name + "抢到了" + money + "元");
                if (redPacket.size() == 0) {
                    System.out.println("活动结束！");
                    break;
                }
            }
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
