import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine(); 

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // First call: generates exception without handling
        // generateException(names);

        // Second call: demonstrates handling
        handleArrayIndexOutOfBounds(names);

        scanner.close();
    }

    // Method that generates ArrayIndexOutOfBoundsException without handling
    private static void generateException(String[] namesArray) {
        System.out.println("Accessing invalid index: " + namesArray[namesArray.length]);
    }

    // Method that demonstrates handling ArrayIndexOutOfBoundsException
    private static void handleArrayIndexOutOfBounds(String[] namesArray) {
        try {
            System.out.println("Accessing invalid index: " + namesArray[namesArray.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access index outside array bounds. " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("A runtime error occurred: " + e.getMessage());
        }
    }
}
