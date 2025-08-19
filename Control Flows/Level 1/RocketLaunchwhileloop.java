import java.util.Scanner;

public class RocketLaunchwhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter countdown start value: ");
        int counter = sc.nextInt();

        // Countdown loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // decrement
        }

        // After countdown
        System.out.println("Liftoff! 🚀");

        sc.close();
    }
}
