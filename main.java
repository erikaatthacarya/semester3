import PBO.KUIS.Pesanan;

public class main {
    public static void main(String[] args) {
        Pesanan pesanan = new Pesanan("Cafe ER/", "Jalan Raya No. 1", "John Doe");
        pesanan.tambahMakanan("Nasi Goreng", 15000);
        pesanan.tambahMakanan("Teh Manis", 5000);
        pesanan.tambahMakanan("Nasi Goreng", 15000);
        pesanan.tambahMakanan("Teh Manis", 5000);

        pesanan.tampilkanInfo();
        pesanan.tampilkanInfo();
        pesanan.tampilkanInfo();
    }
}
