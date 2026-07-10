package org.example.b_collection_map_stream.b_map;

import org.example.b_collection_map_stream.a_hashset.C_Teacher;

import java.util.Map;
import java.util.TreeMap;

public class G_MapDemo {
    public static void main(String[] args) {
        // 目标：TreeMap 结合(原理用法与 TreeSet 一样);
        Map<C_Teacher, String> map = new TreeMap<>((o1, o2) -> Double.compare(o2.getSalary(), o1.getSalary())); // 按照键排序，升序
        map.put(new C_Teacher("老陈", 20, 6232.4), "462期");
        map.put(new C_Teacher("dili", 18, 3999.5), "422期");
        map.put(new C_Teacher("老王", 22, 9999.9), "461期");
        map.put(new C_Teacher("老李", 20, 1999.5), "423期");
        System.out.println(map);
    }
}
