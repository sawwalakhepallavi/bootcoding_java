package com.bootcoding.basic;

public class FibonacciSeries {
        int p1=1;
        int p2=1;
        int sum=1;

        public int [] getFibonacciOf(int n){

            int res[]=new int[n];
            for (int i = 1; i <=n; i++) {
                p2 = p1;
                p1 = sum;
                sum = p1 + p2;
                res[i-1]=sum;
            }

            return res;
        }
}


