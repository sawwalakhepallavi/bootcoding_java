package com.bootcoding.hashmap;

import java.util.HashMap;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        int []res=new TwoSum().twoSum(arr,9);
        for(int r:res) {
            System.out.println(r+" ");
        }
    }
    public int[] twoSum(int arr[],int target){
        int n=arr.length;
        HashMap<Integer,Integer> twoSumMap=new HashMap<>();
        int []res=new int[2];
        for(int i=0;i<n;i++){
            if(twoSumMap.containsKey(arr[i])){
                res[0]=twoSumMap.get(arr[i]);
                res[1]=i;
            }
            else{
                twoSumMap.put(target-arr[i],i);
            }

        }
        return res;
    }
}
