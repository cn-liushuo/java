package org.example.e_net.k_junit_reflect_annotation_proxy.b_reflect;

public class A_ReflectDemo {
    public static void main(String[] args) throws Exception {
        // 目标：掌握反射第一步操作：获取类的 Class 对象。（获取类本身）
        // 1、获取类本身：类.class
        Class c1 = Student.class;
        System.out.println(c1);

        // 2、获取类本身：Class.forName("类的全类名")
        Class c2 = Class.forName("org.example.e_net.k_junit_reflect_annotation_proxy.b_reflect.Student");
        System.out.println(c2);

        // 3、获取类本身，对象.getClass()
        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3);

        System.out.println(c1 == c2); // true
        System.out.println(c2 == c3); // true
    }
}
