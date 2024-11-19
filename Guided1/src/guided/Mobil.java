package guided;

public class Mobil {
    // Definisi kelas Mobil yang merepresentasikan data mobil.
    private String warna; // Atribut untuk menyimpan warna mobil.
    private String merk; // Atribut untuk menyimpan merk mobil.
    private int tahunProduksi; // Atribut untuk menyimpan tahun produksi mobil.

    // Constructor untuk inisialisasi nilai atribut saat objek dibuat.
    public Mobil(String warna, String merk, int tahunProduksi) {
        this.warna = warna; // Mengisi atribut warna dengan parameter warna.
        this.merk = merk; // Mengisi atribut merk dengan parameter merk.
        this.tahunProduksi = tahunProduksi; // Mengisi atribut tahun produksi dengan parameter tahunProduksi.
    }

    // Getter untuk mendapatkan nilai atribut warna.
    public String getWarna() {
        return warna; // Mengembalikan nilai warna mobil.
    }

    // Setter untuk mengubah nilai atribut warna.
    public void setWarna(String warna) {
        this.warna = warna; // Mengatur nilai baru untuk warna.
    }

    // Getter untuk mendapatkan nilai atribut merk.
    public String getMerk() {
        return merk; // Mengembalikan nilai merk mobil.
    }

    // Setter untuk mengubah nilai atribut merk.
    public void setMerk(String merk) {
        this.merk = merk; // Mengatur nilai baru untuk merk.
    }

    // Getter untuk mendapatkan nilai atribut tahun produksi.
    public int getTahunProduksi() {
        return tahunProduksi; // Mengembalikan nilai tahun produksi mobil.
    }

    // Setter untuk mengubah nilai atribut tahun produksi.
    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi; // Mengatur nilai baru untuk tahun produksi.
    }

    // Method untuk menampilkan informasi mobil.
    public void tampilkanInfo() {
        // Menampilkan warna, merk, dan tahun produksi mobil ke layar.
        System.out.println("Informasi Mobil:");
        System.out.println("Warna: " + warna); // Menampilkan warna mobil.
        System.out.println("Merk: " + merk); // Menampilkan merk mobil.
        System.out.println("Tahun Produksi: " + tahunProduksi); // Menampilkan tahun produksi mobil.
    }
}
