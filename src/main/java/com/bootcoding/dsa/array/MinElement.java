package com.bootcoding.dsa.array;
//WAP to find min element of an array
public class MinElement {
    public int min(int nums[]){
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int nums[]={2,4,1,3,8};
        MinElement minElement=new MinElement();
        System.out.println(minElement.min(nums));
    }
}
