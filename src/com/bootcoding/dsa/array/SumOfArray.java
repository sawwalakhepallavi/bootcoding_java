package com.bootcoding.dsa.array;
//Print sum of all element of an array  [7, 22, 19, 44, 45, 65, 66]
public class SumOfArray {
    public static void main(String[] args) {
        int nums[]={7, 22, 19, 44, 45, 65, 66};
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        System.out.println(sum);
    }

}
