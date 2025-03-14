/* Nama File    : MGaris.java
 * Deskripsi    : berisi aplikasi method dalam class Garis
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 18 Februari 2025
 */

public class MGaris {
    public static void main (String[] args){
        //membentuk garis
        Titik X1 = new Titik(1, -2);
        Titik X2 = new Titik(-2, -8);
        Titik T3 = new Titik(1, 1);
        Titik T4 = new Titik(4, 5);
        Garis G1 = new Garis(X1, X2);
        G1.printGaris();

        //memanggil konstruktor tanpa parameter (default)
        Garis G2 = new Garis();
        G2.printGaris();

        //memanggil getter dan setter
        G1.setX1(2, 2);
        G1.setX2(5, 6);
        System.out.println("Setelah mengubah koordinat : ");
        G1.printGaris();
        System.out.println("X1 : (" + G1.getX1().getAbsis() + ", " + G1.getX1().getOrdinat() + ")");
        System.out.println("X2 : (" + G1.getX2().getAbsis() + ", " + G1.getX2().getOrdinat() + ")");

        //memanggil panjang garis dan gradien
        System.out.println("Panjang Garis G1 : " + G1.panjangGaris());
        System.out.println("Gradien Garis G1 : " + G1.gradien());

        //memanggil titik tengah
        Titik tengah = G1.titikTengah();
        System.out.print("Titik Tengah G1 : ");
        tengah.printTitik();

        //mengecek kesamaan gradien (sejajar) dan tegak lurus
        Garis G3 = new Garis(T3, T4);
        G3.printGaris();
        System.out.println("Apakah G1 sejajar dengan G3 ? " + G1.sejajar(G3));
        System.out.println("Apakah G1 tegak lurus dengan G3 ? " + G1.tegakLurus(G3));

        //memanggil getPersamaan
        System.out.println("Persamaan Garis G1 : " + G1.getPersamaan());
        System.out.println("Persamaan Garis G2 : " + G2.getPersamaan());

        //memanggil getCounterGaris
        System.out.println("Jumlah Garis yang telah dibuat : " + Garis.getCounterGaris());
    }
}
