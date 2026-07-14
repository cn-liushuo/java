package org.example.c_file_io.k_bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class A_BufferedWriterDemo {
    public static void main(String[] args) {
        // 目标：搞清楚缓冲字符输出流的使用：提升了字符输出流的写字符的性能，多了换行功能
        try (
                // 1、创建一个字符输出流对象，指定写出的目的地。、
                // Writer fw = new FileWriter("CJavaSEPorjectMax/src/main/resources/liushuo07-out.txt"); // 覆盖管道
                Writer fw = new FileWriter("CJavaSEPorjectMax/src/main/resources/liushuo07-out.txt", true); // 追加数据

                // 2、创建一个缓冲字符输出流对象，将字符输出流对象装进去
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            // 2、写一个字符出去：public void write(int c)
            bw.write('a');
            bw.write(98);
            bw.write('铄');
            bw.newLine(); // 换行

            // 3、写一个字符串出去：public void write(String str)
            bw.write("java");
            bw.write("我爱 Java，虽然 Java 不是最好的编程语言之一，但是可以赚钱");
            bw.newLine(); // 换行

            // 4、写一个字符数组出去：public void write(char cbuf[])
            char[] chars = "java".toCharArray();
            bw.write(chars);
            bw.newLine(); // 换行

            // 5、写字符数组的一部分出去：public abstract void write(char cbuf[], int off, int len)
            bw.write(chars, 1, 2);
            bw.newLine(); // 换行

            // 6、写字符串的一部分出去：public void write(String str, int off, int len)
            bw.write("java", 1, 2);
            bw.newLine(); // 换行

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
