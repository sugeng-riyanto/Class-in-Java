package unguided;
import java.util.ArrayList;
import java.util.Scanner;
class Anggota {
    private String nama;
    private String idAnggota;
    private String email;
    private ArrayList<Buku> daftarBuku;

    // Constructor
    public Anggota(String nama, String idAnggota, String email) {
        this.nama = nama;
        this.idAnggota = idAnggota;
        this.email = email;
        this.daftarBuku = new ArrayList<>();
    }

    // Methods to add a borrowed book
    public void pinjamBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku '" + buku.getJudul() + "' berhasil dipinjam.");
    }

    // Display borrowed books
    public void tampilkanBukuPinjaman() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku yang dipinjam.");
        } else {
            System.out.println("Daftar buku yang dipinjam oleh " + nama + ":");
            for (Buku buku : daftarBuku) {
                System.out.println(buku);
            }
        }
    }
}