# Program: Mobil Information System

This program stores and displays car data (color, brand, and production year) using Java. It uses Object-Oriented Programming (OOP) concepts.

---

## Mobil.java

```java
public class Mobil { 
    // Class attributes
    private String warna; // Attribute for car color
    private String merk; // Attribute for car brand
    private int tahunProduksi; // Attribute for production year

    // Constructor to initialize attributes
    public Mobil(String warna, String merk, int tahunProduksi) {
        this.warna = warna; // Assign color
        this.merk = merk; // Assign brand
        this.tahunProduksi = tahunProduksi; // Assign production year
    }

    // Getter and Setter for warna (color)
    public String getWarna() {
        return warna; // Return color
    }
    public void setWarna(String warna) {
        this.warna = warna; // Set color
    }

    // Getter and Setter for merk (brand)
    public String getMerk() {
        return merk; // Return brand
    }
    public void setMerk(String merk) {
        this.merk = merk; // Set brand
    }

    // Getter and Setter for tahunProduksi (production year)
    public int getTahunProduksi() {
        return tahunProduksi; // Return production year
    }
    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi; // Set production year
    }

    // Method to display car information
    public void tampilkanInfo() {
        System.out.println("Informasi Mobil:");
        System.out.println("Warna: " + warna); // Print color
        System.out.println("Merk: " + merk); // Print brand
        System.out.println("Tahun Produksi: " + tahunProduksi); // Print production year
    }
}
```
Main.java
```java
import java.util.Scanner; 
// Import Scanner class for user input

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        // Create Scanner object to read user input

        // Input car details
        System.out.print("Masukkan warna mobil: ");
        String warna = scanner.nextLine(); // Read color input

        System.out.print("Masukkan merk mobil: ");
        String merk = scanner.nextLine(); // Read brand input

        System.out.print("Masukkan tahun produksi mobil: ");
        int tahunProduksi = scanner.nextInt(); // Read production year input

        // Create Mobil object with user input
        Mobil mobil = new Mobil(warna, merk, tahunProduksi);

        // Display car details
        mobil.tampilkanInfo();

        scanner.close(); 
        // Close Scanner to release resources
    }
}

```
How to Run the Program
1. Create the Project in IntelliJ IDEA
Open IntelliJ IDEA and create a new project.
Add the Mobil.java and Main.java files to the src folder.
2. Compile and Run
Right-click on Main.java and select Run 'Main.main()'.
