package org.example.b_collection_map_stream.a_hashset;

import java.util.HashSet;
import java.util.Set;

public class B_SetDemo {
    public static void main(String[] args) {
        // 目标：掌握 HashSet 集合去重操作
        B_Student s1 = new B_Student("张三", 18, "北京", "123456");
        B_Student s2 = new B_Student("李四", 19, "上海", "989876");
        B_Student s3 = new B_Student("张三", 18, "北京", "123456");
        B_Student s4 = new B_Student("李四", 19, "上海", "989876");

        Set<B_Student> set = new HashSet<>(); // 不重复的！
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(set);
    }
}
