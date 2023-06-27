package com.bootcoding.collection.arrayList.student;

import java.util.ArrayList;
import java.util.Scanner;

public class RecordApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Record Details:");
        System.out.println("Enter Student Name:");
        String name = scanner.next();
        System.out.println("is Student Passed out:");
        boolean isPassout = scanner.nextBoolean();
        System.out.println("Enter CGPA score:");
        double cgpa = scanner.nextDouble();

        //Create Object
        Record record = new Record();
        record.setStudentName(name);
        record.setCgpa(cgpa);
        record.setPursuing(!isPassout);

        ArrayList<Record> records = new ArrayList<>();
        records.add(record);
        records.add(record);
        records.add(record);
        records.add(record);
        records.add(record);

        for(int i = 0; i < records.size(); i++){
            System.out.println("Name: "+records.get(i).getStudentName());
            System.out.println("CGPA: "+records.get(i).getCgpa());
            System.out.println("isPassout: "+records.get(i).isPursuing());
        }
    }
}
