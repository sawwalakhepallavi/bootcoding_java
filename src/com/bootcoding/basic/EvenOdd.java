package com.bootcoding.basic;

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is Odd");
        }

    }

    public boolean isEven(int num){
        if(num%2==0)
        {
            System.out.println("Number is even");
            return true;
        }
        else
        {
            System.out.println("Number is Odd");
            return false;
        }
    }
}
