/* Nama File    : Burung.java
 * Deskripsi    : berisi atribut dan method dalam class Burung
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 22 April 2025
 */

public class Burung extends Anabul {
    public Burung(String nama) {
        this.nama = nama;
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi : Cuit.");
    }
}
