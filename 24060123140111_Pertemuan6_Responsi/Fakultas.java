/* Nama File    : Fakultas.java
 * Deskripsi    : berisi atribut dan method dalam class Fakultas
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 25 Maret 2025
 */

public class Fakultas {
    private String nama;
    private float tarifUKT;
    private float gajiPokok;

    public Fakultas() {

    }

    public Fakultas(String nama, float tarifUKT, float gajiPokok) {
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }
    
    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public String getNama() { 
        return nama; 
    }
    
    public void setTarifUKT(float tarifUKT) { 
        this.tarifUKT = tarifUKT; 
    }
    
    public float getTarifUKT() { 
        return tarifUKT; 
    }
    
    public void setGajiPokok(float gajiPokok) { 
        this.gajiPokok = gajiPokok; 
    }
    
    public float getGajiPokok() { 
        return gajiPokok; 
    }

    public void printInfo() {
        System.out.println("Fakultas    : " + nama);
        System.out.println("Tarif UKT   : Rp " + tarifUKT);
        System.out.println("Gaji Pokok  : Rp " + gajiPokok);
    }
}
