package com.bootcoding.abstraction.book;

public class AudioBook extends Book{

    @Override
    void bookSpecification() {
        System.out.println("This book is used for listening purpose.....!");

        bookName="blink of an eye";
        price=100;
        author="r.j sham";
    }
}
