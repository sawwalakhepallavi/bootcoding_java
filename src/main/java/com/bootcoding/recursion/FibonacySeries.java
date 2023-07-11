package com.bootcoding.recursion;

public class FibonacySeries {
    public static void main(String[] args) {
        FibonacySeries fibonacySeries=new FibonacySeries();
        System.out.println(fibonacySeries.fibo(5));
    }
    public int fibo(int num){
        if(num==0){
            return 0;
        }
        if(num==1){
            return 1;
        }
        return fibo(num-1)+fibo(num-2);
    }
}
