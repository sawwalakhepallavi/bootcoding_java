package com.bootcoding.collection.arrayList.employee;

import com.bootcoding.collection.arrayList.student.Record;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EmployeeService {
    public ArrayList<Employee> getEmployee(){
        ArrayList<Employee> employees=new ArrayList<>();
        for(int i = 0; i < employees.size(); i++){
            Employee employee = buildEmployee();
            employees.add(employee);
        }
        return employees;
    }

    private Employee buildEmployee() {
        Employee employee=new Employee();
        employee.setName(employee.getName());
        employee.setExperience(employee.getExperience());
        employee.setSalary(employee.getSalary());
        return employee;
    }
    public String getRandomName(){
        String[] names = {"Rizwan", "Nachiket", "Nikhil", "Shreya", "Rina", "Prerna","Abhishek"};

        int randomIndex = new Random().nextInt(names.length);
        return names[randomIndex];
    }
    public double getRandomExperience() {
        int min = 1;
        int max = 10;
        return min + new Random().nextInt(max-min);
    }
    public double getRandomSalary() {
        int min = 50000;
        int max = 100000;
        return min + new Random().nextInt(max-min);

    }
}
