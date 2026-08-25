package org.example.e_net.k_junit_reflect_annotation_proxy.b_reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class C_ReflectDemo {
    public static void main(String[] args) throws Exception {
        // 目标：反射的基本作用。
        // 1、类的全部成份的获取
        // 2、可以破坏封装性
        // 3、可以绕过泛型的约束
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("令狐冲");
        list.add("东方不败");
        // list.add(9.9);
        // list.add(true);

        Class c1 = list.getClass(); // c1 == ArrayList.class
        // 获取 ArrayList 类的 add 方法
        Method add = c1.getDeclaredMethod("add", Object.class);
        // 触发 list 集合对象的 add 方法执行
        add.invoke(list, 9.9); // 翻墙
        add.invoke(list, true); // 翻墙

        System.out.println(list);
    }
}
