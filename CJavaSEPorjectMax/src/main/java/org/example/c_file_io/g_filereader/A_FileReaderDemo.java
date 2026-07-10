package org.example.c_file_io.g_filereader;

import java.io.FileReader;

public class A_FileReaderDemo {
    public static void main(String[] args) {
        // 目标：掌握文件字符输入流读取字符内容到程序中来。
        // 1、创建文件字符输入流与源文件接通
        try (FileReader fr = new FileReader("CJavaSEPorjectMax/src/main/resources/liushuo06.txt")) {
            // 2、定义一个字符数组，每次读多个字符
            char[] chs = new char[1024];
            int len; // 用于记录每次读了多少个字符
            while ((len = fr.read(chs)) != -1) {
                // 3、每次读取多个字符，并把字符输入转成字符串输出
                String str = new String(chs, 0, len);
                System.out.print(str);
            }
            // 拓展：文件字符输入流每次读取多个字符，性能较好，而且读取中文
            // 是按照字符读取，不会出现乱码！这是一种读取中文很好的方案。
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
