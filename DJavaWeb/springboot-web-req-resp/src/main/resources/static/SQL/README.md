# MySQL 基础练习（DDL / DML）

黑马 JavaWeb 课程配套：MySQL 数据库、表结构（DDL）与数据插入（DML）练习脚本，放在 `springboot-web-req-resp` 静态资源下便于随课程查阅。

> 本目录为 **手写练习用 SQL**，不是 Spring Boot 运行时依赖。请在本地 MySQL 客户端（如命令行、Navicat、DataGrip）中执行。

---

## 目录文件

| 文件 | 内容 |
|------|------|
| `mysql_01.sql` | 数据库操作：查询 / 使用 / 创建 / 删除 |
| `mysql_02.sql` | 表 DDL（建表与约束、查看、修改、删除）+ DML `INSERT`（单行 / 全字段 / 批量）；含 `tb_emp` 员工表示例 |
| `MySQL数据类型.xlsx` | MySQL 常用数据类型对照参考 |
| `README.md` | 本说明 |

---

## 环境要求

1. **MySQL 8.x**（课程常用；5.7 亦可，注意部分语法差异）
2. 建议安装并配置 `mysql` 命令行到 PATH，或使用图形化客户端

连接示例（按本机账号修改）：

```bash
mysql -u root -p
```

---

## 使用说明

建议按文件序号练习：

1. 打开 `mysql_01.sql`，在客户端中分段执行：`SHOW` / `USE` / `CREATE DATABASE` / `DROP DATABASE`
2. 先 `USE` 到目标库，再打开 `mysql_02.sql`：
   - 先练习建表、约束、`ALTER`、`DROP`，理解 `tb_emp` 字段含义
   - 确保已执行完整 `CREATE TABLE tb_emp` 后，再练习文末 `INSERT`（指定字段 / 全字段 / 批量多行）
3. 需要查类型长度与取值范围时，对照 `MySQL数据类型.xlsx`

注意：

- `CREATE` / `DROP` / `INSERT` 会改动本机数据，练习库建议使用独立库名（如 `db01`），勿在生产库执行
- `mysql_02.sql` 中部分 DDL 依赖已存在的表（如早期的 `ALTER tb_emp`）；若报错，先执行完整 `CREATE TABLE tb_emp` 再建改表与插入练习
- 同一脚本内可能有多段互斥示例（如重复 `CREATE TABLE tb_user`），按注释分段执行即可
- `username` 有唯一约束，重复执行同名 `INSERT` 会失败，可改用户名或先清空练习数据

---

## 与课程模块的关系

| 阶段 | 说明 |
|------|------|
| 当前 | 纯 SQL：DDL + 基础 DML（`INSERT`），为后续 JDBC、MyBatis 做准备 |
| 后续（课程） | 在 Spring Boot 中接入数据源与持久层，替换当前 `emp.xml` 等内存/文件方案 |

仓库总览与模块顺序见仓库根目录 [`README.md`](../../../../../../../../README.md)。
