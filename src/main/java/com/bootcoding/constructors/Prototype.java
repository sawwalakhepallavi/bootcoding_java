package com.bootcoding.constructors;

public class Prototype extends Demo{
    Prototype()
    {
        this("Java", "Python");
        System.out.println("Derived class default constructor called");
    }

    Prototype(String str1, String str2)
    {
        super();
        System.out.println("Derived class parameterized constructor called");
    }
}
