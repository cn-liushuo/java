package org.example.a_collection.f_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class E_CollectionTraversalDemo {
    public static void main(String[] args) {
        // 目标：掌握 Collection 的遍历方式二：增强for
        Collection<String> names = new ArrayList<>();
        names.add("张无忌");
        names.add("玄冥二老");
        names.add("宋青书");
        names.add("殷素素");

        // names.forEach(new Consumer<String>() {
        //     @Override
        //     public void accept(String s) {
        //         System.out.println(s);
        //     }
        // });

        // names.forEach(s -> System.out.println(s));

        names.forEach(System.out::println);
    }
}
