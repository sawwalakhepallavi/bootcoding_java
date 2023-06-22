package com.bootcoding.abstraction.book;
public class BookParent {
    public static void main(String[] args) {
        AudioBook audioBook=new AudioBook();
        TextBook textBook=new TextBook();
        EBook eBook=new EBook();

        audioBook.bookSpecification();
        print(audioBook);
        textBook.bookSpecification();
        print(textBook);
        eBook.bookSpecification();
        print(eBook);



    }
    public static void print(Book obj){
        obj.print(obj.price,obj.bookName,obj.author);
    }
}

