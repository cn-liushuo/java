package org.example.e_net.k_junit_reflect_annotation_proxy.c_annotation;

@MyBook(name = "赵丽颖", age = 18, address = {"北京", "上海"})
// @A(value = "delete")
// @A("delete") // 特殊属性value，在使用时，如果只有一个 value 属性，value 名称可以不写
// @A(value = "delete", hobby = "打篮球")
@A("delete")
public class A_AnnotationDemo {
    @MyBook(name = "王海", age = 52, address = {"北京", "香港"})
    public static void main(@A("delete") String[] args) {
        // 目标：自定义注解。
        @A("delete")
        int a;
    }
}
