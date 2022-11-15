package com.bootcoding.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample2 {
    public static void main(String[] args) {
        File file=new File("c://data//bottle.txt");
        String containText="bottles";
        int count=0;
        try {
            Scanner scanner=new Scanner(file);

            while(scanner.hasNext()){
                String text=scanner.nextLine();
                String[] token=text.split(" ");

                for(int i=0;i<token.length;i++){
                    if(containText.equals(token[i])){
                        count++;
                    }
                }

            }
            System.out.println(containText+" is repeat "+ count+ " times");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
