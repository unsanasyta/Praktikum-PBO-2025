/* Nama File    : DosenTamu.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen Tamu
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 11 Maret 2025
 */

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;

public class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate TanggalAkhirKontrak;
    private int MasaKontrak;

    public DosenTamu() {

    }

    public DosenTamu(String NIP, String Nama, LocalDate tglLahir, LocalDate TMT, double GajiPokok, String Fakultas, String NIDK, LocalDate TanggalAkhirKontrak, int MasaKontrak) {
        super(NIP, Nama, tglLahir, TMT, GajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.TanggalAkhirKontrak = TanggalAkhirKontrak;
        this.MasaKontrak = MasaKontrak;
    }

    public void setNidk(String NIDK) {
        this.NIDK = NIDK;
    }

    public String getNidk() {
        return NIDK;
    }

    public void setTanggalAkhirKontrak(LocalDate TanggalAkhirKontrak) {
        this.TanggalAkhirKontrak = TanggalAkhirKontrak;
    }

    public LocalDate getTanggalAkhirKontrak() {
        return TanggalAkhirKontrak;
    }

    public int hitungMasaKontrak() {
        LocalDate today = LocalDate.now();
        Period selisih = Period.between(today, TanggalAkhirKontrak);
        return selisih.getMonths() + (selisih.getYears() * 12); // Konversi tahun ke bulan
    }

    public double hitungTunjangan() {
        return 0.025 * getGajiPokok(); // 2.5% dari gaji pokok
    }
    
    public String getFormattedDate(LocalDate date) {
        return date.getDayOfMonth() + " " + date.getMonth().getDisplayName(TextStyle.FULL, Locale.of("id", "ID")) + " " + date.getYear();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        NumberFormat formatter = NumberFormat.getInstance(new Locale("id", "ID"));
        System.out.println("NIDK                    : " + NIDK);
        System.out.println("Jabatan                 : Dosen Tamu");
        System.out.println("Masa Kontrak Berakhir   : " + getFormattedDate(TanggalAkhirKontrak));
        System.out.println("Sisa Masa Kontrak       : " + hitungMasaKontrak() + " bulan");
        System.out.println("Tunjangan               : Rp " + formatter.format(hitungTunjangan()));
    }
}