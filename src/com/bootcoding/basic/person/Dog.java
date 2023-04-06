package com.bootcoding.basic.person;

import java.util.Objects;

public class Dog {
    String name;
    String bread;
    int age;
    String color;

    public String getName() {
        return name;
    }

    public String getBread() {
        return bread;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return ("my Dog name is "+getName()+ " This bread is "+ getBread()+ " age & color "+getAge()+ " & " +getColor());
    }

    public Dog(String name, String bread, int age, String color) {
        this.name = name;
        this.bread = bread;
        this.age = age;
        this.color = color;
    }

    public static void main(String[] args) {
            Dog dog=new Dog("tuffy","pavalion",3,"white");
        System.out.println(dog.toString());
    }

}
