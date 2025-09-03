import java.util.Scanner;

public class CharacterTypeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        //  Analyze characters and get 2D array
        String[][] charTypes = analyzeCharacters(text);

        // Display in tabular format
        displayCharacterTypes(charTypes);

        scanner.close();
    }

    // Method to check if character is vowel, consonant, or not a letter
    private static String checkCharacterType(char ch) {
        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // convert to lowercase
        }

        // Check if alphabet
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to analyze characters in string and return 2D array
    private static String[][] analyzeCharacters(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string
        }

        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c); // character
            result[i][1] = checkCharacterType(c); // type
        }
        return result;
    }

    // Method to display the 2D array in tabular format
    private static void displayCharacterTypes(String[][] charTypes) {
        System.out.println("\nCharacter\tType");
        System.out.println("----------------------------");

        for (int i = 0; i < charTypes.length; i++) {
            System.out.println(charTypes[i][0] + "\t\t" + charTypes[i][1]);
        }
    }
}
