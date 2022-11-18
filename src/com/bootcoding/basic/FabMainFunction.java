package com.bootcoding.basic;

public class FabMainFunction {
    public static void main(String[] args) {
        FibonacciSeries s1 = new FibonacciSeries();
        int[] fibonacciOf = s1.getFibonacciOf(5);

        for(int i=0;i<5;i++) {
            System.out.println(fibonacciOf[i]);
        }

    }
}
