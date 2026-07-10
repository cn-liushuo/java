package org.example.b_collection_map_stream.c_stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class D_StreamDemo {
    public static void main(String[] args) {
        // 目标：掌握 Stream 流的统计，收集操纵(终结方法)
        List<D_Teacher> teachers = new ArrayList<>();
        teachers.add(new D_Teacher("张三", 23, 500));
        teachers.add(new D_Teacher("金毛狮王", 54, 16000));
        teachers.add(new D_Teacher("李四", 24, 6000));
        teachers.add(new D_Teacher("王五", 25, 7000));
        teachers.add(new D_Teacher("白眉鹰王", 66, 100800));
        teachers.add(new D_Teacher("陈昆", 42, 48000));

        teachers.stream()
                .filter(t -> t.getSalary() > 15000)
                .forEach(System.out::println);

        System.out.println("=========");

        long count = teachers.stream()
                .filter(t -> t.getSalary() > 15000)
                .count();
        System.out.println(count);

        System.out.println("=========");

        // 获取薪水最高的老师对象
        Optional<D_Teacher> max = teachers.stream()
                .max((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary()));
        D_Teacher maxTeacher = max.get(); // 获取 Optional 对象中的元素
        System.out.println(maxTeacher);

        Optional<D_Teacher> min = teachers.stream()
                .max((t1, t2) -> Double.compare(t2.getSalary(), t1.getSalary()));
        D_Teacher minTeacher = min.get(); // 获取 Optional 对象中的元素
        System.out.println(minTeacher);

        System.out.println("=========");

        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张翠山");
        list.add("张三丰");

        // 流只能收集一次

        // 收集到集合或者数组中去
        Stream<String> s1 = list.stream()
                .filter(s -> s.startsWith("张"));
        // 收集到List集合
        List<String> list1 = s1.collect(Collectors.toList());
        System.out.println(list1);

        // Set<String> set2 = new HashSet<>();
        // set2.addAll(list1);

        // 收集到Set集合
        Stream<String> s2 = list.stream()
                .filter(s -> s.startsWith("张"));
        Set<String> set = s2.collect(Collectors.toSet());
        System.out.println(set);

        // 收集到数组中去
        Stream<String> s3 = list.stream()
                .filter(s -> s.startsWith("张"));
        Object[] array = s3.toArray();
        System.out.println("数组：" + Arrays.toString(array));

        System.out.println("===== 收集到 Map 集合 =====");

        // 收集到 Map 集合：键是老师名称，值是老师薪水

        // Map<String, Double> map = teachers.stream()
        //         .collect(Collectors.toMap(new Function<D_Teacher, String>() {
        //             @Override
        //             public String apply(D_Teacher dTeacher) {
        //                 return dTeacher.getName();
        //             }
        //         }, new Function<D_Teacher, Double>() {
        //             @Override
        //             public Double apply(D_Teacher dTeacher) {
        //                 return dTeacher.getSalary();
        //             }
        //         }));

        // 简化
        Map<String, Double> map = teachers.stream()
                .collect(Collectors.toMap(
                        D_Teacher::getName,
                        D_Teacher::getSalary
                ));

        System.out.println(map);
    }
}
