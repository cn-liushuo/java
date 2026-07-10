package org.example.c_file_io.d_fileinputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class C_FileInputStream {
    public static void main(String[] args) throws Exception {
        // 目标：掌握文件字节输入流读取文件中的字节数据到内存中来。
        // 1、创建文件字节输入流管道与文件接通
        // InputStream is = new FileInputStream(new File("b-java-se-project-max/day03-file-io/src/main/resources/liushuo02.txt"));
        InputStream is = new FileInputStream("b-java-se-project-max/day03-file-io/src/main/resources/liushuo04.txt"); // 简化写法

        // 2、一次性读完文件的全部字节: 可以避免读取汉字输出
        byte[] bytes = is.readAllBytes();

        String rs = new String(bytes);

        System.out.print(rs);

        is.close();
    }
}
