package ecommerce;

public class Clothing extends Product {
    public Clothing(String name, double price, int stock) {
        super(name, price, stock);
    }

    @Override
    public String getCategory() {
        return "Clothing";
    }
}
