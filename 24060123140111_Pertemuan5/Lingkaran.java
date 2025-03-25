/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 11 Maret 2025
 */

public class Lingkaran extends BangunDatar implements IResize {
    private double jari;

    public Lingkaran() {
        setJmlSisi(1);
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(warna, border);
        this.jari = diameter / 2;
        setJmlSisi(1);
    }

    public double getJari() {
        return jari;
    }
    
    public void setJari(double jari) {
        this.jari = jari;
    }
    
    @Override
    public double getLuas() {
        return Math.PI * (jari * jari);
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void zoomIn() {
        jari *= 1.1;
    }
    
    @Override
    public void zoomOut() {
        jari *= 0.9;
    }
    
    @Override
    public void zoom(int percent) {
        jari += jari * percent / 100.0;
    }
    
    @Override
    public void tampilkanUkuran() {
        System.out.println("Ukuran Lingkaran : " + jari);
    }
}
