# Java

#### 介绍
Java SE···SpringBoot、Vue、ruoyi、微服务、MySQL、JVM、数据结构与算法、SSM、Spring高级、springcloud、Docker、Git、Maven、Dubbo、Zookeeper、Redis、MongoDB、RabbitMQ、RocketMQ

Java 学习与实战练习仓库，围绕 Java SE 分模块整理，包含算法题解、基础语法、进阶实战与综合项目：

- **ALeetCode**：LeetCode 算法题解（Maven 工程）
- **BJavaSEBasic**：Java SE 基础学习代码（Maven 工程）
- **CJavaSEPorjectMax**：Java SE 进阶实战与综合项目（Maven 工程）

#### 软件架构
仓库由三个相互独立的 Maven 模块组成，均基于 JDK 1.8 编译（pom.xml 中 source/target 配置为 1.8）：

| 模块 | 模块说明 | 主要内容 |
|------|---------|---------|
| ALeetCode | LeetCode 算法题解 | 两数之和、二进制字符串连续 1 字段判断等题解 |
| BJavaSEBasic | Java SE 基础学习 | 变量、运算符、流程控制、数组、面向对象（封装、继承、多态、接口、内部类、Lambda）、GUI（Swing）；员工管理系统、石头迷宫游戏 |
| CJavaSEPorjectMax | Java SE 进阶实战 | 异常、泛型、集合、Map、Stream、文件 IO（commons-io）、多线程（线程安全、锁、线程池）、网络编程（UDP/TCP）、局域网即时通讯 |


#### 环境要求

1. JDK：建议使用 [Eclipse Temurin JDK 8](https://adoptium.net/zh-CN/temurin/releases?version=8&os=any&arch=any)（Adoptium 提供的 OpenJDK 发行版，项目编译目标为 1.8）
2. Maven：建议使用 [Apache Maven 3.6.1](https://maven.apache.org/) 版本
3. 依赖：BJavaSEBasic 与 CJavaSEPorjectMax 使用 Lombok（provided 作用域），CJavaSEPorjectMax 额外使用 commons-io 2.11.0；在 IDE（集成开发环境）中运行需启用 Lombok 插件与注解处理（pom 已配置 maven-compiler-plugin 的 annotationProcessorPaths）


#### 安装教程

1. 安装 JDK 8 并配置 `JAVA_HOME` 环境变量
2. 安装 Maven 3.6.1 并配置 `MAVEN_HOME` 环境变量及 PATH
3. 使用 IntelliJ IDEA 或 Eclipse 打开仓库根目录，三个模块均为独立 Maven 工程，等待依赖下载完成
4. 命令行编译：进入对应模块目录执行 `mvn compile`

#### 使用说明

各模块可直接运行对应类的 `main` 方法：

- **ALeetCode 算法题解**：如 `org.example.a_questionbank.A_One`（两数之和）、`org.example.b_twentysix.A_MarSix`
- **BJavaSEBasic 基础示例**：按包浏览运行；另含两个完整小项目：
  - 员工管理系统：运行 `org.example.i_employee_sys.App`，启动登录与员工管理界面
  - 石头迷宫游戏：运行 `org.example.j_stone_maze.App`，通过方向键移动数字块，挑战历史最少步数
- **CJavaSEPorjectMax 进阶示例**：按包浏览运行（集合、文件 IO、多线程、网络编程）
- **局域网即时通讯（聊天室）**：
  1. 先启动服务端：运行 `org.example.e_net.j_chat_server.com.example.Server`（监听端口 6666）
  2. 再启动一个或多个客户端：运行 `org.example.e_net.i_chat.com.example.App`，输入昵称进入群聊，支持在线人数实时更新与消息群发
