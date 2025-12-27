import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ClothingItem item1 = new ClothingItem("Vintage Tee", "Shirts", "M", 25.00);
        ClothingItem item2 = new ClothingItem("Denim Jeans", "Pants", "L", 55.00);

        System.out.println("=== Welcome to the Clothing Store Management System ===");

        System.out.print("Enter your full name: ");
        String name = input.nextLine();
        System.out.print("Enter your email: ");
        String email = input.nextLine();

        Customer userCustomer = new Customer(name, email, 0, false);

        System.out.println("\nAvailable Inventory:");
        System.out.println("1. " + item1.getDescription());
        System.out.println("2. " + item2.getDescription());
        System.out.print("Select an item number to purchase (1-2): ");

        int choice = input.nextInt();
        ClothingItem selectedItem = (choice == 1) ? item1 : item2;

        System.out.print("Enter a discount percentage to apply (0 for none): ");
        double discount = input.nextDouble();
        selectedItem.applyDiscount(discount);

        // 5. Create and Process the Order
        Order userOrder = new Order(5001, selectedItem, userCustomer, "Pending");

        System.out.println("\n--- Finalizing Order ---");
        userOrder.processOrder();
        userOrder.printInvoice();

        System.out.println("\nThank you for shopping, " + userCustomer.getFullName() + "!");
        System.out.println("You earned loyalty points! Total points: " + userCustomer.getLoyaltyPoints());

        input.close();
    }
}