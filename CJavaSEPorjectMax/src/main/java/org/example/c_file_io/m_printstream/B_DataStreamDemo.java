package org.example.c_file_io.m_printstream;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class B_DataStreamDemo {
    public static void main(String[] args) {
        // 目标：特殊数据流的使用
        try (
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("CJavaSEPorjectMax/src/main/resources/data.txt"))
        ) {
            dos.writeByte(34);
            dos.writeUTF("你好");
            dos.writeInt(365);
            dos.writeDouble(9.9);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
