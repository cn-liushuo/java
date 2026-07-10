package org.example.c_file_io.b_recursion;

public class A_RecursionDemo {
    public static void main(String[] args) {
        // 目标：认识递归的形式。
        printA();
    }

    public static void printA() {
        System.out.println("=====A执行了====");
        printA(); // 直接递归，自己调自己 , 递归可能出现死循环，导致出现栈内存溢出现象
    }
}
