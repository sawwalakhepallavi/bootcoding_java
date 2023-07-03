package com.bootcoding.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
    public static void main(String[] args) throws IOException {
        int i,j=1,k=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        i=8;

        try{
            j=Integer.parseInt(br.readLine());
            k=i/j;

        }catch (IOException e){
            System.out.println("Some Input Output Error");
        }
        catch (ArithmeticException ar){
            System.out.println(ar);
        }
        catch (ArrayIndexOutOfBoundsException ai){
            System.out.println(ai);
        }
        System.out.println(k);
    }
}
