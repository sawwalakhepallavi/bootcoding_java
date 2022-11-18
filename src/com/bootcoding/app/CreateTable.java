package com.bootcoding.app;

public class CreateTable {
    int mult=1;
    public int tableIs(int n) {
        for (int i = 1; i <= 10; i++) {
            mult = i * n;
            System.out.println(+mult);
        }
        return 0;
    }

    public static void main(String[] args) {
        CreateTable createTable=new CreateTable();
        createTable.tableIs(15);
    }
}
