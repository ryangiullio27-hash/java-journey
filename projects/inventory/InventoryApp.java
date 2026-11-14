import java.util.Scanner;

public class InventoryApp {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (choice != 0) {
            System.out.println("Welcome to InventoryApp, choose an option");
            System.out.println("1- Add product");
            System.out.println("2- Edit product");
            System.out.println("3- Remove product");
            System.out.println("4- List products: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // clear the buffer
            } catch (Exception e) {
                System.out.println("Error: enter a valid value!");
                scanner.nextLine();
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter the product name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter the product id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the current stock: ");
                    int stockQuantity = scanner.nextInt();
                    System.out.println("Enter the product price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    Product newProduct = new Product(id, stockQuantity, name, price);
                    inventory.addProduct(newProduct);
                    System.out.println("Product added successfully!");
                    break;
                case 2: {
                    System.out.println("To edit a product, enter its name: ");
                    name = scanner.nextLine();
                    Product foundProduct = inventory.findProductByName(name);

                    if (foundProduct == null) {
                        System.out.println("Product not found!");
                    } else {
                        System.out.println("Enter the new price: ");
                        double newPrice = scanner.nextDouble();
                        System.out.println("Enter the new stock: ");
                        int newStock = scanner.nextInt();
                        foundProduct.setStock(newStock);
                        foundProduct.setPrice(newPrice);
                    }
                    break;
                }
                case 3: {
                    System.out.println("To remove a product, enter its name: ");
                    name = scanner.nextLine();
                    Product foundProduct = inventory.findProductByName(name);

                    if (foundProduct == null) {
                        System.out.println("Product not found!");
                    } else {
                        inventory.removeProduct(foundProduct);
                        System.out.println("Product removed successfully!");
                    }
                    break;
                }
                case 4:
                    System.out.println("---products---");
                    inventory.listProducts();
                    break;
            }
        }
        scanner.close();
    }
}
