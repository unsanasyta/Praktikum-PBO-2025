/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 25 Februari 2025
 */

public class MataKuliah {
    /*********** ATRIBUT **********/
    private String idMatkul;
    private String Nama;
    private int sks;

    /*********** METHOD **********/
    // Konstruktor tanpa parameter
    public MataKuliah() {
        idMatkul = " ";
        Nama = " ";
        sks = 0;
    }

    // Konstruktor dengan parameter
    public MataKuliah(String idMatkul, String Nama, int SKS) {
        this.idMatkul = idMatkul;
        this.Nama = Nama;
        this.sks = SKS;
    }

    // Mengembalikan nilai idMatkul
    public String getidMatkul() {
        return idMatkul;
    }

    // Mengembalikan nilai Nama
    public String getNama() {
        return Nama;
    }

    // Mengembalikan nilai sks
    public int getSks() {
        return sks;
    }

    // Mengeset nilai idMatkul 
    public void setidMatkul(String IdMatkul) {
        idMatkul = IdMatkul;
    }

    // Mengeset nilai Nama 
    public void setNama(String nama) {
        Nama = nama;
    }

    // Mengeset nilai sks 
    public void setSks(int SKS) {
        sks = SKS;
    }

    // Menampilkan data Mata Kuliah
    public void printMatKul() {
        System.out.println("Mata Kuliah : " + idMatkul + " - " + Nama + " (" + sks + " SKS)");
    }    
}