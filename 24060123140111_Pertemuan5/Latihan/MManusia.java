/* Nama File    : MManusia.java
 * Deskripsi    : berisi main program
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 18 Maret 2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MManusia {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        PNS p1 = new PNS("Satriyo", LocalDate.parse("01-04-2006", formatter), "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.parse("01-01-2000", formatter), "Jl. Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", LocalDate.parse("09-01-1977", formatter), "Jl. Bunga 9 Tembalang", 5000000, "Wonogiri");

        PNS p2 = new PNS("Panji", LocalDate.parse("01-04-2010", formatter), "Jl. Default", 10000000, "198004212010041002");
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
        
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

        System.out.println(" ");
        System.out.println("----------Info PNS----------");
        p1.cetakInfo();
        System.out.println(" ");
        p2.cetakInfo();
        System.out.println(" ");
        System.out.println("----------Info Pengusaha----------");
        pe1.cetakInfo();
        System.out.println(" ");
        System.out.println("----------Info Petani----------");
        pt1.cetakInfo();
    }
}