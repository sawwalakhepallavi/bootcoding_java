package com.bootcoding.amrstrong;

public class AmrstrongApp {
    public static void main(String[] args) {
        int num=153;
        int []arr={1,153,370,371,407};
        ArmstrongService armstrongService=new ArmstrongService();
        System.out.println(armstrongService.singleElement(num));
//        System.out.println(armstrongService.multipleElement(arr));
    }
}
