import java.time.LocalDateTime;

abstract class Product {
    private String name;
    private double price;
    private final LocalDateTime createdAt;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.createdAt = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void displayDetails() {
        System.out.println("Nama: " + name);
        System.out.println("Harga: Rp" + price);
        System.out.println("Dibuat pada: " + createdAt);
    }

    public abstract String getCategory();
}
