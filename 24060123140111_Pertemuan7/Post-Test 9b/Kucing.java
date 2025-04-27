/* Nama File    : Kucing.java
 * Deskripsi    : berisi atribut dan method dalam class Kucing
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 22 April 2025
 */

public class Kucing extends Anabul {
    public Kucing(String nama) {
        this.nama = nama;
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi : Meong.");
    }   
}
