/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atribut dan method dalam class Pegawai
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 11 Maret 2025
 */

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;


public class Pegawai {
    private String NIP;
    private String Nama;
    private LocalDate tglLahir;
    private LocalDate TMT;
    private double GajiPokok;

    public Pegawai() {

    }

    public Pegawai(String NIP, String Nama, LocalDate tglLahir, LocalDate TMT, double GajiPokok) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.tglLahir = tglLahir;
        this.TMT = TMT;
        this.GajiPokok = GajiPokok;
    }

    public void setNip(String NIP) {
        this.NIP = NIP;
    }

    public String getNip() {
        return NIP;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public void setTanggalLahir(LocalDate tglLahir) {
        this.tglLahir = tglLahir;
    }

    public LocalDate getTanggalLahir() {
        return tglLahir;
    }

    public void setTmt(LocalDate TMT) {
        this.TMT = TMT;
    }

    public LocalDate getTmt() {
        return TMT;
    }

    public void setGajiPokok(double GajiPokok) {
        this.GajiPokok = GajiPokok;
    }

    public double getGajiPokok() {
        return GajiPokok;
    }

    public String getFormattedDate(LocalDate date) {
        return date.getDayOfMonth() + " " + date.getMonth().getDisplayName(TextStyle.FULL, Locale.of("id", "ID")) + " " + date.getYear();
    }

    public void printInfo() {
        NumberFormat formatter = NumberFormat.getInstance(new Locale("id", "ID"));
        System.out.println("NIP            : " + NIP);
        System.out.println("Nama           : " + Nama);
        System.out.println("Tanggal Lahir  : " + getFormattedDate(tglLahir));
        System.out.println("TMT            : " + getFormattedDate(TMT));
        System.out.println("Gaji Pokok     : Rp " + formatter.format(GajiPokok));
    }
}