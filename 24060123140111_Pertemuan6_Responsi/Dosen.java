/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 25 Maret 2025
 */

public class Dosen extends Karyawan {
    private Fakultas fakultas;
    private static int counter = 0;

    public Dosen() {

    }

    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
        counter++;
    }
    
    public void setFakultas(Fakultas fakultas) { 
        this.fakultas = fakultas; 
    }
    
    public Fakultas getFakultas() { 
        return fakultas; 
    }

    public static int getCounter() { 
        return counter; 
    }
    
    @Override
    public float hitungGaji() { 
        return fakultas.getGajiPokok() * (1 + (getMasaKerja() * 0.01f)); 
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas    : " + fakultas.getNama());
        System.out.println("Gaji Dosen  : Rp " + hitungGaji());
    }
}
