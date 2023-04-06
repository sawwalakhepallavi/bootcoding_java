package com.bootcoding.basic;

public class ReversArrayWithOdd {
    public static void main(String[] args) {
        int arr[]={11,1,3,2,7,8,0,5};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2!=0){
               count++;
            }
        }

        int temp;
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            temp = arr[i];
            arr[i]= arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2!=0) {
                System.out.println(arr[i]);
            }
        }
        int []num=new int[count];
        for (int i = 0; i <count; i++) {

        }
    }
}
