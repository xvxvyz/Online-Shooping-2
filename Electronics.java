// Concrete class Electronics (turunan dari Product dan mengimplementasikan Discountable)
class Electronics extends Product implements Discountable {
    private String brand;
    private String model;
    private Specification specs; // Instance dari inner class Specification

    // Inner class Specification
    public class Specification {
        private double weight;
        private String deviceBrand;

        public Specification(double weight, String deviceBrand) {
            this.weight = weight;
            this.deviceBrand = deviceBrand;
        }

        public double getWeight() {
            return weight;
        }

        public String getDeviceBrand() {
            return deviceBrand;
        }

        public String getSpecs() {
            return "Berat: " + weight + " kg, Merek Perangkat: " + deviceBrand;
        }
    }

    public Electronics(String name, double price, String brand, String model, double weight) {
        super(name, price);
        this.brand = brand;
        this.model = model;
        this.specs = new Specification(weight, brand); // Membuat instance Specification saat Electronics dibuat
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Specification getSpecs() {
        return specs;
    }

    @Override
    public String getCategory() {
        return "Elektronik";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Kategori: " + getCategory());
        System.out.println("Merek: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Spesifikasi: " + specs.getSpecs()); // Menampilkan spesifikasi
    }

    @Override
    public double getDiscountedPrice(double discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            System.out.println("Persentase diskon tidak valid.");
            return getPrice();
        }
        double discountAmount = getPrice() * (discountPercentage / 100);
        return getPrice() - discountAmount;
    }
}
