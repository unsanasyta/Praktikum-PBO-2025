/* Nama File    : Tendik.java
 * Deskripsi    : berisi atribut dan method dalam class Tendik
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 25 Maret 2025
 */

public class Tendik extends Karyawan {
    private static int counter = 0;

    public Tendik() {

    }

    public Tendik(String nama, String email, String NIP, int masaKerja) {
        super(nama, email, NIP, masaKerja);
        counter++;
    }

    public static int getCounter() { 
        return counter; 
    }
    
    @Override
    public float hitungGaji() { 
        return 4000000 + (4000000 * getMasaKerja() * 0.01f);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Gaji Tendik : Rp " + hitungGaji());
    }
}
