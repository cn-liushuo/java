package org.example.b_collection_map_stream.c_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class C_StreamDemo {
    public static void main(String[] args) {
        // 目标：掌握 Stream 常用的中间方法，对流上的数据进行处理(返回新流，支持链式编程)
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张翠山");

        // 1、过滤方法
        list.stream()
                .filter(s -> s.startsWith("张") && s.length() == 3)
                .forEach(System.out::println);

        // 2、排序方法
        List<Double> scores = new ArrayList<>();
        scores.add(99.0);
        scores.add(66.6);
        scores.add(66.6);
        scores.add(77.6);
        scores.add(77.6);
        scores.add(99.6);

        scores.stream()
                .sorted()
                .forEach(System.out::println); // 默认是升序
        System.out.println("=========");
        scores.stream()
                .sorted((s1, s2) -> Double.compare(s2, s1)) // 降序
                .forEach(System.out::println);
        System.out.println("=========");
        scores.stream()
                .sorted((s1, s2) -> Double.compare(s2, s1)) // 降序
                .limit(2) // 前两名
                .forEach(System.out::println);
        System.out.println("=========");
        scores.stream()
                .sorted((s1, s2) -> Double.compare(s2, s1)) // 降序
                .skip(2) // 跳过前两名
                .forEach(System.out::println);
        System.out.println("=========");
        // 如果自定义对象去重复，要重写 hashCode 和 equals 方法，才可以去重复！
        scores.stream()
                .sorted((s1, s2) -> Double.compare(s2, s1)) // 降序
                .distinct() // 去重
                .forEach(System.out::println);

        // 映射/加工方法：把流上元的数据拿出来变成新数据又放到流上去。
        scores.stream()
                .map(s -> "加10分后：" + (s + 10))
                .forEach(System.out::println);

        // 合并流：
        Stream<String> s1 = Stream.of("张三丰", " 张无忌", "张翠山", " 周芷若", "张良");
        Stream<Integer> s2 = Stream.of(111, 22, 333, 44);
        Stream<Object> s3 = Stream.concat(s1, s2);

        System.out.println(s3.count());
    }
}
