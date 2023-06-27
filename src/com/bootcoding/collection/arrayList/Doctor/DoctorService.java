package com.bootcoding.collection.arrayList.Doctor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class DoctorService {
    public ArrayList<Doctor> getDoctorDetails(int size){
        ArrayList<Doctor> doctors=new ArrayList<>();
        for(int i=0;i<size;i++){
            Doctor doctor=new Doctor();
            doctor.setName(getRandomName());
            doctor.setAge(getRandomAge());
            doctor.setTypeOfDoctor(getRandomTypeOfDoctor());
            doctor.setEducation(getRandomEducation());
            doctors.add(doctor);
        }
        return doctors;
    }
    private int getRandomAge() {
        int min = 25;
        int max = 50;
        return min + new Random().nextInt(max-min);

    }
    private String getRandomEducation(){
        String[] names = {"MBBS", "UG", "PG"};
        int randomIndex = new Random().nextInt(names.length);
        return names[randomIndex];
    }

    private String getRandomName(){
        String[] names = {"Rizwan", "Nachiket", "Nikhil", "Shreya", "Rina", "Prerna","Abhishek"};
        int randomIndex = new Random().nextInt(names.length);
        return names[randomIndex];
    }

    private String getRandomTypeOfDoctor(){
        String[] names = {"Pathologist", "Ophthalmology", "Radiologist", "Psychiatrist","Surgeon","Gastroenterologist"};
        int randomIndex = new Random().nextInt(names.length);
        return names[randomIndex];
    }
}
