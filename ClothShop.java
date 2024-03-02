import java.util.Scanner;

public class ClothShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int total = 0;

        while (true) {
            System.out.println("Welcome to the Cloth Shop!");
            System.out.println("1. T-shirt - $10");
            System.out.println("2. Shirt - $20");
            System.out.println("3. Jeans - $30");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                total += 10;
                System.out.println("Added T-shirt to your cart.");
            } else if (choice == 2) {
                total += 20;
                System.out.println("Added Shirt to your cart.");
            } else if (choice == 3) {
                total += 30;
                System.out.println("Added Jeans to your cart.");
            } else if (choice == 4) {
                System.out.println("Your total is $" + total);
                System.out.println("Thank you for shopping with us!");
                break;
            } else if (choice == 5) {
                System.out.println("Exiting the Cloth Shop. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
