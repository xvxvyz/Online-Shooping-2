# Online-Shooping-2
Project ke 2 Online Shoping
📦 Java Shopping App
Aplikasi belanja sederhana berbasis Java menggunakan konsep Object-Oriented Programming (OOP). Program ini memungkinkan pengguna untuk membuat produk, menambahkannya ke keranjang, menerapkan diskon, dan memproses pesanan menggunakan gateway pembayaran.

🚀 Fitur
📦 Menambahkan produk elektronik dan pakaian

🛒 Menyimpan produk ke dalam keranjang belanja

🎁 Menghitung harga setelah diskon

💳 Memproses pembayaran menggunakan sistem PaymentGateway

👤 Menyimpan informasi pelanggan

🧱 Struktur Kelas
Kelas	Deskripsi
Product	Kelas abstrak untuk semua jenis produk
Electronics	Subkelas Product, mewakili produk elektronik
Clothing	Subkelas Product, mewakili pakaian
Discountable	Interface untuk produk yang bisa diberi diskon
ShoppingCart	Menyimpan item dan menghitung total harga
Customer	Menyimpan informasi pelanggan
Order	Mewakili pesanan, memproses pembayaran
PaymentGateway	Interface untuk metode pembayaran
CreditCardPaymentGateway	Implementasi PaymentGateway untuk kartu kredit
Size	Enum ukuran pakaian (S, M, L, XL)

📂 Struktur File
mathematica
Copy
Edit
ShoppingApp/
│
├── MainApp.java
├── Product.java
├── Electronics.java
├── Clothing.java
├── Discountable.java
├── ShoppingCart.java
├── Customer.java
├── Order.java
├── PaymentGateway.java
├── CreditCardPaymentGateway.java
├── Size.java
└── README.md
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
yaml
Copy
Edit
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
Pembayaran berhasil!
📌 Catatan
Proyek ini dibuat tanpa database atau antarmuka grafis.

Fokus pada konsep dasar OOP: inheritance, polymorphism, interface, dan encapsulation.
