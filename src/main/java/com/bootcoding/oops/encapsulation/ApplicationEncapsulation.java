package com.bootcoding.oops.encapsulation;

public class ApplicationEncapsulation {
    private String name;
    private double price;

    public  void show(String s){
        name=s;
    }

    public void setName(String s){
        name=s;
    }
    public String getName(){
        return name;
    }
}
