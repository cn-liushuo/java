package org.example.b_collection_map_stream.b_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class A_MapDemo {
    public static void main(String[] args) {
        // 目标：认识 Map 集合的体系特点。
        // 1、创建 Map 集合
        // Map特点/HashMap特点：无序，不重复，无索引，键值对都可以是null，值不做要求(可以重复)
        // LinkedHashMap特点：有序，不重复，无索引，键值对都可以是null，值不做要求(可以重复)
        // TreeMap特点：按照键可排序，不重复，无索引

        // Map<String, Integer> map = new HashMap<>(); // 一行经典代码
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("嫦娥", 20);
        map.put("女儿国王", 31);
        map.put("嫦娥", 28);
        map.put("铁扇公主", 38);
        map.put("紫霞", 31);
        map.put(null, null);
        System.out.println(map); // {null=null, 嫦娥=28, 铁扇公主=38, 紫霞=31, 女儿国王=31}
    }
}
