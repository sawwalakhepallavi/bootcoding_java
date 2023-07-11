package com.bootcoding.basic;

public class ArrayReversWithEven {
    public static void main(String[] args) {
        int arr[]={1,2,32,4,5,6};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }

        int a[]=new int[count];
        int j= a.length-1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]%2==0){
                a[j--]=arr[i];
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
