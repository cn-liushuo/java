# 《综合项目实战-局域网内的沟通软件》

## 需求：

展示一个用户的登录界面，这个界面只要求用户输入自己聊天的昵称就可以了。

登录进入后，展示一个群聊的窗口，这个窗口要展示在线人数，展示消息展示框，消息输入框，发送按钮，可以实现群聊。实现实时展示在线人数。完全做到即时通讯功能。

## 技术选型

1、GUI 编程技术：Swing

2、网络编程

3、面向对象设计

4、常用 API

## 思路分析

### 1、创建一个模块，代表我们的项目：chat-system

### 2、拿到系统需要的界面：Swing 代码。

- 登录界面：这个界面只要求用户输入自己聊天的昵称就可以了。

```java
package org.example.e_net.i_chat.com.example.ui;

import javax.swing.*;
import java.awt.*;

public class ChatEntryFrame extends JFrame {
    private JTextField nicknameField;
    private JButton enterButton;
    private JButton cancelButton;

    public ChatEntryFrame() {
        setTitle("局域网聊天室");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false); // 禁止调整大小

        // 设置背景颜色
        getContentPane().setBackground(Color.decode("#F0F0F0"));

        // 创建主面板并设置布局
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.decode("#F0F0F0"));
        add(mainPanel);

        // 创建顶部面板
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        topPanel.setBackground(Color.decode("#F0F0F0"));

        // 标签和文本框
        JLabel nicknameLabel = new JLabel("昵称：");
        nicknameLabel.setFont(new Font("楷体", Font.BOLD, 16));
        nicknameField = new JTextField(10);
        nicknameField.setFont(new Font("楷体", Font.PLAIN, 16));
        nicknameField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));

        topPanel.add(nicknameLabel);
        topPanel.add(nicknameField);
        mainPanel.add(topPanel, BorderLayout.NORTH);

        // 按钮面板
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.setBackground(Color.decode("#F0F0F0"));

        enterButton = new JButton("进入");
        enterButton.setFont(new Font("楷体", Font.BOLD, 16));
        enterButton.setBackground(Color.decode("#007BFF"));
        enterButton.setForeground(Color.WHITE);
        enterButton.setBorderPainted(false);
        enterButton.setFocusPainted(false);

        cancelButton = new JButton("取消");
        cancelButton.setFont(new Font("楷体", Font.BOLD, 16));
        cancelButton.setBackground(Color.decode("#DC3545"));
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setBorderPainted(false);
        cancelButton.setFocusPainted(false);

        buttonPanel.add(enterButton);
        buttonPanel.add(cancelButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // 添加监听器
        enterButton.addActionListener(e -> {
            String nickname = nicknameField.getText();
            if (!nickname.isEmpty()) {
                // 进入聊天空逻辑
                dispose(); // 关闭窗口
            } else {
                JOptionPane.showMessageDialog(this, "请输入昵称！");
            }
        });

        cancelButton.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    public static void main(String[] args) {
        new ChatEntryFrame();
    }
}
```

- 获取系统需要的聊天界面

```java
package org.example.e_net.i_chat.com.example.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientChatFrame extends JFrame {
    public JTextArea smsContent = new JTextArea(23, 50);
    private JTextArea smsSend = new JTextArea(4, 40);
    public JList<String> onLineUsers = new JList<>();
    private JButton sendBn = new JButton("发送");

    public ClientChatFrame() {
        initView();
        this.setVisible(true);
    }

    private void initView() {
        this.setSize(700, 600);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭窗口，退出程序
        this.setLocationRelativeTo(null); // 窗口居中

        // 设置窗口背景色
        this.getContentPane().setBackground(new Color(0xf0, 0xf0, 0xf0));

        // 设置字体
        Font font = new Font("Simkai", Font.PLAIN, 14);

        // 消息内容框
        smsContent.setFont(font);
        smsContent.setBackground(new Color(0xf0, 0xf0, 0xf0));
        smsContent.setEnabled(false);

        // 发送消息框
        smsSend.setFont(font);
        smsSend.setWrapStyleWord(true);
        smsSend.setLineWrap(true);

        // 在线用户列表
        onLineUsers.setFont(font);
        onLineUsers.setFixedCellWidth(120);
        onLineUsers.setVisibleRowCount(13);

        // 创建底部面板
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBackground(new Color(0xf0, 0xf0, 0xf0));

        // 消息输入框
        JScrollPane smsSendScrollPane = new JScrollPane(smsSend);
        smsSendScrollPane.setBorder(BorderFactory.createEmptyBorder());
        smsSendScrollPane.setPreferredSize(new Dimension(500, 50));

        // 发送按钮
        sendBn.setFont(font);
        sendBn.setBackground(Color.decode("#009688"));
        sendBn.setForeground(Color.WHITE);

        // 按钮面板
        JPanel btns = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        btns.setBackground(new Color(0xf0, 0xf0, 0xf0));
        btns.add(sendBn);

        // 添加组件
        bottomPanel.add(smsSendScrollPane, BorderLayout.CENTER);
        bottomPanel.add(btns, BorderLayout.EAST);

        // 用户列表面板
        JScrollPane userListScrollPane = new JScrollPane(onLineUsers);
        userListScrollPane.setBorder(BorderFactory.createEmptyBorder());
        userListScrollPane.setPreferredSize(new Dimension(120, 500));

        // 中心消息面板
        JScrollPane smsContentScrollPane = new JScrollPane(smsContent);
        smsContentScrollPane.setBorder(BorderFactory.createEmptyBorder());

        // 添加所有组件
        this.add(smsContentScrollPane, BorderLayout.CENTER);
        this.add(bottomPanel, BorderLayout.SOUTH);
        this.add(userListScrollPane, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        new ClientChatFrame();
    }
}
```

### 3、定义一个 App 启动类：创建进入界面对象并展示

### 4、分析系统的整体架构

![chat.png](../../../../../resources/images/chat.png)

1、开发服务端要做的事情大概有这些：

- 接收客户端的管道链接。
- 接收登录消息，接收昵称信息。
- 服务端也可能是接收客户端发送过来的群聊消息。
- 服务端存储全部在线的socket管道，以便到时候知道哪些客户端在线，以便为这些客户端转发消息。
- 如果服务端收到了登录消息，接收昵称，然后更新所有客户端的在线人数列表。
- 如果服务端收到了群聊消息，需要接收这个人的消息，再转发给所有客户端展示这个消息。

2、客户端界面已经准备好了。

### 5、先开发完整的服务端。

- 第一步：创建一个服务端的项目：chat-server
- 第二步：创建一个服务端启动类，启动服务器等待客户端的连接

```java
public class Server {
  public static void main(String[] args) {
    System.out.println("========= 启动服务端系统 =========");
    try {
      // 1、注册端口
      ServerSocket serverSocket = new ServerSocket(Constant.PORT);
      // 2、主线程负责接收客户端的连接请求
      while (true) {
        // 调用 accept 方法，获取客户端的 Socket 对象
        System.out.println("========= 等待客户端的连接…… =========");
        Socket socket = serverSocket.accept();
        System.out.println("========= 一个客户端连接成功…… =========");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
```

- 第三步：把这个管道交给一个独立的线程来处理，以便支持很多客户端可以同时进来通信。

```java
public class Server {
  public static void main(String[] args) {
    System.out.println("========= 启动服务端系统 =========");
    try {
      // 1、注册端口
      ServerSocket serverSocket = new ServerSocket(Constant.PORT);
      // 2、主线程负责接收客户端的连接请求
      while (true) {
        // 调用 accept 方法，获取客户端的 Socket 对象
        System.out.println("========= 等待客户端的连接…… =========");

        Socket socket = serverSocket.accept();
        new ServerReaderThread(socket).start();

        System.out.println("========= 一个客户端连接成功…… =========");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
```

- 第四步：定义一个集合容器存储所有登录进来的客户端管道，以便将来群发消息给他们。
  - 这个集合只需要一个记住所有的在线的客户端socket

```java
// 定义一个 Map 集合，键是客户端的管道，值是这个管道的用户名称。
public static final Map<Socket, String> onLineSockets = new HashMap<>();
```

### 6、服务端接收登录消息/群聊消息