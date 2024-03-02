import java.util.Scanner;

 class TrainBooking {
     static boolean[] seats = new boolean[10]; // 10 seats in the train  [1,2,3,4,5,6,7,8,9,10]

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while(true) {
            System.out.println("1. Book Ticket for Train");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. View Available Seats");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bookTicket();
                    break;
                case 2:
                    cancelTicket();
                    break;
                case 3:
                    viewAvailableSeats();
                    break;
                case 4:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        } 
        
    }

     static void bookTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Booking ticket...");
        System.out.println("Enter seat number (1-10): ");
        int seatNumber = scanner.nextInt();
        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid seat number. Please enter a seat number between 1 and 10.");
            return;
        }
        if (seats[seatNumber - 1]) {
            System.out.println("Seat " + seatNumber + " is already booked. Please select another seat.");
        } else {
            seats[seatNumber - 1] = true;
            System.out.println("Ticket booked successfully for seat " + seatNumber + ".");
        }
    }

     static void cancelTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Canceling ticket...");
        System.out.println("Enter seat number (1-10): ");
        int seatNumber = scanner.nextInt();
        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid seat number. Please enter a seat number between 1 and 10.");
            return;
        }
        if (!seats[seatNumber - 1]) {
            System.out.println("Seat " + seatNumber + " is not booked. No ticket to cancel.");
        } else {
            seats[seatNumber - 1] = false;
            System.out.println("Ticket canceled successfully for seat " + seatNumber + ".");
        }
    }

     static void viewAvailableSeats() {
        System.out.println("Available seats:");
        for (int i = 0; i < seats.length; i++) {
            if (!seats[i]) {                //(!seats[0])    =1
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
    }
}
