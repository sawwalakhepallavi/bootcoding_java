package com.bootcoding.recursion;

public class OddNumber {
    public static void main(String[] args) {
        odd(5);
    }
    public static void odd(int n){
        if(n==1){
            return ;
        }
        odd(n-1);
        if(n%2 == 1){

            System.out.println(n);
        }


    }
}
