package com.bootcoding.basic.person;

import java.util.Scanner;
public class PersonEducation {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<=5){
            System.out.println("Student in nursery class");
        }
        if(age>5 && age<=15){
            System.out.println("Student in school-K10\n");
        }
        if(age>=16 && age<=18){
            System.out.println("Student in high school-K12\n");
        }
        if(age>=19 && age<=22){
            System.out.println("Student is graduate\n");
        }
        sc.close();
    }
}
