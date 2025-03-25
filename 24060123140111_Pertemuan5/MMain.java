/* Nama File    : MMain.java
 * Deskripsi    : Main Program
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 11 Maret 2025
 */

 public class MMain {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi = new Persegi(5, "Merah", "Hitam");
        System.out.println("---------- PERSEGI ---------- ");
        persegi.printInfo();
        System.out.println("Luas        : " + persegi.getLuas());
        System.out.println("Keliling    : " + persegi.getKeliling());
        System.out.println("Diagonal    : " + persegi.getDiagonal());
        System.out.println();

        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(10, "Biru", "Putih");
        System.out.println("---------- LINGKARAN ----------");
        lingkaran.printInfo();
        System.out.println("Luas        : " + lingkaran.getLuas());
        System.out.println("Keliling    : " + lingkaran.getKeliling());
        System.out.println();
        
        System.out.println("----------PENGGUNAAN IRESIZE----------");
        System.out.println("----------Ukuran awal----------");
        persegi.tampilkanUkuran();
        lingkaran.tampilkanUkuran();
        
        System.out.println("----------Setelah zoomIn----------");
        persegi.zoomIn();
        lingkaran.zoomIn();
        persegi.tampilkanUkuran();
        lingkaran.tampilkanUkuran();
        
        System.out.println("----------Setelah zoomOut----------");
        persegi.zoomOut();
        lingkaran.zoomOut();
        persegi.tampilkanUkuran();
        lingkaran.tampilkanUkuran();
        
        System.out.println("----------Setelah zoom dengan 20%----------");
        persegi.zoom(20);
        lingkaran.zoom(20);
        persegi.tampilkanUkuran();
        lingkaran.tampilkanUkuran();

        System.out.println("\n---------PERBANDINGAN LUAS PERSEGI & LINGKARAN---------");
        System.out.println("Apakah luas Persegi sama dengan luas Lingkaran ? " + persegi.isEqualLuas(lingkaran));
    }
}