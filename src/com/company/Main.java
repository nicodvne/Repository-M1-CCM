package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 39;
        int c = 0;
        displayDateNow();

        System.out.println(sum(a, b, c));

        for (String arg:args) {
            System.out.println(arg);
        }
    }

    public static void displayDateNow(){
        System.out.println("La date du jour est : " + LocalDate.now());
    }

    public static int sum(int... values){
        int sum = 0;

        for(int c : values){
            sum += c;
        }

        return sum;
    }
}


