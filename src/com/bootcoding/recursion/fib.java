package com.bootcoding.recursion;

public class fib {
    public int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+ fib(n-2);
    }

    public static void main(String[] args) {
        fib f=new fib();
        f.fib(5);
        System.out.println(+f.fib(5));
    }
}
