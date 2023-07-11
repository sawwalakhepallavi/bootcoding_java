package com.bootcoding.collection.arrayList.Doctor;

import com.bootcoding.collection.arrayList.student.Record;
import com.bootcoding.collection.arrayList.student.RecordService;

import java.util.ArrayList;

public class DoctorApp {
    public static void main(String[] args) {
        DoctorService ds = new DoctorService();
        ArrayList<Doctor> doctors = ds.getDoctorDetails(10000000);

        for (int i = 0; i < doctors.size(); i++) {
            System.out.println("Name: " +doctors.get(i).getName());
            System.out.println("Type of Doctor: "+doctors.get(i).getTypeOfDoctor());
            System.out.println("age: " + doctors.get(i).getAge());
            System.out.println("Education: " + doctors.get(i).getEducation());
        }
    }
}
