package org.example.c_file_io.c_charset;

import java.util.Arrays;

public class A_Charset {
    public static void main(String[] args) throws Exception {
        // 目标：写程序实现字符编码和解码
        // 1、编码
        String name = "我爱你中国abc666";

        // byte[] bytes = name.getBytes(); // 平台的 UTF-8 编码的。
        byte[] bytes = name.getBytes("GBK"); // 指定 GBK 进行编码。
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        // 2、解码
        // String name2 = new String(bytes); // 平台的 UTF-8 解码的
        String name2 = new String(bytes, "GBK"); // 指定 GBK 进行解码。
        System.out.println(name2);
    }
}
