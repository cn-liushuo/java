package org.example.c_file_io.f_copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class A_CopyDemo {
    public static void main(String[] args) {
        // 目标：使用字节流完成文件的复制操作。
        // 源文件: D:\images\wechat\avatar.png
        // 目标文件: D:\images\wechat\avatar_copy.png (复制过去的时候必须带文件名的，无法自动生成文件名。)
        try {
            copyFile("D:\\images\\wechat\\avatar.png", "D:\\images\\wechat\\avatar_copy.png");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // 复制文件
    public static void copyFile(String srcPath, String destPath) throws Exception {
        // 1、创建一个文件字节输入流管道与源文件接通
        FileInputStream fis = new FileInputStream(srcPath);
        FileOutputStream fos = new FileOutputStream(destPath);
        // 2、读取一个字节数组，写入一个字节数组
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, len); // 读取多少个字节，就写入多少个字节
        }
        System.out.println("复制成功！");
    }
}
