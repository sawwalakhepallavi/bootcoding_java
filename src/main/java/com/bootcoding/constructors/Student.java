package com.bootcoding.constructors;
//Example of default constructor that displays the default values
public class Student {
    int id;
    String name;


    void display() {
        System.out.println("student id is "+id + " student name is " + name);
    }

    public static void main(String args[]) {

        Student s1 = new Student();

        s1.display();

    }
}