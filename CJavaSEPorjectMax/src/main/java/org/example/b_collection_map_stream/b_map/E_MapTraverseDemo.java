package org.example.b_collection_map_stream.b_map;

import java.util.HashMap;
import java.util.Map;

public class E_MapTraverseDemo {
    public static void main(String[] args) {
        // 目标：掌握 Map 集合的遍历方式三：Lambda。
        Map<String, Integer> map = new HashMap<>();
        map.put("嫦娥", 20);
        map.put("女儿国王", 31);
        map.put("嫦娥", 28);
        map.put("铁扇公主", 38);
        map.put("紫霞", 31);
        System.out.println(map); // {嫦娥=28, 铁扇公主=38, 紫霞=31, 女儿国王=31}

        // 1、直接调用 Map 集合的 forEach 方法完成遍历
        // map.forEach(new BiConsumer<String, Integer>() {
        //     @Override
        //     public void accept(String key, Integer value) {
        //         System.out.println(key + '=' + value);
        //     }
        // });

        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}
