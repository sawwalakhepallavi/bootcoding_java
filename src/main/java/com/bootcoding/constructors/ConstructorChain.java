package com.bootcoding.constructors;

public class ConstructorChain {
    ConstructorChain()
    {
        this("Javapoint");
        System.out.println("Default constructor called.");
    }

    ConstructorChain(String str)
    {
        System.out.println("Parameterized constructor called");
    }

    public static void main(String args[])
    {

        ConstructorChain cc = new ConstructorChain();
    }
}
