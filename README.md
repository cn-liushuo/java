# Java

Java 学习与实战练习仓库。关键词：Java SE、算法、前端 Web、Vue、Maven、Spring Boot。

当前已落地四个相互独立的模块（Java 侧统一 **JDK 1.8**）：

| 顺序 | 模块 | 类型 | 一句话说明 |
|------|------|------|------------|
| 1 | [**BJavaSEBasic**](BJavaSEBasic/README.md) | Maven | Java SE 语法、面向对象、Swing 小项目 |
| 2 | [**CJavaSEPorjectMax**](CJavaSEPorjectMax/README.md) | Maven | 集合 / IO / 多线程 / 网络 / 反射与代理 |
| 3 | [**ALeetCode**](ALeetCode/README.md) | Maven | LeetCode 算法题解 |
| 4 | [**DJavaWeb**](DJavaWeb/README.md) | Maven 聚合 + 前端静态页 + Vue CLI | HTML / CSS / JS / Ajax / Vue；Maven；HTTP 与 Spring Boot Web；MySQL 基础练习 |

> 建议按上表顺序学习：先 SE，再进阶与网络，再刷题巩固，最后补前端与 Web 后端入门，为后续 Spring / MyBatis / 微服务做准备。

各模块的包对照、接口明细、运行步骤见对应子目录 README，本页只做总览与导航。

---

## 目录结构

```text
java/
├── ALeetCode/           # 算法题解
├── BJavaSEBasic/        # Java SE 基础 + 员工系统 / 石头迷宫
├── CJavaSEPorjectMax/   # Java SE 进阶（集合 / IO / 线程 / 网络 / 反射等）
├── DJavaWeb/            # JavaWeb（前端 → Maven → HTTP → Spring Boot → SQL）
└── README.md
```

---

## 环境要求

| 环境 | 说明 |
|------|------|
| **JDK 8** | 建议 [Eclipse Temurin 8](https://adoptium.net/zh-CN/temurin/releases?version=8&os=any&arch=any)，配置 `JAVA_HOME` |
| **Maven 3.6.1+** | 建议 [Apache Maven](https://maven.apache.org/)，配置 `MAVEN_HOME` 与 PATH |
| **IDE** | IntelliJ IDEA / Eclipse；使用 Lombok 的模块需开启注解处理 |
| **Node.js LTS** | 仅 [vue-project](DJavaWeb/vue-project/README.md) 需要 |
| **MySQL 8.x** | 仅练习 [static/SQL](DJavaWeb/springboot-web-req-resp/src/main/resources/static/SQL/README.md) 时需要 |

主要依赖版本见各模块 README。

---

## 安装与运行（入口）

**Java 模块（A / B / C）**

1. IDE 打开仓库根目录，等待 Maven 依赖下载完成  
2. 进入模块目录执行：`mvn compile`  
3. 运行对应类的 `main`（详见各模块 README）

**DJavaWeb**

```bash
cd DJavaWeb
mvn compile
```

前端、Spring Boot、手写 HTTP Server、MySQL 练习等详见 [DJavaWeb/README.md](DJavaWeb/README.md)。

---

## 课程参考

| 模块 | 课程 |
|------|------|
| [BJavaSEBasic](BJavaSEBasic/README.md)、[CJavaSEPorjectMax](CJavaSEPorjectMax/README.md) | [黑马程序员 2024 Java 基础](https://www.bilibili.com/video/BV1gb42177hm/?spm_id_from=333.788.video.desc.click) |
| [DJavaWeb](DJavaWeb/README.md) | [黑马程序员 JavaWeb 开发教程（Spring / MyBatis / SpringMVC / SpringBoot 全流程）](https://www.bilibili.com/video/BV1m84y1w7Tb/?spm_id_from=333.788.video.desc.click) |
