package org.example.c_file_io.h_filewriter;

import java.io.FileWriter;
import java.io.Writer;

public class A_FileWriterDemo {
    public static void main(String[] args) {
        // 目标：搞清楚文件字符输入流的使用：写字符出去的流。
        try (
                // 1、创建一个字符输出流对象，指定写出的目的地。、
                // Writer fw = new FileWriter("CJavaSEPorjectMax/src/main/resources/liushuo07-out.txt"); // 覆盖管道
                Writer fw = new FileWriter("CJavaSEPorjectMax/src/main/resources/liushuo07-out.txt", true); // 追加数据
        ) {
            // 2、写一个字符出去：public void write(int c)
            fw.write('a');
            fw.write(98);
            fw.write('铄');
            fw.write("\r\n"); // 换行

            // 3、写一个字符串出去：public void write(String str)
            fw.write("java");
            fw.write("我爱 Java，虽然 Java 不是最好的编程语言之一，但是可以赚钱");
            fw.write("\r\n"); // 换行

            // 4、写一个字符数组出去：public void write(char cbuf[])
            char[] chars = "java".toCharArray();
            fw.write(chars);
            fw.write("\r\n"); // 换行

            // 5、写字符数组的一部分出去：public abstract void write(char cbuf[], int off, int len)
            fw.write(chars, 1, 2);
            fw.write("\r\n"); // 换行

            // 6、写字符串的一部分出去：public void write(String str, int off, int len)
            fw.write("java", 1, 2);
            fw.write("\r\n"); // 换行

            // fw.flush(); // 刷新缓冲区，将缓冲区中的数据全部写出去。
            // 刷新后，流可以继续使用。
            // fw.close(); // 关闭资源，关闭包含了刷新！关闭后流不能继续使用！

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
