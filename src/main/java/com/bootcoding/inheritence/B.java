package com.bootcoding.inheritence;

public class B extends A{
    private int x;
    public B(){
        x=20;
    }
    public void display(){
        System.out.println(super.x+ " "+x);
    }
}
