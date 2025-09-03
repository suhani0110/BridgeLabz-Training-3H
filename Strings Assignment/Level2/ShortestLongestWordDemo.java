import java.util.Scanner;

public class ShortestLongestWordDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        // Step 1: Split words
        String[] words = customSplit(text);

        // Step 2: Build word-length table
        String[][] wordLengthTable = generateWordLengthTable(words);

        // Step 3: Find shortest & longest
        int[] indexes = findShortestAndLongest(wordLengthTable);

        // Step 4: Display results
        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------------");
        for (int i = 0; i < wordLengthTable.length; i++) {
            String word = wordLengthTable[i][0];
            int length = Integer.parseInt(wordLengthTable[i][1]);
            System.out.println(word + "\t\t" + length);
        }

        System.out.println("\nShortest Word: " + wordLengthTable[indexes[0]][0] 
                         + " (Length: " + wordLengthTable[indexes[0]][1] + ")");
        System.out.println("Longest Word: " + wordLengthTable[indexes[1]][0] 
                         + " (Length: " + wordLengthTable[indexes[1]][1] + ")");

        scanner.close();
    }

    // Method to find string length without length()
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

    // Method to split text without split()
    private static String[] customSplit(String text) {
        int length = findStringLength(text);

        //  count words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        //  extract words
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
        words[wordIndex] = currentWord.toString();

        return words;
    }

    // Method to generate word-length table
    private static String[][] generateWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return table;
    }

    // Method to find shortest & longest word index
    private static int[] findShortestAndLongest(String[][] table) {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]);
            int minLength = Integer.parseInt(table[minIndex][1]);
            int maxLength = Integer.parseInt(table[maxIndex][1]);

            if (length < minLength) {
                minIndex = i;
            }
            if (length > maxLength) {
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }
}
