package com.bootcoding.collection.arrayList.student;

public class Record {
    private String studentName;
    private boolean isPursuing;
    private double cgpa;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isPursuing() {
        return isPursuing;
    }

    public void setPursuing(boolean pursuing) {
        isPursuing = pursuing;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}
