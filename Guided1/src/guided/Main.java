package guided;

import java.util.Scanner;
// Mengimpor kelas Scanner untuk membaca input dari pengguna.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Membuat objek Scanner untuk membaca input dari konsol.

        // Meminta pengguna memasukkan warna mobil.
        System.out.print("Masukkan warna mobil: ");
        String warna = scanner.nextLine();
        // Menyimpan input pengguna ke variabel warna.

        // Meminta pengguna memasukkan merk mobil.
        System.out.print("Masukkan merk mobil: ");
        String merk = scanner.nextLine();
        // Menyimpan input pengguna ke variabel merk.

        // Meminta pengguna memasukkan tahun produksi mobil.
        System.out.print("Masukkan tahun produksi mobil: ");
        int tahunProduksi = scanner.nextInt();
        // Menyimpan input pengguna ke variabel tahunProduksi.

        // Membuat objek Mobil dengan data yang diinputkan oleh pengguna.
        Mobil mobil = new Mobil(warna, merk, tahunProduksi);

        // Menampilkan informasi mobil menggunakan method tampilkanInfo().
        mobil.tampilkanInfo();

        scanner.close();
        // Menutup Scanner untuk membebaskan resource yang digunakan.
    }
}
