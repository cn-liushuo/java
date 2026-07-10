package org.example.b_collection_map_stream.c_stream;

import java.util.*;
import java.util.stream.Stream;

public class B_StreamDemo {
    public static void main(String[] args) {
        // 目标：获取 Stream 流的方式。
        // 1、获取集合的Stream流，调用集合提供的 stream() 方法
        Collection<String> list = new ArrayList<>();
        Stream<String> s1 = list.stream();

        // 2、Map集合，怎么拿 Stream 流。
        Map<String, Integer> map = new HashMap<>();
        // 获取键流
        Stream<String> s2 = map.keySet().stream();
        // 获取值流
        Stream<Integer> s3 = map.values().stream();
        // 获取键值对流
        Stream<Map.Entry<String, Integer>> s4 = map.entrySet().stream();

        // 3、获取数组的流。
        String[] names = {"张三丰", "张无忌", "张翠山", "周芷若", "张良"};
        Stream<String> s5 = Arrays.stream(names);
        System.out.println(s5.count()); // 5
        Stream<String> s6 = Stream.of(names);
        Stream<String> s7 = Stream.of("张三丰", " 张无忌", "张翠山", " 周芷若", "张良");
    }
}
