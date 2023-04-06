package com.bootcoding.assignment1;

import com.sun.org.apache.bcel.internal.generic.VariableLengthInstruction;

public class FindMissingNumber {
    public int missingNumber(int []num){
        int n=num.length;
        int sum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++)
            sum -= num[i];
        return sum;

    }
    public static void main(String[] args) {
        FindMissingNumber findMissNum=new FindMissingNumber();
        int []num={1,2,3,5,6,7};
        System.out.println(+findMissNum.missingNumber(num));
    }
}
