package org.example.e_net.d_tcp1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class A_ClientDemo {
    public static void main(String[] args) throws Exception {
        // 目标：实现 TCP 通信一发一收：客户端开发。
        System.out.println("========= 客户端启动了 =========");
        // 1、创建 Socket 管道对象，请求与服务端的 Socket 链接，可靠链接
        Socket socket = new Socket("127.0.0.1", 9999);

        // 2、从 socket 管道通信中得到一个字节输出流
        OutputStream os = socket.getOutputStream();

        // 3、特殊数据流。
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeInt(1);
        dos.writeUTF("你在哪儿？");

        // 4、释放资源
        socket.close();
    }
}
