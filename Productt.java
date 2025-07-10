package ecommerce;

public abstract class Product {
    protected String name;
    protected double price;
    protected int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    public void setStock(int stock) { this.stock = stock; }

    public abstract String getCategory();

    @Override
    public String toString() {
        return name + " - " + getCategory() + " - Rp" + price + " - Stok: " + stock;
    }
}

