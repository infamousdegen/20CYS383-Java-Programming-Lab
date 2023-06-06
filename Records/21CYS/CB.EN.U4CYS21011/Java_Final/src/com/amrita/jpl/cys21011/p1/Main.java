package com.amrita.jpl.cys21011.p1;

import java.util.Scanner;

public class Main {
    /**
     * Takes in a choice from the user and calls the corresponding function according to the user
     * @param args This is an array of command-line arguments for the main method
     */
    public static void main(String[] args) {
        // Creating a Scanner object to read inputs from the user
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();

        System.out.println("Enter your choice:");
        System.out.println("1. Factorial (fact)");
        System.out.println("2. Fibonacci (fibo)");
        System.out.println("3. The sum of 'n' numbers (sum n no)");
        System.out.println("4. Prime Test (prime test)");

        int choice = scanner.nextInt();

        if(choice == 1){
            System.out.printf("Enter a number:");
            int n1 = scanner.nextInt();
            if(n1<=0){
                System.out.printf(" Please enter a number more than 0");

            }
            else{
                System.out.printf("Factorial is " + obj.fact(n1));
            }
        } else if (choice == 2) {
            System.out.printf("Enter the number of fibonacci to be printed  ");
            int n2 = scanner.nextInt();
            if(n2 <=0){
                System.out.printf(" Please enter a number more than 0");
            }
            else {
                obj.fibo(n2);
            }

        } else if (choice ==3) {
            System.out.printf("Enter the number until where sum has to be found ");
            int n3 = scanner.nextInt();
            if(n3 <0){
                System.out.printf("Negative values not accepted ");

            }
            else{
                System.out.println("The sum of first " + n3 + " numbers is " + obj.sum_n_no(n3));
            }

        } else if (choice == 4) {
            System.out.printf("Enter the number to check for prime ");
            int n4 = scanner.nextInt();
            if(n4 <=0){
                System.out.printf("Enter a value greater than 0 ");
            }
            else {
                boolean value = obj.prime_test(n4);
                if(value){
                    System.out.printf("It is a prime number");
                }
                else{
                    System.out.printf("It is not a prime number");

                }

            }


        }
        else {
            System.out.printf("Invalid Choice ");
        }

    }

    /**
     * Calculaltes the factorial of the given numbers , uses recursion to achieve it
     * @param n It is the number whose factorial has to be calculated
     * @return int Returns the factorial of the given number
     */
    public int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    /**
     * This generates the fibonacci sequence of n numbers
     * @param n number of fibonacci numbers to be found
     */
    public void fibo(int n) {
        int a = 0, b = 1, c;
        System.out.printf("Fibonacci sequence of first " + n + " numbers: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    /***
     * Function to calculate the sum of first n numbers as specified by the user
     * @param n this is the n which user enters
     * @return int returns the sum of the first n numbers
     */
    public int sum_n_no(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    /***
     * Checks whether a number is prime or not
     * @param n the number to check whether a prime or not
     * @return boolean value indicating whether it is prime or not
     */
    public boolean prime_test(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
