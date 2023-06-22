package com.bootcoding.abstraction.Interface.chocolate;

public class Child2 implements IParent{

    @Override
    public void purchase(double amount) {
        System.out.println("I am child2: I bought DairyMilks!");
    }
}
