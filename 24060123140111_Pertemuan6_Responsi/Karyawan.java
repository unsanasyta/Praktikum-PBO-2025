/* Nama File    : Karyawan.java
 * Deskripsi    : berisi atribut dan method dalam class Karyawan
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 25 Maret 2025
 */

public class Karyawan extends CivitasAkademika {
    private String NIP;
    private int masaKerja;

    public Karyawan() {

    }

    public Karyawan(String nama, String email, String NIP, int masaKerja) {
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
    }
    
    public void setNIP(String NIP) { 
        this.NIP = NIP; 
    }
    
    public String getNIP() { 
        return NIP; 
    }
    
    public void setMasaKerja(int masaKerja) { 
        this.masaKerja = masaKerja; 
    }
    
    public int getMasaKerja() { 
        return masaKerja; 
    }
    
    public float hitungGaji() { 
        return 0; 
    }   

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIP         : " + NIP);
        System.out.println("Masa Kerja  : " + masaKerja + " tahun");
    }
}
