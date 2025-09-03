import java.util.Scanner;

public class WordLengthTableDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        //Split words using custom method
        String[] words = customSplit(text);

        //  Create 2D array with word and its length
        String[][] wordLengthTable = generateWordLengthTable(words);

        //  Display in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------------");
        for (int i = 0; i < wordLengthTable.length; i++) {
            String word = wordLengthTable[i][0];
            int length = Integer.parseInt(wordLengthTable[i][1]); // convert back to int for display
            System.out.println(word + "\t\t" + length);
        }

        scanner.close();
    }

    // Method to find length of string without using length()
    private static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
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
        words[wordIndex] = currentWord.toString(); // add last word

        return words;
    }

    // Method to create 2D array of words and lengths
    private static String[][] generateWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i]; // word
            table[i][1] = String.valueOf(findStringLength(words[i])); // length as string
        }

        return table;
    }
}

