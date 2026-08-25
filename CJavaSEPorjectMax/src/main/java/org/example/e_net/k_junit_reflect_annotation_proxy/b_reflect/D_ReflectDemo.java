package org.example.e_net.k_junit_reflect_annotation_proxy.b_reflect;

public class D_ReflectDemo {
    public static void main(String[] args) throws Exception {
        // 目标：搞清楚反射的应用，做框架的通用技术。
        Dog d = new Dog("米奇", 3);
        SaveObjectFrameWork.saveObject(d);

        // 创建学生对象
        Student s = new Student("张三", 18, "123456789");
        SaveObjectFrameWork.saveObject(s);

        // 创建老师对象
        Teacher t = new Teacher("李老师", 19, "java、前端", 8000.0, "高三(1)班", '女', "13800138000");
        SaveObjectFrameWork.saveObject(t);
    }
}
