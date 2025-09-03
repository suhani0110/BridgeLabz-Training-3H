import java.util.Scanner;

public class LowercaseConversionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter text: ");
            String userInput = scanner.nextLine();

            // Using built-in method
            String builtInLowercase = userInput.toLowerCase();

            // Using custom method
            String customLowercase = convertToLowercase(userInput);

            // Compare both results
            boolean isEqual = compareStrings(builtInLowercase, customLowercase);

            System.out.println("Original Text: " + userInput);
            System.out.println("Built-in Lowercase: " + builtInLowercase);
            System.out.println("Custom Lowercase: " + customLowercase);
            System.out.println("Are both results equal? " + isEqual);

        } catch (RuntimeException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Method to convert text to lowercase using ASCII logic
    private static String convertToLowercase(String inputText) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase to lowercase
                ch = (char) (ch + 32);
            }

            result.append(ch);
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
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

