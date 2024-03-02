import java.util.Scanner;

public class CopyCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Copycat is ready! Type something and press enter. Type 'exit' to quit.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println(input);
        }

        scanner.close();
    }
}
