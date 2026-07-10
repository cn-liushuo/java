package org.example.b_collection_map_stream.a_hashset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class C_SetDemo {
    public static void main(String[] args) {
        // 目标：搞清楚 TreeSet 集合对于自定义对象的排序
        Set<C_Teacher> teachers = new TreeSet<>(new Comparator<C_Teacher>() {
            @Override
            public int compare(C_Teacher o1, C_Teacher o2) {
                // return o2.getAge() - o1.getAge(); // 降序
                // if (o1.getSalary() > o2.getSalary()) {
                //     return 1;
                // } else if (o1.getSalary() < o2.getSalary()) {
                //     return -1;
                // } else {
                //     return 0;
                // }
                // return Double.compare(o1.getSalary(), o2.getSalary()); // 薪水升序
                return Double.compare(o2.getSalary(), o1.getSalary()); // 薪水降序
            }
        }); // 排序，不重复，无索引

        // 简化形式
        // Set<C_Teacher> teachers = new TreeSet<>((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary())); // 排序，不重复，无索引

        teachers.add(new C_Teacher("老陈", 20, 6232.4));
        teachers.add(new C_Teacher("dili", 18, 3999.5));
        teachers.add(new C_Teacher("老王", 22, 9999.9));
        teachers.add(new C_Teacher("老李", 20, 1999.5));
        System.out.println(teachers);

        // 结论：TreeSet集合默认不能给自定义对象排序，因为不知道大小规则。
        // 一定要解决怎么办？两种方案。
        // 1、对象类实现一个 Comparable 比较接口，重写 compareTo 方法，指定大小比较规则
        // 2、public TreeSet (Comparator c) 集合自带比较器 Comparator 对象，指定比较规则
    }
}
