/* Nama File    : Sewa.java
 * Deskripsi    : berisi aplikasi class
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 22 April 2025
 */

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calRent(50, 1000);  
        mobil.calRent(50,1000);       
        bis.calRent(50,1000);
    }
}
 
 /* Polimorfisme Universal: Inclusion
 Anggap jika kita mempunyai method hitungSewa(Vehicle v), analisalah keuntungan
 penggunaan teknik polimorfisme inclusion.
 Jawab :
 jadi, dengan inclusion, kita bisa dapat keuntungan seperti
 Satu method hitungSewa bisa menerima semua subclassnya Vehicle
 Tak perlu buat method yang beda untuk tiap jenis kendaraan
 Kalau ada subclass baru (misal Truck), method tetap bisa dipakai tanpa perubahan
 Method yang dijalankan sesuai dengan tipe objek sebenarnya (kalau dioverride) */