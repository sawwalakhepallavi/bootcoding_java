package com.bootcoding.collection.hashmap.number.service;

import com.bootcoding.collection.hashmap.number.mode.Number;

import java.util.ArrayList;
import java.util.Random;

public class NumberService {
//    private int getRandomNumber(){
//            int min = 1;
//            int max = 10;
//            return min + new Random().nextInt(max - min);
//    }
//    public Number setRandomNumber(){
//        Number number=new Number();
//        number.setNumber(getRandomNumber());
//        return number;
//    }
//
//    public ArrayList<Number> numberGenerate(int size){
//        EvenOddService evn=new EvenOddService();
//        ArrayList<Number> numbers=new ArrayList<>();
//        for(int i=0;i<size;i++){
//            Number number=setRandomNumber();
//            numbers.add(number);
//        }
//        return numbers;
//    }


    public Number getRandomNumber(){
        Random random = new Random();
        int n = random.nextInt();
        Number number = new Number();
        number.setNum(n);
        return number;
    }
}
