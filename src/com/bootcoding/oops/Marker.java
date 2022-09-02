package com.bootcoding.oops;

public class Marker {
    String company;
    String color;
    String type;
    double price;
    public Marker(){
        System.out.println("Marker");
    }

    public static void main(String[] args) {
        Marker m1=new Marker();
        Marker m2=new Marker();
        m1.color="Blue";
        m1.company="camlir";
        m1.type="Whiteblackmarker";
        m1.price=129.00;
        m2.color="Black";
        m2.company="camlir";
        m2.type="Whitemarker";
        m2.price=127.00;
        System.out.println("main marker  "+m2.color  +" "+m2.company+" "  + m2.type +" " +m2.price);
        System.out.println("main marker  "+m1.color  +" "+m1.company+" "  + m1.type +" " +m1.price);
    }
}
