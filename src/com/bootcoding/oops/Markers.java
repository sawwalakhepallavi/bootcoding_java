package com.bootcoding.oops;

public class Markers {

        long id;
        String compary;
        String color;
        String typr;
        double price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompary() {
        return compary;
    }

    public void setCompary(String compary) {
        this.compary = compary;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypr() {
        return typr;
    }

    public void setTypr(String typr) {
        this.typr = typr;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void fillMarker(){
            System.out.println("Fill Marker");
        }
        public Markers(){

        }
        public Markers(String cmp,String clr,String t,double p){
            compary=cmp;
            color=clr;
            typr=t;
            price=p;
        }
        public void print(){
            System.out.println(compary);
            System.out.println(color);
            System.out.println(typr);
            System.out.println(price);
        }

        public static void main(String[] args) {
            Markers m2 = new Markers("Natraj","Black","Black pen",127.00);

            m2.fillMarker();
            m2.print();

        }

}
