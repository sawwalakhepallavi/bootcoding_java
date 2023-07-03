package com.bootcoding.exceptionhandling;

public class ArithmaticExceptionOccure {
    public static void main(String[] args) {
        int i,j,k=0;
        i=4;
        j=0;
        try{
            k=i/j;
        }catch (ArithmeticException e){
            System.out.println("Cannot Divisible by zero "+e);
        }
    }
}
