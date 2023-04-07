package com.bootcoding.dsa.array;
//Print odd element of an array  [7, 22, 19, 44, 45, 65, 66]
public class OddArray {
    public static void main(String[] args) {
        int arr[]={7, 22, 19, 44, 45, 65, 66};
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
