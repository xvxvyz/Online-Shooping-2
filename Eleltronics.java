package ecommerce;

public class Electronics extends Product {
    public Electronics(String name, double price, int stock) {
        super(name, price, stock);
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }
}
