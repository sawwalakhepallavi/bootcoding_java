package com.bootcoding.collection.hashcode;

import java.util.HashMap;

public class HashcodeExample {
    public static void main(String[] args) {
        HashcodeExample hc=new HashcodeExample();
        HashMap<Restaurant,Integer> map=new HashMap<>();
        map.put(new Restaurant("Baba biryani","Nagpur","Non_veg"),1);
        map.put(new Restaurant("Haldiram","Nagpur","Veg"),2);
        map.put(new Restaurant("ram bhandar","nagpur","veg"),3);
        map.put(new Restaurant("chaska","nagpur","veg"),4);
        map.put(new Restaurant("dominos","nagpur","non_veg"),5);

        System.out.println(map.get(new Restaurant("ram bhandar","nagpur","veg")));
    }
}
