import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    static void generateException(String text) {
        System.out.println("Character at index 10: " + text.charAt(10));
    }

    static void handleException(String text) {
        try {
            System.out.println("Character at index 10: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Index is beyond string length!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        System.out.println("\nCalling method to generate StringIndexOutOfBoundsException:");
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\nCalling method to handle StringIndexOutOfBoundsException:");
        handleException(text);

        sc.close();
    }
}

