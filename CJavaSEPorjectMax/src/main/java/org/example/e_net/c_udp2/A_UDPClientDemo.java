package org.example.e_net.c_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class A_UDPClientDemo {
    public static void main(String[] args) throws Exception {
        // 目标：完成 UDP 通信多发多收：客户端开发。
        System.out.println("========= 客户端启动了 =========");
        // 1、创建发送端对象（代表抛韭菜的人）
        DatagramSocket socket = new DatagramSocket();

        Scanner sc = new Scanner(System.in);
        while (true) {
            // 2、创建数据包对象封装要发送的数据。(韭菜盘子)
            System.out.println("请输入：");
            String msg = sc.nextLine();

            // 如果用户输入的是 exit ，则退出
            if ("exit".equals(msg)) {
                System.out.println("========= 客户端退出 =========");
                socket.close();
                break;
            }

            byte[] bytes = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLoopbackAddress(), 8080);

            // 3、让发送端对象发送数据包的数据
            socket.send(packet);
        }
    }
}
