package com.company;
import java.util.Scanner;

public class Extract_Digits_FromInteger {
    public static void main(String[] args){



        // Declaring the number
        int number = 110102;

        // Printing the last digit of the number
        while(number >0) {

            // Finding the remainder (Last Digit)
            int remainder = number % 10;

            // Printing the remainder/current last digit
            System.out.println(remainder);

            // Removing the last digit/current last digit
            number = number / 10;
    }
    }
}


