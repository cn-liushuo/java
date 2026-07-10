package org.example.a_collection.h_test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class A_Movie {
    private String name;
    private double score;
    private String actor;
    private double price;
}
