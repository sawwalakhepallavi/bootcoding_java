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
                for(int i=0;i<nums.length;i++){
                    sum = sum + Integer.parseInt(nums[i]);
                }
                System.out.println("Addition is :"+sum);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
