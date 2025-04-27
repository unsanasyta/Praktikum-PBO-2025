/* Nama File    : Car.java
 * Deskripsi    : berisi atribut dan method dalam class Car
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 22 April 2025
 */

public class Car extends Vehicle {
    @Override
    void calRent(int jarak, float harga){
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("Harga sewa mobil = " + fare);
    }
}
 
 /* Method calRent di Car tidak pakai @Override (di modul), 
 karena signature methodnya beda (jarak, harga vs distance, price)
 jadi bukan override yang "baik"
 sehingga di sini saya override sendiri */