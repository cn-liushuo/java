package org.example.c_file_io.k_bufferedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B_BufferedTest {
    public static void main(String[] args) {
        // 目标：完成出师表的案例
        try (
                // 1、创建一个缓冲字符输入流对象与源文件接通。
                BufferedReader br = new BufferedReader(new FileReader("CJavaSEPorjectMax/src/main/resources/csb.txt"));
                // 6、创建一个缓冲字符输出流对象与目标文件接通。
                BufferedWriter bw = new BufferedWriter(new FileWriter("CJavaSEPorjectMax/src/main/resources/csb_sorted.txt"))
        ) {
            // 2、提前准备一个List集合存储每段内容
            List<String> data = new ArrayList<>();
            // 3、按照行读取数据，存入到 data 集合中去
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
            // 4、给集合中的每段内容，按照首字符排序
            Collections.sort(data);
            System.out.println(data);

            // 5、遍历集合，将每段内容写入到目标文件中。
            for (String s : data) {
                bw.write(s);
                bw.newLine(); // 换行
            }
            System.out.println("处理完毕！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
