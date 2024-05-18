/* Question : Write a program that reads two integers from the command line and performs division. Handle
`NumberFormatException` if the input is not an integer, and `ArithmeticException` if there is division by zero. */

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer ");
        int a = scanner.nextInt();
        System.out.println("Enter second integer ");
        int b = scanner.nextInt();
        try{
            System.out.println(a / b);

        }catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed.");
        }catch(NumberFormatException e){
            System.out.println("Input is not an integer.");
        }
        catch(Exception e){
            System.out.println("An error occurred.");
        }
        scanner.close();

    }
}