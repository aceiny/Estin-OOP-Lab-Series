/* Response :
    No, it's not possible to manage syntax errors using exceptions in Java.
    Exceptions are used for handling runtime errors, 
    not compile-time errors. Syntax errors are compile-time errors,
    which means they occur before the code is executed. 
    The Java compiler checks the syntax of your code before it's run,
    and if there are any syntax errors, it will refuse to compile the code until they're fixed. */
public class Exo1 {
    public static void main(String[] args) {
        int number = 10 ; // Added missing semicolon
        System.out.println("Number is: " + number);
    }
}