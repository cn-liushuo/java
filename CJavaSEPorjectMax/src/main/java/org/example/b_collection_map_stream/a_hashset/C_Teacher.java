package org.example.b_collection_map_stream.a_hashset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 1、对象类实现一个 Comparable 比较接口，重写 compareTo 方法，指定大小比较规则
@Data
@NoArgsConstructor
@AllArgsConstructor
public class C_Teacher implements Comparable<C_Teacher> {
    private String name;
    private int age;
    private double salary;

    @Override
    public String toString() {
        return "C_Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}' + "\n";
    }

    // t2.compareTo(t1)
    // t2 == this 比较者
    // t1 == o 被比较者
    // 规定1：如果你认为左边大于右边 请返回正整数
    // 规定2：如果你认为左边小于右边 请返回负整数
    // 规定3：如果你认为左边等于右边 请返回0
    // 默认就会升序。
    @Override
    public int compareTo(C_Teacher o) {
        // 按照年龄升序
        // if (this.getAge() > o.getAge()) return 1;
        // if (this.getAge() < o.getAge()) return -1;
        // return 0;
        return this.getAge() - o.getAge(); // 升序
        // return o.getAge() - this.getAge(); // 降序
    }
}
