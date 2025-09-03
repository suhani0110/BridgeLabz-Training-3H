import java.util.Scanner;

public class VowelConsonantCountDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Count vowels and consonants
        int[] result = countVowelsAndConsonants(text);

        System.out.println("\nTotal Vowels: " + result[0]);
        System.out.println("Total Consonants: " + result[1]);

        scanner.close();
    }

    // Method to check if character is vowel or consonant
    private static String checkCharacterType(char ch) {
        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // difference between 'A' and 'a' is 32
        }

        // Check if it is a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "NotALetter";
    }

    
    private static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        // Loop through characters using charAt()
        int i = 0;
        try {
            while (true) {
                char c = text.charAt(i);
                String type = checkCharacterType(c);

                if (type.equals("Vowel")) {
                    vowels++;
                } else if (type.equals("Consonant")) {
                    consonants++;
                }
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
        }

        return new int[]{vowels, consonants};
    }
}

