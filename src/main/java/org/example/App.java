package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        //Inputs
        System.out.print("What is your first number? ");
        String strNum1 = scanner.next();
        System.out.print("What is your second number? ");
        String strNum2 = scanner.next();

        //Parsing
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        //Operations
        int sum = num1 + num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int subtract = num1 - num2;

        //Output
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + subtract);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
    }
}
