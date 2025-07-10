package ecommerce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductManager pm = new ProductManager();
        TransactionManager tm = new TransactionManager();

        pm.addProduct(new Clothing("Kaos Polos", 50000, 10));
        pm.addProduct(new Electronics("Headset", 150000, 5));

        int pilihan;
        do {
            System.out.println("\n=== E-Commerce Console ===");
            System.out.println("1. Lihat Produk");
            System.out.println("2. Tambah Produk");
            System.out.println("3. Beli Produk");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt(); input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\nDaftar Produk:");
                    for (Product p : pm.getAllProducts()) {
                        System.out.println("- " + p);
                    }
                    break;

                case 2:
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Harga: ");
                    double harga = input.nextDouble();
                    System.out.print("Stok: ");
                    int stok = input.nextInt(); input.nextLine();
                    System.out.print("Kategori (1=Clothing, 2=Electronics): ");
                    int kategori = input.nextInt();

                    Product newProduct = (kategori == 1)
                        ? new Clothing(nama, harga, stok)
                        : new Electronics(nama, harga, stok);

                    pm.addProduct(newProduct);
                    System.out.println("Produk berhasil ditambahkan.");
                    break;

                case 3:
                    System.out.print("Nama Produk: ");
                    String namaBeli = input.nextLine();
                    Product p = pm.findByName(namaBeli);

                    if (p == null) {
                        System.out.println("Produk tidak ditemukan!");
                        break;
                    }

                    System.out.print("Jumlah: ");
                    int qty = input.nextInt();
                    tm.buyProduct(p, qty);
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
