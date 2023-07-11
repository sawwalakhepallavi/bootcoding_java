package com.bootcoding.recursion;

public class EvenNumber {
    public static void main(String[] args) {
        even(5);
    }
    public static int even(int n){
        if(n%2==0){
            System.out.println(n);
        }
        if(n==1){
            return 1;
        }
        return even(n - 1);

    }
}
