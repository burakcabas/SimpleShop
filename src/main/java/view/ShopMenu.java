package view;

import java.util.Scanner;

public class ShopMenu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        int choice;

        do {
            System.out.println("\nShop Menu:");
            System.out.println("1. View Products");
            System.out.println("2. Resources");
            System.out.println("3. Information");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Call the method to display products (implementation details omitted)
                    System.out.println("Displaying products...");
                    break;
                case 2:
                    // Handle resources section (implementation details omitted)
                    System.out.println("Accessing resources...");
                    break;
                case 3:
                    // Display shop information (implementation details omitted)
                    System.out.println("Showing shop information...");
                    break;
                case 4:
                    System.out.println("Exiting shop menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4); // Exit loop when user chooses option 4
    }
}
