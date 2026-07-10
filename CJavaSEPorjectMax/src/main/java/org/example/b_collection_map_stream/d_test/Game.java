package org.example.b_collection_map_stream.d_test;

public class Game {
    public static void main(String[] args) {
        // 目标：开发斗地主游戏。
        // 1、每张牌都是一个对象，定义牌类。 -- Card
        // 2、游戏房间也是一个对象，定义房间类(54张牌，开始启动)。
        Room r = new Room();
        r.start();
    }
}
