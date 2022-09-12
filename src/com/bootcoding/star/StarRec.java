package com.bootcoding.star;

public class StarRec {
    public static void main(String[] args) {
        for(int i=1;i<8;i++){
            for(int j=i;j<=4;j++){
                System.out.print("*");
            }
            for(int k=1;k<=(i*2);k++){
                System.out.print(" ");
            }
            for(int m=i;m<=4;m++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
