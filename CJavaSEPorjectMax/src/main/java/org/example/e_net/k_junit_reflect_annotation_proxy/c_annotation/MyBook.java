package org.example.e_net.k_junit_reflect_annotation_proxy.c_annotation;

// 自定义注解
public @interface MyBook {
    String name();

    int age() default 18;

    String[] address();
}
