package org.example.e_net.a_inetaddress;

import java.net.InetAddress;

public class A_InetAddressDemo {
    public static void main(String[] args) {
        // 目标：认识 InetAddress 获取本机 IP 对象和对方 IP 对象。
        try {
            // 1、获取本机 IP 对象
            InetAddress ip1 = InetAddress.getLocalHost();
            System.out.println(ip1);
            System.out.println(ip1.getHostName());
            System.out.println(ip1.getHostAddress());

            // 2、获取对方 IP 对象
            InetAddress ip2 = InetAddress.getByName("www.baidu.com");
            System.out.println(ip2);
            System.out.println(ip2.getHostName());
            System.out.println(ip2.getHostAddress());

            // 3、判断本机与对方主机是否互通
            System.out.println(ip2.isReachable(5000)); // false/true ping
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
