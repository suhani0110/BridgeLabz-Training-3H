import java.util.Scanner;

public class StringLengthDemo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      // Take user input
      System.out.print("Enter a word: ");
      String userInput = scanner.next();

      // Built-in length
      int builtInLength = userInput.length();

      // Custom method length
      int customLength = findStringLength(userInput);

      // Display results
      System.out.println("Original String: " + userInput);
      System.out.println("Built-in length(): " + builtInLength);
      System.out.println("Custom method length: " + customLength);

    } catch (RuntimeException e) {
      System.out.println("A runtime error occurred: " + e.getMessage());
    } finally {
      scanner.close();
    }
  }

  // Method to find string length without using length()
  private static int findStringLength(String inputText) {
    int count = 0;
    try {
      while (true) {
        inputText.charAt(count); // will throw exception when index exceeds
        count++;
      }
    } catch (StringIndexOutOfBoundsException e) {
      // Expected exception -> stop counting
    }
    return count;
  }
}
