/* Nama File    : Anjing.java
 * Deskripsi    : berisi atribut dan method dalam class Anjing
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 22 April 2025
 */

public class Anjing extends Anabul {
    public Anjing(String nama) {
        this.nama = nama;
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi : Guk-guk.");
    }
}
