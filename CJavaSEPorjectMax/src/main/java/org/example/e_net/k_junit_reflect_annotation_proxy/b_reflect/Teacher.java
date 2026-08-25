package org.example.e_net.k_junit_reflect_annotation_proxy.b_reflect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private String name;
    private int age;
    private String hobby;
    private double salary;
    private String className;
    private char sex;
    private String phone;
}
