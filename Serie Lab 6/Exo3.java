/* Question : Create a custom exception called `InvalidInputException` that is thrown when an input value is negative. Write a
program that prompts the user for a positive integer and uses the custom exception to handle invalid input. */


import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message) ; 
    }
}
public class Exo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number = scanner.nextInt();

        try {
            if (number < 0) {
                throw new InvalidInputException("Negative input is not allowed.");
            }
            System.out.println("You entered: " + number);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}