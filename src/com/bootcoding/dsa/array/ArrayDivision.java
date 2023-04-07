package com.bootcoding.dsa.array;
//WAP to print element of an array which are divisible by 3 & 5
public class ArrayDivision {
    public int[] divisionOfArray(int []arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0 && arr[i]%5==0){
                System.out.println(arr[i]);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={7, 22, 15, 44, 45, 65, 66};
        ArrayDivision arrayDivision=new ArrayDivision();
        arrayDivision.divisionOfArray(arr);
    }
}
