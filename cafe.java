public class cafe {
    private String nama;
    private String alamat;

    public cafe(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Cafe: " + nama);
        System.out.println("Alamat: " + alamat);
    }
}
