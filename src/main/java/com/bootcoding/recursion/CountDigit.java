package com.bootcoding.recursion;

public class CountDigit {
    public static void main(String[] args) {
        System.out.println(digitCount(123));
    }
    public static int digitCount(int num){
//        int count=0;
//        while(num!=0){
//            count++;
//            num=num/10;
//        }
//        return count;
        if(num==0){
            return 0;
        }
        return 1+digitCount(num/10);
    }
}
