import java.util.Scanner;

public class CharArrayCompare {

    static char[] stringToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.next();

        char[] myArr = stringToCharArray(text);

        char[] builtInArr = text.toCharArray();

        boolean result = compareCharArrays(myArr, builtInArr);
        System.out.print("User-defined char array: ");
        for (char c : myArr) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Built-in toCharArray(): ");
        for (char c : builtInArr) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Are both arrays same? " + result);

        sc.close();
    }
}
