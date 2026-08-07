package org.example.e_net.d_tcp1;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class B_ServeDemo {
    public static void main(String[] args) throws Exception {
        // 目标：实现 TCP 通信一发一收：服务端开发。
        System.out.println("========= 服务端启动了 =========");
        // 1、创建一个服务端 ServerSocket 对象，绑定端口号，监听客户端连接
        ServerSocket ss = new ServerSocket(9999);
        // 2、调用 accept 方法，阻塞等待客户端连接，一旦有客户连接会返回一个 Socket 对象
        Socket socket = ss.accept();
        // 3、获取输入流，读取客户端发送的数据
        InputStream is = socket.getInputStream();
        // 4、把字节输入流包装成特殊数据输入流
        DataInputStream dis = new DataInputStream(is);
        // 5、读取数据
        int id = dis.readInt();
        String msg = dis.readUTF();
        System.out.println("id=" + id + "收到的客户端msg=" + msg);
        // 6、客户端的 ip 和端口(谁给我发的)
        System.out.println("客户端的ip=" + socket.getInetAddress().getHostAddress());
        System.out.println("客户端的端口=" + socket.getPort());
    }
}
