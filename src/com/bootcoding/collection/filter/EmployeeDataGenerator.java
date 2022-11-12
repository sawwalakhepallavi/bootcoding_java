package com.bootcoding.collection.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeDataGenerator {

    private String[] empNames = {"Pallavi", "Sakshit", "Yash", "Diksha", "Sourabh", "Omkar"};
    private String[] bankNames = {"HDFC", "SBI", "ICICI", "AXIS"};

    public List<Employee> generateRandomEmployees(int numberOfEmployees){

        // Creating array list of Employees where all employee will be stored.
        List<Employee> employeeList = new ArrayList<>();


        for(int i=0; i<numberOfEmployees; i++){

            Employee employee = new Employee();
            employee.setId(i);
            employee.setExperience(getRandomExperience(10));
            employee.setName(getRandomEmpName());
            employee.setSalary(getRandomSalary(25000, 100000));
            employee.setBankAccount(getRandomBankAccount());

            //adding an element in the arraylist (employeeList)
            employeeList.add(employee);
        }

        System.out.println(employeeList.size() + " SIZE");
        return employeeList;
    }

    private BankAccount getRandomBankAccount() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountId(getRandomNumber());
        bankAccount.setBranch("Nagpur");
        bankAccount.setBankName(getRandomBankName());
        bankAccount.setCurrentBalance(getRandomSalary(1000, 1000000));
        return bankAccount;
    }

    public String getRandomBankName(){
        Random random = new Random();
        int index = random.nextInt(bankNames.length);
        return bankNames[index];
    }
    private int getRandomNumber() {
        return 1 + new Random().nextInt(10000);
    }

    private double getRandomSalary(final int minSalary, final int maxSalary) {
        Random random = new Random();
        return minSalary + random.nextInt(maxSalary - minSalary);
    }

    private String getRandomEmpName() {
        Random random = new Random();
        int index = random.nextInt(empNames.length);
        return empNames[index];
    }

    private int getRandomExperience(int maxExperience) {

        Random random = new Random();
        return random.nextInt(maxExperience);
    }
}
