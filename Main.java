// Main.java
package supermarket;

import supermarket.inventory.InventoryManager;
import supermarket.purchase.PurchaseManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventoryManager inventoryManager = new InventoryManager();
        PurchaseManager purchaseManager = new PurchaseManager();

        while (true) {
            System.out.println("Supermarket Materials Information System");
            System.out.println("1. Manage Inventory");
            System.out.println("2. Manage Purchases");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    inventoryManager.manageInventory();
                    break;
                case 2:
                    purchaseManager.managePurchases();
                    break;
                case 3:
                    System.out.println("Exiting the system.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
