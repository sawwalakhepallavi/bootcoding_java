package com.bootcoding.basic;

import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {

        double slab;
        double a;
        double slabFirst;
        System.out.println("enter your ANNUAL income");

        Scanner sc = new Scanner(System.in);
        slab = sc.nextDouble();
        if (slab >= 100000 && slab <= 500000) {
            a = slab * 0.1;
            System.out.println("income tax is " + a);
        }
        if (slab >= 500000 && slab <= 900000) {
            slabFirst = slab - 500000;
            a = slabFirst * 0.2;
            a = a + 50000;
            System.out.println("income tax is " + a);
        }
        if (slab >= 1000000) {
            slabFirst = slab - 1000000;
            a = slabFirst * 0.3;
            a = a + 1500000;
            System.out.println("income tax is " + a);
        }


    }

    public void start() {
        System.out.println("start");
    }
}
