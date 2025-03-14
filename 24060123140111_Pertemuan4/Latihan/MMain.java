/* Nama File    : MMain.java
 * Deskripsi    : Main Program
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 11 Maret 2025
 */

 import java.text.NumberFormat;
 import java.time.LocalDate;
 import java.util.Locale;
 
 public class MMain {
     public static void main(String[] args) {
        // Formatter untuk format angka Indonesia
        NumberFormat formatter = NumberFormat.getInstance(new Locale("id", "ID"));
        // Membuat objek Dosen Tetap
        DosenTetap dosenTetap = new DosenTetap(
             "9545647548",
             "Andi",
             LocalDate.of(1990, 5, 5),
             LocalDate.of(2015, 1, 1),
             5000000.0,
             "Fakultas Sains dan Matematika",
             "78647324",
             24
        );
 
        // Membuat objek Dosen Tamu
        DosenTamu dosenTamu = new DosenTamu(
             "7845123345",
             "Jake",
             LocalDate.of(1985, 3, 15),
             LocalDate.of(2020, 6, 1),
             4000000.0,
             "Fakultas Teknik",
             "NIDK12345",
             LocalDate.of(2025, 6, 1),
             12
        );
 
        // Membuat objek Tendik (Tenaga Kependidikan)
        Tendik tendik = new Tendik(
             "1234567890",
             "Unsa",
             LocalDate.of(1980, 7, 10),
             LocalDate.of(2010, 9, 15),
             4500000.0,
             "Teknologi Informasi"
        );
 
        // Menampilkan informasi Dosen Tetap
        System.out.println("---------- Data Dosen Tetap ----------");
        dosenTetap.printInfo();
        System.out.println();
 
        // Menampilkan informasi Dosen Tamu
        System.out.println("---------- Data Dosen Tamu ----------");
        dosenTamu.printInfo();
        System.out.println();
 
        // Menampilkan informasi Tendik
        System.out.println("---------- Data Tendik ----------");
        tendik.printInfo();
        System.out.println();
    }
}
 
