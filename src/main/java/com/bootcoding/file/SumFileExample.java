package com.bootcoding.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumFileExample {
    public static void main(String[] args) {
        File file=new File("C://data//numbers//input.txt");
        try {
            Scanner scanner=new Scanner(file);
            while(scanner.hasNext()){
                String num= scanner.nextLine();
                String[] nums=num.split(",");
                int sum=0;
                int substraction=0;
                int mult=1;
                for(int i=0;i<nums.length;i++){
                    sum = sum + Integer.parseInt(nums[i]);
                    mult = mult * Integer.parseInt(nums[i]);
                    substraction = substraction - Integer.parseInt(nums[i]);
                }
                System.out.println("Addition is :"+sum);
                System.out.println("Multiplication is :"+mult);
                System.out.println("substraction is :"+substraction);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
