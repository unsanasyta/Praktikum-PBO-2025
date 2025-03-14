/* Nama File    : Tendik.java
 * Deskripsi    : berisi atribut dan method dalam class Tendik
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 11 Maret 2025
 */

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;

 public class Tendik extends Pegawai {
    private String Bidang;
    private static final int BUP = 55;

    public Tendik() {

    }

    public Tendik(String NIP, String Nama, LocalDate tglLahir, LocalDate TMT, double GajiPokok, String Bidang) {
        super(NIP, Nama, tglLahir, TMT, GajiPokok);
        this.Bidang = Bidang;
    }

    public void setBidang(String Bidang) {
        this.Bidang = Bidang;
    }

    public String getBidang() {
        return Bidang;
    }

    public int MasaKerja() {
        return Period.between(getTmt(), LocalDate.now()).getYears();
    }

    public LocalDate hitungBUP() {
        return getTanggalLahir().plusYears(BUP).plusMonths(1);
    }

    public double hitungTunjangan() {
        return 0.01 * MasaKerja() * getGajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        NumberFormat formatter = NumberFormat.getInstance(new Locale("id", "ID"));
        System.out.println("Bidang          : " + Bidang);
        System.out.println("Tunjangan       : Rp " + formatter.format(hitungTunjangan()));
        System.out.println("BUP             : " + getFormattedDate(hitungBUP()));
    }
}