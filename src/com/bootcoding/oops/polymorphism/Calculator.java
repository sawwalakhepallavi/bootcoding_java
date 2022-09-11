package com.bootcoding.oops.polymorphism;

public class Calculator {
    public int add(int a,int b){
        int c=a+b;
        System.out.println("Addition is" +a);
        return c;
    }
    public int add(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
           sum=sum+arr[i];
        }

        return sum;
    }
    public double add(double d,int e){
        double f=d+e;
        System.out.println("Double Addition"+f);
        return f;
    }
}
