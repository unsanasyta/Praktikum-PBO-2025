/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 25 Februari 2025
 */

public class Dosen {
    /*********** ATRIBUT **********/
    private String NIP;
    private String Nama;
    private String Prodi;

    /*********** METHOD **********/
    // Konstruktor tanpa parameter
    public Dosen() {
        NIP = " ";
        Nama = " ";
        Prodi = " ";
    }

    // Konstruktor dengan parameter
    public Dosen(String NIP, String Nama, String Prodi) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    // Mengembalikan nilai NIP
    public String getNIP() {
        return NIP;
    }

    // Mengembalikan nilai nama
    public String getNama() {
        return Nama;
    }

    // Mengembalikan nilai prodi
    public String getProdi() {
        return Prodi;
    }

    // Mengeset nilai NIP dengan x
    public void setNIP(String nip) {
        NIP = nip;
    }

    // Mengeset nilai Nama dengan y
    public void setNama(String nama) {
        Nama = nama;
    }

    // Mengeset nilai Prodi dengan z
    public void setProdi(String prodi) {
        Prodi = prodi;
    }

    // Menampilkan data Dosen
    public void printDosen() {
        System.out.println("Dosen Wali : " + NIP + " - " + Nama + " (" + Prodi + ")");
    }    
}