package org.example.e_net.k_junit_reflect_annotation_proxy.c_annotation;

import java.lang.reflect.Method;

public class D_AnnotationDemo {
    // 目标：搞清楚注解的应用场景：模拟 junit 框架，有 MyTest 注解的方法执行，没有的就不执行。

    public static void main(String[] args) throws Exception {
        D_AnnotationDemo ad = new D_AnnotationDemo();
        // 1、获取类对象
        Class c = D_AnnotationDemo.class;
        // 2、获取所有方法
        Method[] methods = c.getMethods();
        // 3、遍历所有方法，判断方法上是否有 MyTest 注解，有就执行，没有就不执行。
        for (Method method : methods) {
            // 4、判断方法上是否有 MyTest 注解
            if (method.isAnnotationPresent(MyTest.class)) {
                // 获取到这个方法的注解
                MyTest myTest = method.getDeclaredAnnotation(MyTest.class);
                int count = myTest.count();
                // 5、有就执行这个 method 方法
                for (int i = 0; i < count; i++) {
                    method.invoke(ad);
                }
            }
        }
    }

    // 测试方法： public 无参 无返回值
    @MyTest
    public void test1() {
        System.out.println("test1方法执行了");
    }

    public void test2() {
        System.out.println("test2方法执行了");
    }

    @MyTest(count = 5)
    public void test3() {
        System.out.println("test3方法执行了");
    }

    @MyTest
    public void test4() {
        System.out.println("test4方法执行了");
    }
}
