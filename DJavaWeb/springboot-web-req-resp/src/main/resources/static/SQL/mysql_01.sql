-- 数据库操作

-- 查询
-- 查询所有数据库
show databases;
-- 查询当前数据库
select database();

-- 使用
-- 使用数据库
use db01;

-- 创建
-- 直接创建数据库(如果已经有了会报错)
create database db01;
-- 判断没有后再创建数据库
create database if not exists db01;

-- 删除
-- 删除数据库
-- 直接删除数据库(如果没有这个数据库会报错)
drop database db03;
-- 判断有没有后再删除数据库
drop database if exists db03;