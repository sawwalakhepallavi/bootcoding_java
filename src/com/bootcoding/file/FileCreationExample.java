package com.bootcoding.file;

import java.io.File;

public class FileCreationExample {
    public static void main(String[] args) {
        File file= new File("c://data//data1//data2//folder");
        if(!file.exists()){
            boolean mkdir=file.mkdirs();
        }
    }
}
