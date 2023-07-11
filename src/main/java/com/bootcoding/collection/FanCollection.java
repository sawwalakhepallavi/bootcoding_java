package com.bootcoding.collection;

import com.bootcoding.oops.Fan;

import java.util.HashMap;

public class FanCollection {
    HashMap<Long,Fan> fanStore=new HashMap<>();
    public void addFans(Fan f){
        fanStore.put(f.getPrice(),f);
    }
    public void printFan(){
        for(Fan f: fanStore.values()){
            System.out.println("Company:"+f.getCompany());
            System.out.println("Color:"+f.getColor());
            System.out.println("Price:"+f.getPrice());
            System.out.println("Sales:"+f.getSale());
        }

    }
    public static void main(String[] args) {
        FanCollection fc=new FanCollection();
        for(int i=0;i<=10;i++){
            Fan f= new Fan();
            f.setColor("braun "+i);
            f.setPrice((i*50));
            f.setCompany("Usha"+i);
            f.setSale((i+89)*50);
            fc.addFans(f);
        }
        fc.printFan();
    }
}
