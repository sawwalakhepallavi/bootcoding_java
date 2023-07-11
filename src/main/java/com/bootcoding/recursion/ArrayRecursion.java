package com.bootcoding.recursion;

public class ArrayRecursion {
    public void print(int []a,int i){
       if(i >= a.length){
           return;
       }

       if(i%2==0) {
           System.out.println(a[i]);
       }
       print(a,++i);
       if(i%2!=0 && i < a.length){
           System.out.println(a[i]);
       }
    }

    public static void main(String[] args) {
        ArrayRecursion ar=new ArrayRecursion();
        int a[]={1,2,3,4,5};
        ar.print(a,0);
    }
}
