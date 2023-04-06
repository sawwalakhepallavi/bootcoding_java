package com.bootcoding.assignment1;

public class RecursionProb {
    public boolean power(int n){
        if(n == 0){
            return false;
        }
        if(n == 1){
            return true;
        }

        if(n % 2 != 0) {
            return false;
        }

        return power(n/2);
    }
    public static void main(String[] args) {
        RecursionProb recursionProb=new RecursionProb();
        System.out.println(recursionProb.power(16));
    }
}
