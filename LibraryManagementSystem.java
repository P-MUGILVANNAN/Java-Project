import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> books = new ArrayList<>();

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Library Management System");
            System.out.println("1. Add a book");
            System.out.println("2. Display all books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the book: ");
                    String bookToAdd = scanner.nextLine();
                    books.add(bookToAdd);
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No books in the library!");
                    } else {
                        System.out.println("Books in the library:");
                        for (String book : books) {
                            System.out.println("- " + book);
                        }
                    }
                    break;
                case 3:
                    isRunning = false;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
        }

        scanner.close();
    }
}