/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 11 Maret 2025
 */

import java.time.LocalDate;

public class Dosen extends Pegawai {
    private String Fakultas;

    public Dosen() {

    }

    public Dosen(String NIP, String Nama, LocalDate tglLahir, LocalDate TMT, double GajiPokok, String Fakultas) {
        super(NIP, Nama, tglLahir, TMT, GajiPokok);
        this.Fakultas = Fakultas;
    }

    public void setFakultas(String Fakultas) {
        this.Fakultas = Fakultas;
    }

    public String getFakultas() {
        return Fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo(); 
        System.out.println("Fakultas        : " + Fakultas);
    }
}