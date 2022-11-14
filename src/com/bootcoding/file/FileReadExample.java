package com.bootcoding.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {
    public static void main(String[] args)  {
        try {
            File file=new File("C:\\File\\file.txt");
            Scanner scanner=new Scanner(file);


            System.out.println("Is file readable:"+file.canRead());
            System.out.println("Is file Write:"+file.canWrite());
            System.out.println("Is file Execute:"+file.canExecute());
            System.out.println("Is path:"+file.getPath());
            System.out.println("Absolute file path "+file.getAbsolutePath());
            System.out.println("Reading File Contents ");


            while(scanner.hasNext()){
                String line =scanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
