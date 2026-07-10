package org.example.c_file_io.e_fileoutputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class A_FileOutputStream {
    public static void main(String[] args) throws Exception {
        // 目标：学会使用文件字节输出流
        // 1、创建文件字节输出流管道与目标文件接通
        // OutputStream os = new FileOutputStream("b-java-se-project-max/day03-file-io/src/main/resources/liushuo05-out.txt"); // 覆盖管道
        OutputStream os = new FileOutputStream("b-java-se-project-max/day03-file-io/src/main/resources/liushuo05-out.txt", true); // 追加数据

        // 2、写入数据
        // public void write(int b)
        os.write(97); // 写入一个字节数据
        os.write('b'); // 写入一个字节数据
        // os.write('徐'); // 写入一个字节数据 会乱码
        os.write("\r\n".getBytes()); // 换行

        // 3、写一个字节数组出去
        // public void write(byte[] b)
        byte[] bytes = "我爱你中国666".getBytes();
        os.write(bytes);
        os.write("\r\n".getBytes()); // 换行

        // 4、写一个字节数组的一部分出去
        // public void write(byte[] b, int off, int len)
        os.write(bytes, 0, 3);
        os.write("\r\n".getBytes()); // 换行

        os.close(); // 关闭管道 释放资源
    }
}
