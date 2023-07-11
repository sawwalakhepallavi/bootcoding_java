package com.bootcoding.recursion;

public class ArrayPrint {
    public int print(int []arr,int i){
        if(i==arr[i]){
            return i;
        }
        System.out.println(arr[i]);
        return print(arr,++i);
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,3};
        int i=0;
        ArrayPrint arrayPrint=new ArrayPrint();
        System.out.println(arrayPrint.print(arr,i));
    }
}
