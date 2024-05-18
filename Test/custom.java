class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class Main {
    public static void main(String[] args) {
        try {
            int number = getPositiveNumber();
            System.out.println("You entered: " + number);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getPositiveNumber() throws InvalidInputException {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0) {
            throw new InvalidInputException("Invalid input! Please enter a positive number.");
        }

        return number;
    }
}