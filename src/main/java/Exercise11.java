/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */

import java.util.Scanner;
public class Exercise11 {
    public static void main(String[] args) {
        int euros;
        double exchangeRate, dollars;

        Scanner scnr = new Scanner(System.in);

        System.out.println("How many euros are you exchanging?");
        euros = scnr.nextInt();
        System.out.println("What is the exchange rate?");
        exchangeRate = scnr.nextDouble();

        dollars = euros * exchangeRate;

        System.out.println(euros + " euros at an exchange rate of " + exchangeRate + " is " + Math.round(dollars * 100.00)/100.00 + " U.S. dollars.");

        
        System.exit(0);


    } //end of main//
} //end of program//
