package com.bootcoding.dsa.array;
//WAP to print element of an array if second index and second last index values are same [7, 22, 19, 44, 45, 22, 17]
public class SecondIndex {
    public static void main(String[] args) {
        int arr[]={7,22,119,44,22,17};
        int n=arr.length-1;
        if(arr[1]==arr[n-1]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }

}
