package org.example.b_collection_map_stream.b_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C_MapTraverseDemo {
    public static void main(String[] args) {
        // 目标：掌握 Map 集合的遍历方式一：键找值。
        Map<String, Integer> map = new HashMap<>();
        map.put("嫦娥", 20);
        map.put("女儿国王", 31);
        map.put("嫦娥", 28);
        map.put("铁扇公主", 38);
        map.put("紫霞", 31);
        System.out.println(map); // {嫦娥=28, 铁扇公主=38, 紫霞=31, 女儿国王=31}

        // 1、提取 Map 集合的全部键到一个 Set 集合中去
        Set<String> keys = map.keySet();
        System.out.println(keys);

        // 2、遍历 Set 集合，得到每一个键
        for (String key : keys) {
            // 3、根据键去找值
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
