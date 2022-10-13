package com.bootcoding.collection;

import java.util.ArrayList;
import java.util.List;
import com.bootcoding.oops.Fan;

public class FanArrayListExample1 {
    public static void main(String[] args) {
        List<Fan> list=new ArrayList<Fan>();
        list.add(new Fan("usha",22,178,"grey"));
        list.add(new Fan("anjli",637,188,"braun"));


       for( Fan fan:list){
           System.out.println(fan);
        }

    }
}
