package org.example.b_collection_map_stream.a_hashset;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class A_SetDemo {
    public static void main(String[] args) {
        // 目标：认识Set家族集合的特点
        // 1、创建一个Set集合，特点：无序，不重复，无索引。
        // Set<String> set = new HashSet<>(); // 一行经典代码 HashSet 无序，不重复，无索引。
        Set<String> set = new LinkedHashSet<>(); // LinkedHashSet 有序，不重复，无索引。
        set.add("java");
        set.add("java");
        set.add("鸿蒙");
        set.add("鸿蒙");
        set.add("电商设计");
        set.add("电商设计");
        set.add("新媒体");
        set.add("大数据");
        System.out.println(set);

        // 2、创建一个TreeSet集合：排序(默认一定要大小升序排序)，不重复，无索引。
        Set<Double> set1 = new TreeSet<>();
        set1.add(9.5);
        set1.add(8.5);
        set1.add(10.5);
        set1.add(7.5);
        set1.add(1.0);
        set1.add(1.0);
        System.out.println(set1);
    }
}
