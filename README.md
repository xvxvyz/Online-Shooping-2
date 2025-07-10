# 🛒 Java Online Shopping Console App

Aplikasi belanja sederhana berbasis **Java Console** yang menggabungkan dua proyek:

1. **E-Commerce Console App** – Menyediakan login multi-user, keranjang, checkout.
2. **Online Shopping Java App** – Menambahkan fitur diskon, sistem pemesanan, dan payment gateway.

Aplikasi ini dibangun sepenuhnya dengan prinsip **Object-Oriented Programming (OOP)** seperti inheritance, polymorphism, encapsulation, dan interfaces.

---

## ✨ Fitur Utama

### 📦 Manajemen Produk
- Tambah produk **elektronik** dan **pakaian**
- Menyimpan produk ke dalam **keranjang belanja**
- Dukungan ukuran pakaian melalui `Enum Size`

### 🧺 Keranjang & Checkout
- Keranjang menyimpan item dan menghitung total
- Mendukung diskon otomatis melalui `Discountable` interface

### 👥 Login Multi-User
- Beberapa pengguna dengan username dan password berbeda
- Login diperlukan untuk checkout

### 🎁 Diskon Otomatis
- Diskon 10% untuk produk elektronik
- Diskon 20% untuk produk pakaian

### 💳 Gateway Pembayaran
- Menggunakan interface `PaymentGateway`
- Implementasi `CreditCardPaymentGateway` untuk simulasi pembayaran

### 👤 Manajemen Pelanggan
- Data pelanggan disimpan melalui class `Customer`
- Pesanan dicatat melalui class `Order`

---

## 🧱 Struktur Kelas

| Kelas / Interface             | Deskripsi                                                                 |
|------------------------------|---------------------------------------------------------------------------|
| `Product`                    | Kelas abstrak dasar semua produk                                          |
| `Electronics`, `Clothing`    | Subclass `Product` (kategori produk)                                      |
| `Discountable`               | Interface untuk produk yang mendapatkan diskon                            |
| `ShoppingCart`               | Menyimpan daftar produk yang dibeli                                       |
| `Customer`                   | Menyimpan data pelanggan                                                  |
| `Order`                      | Mewakili satu transaksi / pesanan                                         |
| `PaymentGateway`             | Interface sistem pembayaran                                               |
| `CreditCardPaymentGateway`   | Implementasi pembayaran via kartu kredit                                  |
| `User`, `UserManager`        | Sistem login multi-user                                                   |
| `Size`                       | Enum ukuran pakaian (S, M, L, XL)                                          |

---

## 📁 Struktur Folder

L, XL)

📂 Struktur File

| Lokasi                   | Nama File / Folder              | Deskripsi                                        |
| ------------------------ | ------------------------------- | ------------------------------------------------ |
| `OnlineShoppingApp/`     | `README.md`                     | Dokumentasi proyek                               |
| `OnlineShoppingApp/src/` | `ecommerce/`                    | Package utama untuk seluruh class Java           |
| `ecommerce/`             | `MainApp.java`                  | Program utama (entry point)                      |
| `ecommerce/`             | `Product.java`                  | Kelas abstrak dasar produk                       |
| `ecommerce/`             | `Clothing.java`                 | Subclass `Product`, untuk pakaian                |
| `ecommerce/`             | `Electronics.java`              | Subclass `Product`, untuk elektronik             |
| `ecommerce/`             | `Discountable.java`             | Interface untuk produk yang bisa diberi diskon   |
| `ecommerce/`             | `Size.java`                     | Enum ukuran pakaian (S, M, L, XL)                |
| `ecommerce/`             | `CartItem.java`                 | Objek item dalam keranjang                       |
| `ecommerce/`             | `ShoppingCart.java`             | Menyimpan daftar produk dalam keranjang          |
| `ecommerce/`             | `Customer.java`                 | Menyimpan data pelanggan                         |
| `ecommerce/`             | `Order.java`                    | Mengelola proses pemesanan dan checkout          |
| `ecommerce/`             | `PaymentGateway.java`           | Interface sistem pembayaran                      |
| `ecommerce/`             | `CreditCardPaymentGateway.java` | Implementasi `PaymentGateway` untuk kartu kredit |
| `ecommerce/`             | `User.java`                     | Data user login                                  |
| `ecommerce/`             | `UserManager.java`              | Autentikasi & penyimpanan user                   |


🧪 Cara Menjalankan
Kompilasi semua file Java:

bash
Copy
Edit
javac *.java
Jalankan program utama:

bash
Copy
Edit
java MainApp
Output akan menampilkan:

Detail produk

Harga setelah diskon

Ringkasan keranjang

Proses pembayaran

📝 Contoh Output
--- Detail Produk ---
Nama: Laptop Acer
Harga: Rp8000000.0
Merk: Acer
Model: Aspire 5
Berat: 1.8 kg

Nama: Kaos Polos
Harga: Rp50000.0
Ukuran: M
Warna: Merah

--- Harga Setelah Diskon ---
Laptop Acer harga setelah diskon 10%: Rp7200000.0
Kaos Polos harga setelah diskon 20%: Rp40000.0

--- Proses Pesanan ---
Pelanggan: Budi Santoso
Rincian keranjang:
Laptop Acer x1 = Rp8000000.0
Kaos Polos x2 = Rp100000.0
Total: Rp8100000.0

Memproses pembayaran sebesar Rp8100000.0 melalui kartu kredit...
✅ Pembayaran berhasil!

📌 Catatan
Proyek ini dibuat tanpa database atau antarmuka grafis.

Fokus pada konsep dasar OOP: inheritance, polymorphism, interface, dan encapsulation.

🔐 Login Info Default


| Username | Password |
| -------- | -------- |
| admin    | 123      |
| natan    | abc      |


Nama Kelompok
1. Aditya Dzaky Widiantoro ( 50424035 )

2. Ahmad Nagata Aziz ( 50424066 )

