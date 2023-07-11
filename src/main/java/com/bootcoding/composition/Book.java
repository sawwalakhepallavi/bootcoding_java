package com.bootcoding.composition;


public class Book {
    private String title;
    private Author[] author;
//    private Publication publication;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

//    public Publication getPublication() {
//        return publication;
//    }

//    public void setPublication(Publication publication) {
//        this.publication = publication;
//    }


}
