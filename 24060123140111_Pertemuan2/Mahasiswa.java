/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 25 Februari 2025
 */

import java.util.ArrayList;

public class Mahasiswa {
    /*********** ATRIBUT **********/
    private String NIM;
    private String Nama;
    private String Prodi;
    private ArrayList<MataKuliah> listMatkul; 
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /*********** METHOD **********/
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.NIM = " ";
        this.Nama = " ";
        this.Prodi = " ";
        this.listMatkul = new ArrayList<>(); 
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String NIM, String Nama, String Prodi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.listMatkul = new ArrayList<>(); 
    }

    // Mengeset nilai dosen wali 
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    // Mengeset nilai kendaraan
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Menambah nilai mata kuliah
    public void addMatKul(MataKuliah matkul) {
        if (listMatkul.size() < 50) {
            listMatkul.add(matkul); 
        } else {
            System.out.println("Maksimal 50 mata kuliah!");
        }
    }

    // Mengembalikan jumlah SKS mata kuliah yang diambil mahasiswa.
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah matkul : listMatkul) {
            totalSKS += matkul.getSks();
        }
        return totalSKS;
    }

    // Mengembalikam jumlah mata kuliah yang diambil mahasiswa.
    public int getJumlahMatKul() {
        return listMatkul.size();
    }

    // Menampilkan NIM, Nama, dan Prodi mahasiswa.
    public void printMhs() {
        System.out.println("Mahasiswa : " + NIM + " - " + Nama + " (" + Prodi + ")");
    }

    // Menampilkan detail data mahasiswa
    public void printDetailMhs() {
        printMhs();
        System.out.println("Jumlah Mata Kuliah : " + getJumlahMatKul());
        System.out.println("Total SKS : " + getJumlahSKS());
        System.out.println("Daftar Mata Kuliah :");
        for (MataKuliah matkul : listMatkul) {
            matkul.printMatKul();
        }
        if (dosenWali != null) {
            dosenWali.printDosen();
        }
        if (kendaraan != null) {
            kendaraan.printKendaraan();
        }
        System.out.println("------------------------------------------------");
    }
}