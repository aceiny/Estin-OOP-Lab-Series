/* Question : Write a program that takes two integer inputs from the command line and performs division. Use a try-catch
block to handle `ArithmeticException` when dividing by zero and print a custom error message. */
public class Exo2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }
}