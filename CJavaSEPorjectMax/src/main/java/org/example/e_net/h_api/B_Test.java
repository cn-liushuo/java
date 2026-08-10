package org.example.e_net.h_api;

public class B_Test {
    public static void main(String[] args) {
        // 目标：高效拼接字符串。
        // + 拼接字符串内容，如果是大量拼接，效率极差！
        // String 的对象是不可变对象：共享数据性能可以，修改数据性能差！
        // String s = "";
        // for (int i = 0; i < 1000000; i++) {
        //     s = s + "abc";
        // }
        // System.out.println(s);

        // 定义字符串可以使用 String 类型，但是操作字符串建议大家用 StringBuilder (性能好)
        StringBuilder sb = new StringBuilder(); // StringBuilder 对象是可变内容的容器：sb = "";
        for (int i = 0; i < 1000000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);
        // StringBuilder 只是拼接字符串的手段，结果还是要恢复成字符串(目的)
        String s = sb.toString();
        System.out.println(s);

        StringBuilder sb2 = new StringBuilder();
        String result = sb2.append("张三").append("李四").append("王五").toString();
        System.out.println(result);
    }
}
