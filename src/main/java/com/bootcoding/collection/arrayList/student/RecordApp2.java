package com.bootcoding.collection.arrayList.student;

import java.util.ArrayList;

public class RecordApp2 {
    public static void main(String[] args) {
        RecordService rd = new RecordService();
        ArrayList<Record> records = rd.getRecords(10000000);

        for (int i = 0; i < records.size(); i++) {
            System.out.println(i);
            System.out.println("Name: " + records.get(i).getStudentName());
            System.out.println("CGPA: " + records.get(i).getCgpa());
            System.out.println("isPassout: " + records.get(i).isPursuing());
        }
    }
}
