package com.bootcoding.collection.arrayList.employee;

import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        EmployeeService employeeService=new EmployeeService();
        Scanner scanner=new Scanner(System.in);
        System.out.println("number of Employee are:");
        int num= scanner.nextInt();
        for(int i=0;i<num;i++){
            System.out.println(employeeService.getRandomName());
            System.out.println(employeeService.getRandomExperience());
            System.out.println(employeeService.getRandomSalary());

        }
    }
}
