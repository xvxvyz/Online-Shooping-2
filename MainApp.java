import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek produk
        Electronics laptop1 = new Electronics("Laptop Acer", 8000000, "Acer", "Aspire 5", 1.8);
        Clothing kaos1 = new Clothing("Kaos Polos", 50000, Size.M, "Merah");

        // Membuat objek customer
        Customer customer1 = new Customer("Budi Santoso", "budi.s@example.com");

        // Membuat objek shopping cart
        ShoppingCart cart1 = new ShoppingCart();

        // Menambahkan produk ke keranjang
        cart1.addItem(laptop1, 1);
        cart1.addItem(kaos1, 2);

        // Menampilkan detail produk
        System.out.println("\n--- Detail Produk ---");
        System.out.println();
        laptop1.displayDetails();
        System.out.println();
        kaos1.displayDetails();
        System.out.println();

        // Menampilkan harga setelah diskon
        System.out.println("\n--- Harga Setelah Diskon ---");
        if (laptop1 instanceof Discountable) {
            double discountedPrice = ((Discountable) laptop1).getDiscountedPrice(10); // Diskon 10%
            System.out.println(laptop1.getName() + " harga setelah diskon 10%: Rp" + discountedPrice);
        }

        if (kaos1 instanceof Discountable) {
            double discountedPrice = ((Discountable) kaos1).getDiscountedPrice(20); // Diskon 20%
            System.out.println(kaos1.getName() + " harga setelah diskon 20%: Rp" + discountedPrice);
        }

        // Membuat objek payment gateway
        PaymentGateway creditCardGW = new CreditCardPaymentGateway();

        // Membuat objek order
        Order order1 = new Order(cart1, customer1, creditCardGW);

        // Memproses pesanan
        order1.processOrder();

        scanner.close();
    }
}
