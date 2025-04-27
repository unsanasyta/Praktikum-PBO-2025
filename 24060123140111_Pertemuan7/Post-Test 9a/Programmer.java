/* Nama File    : Programmer.java
 * Deskripsi    : berisi atribut dan method dalam class Programmer
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 22 April 2025
 */

public class Programmer extends Pegawai {
    double bonus = 450000;

    public Programmer(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
