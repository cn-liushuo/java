package org.example.d_thread.h_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadTest {
    public static void main(String[] args) {
        // 目标：完成多线程综合小案例
        // 红包雨游戏，某企业有100名员工，员工的工号依次是1，2，3，4，..到100。
        // 现在公司举办了年会活动，活动中有一个红包雨环节，要求共计发出200个红包，其中小红包在[1-30] 元之间。
        // 总占比为 80%，大红包[31-100]元，总占比为20%。
        // 分析：100个员工实际上就是100个线程，来竞争200个红包。
        List<Integer> redPacket = getRedPacket(200);
        // 2、定义线程类，船舰100个线程，竞争同一个集合。
        for (int i = 1; i <= 100; i++) {
            new PeopleGetRedPacket(redPacket, "人" + i).start();
        }
    }

    // 准备这200个随机的红包返回，放到 List 集合中去返回。
    public static List<Integer> getRedPacket(int count) {
        Random r = new Random();
        // 其中小红包在[1-30] 元之间，总占比为 80%。大红包[31-100]元，总占比为20%。
        List<Integer> redPacket = new ArrayList<>();
        for (int i = 0; i < count * 0.8; i++) {
            redPacket.add(r.nextInt(30) + 1);
        }
        for (int i = 0; i < count * 0.2; i++) {
            redPacket.add(r.nextInt(70) + 31);
        }
        return redPacket;
    }
}
