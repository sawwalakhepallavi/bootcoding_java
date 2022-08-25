package com.bootcoding.basic;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class College {
    ArrayList<Department> department = new ArrayList<>();

     public College(){
        System.out.println("I'm college");
    }

    void takeAttendance(){
         department.get(0).attendance();
    }

}
