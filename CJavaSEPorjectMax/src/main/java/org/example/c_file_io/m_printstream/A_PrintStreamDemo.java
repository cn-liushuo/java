package org.example.c_file_io.m_printstream;

import javax.swing.*;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class A_PrintStreamDemo {
    public static void main(String[] args) {
        // 目标：打印流的使用
        try (
                // PrintStream ps = new PrintStream("CJavaSEPorjectMax/src/main/resources/ps.txt");
                PrintStream ps = new PrintStream(new FileOutputStream("CJavaSEPorjectMax/src/main/resources/ps.txt", true));
                // PrintWriter ps = new PrintWriter("CJavaSEPorjectMax/src/main/resources/ps.txt");
        ) {
            ps.println(97);
            ps.println('a');
            ps.println("鸿嘉");
            ps.println(true);
            ps.println(99.9);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
