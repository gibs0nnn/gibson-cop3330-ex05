package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your first number? ");
        int numOne = scanner.nextInt();
        System.out.print("What is your second number? ");
        int numTwo = scanner.nextInt();

        int sum = numOne + numTwo;
        int product = numOne * numTwo;
        int quotient = numOne / numTwo;
        int subtract = numOne - numTwo;

        System.out.println(numOne + " + " + numTwo + " = " + sum);
        System.out.println(numOne + " - " + numTwo + " = " + subtract);
        System.out.println(numOne + " * " + numTwo + " = " + product);
        System.out.println(numOne + " / " + numTwo + " = " + quotient);
    }
}
