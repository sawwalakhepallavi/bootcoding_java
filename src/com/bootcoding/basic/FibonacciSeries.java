package com.bootcoding.basic;

public class FibonacciSeries {
    public static void main(String[] args) {
        int p1=1;
        int p2=1;
        int sum=1;
        for(int i=1;i<=9;i++){
            System.out.println("Fibonacci Series is "+sum);
            p2=p1;
            p1=sum;
            sum=p1+p2;

        }
    }

}
