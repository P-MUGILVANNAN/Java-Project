import java.util.ArrayList;
import java.util.Scanner;

public class SuperMarketBillingSystem {
    private static ArrayList<String> items = new ArrayList<>();
    private static ArrayList<Double> prices = new ArrayList<>();
    private static ArrayList<Integer> quantities = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Adding sample items to the supermarket
        items.add("Apple");
        items.add("Banana");
        items.add("Milk");
        items.add("Bread");
        items.add("Eggs");

        // Adding sample prices for the items
        prices.add(2.0);
        prices.add(1.0);
        prices.add(3.5);
        prices.add(2.0);
        prices.add(4.0);

        while (true) {
            System.out.println("Welcome to the Supermarket Billing System!");
            System.out.println("1. Add item to cart");
            System.out.println("2. View cart");
            System.out.println("3. Generate bill");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                addItemToCart(scanner);
            } else if (choice == 2) {
                viewCart();
            } else if (choice == 3) {
                generateBill();
            } else if (choice == 4) {
                System.out.println("Thank you for shopping with us!");
                scanner.close();
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addItemToCart(Scanner scanner) {
        System.out.println("Available items:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i) + " - $" + prices.get(i));
        }
        System.out.print("Enter the item number: ");
        int itemNumber = scanner.nextInt();

        if (itemNumber >= 1 && itemNumber <= items.size()) {
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();
            quantities.add(quantity);
            System.out.println(quantity + " " + items.get(itemNumber - 1) + "(s) added to cart.");
        } else {
            System.out.println("Invalid item number.");
        }
    }

    private static void viewCart() {
        if (quantities.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Items in cart:");
            for (int i = 0; i < quantities.size(); i++) {
                System.out.println(quantities.get(i) + " " + items.get(i) + "(s) - $" + (prices.get(i) * quantities.get(i)));
            }
        }
    }

    private static void generateBill() {
        double total = 0.0;
        if (!quantities.isEmpty()) {
            System.out.println("Generating bill...");
            for (int i = 0; i < quantities.size(); i++) {
                total += prices.get(i) * quantities.get(i);
            }
            System.out.println("Total bill: $" + total);
            quantities.clear();
        } else {
            System.out.println("Cart is empty. No bill generated.");
        }
    }
}
