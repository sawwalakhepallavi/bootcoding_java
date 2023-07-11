package com.bootcoding.dsa.array;
//WAP to copy the elements of one array into another array and print the array
public class CopyArray {
    public int[] cloneArray(int nums[]){
        int nums2[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            System.out.println("Element of new Array  "+nums[i]);
                nums2[i]=nums[i];
        }
        System.out.println("Element of new array");
        for(int i=0;i<nums2.length;i++){
            System.out.println(nums2[i]);
        }
        return nums2;
    }
    public static void main(String[] args) {
        int nums[]={3,5,23,5,32,66,65,97};
        CopyArray copyArray=new CopyArray();
        copyArray.cloneArray(nums);
    }

}
