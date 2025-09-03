import java.util.Scanner;

public class StringSplitDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        // Built-in split
        String[] builtInWords = text.split(" ");

        // Custom split
        String[] customWords = customSplit(text);

        // Compare results
        boolean isEqual = compareStringArrays(builtInWords, customWords);

        // Display results
        System.out.println("\nBuilt-in split() result:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nCustom split() result:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both results same? " + isEqual);

        scanner.close();
    }

    // Method to find length of string without length()
    private static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end of string
        }
        return count;
    }

    // Method to split string without using split()
    private static String[] customSplit(String text) {
        int length = findStringLength(text);

        // Step 1: Count words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Extract words
        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                words[wordIndex++] = currentWord.toString();
                currentWord = new StringBuilder();
            } else {
                currentWord.append(c);
            }
        }
        words[wordIndex] = currentWord.toString(); // last word

        return words;
    }

    // Method to compare two string arrays
    private static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}
