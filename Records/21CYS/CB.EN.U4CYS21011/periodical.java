package com.amrita.jpl.cys21011.p1;

import java.util.Scanner;

public class periodical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Factorial");
            System.out.println("2. Fibonacci");
            System.out.println("3. Sum of n numbers");
            System.out.println("4. Prime");
            System.out.println("5. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a number to find factorial:");
                    int num1 = scanner.nextInt();
                    if (num1 <= 0) {
                        System.out.println("Error: Cannot find factorial for a negative number or 0.");
                        break;
                    } else {
                        long fact = factorial(num1);
                        System.out.println("Factorial of " + num1 + " is " + fact);
                    }
                    break;
                case 2:
                    System.out.println("Enter a number to find the Fibonacci series: ");
                    int num2 = scanner.nextInt();
                    if (num2 <= 0) {
                        System.out.println("Error: Cannot find Fibonacci series for a negative number or 0.");
                        break;
                    }
                    System.out.println("Fibonacci series up to " + num2 + " is:");
                    fibonacci(num2);
                    break;
                case 3:
                    System.out.println("Enter the value of n for the sum of n numbers:");
                    int n = scanner.nextInt();
                    if (n <= 0) {
                        System.out.println("Error: Cannot find the sum of numbers for a negative number or 0.");
                        break;
                    }
                    int sum = sumOfNNumbers(n);
                    System.out.println("Sum of the first " + n + " numbers is " + sum);
                    break;
                case 4:
                    System.out.println("Enter a number to check if it is prime or not:");
                    int num3 = scanner.nextInt();
                    if (num3 <= 0) {
                        System.out.println("Error: Cannot perform the prime number test for a negative number or 0.");
                        break;
                    }
                    boolean isPrime = isPrime(num3);
                    if (isPrime) {
                        System.out.println(num3 + " is a prime number.");
                    } else {
                        System.out.println(num3 + " is not a prime number.");
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Error: Invalid choice.");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void fibonacci(int n) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        for (int i = 2; i <= n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static int sumOfNNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
