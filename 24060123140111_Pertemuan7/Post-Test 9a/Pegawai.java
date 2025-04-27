/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atribut dan method dalam class Pegawai
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 22 April 2025
 */

public class Pegawai {
    // Atribut
    String nama;
    double gajiPokok = 5000000;

    // Methods
    public Pegawai(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}
