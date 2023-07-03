package com.bootcoding.exceptionhandling;

public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        int a[]=new int[4];
        try{
            for(int i=0;i<=4;i++){
                System.out.println(a[i]=i+1);
            }
        }
        catch (ArithmeticException ae){
            System.out.println(ae);
        } catch (ArrayIndexOutOfBoundsException arr){
            System.out.println("indexing greater than the range "+arr);
        }
    }
}
