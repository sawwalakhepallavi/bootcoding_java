package com.bootcoding.collection.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {

        EmployeeDataGenerator dataGenerator = new EmployeeDataGenerator();
        List<Employee> employees = dataGenerator.generateRandomEmployees(100);



        // without java 8
        List<Employee> employeesWithIciciBankAccount = new ArrayList<>();
        for(Employee employee : employees){
            if("ICICI".equals(employee.getBankAccount().getBankName())) {
                employeesWithIciciBankAccount.add(employee);
            }
        }

        // using java 8
        List<Employee> icici = employees.stream().filter(employee -> employee.getBankAccount().getBankName().equals("ICICI"))
                .collect(Collectors.toList());

        System.out.println("USING Java 8");
        //using java 8
        icici.forEach(Application::printEmployee);

        System.out.println(" Total Employees : " + employees.size());
        System.out.println(" Employees having ICICI Bank Account : " + employeesWithIciciBankAccount.size()) ;

        System.out.println(" Employees having ICICI Bank Account (Java 8) : " + icici.size()) ;

    }

    private static void printEmployee(Employee employee){
        System.out.println(" ====================  ========================== ======");
        System.out.println("ID: " + employee.getId());
        System.out.println("Name : " + employee.getName());
        System.out.println("Experience: " + employee.getExperience());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Bank Name: " + employee.getBankAccount().getBankName());
    }
}
