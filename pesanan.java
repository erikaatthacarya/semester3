public class pesanan extends menu{
    private String namaPelanggan;
    private List<String> daftarPesanan;
    private double totalHarga;

    public pesanan(String nama, String alamat, String namaPelanggan) {
        super(nama, alamat);
        this.namaPelanggan = namaPelanggan;
        daftarPesanan = new ArrayList<>();
    }

    public void tambahPesanan(String pesanan, double harga) {
        daftarPesanan.add(pesanan);
        totalHarga += harga;
    }

    public void tampilkanPesanan() {
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Daftar Pesanan:");
        for (String pesanan : daftarPesanan) {
            System.out.println("- " + pesanan);
        }
        System.out.println("Total Harga: Rp." + totalHarga);
    }
}
