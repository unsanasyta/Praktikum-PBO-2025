/* Nama File    : MMain.java
 * Deskripsi    : berisi implementasi pemanggilan methods
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 22 April 2025
 */

import java.util.ArrayList;

public class MMain {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<Pegawai>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

/*
1. Screenshot program

2. Jelaskan manfaat polimorfisme pada kasus ini
Jawab : 
Manfaat Polimorfisme pada kasus ini yaitu kita dapat menangani berbagai tipe objek 
seperti Manajer dan Programmer dengan cara yang lebih umum melalui referensi 
tipe induk yaitu Superclass Pegawai. Hal ini  memungkinkan penambahan pegawai baru 
tanpa harus mengubah kode yang sudah ada, hanya dengan membuat kelas turunan baru 
dan menyesuaikan implementasi tampilData() sesuai dengan kebutuhan.
Polimorfisme mengurangi redundansi kode dan meningkatkan fleksibilitas program 
dalam mengelola berbagai tipe objek yang berbagi kelas induk/Superclass yang sama.

3. Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! 
Apa permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?
Jawab :
Tanpa polimorfisme, jika kita menambahkan pegawai baru (misalnya pegawai4 dan pegawai5), 
kita akan membutuhkan logika tambahan di dalam main untuk menangani setiap jenis pegawai secara terpisah. 
Misalnya, jika pegawai4 adalah Programmer, kita perlu menulis kode khusus untuk itu, 
yang dapat menyebabkan duplikasi kode. Dengan polimorfisme, penambahan pegawai baru 
dapat dilakukan secara lebih mudah, hanya dengan membuat kelas baru dan menggunakan 
mekanisme tampilData() yang ada.
 */