
//package 27-08-2025;
import java.util.Scanner;

public class ATMtransaction {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int ans = calculateBalance(arr);
    System.out.println(ans);
    if (ans < 0) {
      System.out.println("Overdraft");
    }
  }

  public static int calculateBalance(int[] arr) {
    int balance = 0;
    for (int i = 0; i < arr.length; i++) {
      int t = arr[i];
      if (t > 0) {
        balance = balance + t;
      } else {
        balance = balance + t;
      }
    }
    return balance;
  }

}
