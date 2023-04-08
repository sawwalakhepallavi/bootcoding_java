package com.bootcoding.dsa.array;

public class ReversString {
    public static void main(String[] args) {
        String  s[] = {"h","e","l","l","o"};
        String temp;
        for(int i=0;i<s.length/2;i++){
            temp=s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i]=temp;
            System.out.println(s[i]);
        }

    }
}
