package com.bootcoding.basic;

public class Average
{
    public static void main(String[] args) {
        int arr[]={5,6,3,8,9,4};
        int sum=0;
        int avg=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            avg=sum/ arr.length;
            if(avg<arr[i]){
                System.out.println(arr[i]);
            }
        }
        System.out.println(avg);

    }
}
