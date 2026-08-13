package org.example.e_net.k_junit_reflect_annotation_proxy.b_reflect;

public class Dog {
    private String name;
    private int age;
    private String hobby;

    private Dog() {
        System.out.println("无参数构造器执行了~~");
    }

    private Dog(String name) {
        this.name = name;
        System.out.println("有1个参数构造器执行了~~");
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有2个参数构造器执行了~~");
    }

    private void eat() {
        System.out.println("狗吃骨头！");
    }

    public String eat(String name) {
        System.out.println("狗吃" + name);
        return "狗说，汪汪汪！";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
