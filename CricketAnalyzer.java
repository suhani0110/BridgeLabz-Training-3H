import java.util.Scanner;

public class CricketAnalyzer {

    // Method to calculate total runs
    public static int getTotalRuns(int[] runs) {
        int total = 0;
        for (int run : runs) {
            total += run;3
        }
        return total;
    }

    // Method to calculate average runs per over
    public static double getAverageRuns(int[] runs) {
        return (double) getTotalRuns(runs) / runs.length;
    }

    // Method to find the highest scoring over
    public static int getHighestOver(int[] runs) {
        int maxRuns = runs[0];
        int over = 1;
        for (int i = 1; i < runs.length; i++) {
            if (runs[i] > maxRuns) {
                maxRuns = runs[i];
                over = i + 1; // over number (1-based)
            }
        }
        return over;
    }

    // Method to find the lowest scoring over
    public static int getLowestOver(int[] runs) {
        int minRuns = runs[0];
        int over = 1;
        for (int i = 1; i < runs.length; i++) {
            if (runs[i] < minRuns) {
                minRuns = runs[i];
                over = i + 1;
            }
        }
        return over;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of overs: ");
        int n = sc.nextInt();
        int[] runs = new int[n];

        System.out.println("Enter runs scored in each over:");
        for (int i = 0; i < n; i++) {
            runs[i] = sc.nextInt();
        }

        // Analysis
        int total = getTotalRuns(runs);
        double avg = getAverageRuns(runs);
        int highOver = getHighestOver(runs);
        int lowOver = getLowestOver(runs);

        // Output
        System.out.println("\n--- Cricket Score Analysis ---");
        System.out.println("Total Runs: " + total);
        System.out.println("Average Runs per Over: " + avg);
        System.out.println("Highest scoring over: Over " + highOver + " (" + runs[highOver - 1] + " runs)");
        System.out.println("Lowest scoring over: Over " + lowOver + " (" + runs[lowOver - 1] + " runs)");
    }
}
