package org.example.e_net.k_junit_reflect_annotation_proxy.c_annotation;

public @interface A {
    String value(); // 特殊属性value，在使用时，如果只有一个 value 属性，value 名称可以不写

    String hobby() default "打篮球";
}
