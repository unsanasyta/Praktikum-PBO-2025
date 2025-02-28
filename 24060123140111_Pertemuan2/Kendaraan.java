/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 25 Februari 2025
 */

public class Kendaraan {
    /*********** ATRIBUT **********/
    private String noPlat;
    private String Jenis;

    /*********** METHOD **********/
    // Konstruktor tanpa parameter
    public Kendaraan() {
        noPlat = " ";
        Jenis = " ";
    }

    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String Jenis) {
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    // Mengembalikan nilai noPlat
    public String getnoPlat() {
        return noPlat;
    }

    // Mengembalikan nilai jenis
    public String getJenis() {
        return Jenis;
    }

    // Mengeset nilai noPlat 
    public void setnoPlat(String Nomor) {
        noPlat = Nomor;
    }

    // Mengeset nilai jenis dengan y
    public void setJenis(String jenis) {
        Jenis = jenis;
    }

    // Menampilkan data Kendaraan
    public void printKendaraan() {
        System.out.println("Kendaraan : " + noPlat + " - " + Jenis);
    }    
}