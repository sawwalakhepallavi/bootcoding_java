package com.bootcoding.dsa.array;
// WAP to copy the half elements on one array into second array and print the second array
public class CopyHalfArray {
    public static int[] element(int arr[]){
        int nums[]=new int[arr.length];
        System.out.println("original array");
        for(int i=0;i< arr.length;i++){
            nums[i]=arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("nuw array" );
        for(int i=0;i<nums.length/2;i++){
            System.out.println(nums[i]);
        }
        return nums;
    }

    public static void main(String[] args) {
        int arr[]={2,4,3,5,6,4,2};
        CopyHalfArray copyArray=new CopyHalfArray();
        CopyHalfArray.element(arr);
    }
}
