package com.bootcoding.basic.person;

public class PerfectSquare {
    public static void main(String[] args) {
    int num=4;
    int j;
        for(int i=1;i<=num;i++){
        j=i*i;
            if(j==num){
                System.out.println("true");
                break;
            }
            else{
                System.out.println("false");
            }
        }

    }
}

