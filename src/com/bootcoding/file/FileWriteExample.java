package com.bootcoding.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteExample {
    public static void main(String[] args) {
        File file=new File("c://file//output.txt");
        try {
            if(file.createNewFile()){
                System.out.println("File has been created!");
            }
            else{
                System.out.println("File exists already!");
            }
            System.out.println("Is file readable:"+file.canRead());
            System.out.println("Is file Write:"+file.canWrite());
            System.out.println("Is file Execute:"+file.canExecute());
            System.out.println("Is path:"+file.getPath());
            System.out.println("Absolute file path "+file.getAbsolutePath());


            FileWriter fw=new FileWriter(file);
            fw.write("Welcome to the file Writting example,data has been written by programmatically....!");
            fw.close();
            System.out.println("File Contents:");
            Scanner sc=new Scanner(file);
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
