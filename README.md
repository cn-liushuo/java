# Java

Java 学习与实战练习仓库。关键词：Java SE、算法、前端 Web、Vue、后续可衔接 SpringBoot / 微服务等。

当前已落地四个相互独立的模块（Java 侧统一 **JDK 1.8**）：

| 顺序 | 模块 | 类型 | 一句话说明 |
|------|------|------|------------|
| 1 | **BJavaSEBasic** | Maven | Java SE 语法、面向对象、Swing 小项目 |
| 2 | **CJavaSEPorjectMax** | Maven | 集合 / IO / 多线程 / 网络 / 反射与代理 |
| 3 | **ALeetCode** | Maven | LeetCode 算法题解 |
| 4 | **DJavaWeb** | Maven + 前端静态页 + Vue CLI | HTML / CSS / JS / Ajax / Vue 入门与实战 |

> 建议按上表顺序学习：先 SE，再进阶与网络，再刷题巩固，最后补前端，为后续 SpringBoot 前后端分离做准备。

---

#### 软件架构

| 模块 | 主要内容 |
|------|----------|
| ALeetCode | 两数之和；二进制字符串连续 `1` 字段判断等 |
| BJavaSEBasic | 变量、运算符、流程控制、数组、OOP（封装 / 继承 / 多态 / 接口 / 内部类 / Lambda）、GUI；员工管理系统、石头迷宫 |
| CJavaSEPorjectMax | 异常、泛型、集合、Map、Stream、文件 IO（commons-io）、多线程、UDP/TCP、局域网即时通讯；JUnit、反射、注解、动态代理 |
| DJavaWeb | HTML/CSS、JS（BOM/DOM/事件）、Vue 指令与生命周期、Ajax（原生 / Axios）；`vue-project`（Vue 2 + Element UI + Vue Router，Tlias 部门 `/dept`、员工 `/emp`） |

---

#### 目录结构

```text
java/
├── ALeetCode/                 # 算法题解
├── BJavaSEBasic/              # Java SE 基础 + 员工系统 / 石头迷宫
├── CJavaSEPorjectMax/         # Java SE 进阶（集合 / IO / 线程 / 网络 / 反射等）
├── DJavaWeb/                  # 前端 Web（黑马 JavaWeb 课程前端阶段）
│   └── src/main/
│       ├── HTML/              # HTML / CSS 示例
│       ├── JS/                # JavaScript + Vue 指令示例
│       ├── Ajax/              # Ajax 原生与 Axios
│       └── vue-project/       # Vue CLI 实战（Tlias 管理页）
└── README.md
```

---

#### 环境要求

1. **JDK 8**：建议 [Eclipse Temurin 8](https://adoptium.net/zh-CN/temurin/releases?version=8&os=any&arch=any)，配置 `JAVA_HOME`
2. **Maven 3.6.1+**：建议 [Apache Maven](https://maven.apache.org/)，配置 `MAVEN_HOME` 与 PATH
3. **IDE**：IntelliJ IDEA / Eclipse；使用 Lombok 的模块需开启注解处理
4. **Node.js LTS**（仅 `DJavaWeb/vue-project`）：建议 [Node.js](https://nodejs.org/)，含 npm

主要依赖：

- BJavaSEBasic / CJavaSEPorjectMax：Lombok `1.18.46`（provided）
- CJavaSEPorjectMax：commons-io `2.11.0`、JUnit `4.13.2`
- vue-project：Vue `2.6`、Vue Router `3`、Element UI `2`、Axios

---

#### 安装与运行

**Java 模块**

1. IDE 打开仓库根目录，等待各 Maven 工程依赖下载完成  
2. 进入模块目录执行：`mvn compile`  
3. 运行对应类的 `main` 方法（见下方「使用说明」）

**前端 vue-project**

```bash
cd DJavaWeb/src/main/vue-project
npm install
npm run serve
```

静态 HTML / JS / Ajax 示例：用浏览器直接打开对应 `.html` 即可。

---

#### 使用说明

**ALeetCode**

- `org.example.a_questionbank.A_One`：两数之和  
- `org.example.b_twentysix.A_MarSix`：二进制字符串连续 `1` 字段判断  

**BJavaSEBasic**

- 按包浏览运行基础示例  
- 员工管理系统：`org.example.i_employee_sys.App`  
- 石头迷宫：`org.example.j_stone_maze.App`（方向键移动，挑战最少步数）  

**CJavaSEPorjectMax**

- 按包浏览：集合、文件 IO、多线程、网络、JUnit / 反射 / 注解 / 代理  
- 局域网即时通讯（端口 `6666`）：  
  1. 先启服务端：`org.example.e_net.j_chat_server.com.example.Server`  
  2. 再启客户端：`org.example.e_net.i_chat.com.example.App`（昵称登录、在线人数、群聊）  

**DJavaWeb**

| 路径 | 用法 |
|------|------|
| `src/main/HTML` | 浏览器打开 HTML/CSS 示例 |
| `src/main/JS` | 01–16 JS 基础；17–23 Vue 指令与生命周期 |
| `src/main/Ajax` | 原生 Ajax / Axios / 案例 |
| `src/main/vue-project` | `npm run serve`；默认 `/dept`，另有 `/emp` |

---

#### 模块学习路径（包 / 目录对照）

**BJavaSEBasic**

| 包名 | 主题 |
|------|------|
| `a_helloword_app` | HelloWorld、快捷键、注释、字面量、变量 |
| `b_basic_app` | 方法、类型、Scanner、运算符 |
| `c_flow_control` | 分支、循环 |
| `d_array` | 数组 |
| `e_oop` ~ `h_oop` | OOP、Lambda、GUI |
| `i_employee_sys` | 员工管理系统 |
| `j_stone_maze` | 石头迷宫 |

**CJavaSEPorjectMax**

| 包名 | 主题 |
|------|------|
| `a_collection` | 异常、泛型、Collection / List |
| `b_collection_map_stream` | HashSet、Map、Stream |
| `c_file_io` | 文件与各类 IO、commons-io |
| `d_thread` | 线程、同步、Lock、线程池 |
| `e_net` | UDP/TCP、聊天室、`k_junit_reflect_annotation_proxy` |

**DJavaWeb**

| 目录 | 主题 |
|------|------|
| `HTML` | 排版案例、表格 / 表单、盒子模型 |
| `JS` | 语法 → DOM/事件 → Vue 指令 |
| `Ajax` | 原生与 Axios |
| `vue-project` | Element UI + Tlias 部门 / 员工页 |

---

#### 课程参考

| 模块 | 课程 |
|------|------|
| BJavaSEBasic、CJavaSEPorjectMax | [黑马程序员 2024 Java 基础](https://www.bilibili.com/video/BV1gb42177hm/?spm_id_from=333.788.video.desc.click) |
| DJavaWeb | [黑马程序员 JavaWeb 开发教程（Spring / MyBatis / SpringMVC / SpringBoot 全流程）](https://www.bilibili.com/video/BV1m84y1w7Tb/?spm_id_from=333.788.video.desc.click) |
