package com.bootcoding.constructors;

public class Demo {
    Demo()
    {
        this(80, 90);
        System.out.println("Base class default constructor called");
    }
    Demo(int x, int y)
    {
        System.out.println("Base class parameterized constructor called");
    }
}
