package Workshop;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Currency converter App: ");
            System.out.println("1. Convert SEK to USD");
            System.out.println("2. Convert USD to SEK");
            System.out.println("3. Convert SEK to Euro");
            System.out.println("4. Convert Euro to SEK");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            System.out.println("Enter amount: ");
            double amount = scanner.nextDouble();

            switch (choice) {
                case 1:
                    Conversion.SEK_to_USD(amount);
                    break;
                case 2:
                    Conversion.USD_to_SEK(amount);
                    break;
                case 3:
                    Conversion.SEK_to_Euro(amount);
                    break;
                case 4:
                    Conversion.Euro_to_SEK(amount);
                    break;
                case 5:
                    System.out.println("Thank you for using the currency converter!");
                    scanner.close();

                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }
    }
}
