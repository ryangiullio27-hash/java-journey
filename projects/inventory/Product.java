public class Product {
    private int id;
    private int stock;
    private String name;
    private double price;

    public Product(int id, int stock, String name, double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero!");
        }
        if (stock < 0) {
            throw new IllegalArgumentException("Stock cannot be negative!");
        }

        this.id = id;
        this.price = price;
        this.stock = stock;
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        if (price <= 0) throw new IllegalArgumentException("Invalid price!");
        this.price = price;
    }

    public void setStock(int stock) {
        if (stock < 0) throw new IllegalArgumentException("Invalid stock!");
        this.stock = stock;
    }
}
