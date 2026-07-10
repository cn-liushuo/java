package org.example.b_collection_map_stream.d_test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String size;
    private String color;
    private int num; // 大小  面向对象设计

    @Override
    public String toString() {
        return size + color;
    }
}
