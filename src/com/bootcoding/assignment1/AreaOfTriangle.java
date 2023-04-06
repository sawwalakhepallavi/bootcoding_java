package com.bootcoding.assignment1;

public class AreaOfTriangle {
    public int findAreaTriangle(int base , int height){
        int area=(base*height)/2;
        return area;
    }
    public static void main(String[] args) {
        AreaOfTriangle area=new AreaOfTriangle();
        int b=5;
        int h=10;
        System.out.println(area.findAreaTriangle(b,h));
    }
}
