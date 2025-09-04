import java.util.Scanner;

class CharacterFrequencyFinder {

    // Method 1: Find frequency of characters and return 2D array
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // ASCII range

        int length = 0;
        try {
            while (true) {
                text.charAt(length); // throws exception when index exceeds
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
        }

        // Count frequency of each character
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Prepare result array
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (frequency[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(frequency[ch]);
                frequency[ch] = 0; // Mark processed
                index++;
            }
        }

        return result;
    }

    // Method 2: Display result in tabular format
    public static void displayFrequency(String[][] frequencyData) {
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("----------------------");
        for (int i = 0; i < frequencyData.length; i++) {
            System.out.printf("%-10s %-10s%n", frequencyData[i][0], frequencyData[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            String[][] frequencyData = findCharacterFrequency(input);

            displayFrequency(frequencyData);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
