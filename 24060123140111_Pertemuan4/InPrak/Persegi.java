/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 11 Maret 2025
 */

 public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi,  String warna, String border) {
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi *sisi;
    }

    public double getKeliling() {
        return 4*sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }
}
