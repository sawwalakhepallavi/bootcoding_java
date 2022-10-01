package com.bootcoding.collection;

public class AddTwoArray {
    public static void main(String[] args) {
        int target=9;
        int nums[]={2,7,11,15};
        int[] num=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<(nums.length);j++) {
                if((nums[i]+nums[j])==target){
                    System.out.println( num[0]=i);
                    System.out.println(num[1]=j);
                }
            }
        }
    }
}
