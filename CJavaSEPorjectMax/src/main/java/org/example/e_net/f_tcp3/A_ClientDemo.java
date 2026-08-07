package org.example.e_net.f_tcp3;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class A_ClientDemo {
    public static void main(String[] args) throws Exception {
        // 目标：实现 TCP 通信多发多收：支持多个客户端开发。
        System.out.println("========= 客户端启动了 =========");
        // 1、创建 Socket 管道对象，请求与服务端的 Socket 链接，可靠链接
        Socket socket = new Socket("127.0.0.1", 9999);

        // 2、从 socket 管道通信中得到一个字节输出流
        OutputStream os = socket.getOutputStream();

        // 3、特殊数据流。
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("========= 请说：=========");
            String msg = sc.nextLine();
            if ("exit".equals(msg)) {
                System.out.println("退出成功！");
                dos.close(); // 关闭输出流
                socket.close(); // 关闭 socket
                break;
            }
            dos.writeUTF(msg); // 发送数据
            dos.flush();
        }
    }
}
