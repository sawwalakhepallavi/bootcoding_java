package com.bootcoding.recursion;

public class SumNumber {
    public static void main(String[] args) {
        SumNumber sumNumber=new SumNumber();
        System.out.println(sumNumber.sum(5));
    }
    public int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
