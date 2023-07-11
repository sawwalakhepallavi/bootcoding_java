package com.bootcoding.composition;

public class BookApp {
    public static void main(String[] args) {
            Author author =new Author();
            author.setAge(20);
            author.setName("Lemeno");

            Author author1 =new Author();
            author1.setName("King");
            author1.setAge(21);

//            Publication publication= new Publication();
//            publication.setCompany("KBT");
//            publication.setAddress("Korea" );
//            publication.setSince(1997);

            Book myBook =new Book();
//            myBook.setPublication(publication);
            myBook.setTitle("Crack your Exam");
            Author[] authors =new Author[2];
            authors[0]=author;
            authors[1]=author1;
            myBook.setAuthor(authors);

    }
}
