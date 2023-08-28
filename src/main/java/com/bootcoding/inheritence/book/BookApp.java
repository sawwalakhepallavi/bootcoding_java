package com.bootcoding.inheritence.book;

public class BookApp {
    public static void main(String[] args) {
        AudioBook audioBook = new AudioBook();
//        EBook eBook=new EBook();
//        TestBook testBook=new TestBook();
        Book book=new Book();
        book.pages=10;
        book.Price=200;
        book.title="ramam";
        System.out.println("Title:"+book.title+ " , "+ "Price:"+book.Price+ " , "+"Pages:"+book.pages);

        book.setType("funny Book");

        book.buy();
        book.sale();
        book.sale();;
//        audioBook.audiobooks();
//        eBook.eBooks();
//        testBook.testBooks();

        book.test();

    }
}