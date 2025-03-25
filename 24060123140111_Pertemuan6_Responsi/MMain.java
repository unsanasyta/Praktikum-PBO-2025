/* Nama File    : MMain.java
 * Deskripsi    : Main Program
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 25 Maret 2025
 */

public class MMain {
    public static void main(String[] args) {
        Fakultas fakultasFSM = new Fakultas("Fakultas Sains dan Matematika", 8500000, 7000000);
        Mahasiswa mahasiswa1 = new Mahasiswa("Unsa", "sza@gmail.com", "24060123140111", 4, fakultasFSM);
        Dosen dosen1 = new Dosen("Ir. Daniel", "niell@lecturer.co.id", "D240602015001", 10, fakultasFSM);
        Tendik tendik1 = new Tendik("Ning", "ningz@staff.co.id", "T240602020001", 5);
        
        Fakultas fakultasFT = new Fakultas("Fakultas Teknik", 7500000, 7000000);
        Mahasiswa mahasiswa2 = new Mahasiswa("Joel", "joe@gmail.com", "23060123140111", 4, fakultasFT);
        Dosen dosen2 = new Dosen("Jae", "jae@lecturer.co.id", "D2306012015010", 15, fakultasFT);
        
        System.out.println("----------Info Fakultas----------");
        fakultasFSM.printInfo();
        System.out.println("");
        fakultasFT.printInfo();
        System.out.println("");
        System.out.println("----------Info Mahasiswa----------");
        mahasiswa1.printInfo();
        System.out.println("");
        mahasiswa2.printInfo();
        System.out.println("");
        System.out.println("----------Info Dosen----------");
        dosen1.printInfo();
        System.out.println("");
        dosen2.printInfo();
        System.out.println("");
        System.out.println("----------Info Tendik----------");
        tendik1.printInfo();
        System.out.println("");

        System.out.println("----------Info Instance----------");
        System.out.println("Total Mahasiswa         : " + Mahasiswa.getCounter());
        System.out.println("Total Dosen             : " + Dosen.getCounter());
        System.out.println("Total Tendik            : " + Tendik.getCounter());

    }
}