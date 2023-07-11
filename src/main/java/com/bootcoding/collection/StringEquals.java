package com.bootcoding.collection;

public class StringEquals {
    public static void main(String[] args) {
        String s1="Bootcoding";
        String s2=new String("Bootcoding");
        String s3=s1;
        if(s1==s2){
            System.out.println("ref s1 & s2 are same");
        }
        else{
            System.out.println("ref s1 & s2 are not same");
        }
        if(s1.equals(s2)){
            System.out.println("content s1 & s2 are same");
        }
        else{
            System.out.println("content s1 & s2 are not same");
        }
        if(s1==s3){
            System.out.println("ref s1 & s3 are same");
        }
        else{
            System.out.println("ref s1 & s3 are not same");
        }
        if(s1.equals(s3)){
            System.out.println("content s1 &s3 are same");
        }
        else{
            System.out.println("content s1 & s3 are not same");
        }
    }
}
