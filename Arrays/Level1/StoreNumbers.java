import java.util.Scanner;

class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10]; 
        double total = 0.0;
        int index = 0;
        System.out.println("Enter numbers (max 10). Enter 0 or a negative number to stop:");
        while (true) {
            double input = sc.nextDouble();
            if (input <= 0) {
                break;
            }
            if (index == 10) {
                System.out.println("Array limit reached (10 numbers).");
                break;
            }
            numbers[index] = input;
            index++;
        }
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nTotal sum = " + total);
        sc.close();
    }
}

