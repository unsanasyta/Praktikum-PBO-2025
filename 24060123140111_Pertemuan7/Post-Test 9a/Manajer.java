/* Nama File    : Manager.java
 * Deskripsi    : berisi atribut dan method dalam class Manager
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 22 April 2025
 */

public class Manajer extends Pegawai {
    double tunjangan = 700000;

    public Manajer(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
