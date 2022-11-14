package com.bootcoding.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FolderExample {
    public static void main(String[] args) {
        File jdkFolder=new File("C:\\Program Files\\Java\\jdk1.8.0_321");
        if(jdkFolder.isDirectory()){
            File[] files=jdkFolder.listFiles();
            for(File file :files){
                System.out.println(file.getPath());
                System.out.println(file.getName());
                if(file.getName().equals("README.html")){
                    System.out.println("----------------------#############################----------------");
                    try {
                        Scanner sc=new Scanner(file);
                        while(sc.hasNext()){
                            String line =sc.nextLine();
                            System.out.println(line);
                        }
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

    }
}
