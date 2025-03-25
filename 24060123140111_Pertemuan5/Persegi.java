/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 11 Maret 2025
 */

 public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(warna, border);
        this.sisi = sisi;
        setJmlSisi(4);
    }

    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void zoomIn() {
        sisi *= 1.1;
    }
    
    @Override
    public void zoomOut() {
        sisi *= 0.9;
    }
    
    @Override
    public void zoom(int percent) {
        sisi += sisi * percent / 100.0;
    }
    
    @Override
    public void tampilkanUkuran() {
        System.out.println("Ukuran Persegi  : " + sisi);
    }
}
