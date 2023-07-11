package com.bootcoding.recursion;

public class RecursionAssending {
    public void prints(int n){
        if(n<1){
            return ;
        }
        prints(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        RecursionAssending ra=new RecursionAssending();
        ra.prints(5);
    }
}
