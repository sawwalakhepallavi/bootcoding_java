package com.bootcoding.assignment1;

public class ArraySorting {
    public int[] array(int []a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<i+1;j++){
                int temp=0;
                a[i]=temp;
                temp=a[j];
                a[i]=a[j];
                System.out.println(a[i]);
            }
        }
        return a;
    }
    public static void main(String[] args) {
        ArraySorting arraySorting=new ArraySorting();
        int a[]={5,4,3,7,8};
        arraySorting.array(a);
    }
}
