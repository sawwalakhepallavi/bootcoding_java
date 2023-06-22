package com.bootcoding.amrstrong;

public class ArmstrongService {
    public static int countDig(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count = count + 1;
        }
        return count;
    }
//    public static int countDig(int[] arr){
//        int count = 0;
//        for(int i=0;i<arr.length;i++){
//            while (arr[i] != 0) {
//                arr[i] = arr[i] / 10;
//                count = count + 1;
//            }
//        }
//        return count;
//    }


    public boolean singleElement(int num) {
        int count = countDig(num);
        System.out.println(count);
        int add = 0;
        int nums=num;
        while (num != 0) {
            int mul=1;
            int mod=num%10;
            for (int i = 0; i < count; i++) {
                mul = mod * mul;
            }
            num = num / 10;
            add+=mul;

        }
        if(nums==add){
            return true;
        }

       return false;
    }

//    public boolean multipleElement(int[] arr) {
//        int count=countDig(arr);
//        for(int i=0;i< arr.length;i++) {
//            System.out.println(count);
//        }
//        return false;
//    }
}
