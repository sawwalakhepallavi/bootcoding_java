package com.bootcoding.abstraction.book;

import java.sql.SQLOutput;

public abstract class Book {
    public int price;
    public String bookName;
    public String author;
    abstract void bookSpecification();

    public void print(int price,String bookName,String author){
        System.out.println(+price+ " , "+bookName+","+author);
    }
}
