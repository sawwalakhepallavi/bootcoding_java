package com.bootcoding.oops.abstraction;

import com.bootcoding.oops.abstraction.Animal;

public class Dog extends Animal {
    public void sleep(){
        super.sleep();
        System.out.println("Dog is sleeping");
    }
}
