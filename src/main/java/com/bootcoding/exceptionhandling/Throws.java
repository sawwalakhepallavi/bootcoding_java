package com.bootcoding.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Throws {
    public static void main(String[] args) throws IOException {
        BufferedReader br=null;
        try{
            String str=" ";
            br=new BufferedReader(new InputStreamReader(System.in));
            str= br.readLine();
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            br.close();
        }
    }
}
