package unguided;
import java.util.ArrayList;
import java.util.Scanner;
public class Perpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Anggota
        System.out.print("Masukkan nama anggota: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan ID anggota: ");
        String idAnggota = scanner.nextLine();

        System.out.print("Masukkan email anggota: ");
        String email = scanner.nextLine();

        Anggota anggota = new Anggota(nama, idAnggota, email);

        // Input Buku
        String lanjut;
        do {
            System.out.print("Masukkan judul buku: ");
            String judul = scanner.nextLine();

            System.out.print("Masukkan penulis buku: ");
            String penulis = scanner.nextLine();

            System.out.print("Masukkan ISBN buku: ");
            String isbn = scanner.nextLine();

            Buku buku = new Buku(judul, penulis, isbn);
            anggota.pinjamBuku(buku);

            System.out.print("Apakah ingin menambah buku lain? (ya/tidak): ");
            lanjut = scanner.nextLine();

        } while (lanjut.equalsIgnoreCase("ya"));

        // Tampilkan daftar buku
        anggota.tampilkanBukuPinjaman();

        scanner.close();
    }
}