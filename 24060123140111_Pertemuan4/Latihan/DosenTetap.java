/* Nama File    : DosenTetap.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTetap
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 11 Maret 2025
 */

 import java.text.NumberFormat;
 import java.time.LocalDate;
 import java.time.Period;
 import java.time.format.TextStyle;
 import java.util.Locale;

 public class DosenTetap extends Dosen {
    private String NIDN;
    private static final int BUP = 65;

    public DosenTetap() {

    }

    public DosenTetap(String NIP, String Nama, LocalDate tglLahir, LocalDate TMT, double GajiPokok, String Fakultas, String NIDN, int MasaKerja) {
        super(NIP, Nama, tglLahir, TMT, GajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    public void setNidn(String NIDN) {
        this.NIDN = NIDN;
    }

    public String getNidn() {
        return NIDN;
    }

    public LocalDate hitungBUP() {
        return getTanggalLahir().plusYears(BUP).plusMonths(1);
    }

    public String MasaKerja() {
        Period period = Period.between(getTmt(), LocalDate.now());
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }

    public double hitungTunjangan() {
        int masaKerja = Period.between(getTmt(), LocalDate.now()).getYears();
        return 0.02 * masaKerja * getGajiPokok();
    }

    public String getFormattedDate(LocalDate date) {
        return date.getDayOfMonth() + " " + date.getMonth().getDisplayName(TextStyle.FULL, Locale.of("id", "ID")) + " " + date.getYear();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        NumberFormat formatter = NumberFormat.getInstance(new Locale("id", "ID"));
        System.out.println("NIDN            : " + NIDN);
        System.out.println("Masa Kerja      : " + MasaKerja());
        System.out.println("BUP             : " + getFormattedDate(hitungBUP()));
        System.out.println("Jabatan         : Dosen tetap");
        System.out.println("Tunjangan       : Rp " + formatter.format(hitungTunjangan()));
    }
}
