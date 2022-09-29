package com.bootcoding.collection;

import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        System.out.println("Size "+list.size());
        list.add("raja");
        list.add("ravi");
        list.add("kiran");
        System.out.println("size "+list.size());
    }
}
