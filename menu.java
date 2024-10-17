public class menu extends cafe{

    private List<String> daftarMakanan;
    private List<String> daftarMinuman;
    private double hargaMakanan;
    private double hargaMinuman;

    public menu(String nama, String alamat) {
        super(nama, alamat);
        daftarMakanan = new ArrayList<>();
        daftarMinuman = new ArrayList<>();
    }

    public void tambahMakanan(String makanan, double harga) {
        daftarMakanan.add(makanan);
        hargaMakanan += harga;
    }

    public void tambahMinuman(String minuman, double harga) {
        daftarMinuman.add(minuman);
        hargaMinuman += harga;
    }

    public void tampilkanMenu() {
        System.out.println("Daftar Makanan:");
        for (String makanan : daftarMakanan) {
            System.out.println("- " + makanan);
        }
        System.out.println("Daftar Minuman:");
        for (String minuman : daftarMinuman) {
            System.out.println("- " + minuman);
        }
        System.out.println("Harga Makanan: Rp." + hargaMakanan);
        System.out.println("Harga Minuman: Rp." + hargaMinuman);
    }
}
