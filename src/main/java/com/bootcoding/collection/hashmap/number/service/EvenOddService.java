package com.bootcoding.collection.hashmap.number.service;

import com.bootcoding.collection.hashmap.number.mode.Number;

public class EvenOddService {
    public void evenOdd(Number num){
        if(num.getNum()%2==0){
            num.setEven("Even");
        }else {
           num.setEven("Odd");
        }
    }
}
