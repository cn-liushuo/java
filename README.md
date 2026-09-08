# Java

Java 学习与实战练习仓库。关键词：Java SE、算法、前端 Web、Vue、Maven、Spring Boot。

当前已落地四个相互独立的模块（Java 侧统一 **JDK 1.8**）：

| 顺序 | 模块 | 类型 | 一句话说明 |
|------|------|------|------------|
| 1 | **BJavaSEBasic** | Maven | Java SE 语法、面向对象、Swing 小项目 |
| 2 | **CJavaSEPorjectMax** | Maven | 集合 / IO / 多线程 / 网络 / 反射与代理 |
| 3 | **ALeetCode** | Maven | LeetCode 算法题解 |
| 4 | **DJavaWeb** | Maven 聚合 + 前端静态页 + Vue CLI | HTML / CSS / JS / Ajax / Vue；Maven 入门；HTTP 原理与 Spring Boot Web（快速入门 + 请求响应参数） |

> 建议按上表顺序学习：先 SE，再进阶与网络，再刷题巩固，最后补前端与 Web 后端入门，为后续 Spring / MyBatis / 微服务做准备。

---

#### 软件架构

| 模块 | 主要内容 |
|------|----------|
| ALeetCode | 两数之和；二进制字符串连续 `1` 字段判断等 |
| BJavaSEBasic | 变量、运算符、流程控制、数组、OOP（封装 / 继承 / 多态 / 接口 / 内部类 / Lambda）、GUI；员工管理系统、石头迷宫 |
| CJavaSEPorjectMax | 异常、泛型、集合、Map、Stream、文件 IO（commons-io）、多线程、UDP/TCP、局域网即时通讯；JUnit、反射、注解、动态代理 |
| DJavaWeb | 前端：HTML/CSS、JS（BOM/DOM/事件）、Vue 指令与生命周期、Ajax（原生 / Axios）、`vue-project`（Vue 2 + Element UI + Vue Router）；后端入门：Maven 多模块、手写 HTTP Server、Spring Boot Web 快速入门与请求参数绑定 |

---

#### 目录结构

```text
java/
├── ALeetCode/                      # 算法题解
├── BJavaSEBasic/                   # Java SE 基础 + 员工系统 / 石头迷宫
├── CJavaSEPorjectMax/              # Java SE 进阶（集合 / IO / 线程 / 网络 / 反射等）
├── DJavaWeb/                       # JavaWeb（黑马课程：前端 → Maven → HTTP → Spring Boot）
│   ├── HTML/                       # HTML / CSS 示例
│   ├── JS/                         # JavaScript + Vue 指令示例
│   ├── Ajax/                       # Ajax 原生与 Axios
│   ├── vue-project/                # Vue CLI 实战（Tlias 管理页）
│   ├── maven-project01/            # Maven 入门（依赖 / 测试等）
│   ├── maven-project02/            # Maven 练习
│   ├── maven-projectA/B/C/         # Maven 多模块依赖演示
│   ├── http-server-demo/           # 基于 ServerSocket 的简易 HTTP 服务
│   ├── springboot-web-quickstart/  # Spring Boot Web 快速入门（Hello / 表单页）
│   ├── springboot-web-quickstart2/ # Spring Boot Web 脚手架练习
│   ├── springboot-web-req-resp/    # Spring Boot 请求参数接收与响应
│   └── pom.xml                     # DJavaWeb 聚合父工程
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
- springboot-web-quickstart：Spring Boot `2.6.13`（`spring-boot-starter-web`）
- springboot-web-req-resp：Spring Boot `2.7.6`（`spring-boot-starter-web`）

---

#### 安装与运行

**Java 模块（A / B / C）**

1. IDE 打开仓库根目录，等待各 Maven 工程依赖下载完成
2. 进入模块目录执行：`mvn compile`
3. 运行对应类的 `main` 方法（见下方「使用说明」）

**DJavaWeb 聚合工程**

```bash
cd DJavaWeb
mvn compile
```

**前端 vue-project**

```bash
cd DJavaWeb/vue-project
npm install
npm run serve
```

静态 HTML / JS / Ajax 示例：用浏览器直接打开对应 `.html` 即可。

**Spring Boot 快速入门**

```bash
cd DJavaWeb/springboot-web-quickstart
mvn spring-boot:run
```

启动后访问：

- `http://localhost:8080/hello` → 返回 `Hello World`
- `http://localhost:8080/01.GET-POST.html` → GET / POST 表单演示页

**Spring Boot 请求响应（参数绑定）**

```bash
cd DJavaWeb/springboot-web-req-resp
mvn spring-boot:run
```

`RequestController` 统一前缀 `/param`，示例：

| 路径 | 说明 |
|------|------|
| `/param/simpleParam` | 简单参数（`@RequestParam`） |
| `/param/simplePojo` | 简单实体封装 |
| `/param/complexPojo` | 复杂实体（含嵌套 Address） |
| `/param/arrayParam` | 数组参数 |
| `/param/listParam` | 集合参数 |
| `/param/dateParam` | 日期时间（`yyyy-MM-dd HH:mm:ss`） |
| `/param/jsonParam` | JSON 请求体（`@RequestBody`） |
| `/param/path/{id}`、`/param/path/{id}/{name}` | 路径变量（`@PathVariable`） |

**手写 HTTP Server**

运行 `DJavaWeb/http-server-demo` 中 `com.itheima.Server` 的 `main`（默认端口 `8080`），浏览器访问对应静态资源路径即可。注意：与 Spring Boot 同时启动时勿占用同一端口。

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
| `HTML/` | 浏览器打开 HTML/CSS 示例 |
| `JS/` | 01–16 JS 基础；17–23 Vue 指令与生命周期 |
| `Ajax/` | 原生 Ajax / Axios / 案例 |
| `vue-project/` | `npm run serve`；默认 `/dept`，另有 `/emp` |
| `maven-project01` ~ `maven-projectC` | Maven 依赖、测试、多模块练习 |
| `http-server-demo/` | 运行 `com.itheima.Server`，体验 HTTP 请求/响应 |
| `springboot-web-quickstart/` | 运行启动类；`HelloController` 提供 `/hello` |
| `springboot-web-quickstart2/` | Spring Boot 脚手架练习工程 |
| `springboot-web-req-resp/` | `RequestController`：各类请求参数绑定演示 |

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

| 目录 / 子模块 | 主题 |
|---------------|------|
| `HTML` | 排版案例、表格 / 表单、盒子模型 |
| `JS` | 语法 → DOM/事件 → Vue 指令 |
| `Ajax` | 原生与 Axios |
| `vue-project` | Element UI + Tlias 部门 / 员工页 |
| `maven-project*` | Maven 工程结构、依赖管理、多模块 |
| `http-server-demo` | Socket 级 HTTP 服务原理 |
| `springboot-web-quickstart` | Spring Boot Web、Controller、静态资源 |
| `springboot-web-quickstart2` | Spring Boot 脚手架练习 |
| `springboot-web-req-resp` | 简单/实体/数组/集合/日期/JSON/路径参数绑定 |

---

#### 课程参考

| 模块 | 课程 |
|------|------|
| BJavaSEBasic、CJavaSEPorjectMax | [黑马程序员 2024 Java 基础](https://www.bilibili.com/video/BV1gb42177hm/?spm_id_from=333.788.video.desc.click) |
| DJavaWeb | [黑马程序员 JavaWeb 开发教程（Spring / MyBatis / SpringMVC / SpringBoot 全流程）](https://www.bilibili.com/video/BV1m84y1w7Tb/?spm_id_from=333.788.video.desc.click) |
