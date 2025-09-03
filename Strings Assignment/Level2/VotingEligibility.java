import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);

        String[][] result = checkVotingEligibility(ages);

        displayResult(result);

        sc.close();
    }

    // Generate random 2-digit ages for n students
    private static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // 2-digit age (10–99)
        }
        return ages;
    }

    // Check voting eligibility and return 2D array
    private static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); // Age
            if (ages[i] < 0) {
                result[i][1] = "false"; // Negative ages cannot vote
            } else if (ages[i] >= 18) {
                result[i][1] = "true"; // Eligible
            } else {
                result[i][1] = "false"; // Not eligible
            }
        }
        return result;
    }

    // Display results in tabular format
    private static void displayResult(String[][] result) {
        System.out.printf("%-10s %-15s%n", "Age", "Can Vote?");
        System.out.println("-----------------------");
        for (int i = 0; i < result.length; i++) {
            int age = Integer.parseInt(result[i][0]); // Convert String back to int
            System.out.printf("%-10d %-15s%n", age, result[i][1]);
        }
    }
}
