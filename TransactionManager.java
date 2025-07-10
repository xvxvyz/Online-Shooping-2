ackage ecommerce;

public class TransactionManager {
    public boolean buyProduct(Product p, int qty) {
        if (p.getStock() >= qty) {
            p.setStock(p.getStock() - qty);
            System.out.println("Pembelian berhasil: " + p.getName() + " x" + qty);
            return true;
        } else {
            System.out.println("Stok tidak cukup!");
            return false;
        }
    }
}

