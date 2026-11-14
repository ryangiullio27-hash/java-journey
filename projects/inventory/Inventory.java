import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product findProductByName(String searchedName) {
        for (Product product : products) {
            if (product.getName().equals(searchedName)) {
                return product;
            }
        }
        return null;
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double calculateTotalValue() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice() * product.getStock();
        }
        return total;
    }

    public void listProducts() {
        for (Product product : products) {
            System.out.println(product.getName() + " - $ " + product.getPrice() + " - Qty: " + product.getStock());
        }
    }
}
