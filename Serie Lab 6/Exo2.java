/* Question : Write a program that takes two integer inputs from the command line and performs division. Use a try-catch
block to handle `ArithmeticException` when dividing by zero and print a custom error message. */

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer ");
        int a = scanner.nextInt();
        System.out.println("Enter second integer ");
        int b = scanner.nextInt();
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
        scanner.close();
    }
}