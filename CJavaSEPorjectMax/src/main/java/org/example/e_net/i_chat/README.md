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

### 4、从进入界面开始开发。