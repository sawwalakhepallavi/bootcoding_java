package com.bootcoding.collection.hashmap.number;

import com.bootcoding.collection.hashmap.number.mode.Number;
import com.bootcoding.collection.hashmap.number.service.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumberApp {
    public static void main(String[] args) throws IOException {
        NumberService ns = new NumberService();
        EvenOddService eos = new EvenOddService();
        PalindromeService ps = new PalindromeService();
        PrimeNumberService pns = new PrimeNumberService();
        ArmstrongService ams=new ArmstrongService();
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/Data/num.csv"));

        ArrayList<Number> numbers = new ArrayList<>();
        for(int i = 0; i < 1000; i++){

            Number randomNumber = ns.getRandomNumber();
//            ams.armstrongNumber(randomNumber);
            eos.evenOdd(randomNumber);
            ps.palindrome(randomNumber);
            pns.primeNumber(randomNumber);
            numbers.add(randomNumber);
        }

        for(Number number : numbers) {
            writer. write(number.toString());
            writer.write("\n");
        }
        writer.flush();
        writer.close();
    }
}
