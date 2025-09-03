import java.util.Scanner;

public class UppercaseConversionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter text: ");
            String userInput = scanner.nextLine();

            // Using built-in method
            String builtInUppercase = userInput.toUpperCase();

            // Using custom method
            String customUppercase = convertToUppercase(userInput);

            // Compare both results
            boolean isEqual = compareStrings(builtInUppercase, customUppercase);

            System.out.println("Original Text: " + userInput);
            System.out.println("Built-in Uppercase: " + builtInUppercase);
            System.out.println("Custom Uppercase: " + customUppercase);
            System.out.println("Are both results equal? " + isEqual);

        } catch (RuntimeException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static String convertToUppercase(String inputText) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase
                ch = (char) (ch - 32);
            }

            result.append(ch);
        }
        return result.toString();
    }

    private static boolean compareStrings(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

