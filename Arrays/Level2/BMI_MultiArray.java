import java.util.Scanner;

public class BMI_MultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];


        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            double weight;
            do {
                System.out.print("Enter weight (kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Invalid! Weight must be positive.");
                }
            } while (weight <= 0);
            double height;
            do {
                System.out.print("Enter height (m): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Invalid! Height must be positive.");
                }
            } while (height <= 0);

            double bmi = weight / (height * height);
            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) +
                    " | Weight: " + personData[i][0] + " kg" +
                    " | Height: " + personData[i][1] + " m" +
                    " | BMI: " + String.format("%.2f", personData[i][2]) +
                    " | Status: " + weightStatus[i]);
        }
    }
}
