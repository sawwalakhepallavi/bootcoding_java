package com.bootcoding.collection;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,String>emailids=new HashMap<>();
        emailids.put("std-123","Imcoder@gmail.com");
        emailids.put("std-333","ImJavadeveloper@gmail.com");
        String emailid= emailids.get("std-123");
        System.out.println("Values of std-123"+emailid);
        System.out.print(emailids);
    }
}
