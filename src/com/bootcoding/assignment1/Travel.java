package com.bootcoding.assignment1;

public class Travel {
    public int travelOt(int x){
        int n;
        if(x<=10){
            n=100;
            return n;
        }
        else
            n=x*10;
        return n;
    }
    public static void main(String[] args) {
        Travel travel=new Travel();
        System.out.println(travel.travelOt(20));
    }
}
