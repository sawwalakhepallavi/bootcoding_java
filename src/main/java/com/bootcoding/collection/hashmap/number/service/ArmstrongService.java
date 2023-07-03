package com.bootcoding.collection.hashmap.number.service;

import com.bootcoding.collection.hashmap.number.mode.Number;

public class ArmstrongService {
    public static int countDig(Number number) {
        int count = 0;
        int n=number.getNum();
        while (n != 0) {
           n= n/ 10;
           count = count + 1;
        }
        return count;
    }
    public void armstrongNumber(Number number) {
        int count = countDig(number);
        System.out.println(count);
        int add = 0;
        int nums=number.getNum();
        while (number.getNum() != 0) {
            int mul=1;
            int mod= number.getNum()%10;
            for (int i = 0; i < count; i++) {
                mul = mod * mul;
            }
            int num = number.getNum() / 10;
            add+=mul;

        }
        if(nums==add){
            number.setArmstrong("it is Armstrong");
        }
        number.setArmstrong("Not Armstrong");

    }


}
