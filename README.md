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

# Library Borrowing System

## Table of Contents
- [Introduction](#introduction)
- [Project Structure](#project-structure)
- [Classes Explanation](#classes-explanation)
- [How to Run](#how-to-run)
- [Sample Input and Output](#sample-input-and-output)
- [More Details](#more-details)

---

## Introduction

This project is a simple **Library Borrowing System** implemented in Java. The program allows:
1. Users to input library member details (name, ID, email).
2. Users to input book details (title, author, ISBN) for books borrowed by the member.
3. The system to display the list of books borrowed by a specific member.

This project demonstrates key concepts in **Object-Oriented Programming (OOP)** such as:
- Classes and Objects
- Encapsulation using `private` access modifiers
- Use of `ArrayList` for dynamic data handling
- Input handling using `Scanner`

---

## Project Structure

The project has the following structure:


### Files Description
1. **`Buku.java`**:
   - Represents a book in the library.
   - Attributes: `judul`, `penulis`, `isbn`.
   - Includes getter methods and a `toString` method for displaying book information.

2. **`Anggota.java`**:
   - Represents a library member.
   - Attributes: `nama`, `idAnggota`, `email`, and a list of borrowed books (`ArrayList<Buku>`).
   - Methods:
     - `pinjamBuku`: Adds a book to the member's borrowed list.
     - `tampilkanBukuPinjaman`: Displays all borrowed books.

3. **`Perpustakaan.java`**:
   - Contains the `main` method.
   - Handles user input for member and book details.
   - Controls the program flow (adding books and displaying borrowed books).

---

## How to Run

Follow these steps to run the program in **IntelliJ IDEA**:

1. **Clone or Download the Project**:
   Download or clone the project repository to your computer.

2. **Open IntelliJ IDEA**:
   - Open IntelliJ IDEA and click on **Open Project**.
   - Select the folder containing the project.

3. **Compile and Run**:
   - Right-click on `Perpustakaan.java`.
   - Select **Run 'Perpustakaan.main()'**.
   - The console will prompt for input.

---

## Sample Input and Output

### Input:
Masukkan nama anggota: Sugeng Riyanto 

Masukkan ID anggota: A123 

Masukkan email anggota: sugeng@example.com 

Masukkan judul buku: Pemrograman Java 

Masukkan penulis buku: John Doe Masukkan ISBN buku: 1234567890 

Buku 'Pemrograman Java' berhasil dipinjam. 

Apakah ingin menambah buku lain? (ya/tidak): ya 

Masukkan judul buku: Algoritma Pemrograman 

Masukkan penulis buku: Jane Smith 

Masukkan ISBN buku: 9876543210 Buku 'Algoritma Pemrograman' berhasil dipinjam. 

Apakah ingin menambah buku lain? (ya/tidak): tidak

---

## More Details

For detailed implementation and related projects, please visit the following link:

👉 **[Library Borrowing System Repository on GitHub](https://github.com/sugeng-riyanto/Class-in-Java/tree/main/Guided1/src)** 👈

Here, you can find:
- The source code for all classes (`Buku.java`, `Anggota.java`, and `Perpustakaan.java`).
- Additional examples and guided implementations related to Java.

---

Happy coding! 😊

