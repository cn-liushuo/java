package org.example.a_collection.f_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class C_CollectionTraversalDemo {
    public static void main(String[] args) {
        // 目标：掌握 Collection 的遍历方式一：迭代器遍历
        Collection<String> names = new ArrayList<>();
        names.add("张无忌");
        names.add("玄冥二老");
        names.add("宋青书");
        names.add("殷素素");
        System.out.println(names); // [张无忌, 玄冥二老, 宋青书, 殷素素]

        // 1、得到这集合的迭代器对象
        Iterator<String> it = names.iterator();
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next()); // NoSuchElementException

        // 2、使用一个 while 循环来遍历
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
    }
}
