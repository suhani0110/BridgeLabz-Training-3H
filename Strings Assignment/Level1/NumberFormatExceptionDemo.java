import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();

        // First call: Method without handling -> causes runtime exception

        // Second call: Method with handling
        handleNumberFormatException(userInput);

        scanner.close();
    }

    // Method that generates NumberFormatException without handling
    private static void generateException(String inputText) {
        // This will throw NumberFormatException if input is not numeric
        int number = Integer.parseInt(inputText);
        System.out.println("Converted number: " + number);
    }

    // Method that demonstrates handling NumberFormatException
    private static void handleNumberFormatException(String inputText) {
        try {
            int number = Integer.parseInt(inputText); // May throw exception
            System.out.println("Successfully converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input must be a valid integer. " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("A runtime error occurred: " + e.getMessage());
        }
    }
}

