package org.example.a_collection.d_genericity;

import java.util.ArrayList;

public class B_GenericityDemo {
    public static void main(String[] args) {
        // 目标：理解通配符和上下限
        ArrayList<B_Xiaomi> xiaomis = new ArrayList<>();
        xiaomis.add(new B_Xiaomi());
        xiaomis.add(new B_Xiaomi());
        xiaomis.add(new B_Xiaomi());
        go(xiaomis);

        ArrayList<B_BYD> byds = new ArrayList<>();
        byds.add(new B_BYD());
        byds.add(new B_BYD());
        byds.add(new B_BYD());
        go(byds);

        // ArrayList<B_Dog> dogs = new ArrayList<>();
        // dogs.add(new B_Dog());
        // dogs.add(new B_Dog());
        // dogs.add(new B_Dog());
        // go(dogs);
    }

    // 需求：开发一个极品飞车的游戏。
    // 虽然 Xiaomi 和 BYD 是 Car 的子类，但是 ArrayList<B_Xiaomi> ArrayList<B_BYD> 和 ArrayList<B_Car> 是没有半毛钱关系！
    public static void go(ArrayList<? extends B_Car> cars) {

    }
}
