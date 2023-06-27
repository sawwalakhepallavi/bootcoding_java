package com.bootcoding.collection.arrayList.student;

import java.util.ArrayList;
import java.util.Random;

public class RecordService {
    public ArrayList<Record> getRecords(int size){
        ArrayList<Record> records = new ArrayList<>();
        for(int i = 0; i < size; i++){
            Record record = buildRecord();
            records.add(record);
        }
        return records;
    }

    public Record buildRecord(){
        Record record = new Record();
        record.setStudentName(getRandomName());
        record.setCgpa(getRandomScore());
        record.setPursuing(getRandom());
        return record;
    }

    private boolean getRandom() {
        boolean[] values = {true, false};
        return values[new Random().nextInt(values.length)];
    }

    private double getRandomScore() {
        int min = 1;
        int max = 10;
        return min + new Random().nextInt(max-min);

    }


    private String getRandomName(){
        String[] names = {"Rizwan", "Nachiket", "Nikhil", "Shreya", "Rina", "Prerna","Abhishek"};

        int randomIndex = new Random().nextInt(names.length);
        return names[randomIndex];
    }
}
