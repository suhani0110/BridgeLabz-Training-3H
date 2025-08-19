import java.util.Scanner;

public class LargestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();
        
        // Check for each number being largest
        if (number1 >= number2 &&
