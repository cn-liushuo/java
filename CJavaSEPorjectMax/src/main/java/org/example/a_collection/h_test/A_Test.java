package org.example.a_collection.h_test;

public class A_Test {
    public static void main(String[] args) {
        // 目标：完成电影案例
        // 1、创建电影对象，定义电影类 A_Movie
        // 2、创建一个电影操作对象，专门负责对对象电影数据进行业务处理(上架，下架，查询，封杀某个电影明星的电影) A_MovieService
        A_MovieService movieService = new A_MovieService();
        movieService.start();
    }
}
