import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FortuneTeller {

    public static void main(String[] args) {
        ArrayList<String> fortunes = new ArrayList<>();
        fortunes.add("You will find great success in the near future.");
        fortunes.add("A surprise is waiting for you around the corner.");
        fortunes.add("Take a chance, it will pay off.");
        fortunes.add("Your hard work will soon be rewarded.");
        fortunes.add("Good things come to those who wait.");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Fortune Teller! Press enter to get your fortune or type 'exit' to quit.");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            int index = random.nextInt(fortunes.size());
            String fortune = fortunes.get(index);
            System.out.println("Your fortune is: " + fortune);
        }

        scanner.close();
    }
}
