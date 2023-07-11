package com.bootcoding.recursion;

public class MinArray {
    public static void main(String[] args) {
        MinArray minArray=new MinArray();
        int arr[]={2,4,3,7};
        int min=2,i=0;
        System.out.println(minArray.minElement(arr,min,i));

    }

    private int minElement(int[] arr,int min,int i) {
        if(i== arr.length){
            return min;
        }
        if(min>arr[i]){
            min=arr[i];
        }
//        Math.min(x,y);
//        min=Math.min(min,arr[i]);
        return minElement(arr,min,++i);
    }
}
