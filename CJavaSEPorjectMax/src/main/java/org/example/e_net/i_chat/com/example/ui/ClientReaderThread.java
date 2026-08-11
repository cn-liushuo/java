package org.example.e_net.i_chat.com.example.ui;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ClientReaderThread extends Thread {
    private Socket socket;
    private DataInputStream dis;
    private ClientChatFrame win;

    public ClientReaderThread(Socket socket, ClientChatFrame win) {
        this.win = win;
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 接收的消息可以有很多种类型：1、在线人数更新的数据 2、群聊消息
            // 所以客户端必须声明协议发送消息
            // 比如客户端先发1，代表接下来是登录消息。
            // 比如客户端先发2，代表接下来是群聊消息。
            // 先从 socket 管道中接收客户端发送来的消息类型编号
            dis = new DataInputStream(socket.getInputStream());
            while (true) {
                int type = dis.readInt(); // 1、2、3
                switch (type) {
                    case 1:
                        // 服务端发来的在线人数更新消息
                        updateClientOnLineList();
                        break;
                    case 2:
                        // 服务端发送来的群聊消息
                        getMsgToWin();
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getMsgToWin() throws Exception {
        // 获取群聊消息
        String msg = dis.readUTF();
        win.setMsgToWin(msg);
    }

    // 更新客户端的在线用户列表
    private void updateClientOnLineList() throws Exception {
        // 1、读取有多少个在线用户
        int count = dis.readInt();

        String[] names = new String[count];
        // 2、循环控制读取多少个用户信息。
        for (int i = 0; i < count; i++) {
            // 3、读取每个用户的信息
            String nickname = dis.readUTF();
            // 4、将每个用户的信息添加到集合中。
            names[i] = nickname;
        }

        // 5、将集合中的数据展示到窗口上
        win.updateOnLineUsers(names);
    }

}
