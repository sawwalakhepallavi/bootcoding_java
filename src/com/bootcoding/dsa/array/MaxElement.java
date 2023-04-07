package com.bootcoding.dsa.array;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

//WAP to find max element of an array
public class MaxElement {
    public int maxArray(int []nums){
        int max=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,3,8};
        MaxElement maxElement=new MaxElement();
        System.out.println(maxElement.maxArray(nums));
    }
}
