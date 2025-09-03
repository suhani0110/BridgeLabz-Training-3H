import java.util.Scanner;

public class CustomTrimDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with leading and trailing spaces: ");
        String text = scanner.nextLine();

        //  Find trim indices
        int[] indices = findTrimIndices(text);

        //  Create trimmed string using custom substring
        String customTrimmed = customSubstring(text, indices[0], indices[1]);

        //  Use built-in trim() for comparison
        String builtInTrimmed = text.trim();

        //  Compare results
        boolean isEqual = compareStrings(customTrimmed, builtInTrimmed);

        //  Display results
        System.out.println("\nOriginal: [" + text + "]");
        System.out.println("Custom Trimmed: [" + customTrimmed + "]");
        System.out.println("Built-in Trimmed: [" + builtInTrimmed + "]");
        System.out.println("Are both same? " + isEqual);

        scanner.close();
    }

    // Method to find start and end index ignoring spaces
    private static int[] findTrimIndices(String text) {
        int start = 0;
        int end = 0;

        // Find actual length without using length()
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end of string
        }

        // Find start index (first non-space)
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                start = i;
                break;
            }
        }

        // Find end index (last non-space)
        for (int i = length - 1; i >= 0; i--) {
            if (text.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    private static String customSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    private static boolean compareStrings(String str1, String str2) {
        // Find lengths
        int len1 = 0, len2 = 0;
        try {
            while (true) {
                str1.charAt(len1);
                len1++;
            }
        } catch (StringIndexOutOfBoundsException e) {}
        try {
            while (true) {
                str2.charAt(len2);
                len2++;
            }
        } catch (StringIndexOutOfBoundsException e) {}

        // If lengths differ
        if (len1 != len2) {
            return false;
        }

        // Compare characters
        for (int i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

