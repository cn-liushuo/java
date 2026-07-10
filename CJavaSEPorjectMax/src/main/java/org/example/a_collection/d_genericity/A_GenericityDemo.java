package org.example.a_collection.d_genericity;

import com.example.c_genericity.Student;

public class A_GenericityDemo {
    public static void main(String[] args) {
        // 目标：学会定义泛型方法，搞清楚作用。
        // 需求：打印任意数组的内容。
        String[] names = {"赵敏", "周芷若", "小昭", "张无忌"};
        printArray(names);

        Student[] stus = new Student[3];
        printArray(stus);

        Student max = getMax(stus);
        String max2 = getMax(names);
    }

    public static <T> void printArray(T[] names) {

    }

    public static <T> T getMax(T[] names) {
        return null;
    }
}
