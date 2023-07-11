package com.bootcoding.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyBlock {
    public static void main(String[] args) throws IOException {
        int i,j=1,k=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        i=8;

        try{
            System.out.println("Enter the number: ");
            j=Integer.parseInt(br.readLine());
            k=i/j;
            System.out.println("Output is : "+k);

        }
        catch (IOException e){
            System.out.println("Some Input Output Error");
        }
        catch (ArithmeticException ar){
            System.out.println(ar);
        }
        catch (ArrayIndexOutOfBoundsException ai){
            System.out.println(ai);
        }
        finally {
            br.close();
            System.out.println("BYE");
        }
    }
}
