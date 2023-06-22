package com.bootcoding.inheritence.book;

import java.util.Date;

public class Book {
    public int Price;
    public int pages;
    public String title;
    private Date publicationData;
    private String Type;


    public Date getPublicationData() {
        return publicationData;
    }

    protected void test(){
        System.out.println("Test ");
    }

    public void setPublicationData(Date publicationData) {
        this.publicationData = publicationData;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
    public void buy(){
        System.out.println("......some books i will buy");
    }
    public void sale(){
        System.out.println("......50 books sales today.......");
    }
}
