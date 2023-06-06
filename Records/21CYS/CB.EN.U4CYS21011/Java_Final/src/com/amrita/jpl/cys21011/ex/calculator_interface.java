package com.amrita.jpl.cys21011.ex;

import java.util.Scanner;

/**
 * This is an interface for a basic calculator.
 * It declares methods for addition, subtraction, multiplication, and division.
 */
interface Calculator {
    double add(double num1, double num2);
    double subtract(double num1, double num2);
    double multiply(double num1, double num2);
    double divide(double num1, double num2);
}

/**
 * This class implements the Calculator interface.
 * It provides the definition for the basic arithmetic operations.
 */
class BasicCalculator implements Calculator {
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
    }
}

/**
 * This is the main class where the calculator operations are being used.
 * The program will ask the user to input two numbers, then it will perform
 * addition, subtraction, multiplication, and division operations on these numbers.
 */
public class calculator_interface {
    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double sum = calculator.add(num1, num2);
        System.out.println("Addition: " + sum);

        double difference = calculator.subtract(num1, num2);
        System.out.println("Subtraction: " + difference);

        double product = calculator.multiply(num1, num2);
        System.out.println("Multiplication: " + product);

        try {
            double quotient = calculator.divide(num1, num2);
            System.out.println("Division: " + quotient);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
