package org.example.c_file_io.l_inputStreamReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class A_Demo {
    public static void main(String[] args) {
        // 目标：展示一个问题，不同编码读取乱码的问题
        // 代码 UTF-8     文件 UTF-8 读取不乱码
        // 代码 UTF-8     文件 GBK 读取乱码

        try (
                // 1、创建文件字符输入流与源文件接通
                Reader fr = new FileReader("CJavaSEPorjectMax/src/main/resources/liushuo08.txt");
                // 2、创建缓冲字符输入流包装低级的字符输入流
                BufferedReader br = new BufferedReader(fr);
        ) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
