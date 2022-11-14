package com.bootcoding.file;

import java.io.File;

public class FileDeleteExample {
    public static void main(String[] args) {
        File  file=new File("C://data//data1//data2//folder");
        if(file.exists()){
            file.delete();
        }
    }
}
