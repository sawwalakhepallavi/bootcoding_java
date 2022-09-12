package com.bootcoding.star;

public class StarApplication {
    public static void main(String[] args) {
        for(int i=0;i<=3;i++){
            for(int j=0;j<=i;j++){
                    System.out.print("*");
            }
            System.out.println("\n");
        }
        for(int k=0;k<=3;k++){
            for(int l=k;l<=3;l++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
