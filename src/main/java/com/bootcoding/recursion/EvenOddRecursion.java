package com.bootcoding.recursion;



public class EvenOddRecursion {
    public void printEvenOdd(int n){
        if(n<1){
            return;
        }
        if(n%2==0){
            System.out.println(n);
        }
        printEvenOdd(n-1);
        if(n%2==1){
            System.out.println(n);
        }



    }

    public static void main(String[] args) {
        EvenOddRecursion eor= new EvenOddRecursion();
        eor.printEvenOdd(10);
    }
}
