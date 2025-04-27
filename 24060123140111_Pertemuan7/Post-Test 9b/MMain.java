/* Nama File    : MMain.java
 * Deskripsi    : berisi implementasi pemanggilan methods
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 22 April 2025
 */

public class MMain {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Kucing");
        kucing.gerak();
        kucing.bersuara();
        System.out.println(" ");

        Anabul anjing = new Anjing("Anjing");
        anjing.gerak();
        anjing.bersuara();
        System.out.println(" ");

        Anabul burung = new Burung("Burung");
        burung.gerak();
        burung.bersuara();
    }
}
