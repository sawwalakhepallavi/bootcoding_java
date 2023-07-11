package com.bootcoding.recursion;

public class RecursionDisending {
    public void prints(int n){
        if(n<1){
            return ;
        }
        System.out.println(n);
        prints(n-1);
    }
    public static void main(String[] args) {
        RecursionDisending ps=new RecursionDisending();
        ps.prints(5);

    }
}
