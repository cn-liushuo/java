package org.example.e_net.k_junit_reflect_annotation_proxy.d_proxy;

public class Test {
    public static void main(String[] args) {
        // 目标：创建代理对象。
        // 1、准备一个明星对象：设计明星类。
        Star star = new Star("章若楠");
        // 2、为章若楠创建一个专属于她的代理对象。
        StarService proxy = ProxyUtil.createProxy(star);
        proxy.sing("《红昭愿》");
        System.out.println(proxy.dance());
    }
}
