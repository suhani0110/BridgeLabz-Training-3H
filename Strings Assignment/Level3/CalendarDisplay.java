
import java.util.Scanner;

public class CalendarDisplay {
    static String[] months = { "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December" };

    static int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    static int getFirstDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        sc.close();

        if (month == 2 && isLeapYear(year)) daysInMonth[2] = 29;

        System.out.println("     " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int startDay = getFirstDay(month, year);
        for (int i = 0; i < startDay; i++) System.out.print("    ");

        for (int day = 1; day <= daysInMonth[month]; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0) System.out.println();
        }
    }
}
