package com.bootcoding.dsa.array;
// WAP to print element of an array if first index and last index values are same [7, 22, 19, 44, 45, 65, 7]
public class FirstAndLastIndex {
    public static void main(String[] args) {
        int arr[]={7, 22, 19, 44, 45, 65, 7};
        int n=arr.length-1;
        if(arr[0]==arr[n]){
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    }
}
