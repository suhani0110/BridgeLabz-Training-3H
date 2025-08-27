//package 27-08-2025;

import java.util.Scanner;

public class RailwayReservation {

    // Constants
    static final int MAX_SEATS = 5; // Maximum number of confirmed seats
    static final int MAX_WAITING_LIST = 3; // Maximum waiting list

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Train options
        System.out.println("Select Train:");
        System.out.println("1. Express Train - Fare: ₹500");
        System.out.println("2. Superfast Train - Fare: ₹800");
        System.out.println("3. Bullet Train - Fare: ₹1200");

        int trainChoice;
        int fare = 0;

        // Use switch-case to show fare
        System.out.print("Enter train option (1-3): ");
        trainChoice = scanner.nextInt();

        switch (trainChoice) {
            case 1:
                fare = 500;
                System.out.println("You selected Express Train. Fare: ₹" + fare);
                break;
            case 2:
                fare = 800;
                System.out.println("You selected Superfast Train. Fare: ₹" + fare);
                break;
            case 3:
                fare = 1200;
                System.out.println("You selected Bullet Train. Fare: ₹" + fare);
                break;
            default:
                System.out.println("Invalid train option.");
                return;
        }

        int confirmedSeats = 0;
        int waitingList = 0;
        boolean bookingOpen = true;

        do {
            // Take number of bookings
            System.out.print("\nEnter number of passengers to book: ");
            int numPassengers = scanner.nextInt();

            for (int i = 1; i <= numPassengers; i++) {
                if (confirmedSeats < MAX_SEATS) {
                    confirmedSeats++;
                    System.out.println("Passenger " + i + " - Booking Confirmed. Seat No: " + confirmedSeats);
                } else if (waitingList < MAX_WAITING_LIST) {
                    waitingList++;
                    System.out.println("Passenger " + i + " - Added to Waiting List. WL No: " + waitingList);
                } else {
                    System.out.println("Passenger " + i + " - No seat available. Booking Rejected.");
                }

                // Stop if both seats and waiting list are full
                if (confirmedSeats >= MAX_SEATS && waitingList >= MAX_WAITING_LIST) {
                    bookingOpen = false;
                    break;
                }
            }

            // Continue while there is room for bookings
        } while (bookingOpen);

        System.out.println("\nTrain is fully booked.");
        System.out.println("Total Confirmed: " + confirmedSeats);
        System.out.println("Total Waiting List: " + waitingList);
        scanner.close();
    }
}