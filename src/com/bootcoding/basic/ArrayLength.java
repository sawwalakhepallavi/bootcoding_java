package com.bootcoding.basic;

public class ArrayLength {
    public int[] reversArrayLength(){
        int a[]={5,7,8,11,13};
        int temp;
        int n=a.length;
        for(int i=0;i<n/2;i++){
            temp=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=temp;

        }
        for (int j : a) {
            System.out.println(j);
        }
        return a;
    }
}

