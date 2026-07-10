package org.example.c_file_io.d_fileinputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class B_FileInputStream {
    public static void main(String[] args) throws Exception {
        // 目标：掌握文件字节输入流读取文件中的字节数据到内存中来。
        // 1、创建文件字节输入流管道与文件接通
        // InputStream is = new FileInputStream(new File("b-java-se-project-max/day03-file-io/src/main/resources/liushuo02.txt"));
        InputStream is = new FileInputStream("b-java-se-project-max/day03-file-io/src/main/resources/liushuo03.txt"); // 简化写法

        // 2、开始读取文件中的字节并输出。 每次读取多个字节
        // 定义一个字节数组用于每次读取字节
        byte[] buffer = new byte[3];
        // 定义一个变量记住每次读取了多少个字节。
        int len;
        while ((len = is.read(buffer)) != -1) {
            // 3、把字节数组转成字符串输出，读取多少倒出多少
            String str = new String(buffer, 0, len);
            System.out.print(str);
        }

        is.close();
        // 拓展：每次读取多个字节，性能得到提升，因为每次读取多个字节，可以减少硬盘交互次数，从而提升性能。
        // 依然无法避免读取汉字输出乱码的问题，存在截断汉字字节的可能性！
    }
}
