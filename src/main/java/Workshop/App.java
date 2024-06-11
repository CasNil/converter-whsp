package Workshop;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            DisplayMenu.menu();

            System.out.println("Enter your choice: ");
            String choice = scanner.next();

            if (choice.equals("0")) {
                System.out.println("Thank you for using the currency converter");
                break;
            }

            System.out.println("Enter amount: ");

            if (scanner.hasNextDouble()) {
                double amount = scanner.nextDouble();


                switch (choice) {
                    case "1":
                        Conversion.sekToUsd(amount);
                        break;
                    case "2":
                        Conversion.usdToSek(amount);
                        break;
                    case "3":
                        Conversion.sekToEuro(amount);
                        break;
                    case "4":
                        Conversion.euroToSEK(amount);
                        break;

                    default:
                        System.err.println("Invalid choice. Please try again.");
                        scanner.nextLine();
                        break;
                }
            } else {
                System.err.println("Invalid amount. Please try again.");
                scanner.next();
            }
        }
        scanner.close();
    }
}