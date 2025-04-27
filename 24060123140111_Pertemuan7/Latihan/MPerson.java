/* Nama File    : MPerson.java
 * Deskripsi    : berisi aplikasi class
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 22 April 2025
 */

public class MPerson {
    public static void main(String[] args) {
        Person p;
        p = new Student("Sally");
        p.status(1);
    }
}
 
 /*Jawaban nya ada di file coba.java, MPerson.java, Sewa.java
 
 Polimorfisme Ad Hoc: Overloading
 ada prinsipnya Polimorfisme jenis ini memanfaatkan kemampuan method overloading (yang
 telah dibahas pada topik awal). Silahkan diskusikan kembali contoh dan syarat-syarat yang harus
 dipenuhi untuk mendapatkan method overloading.
 Jawab:
 misal ada method gerak tanpa parameter di kelas parent Kupu
 lalu ada kelas anak KupuDewasa
 nah, di kelas KupuDewasa kan ngebawa method gerak tanpa parameter dari kelas Kupu
 di kelas KupuDewasa bisa nambahin method gerak dengan parameter misal "x" sebagai ketinggian
 tapi, di kelas KupuDewasa belum bisa overloading method gerak
 jadi harus dideklarasiin signature nya di kelas Kupu
 sehingga KupuDewasa bisa meng overloading method gerak tanpa parameter menjadi dengan parameter x
 
 Optional jika ada waktu
 Perhatikan kode berikut ini:
 Maka output yang didapat adalah:
 Now online: Sally
 
 Diskusikan bagaimana hasil tersebut didapatkan (hint: apakah “this” pada kelas person dalam
 method status dieksekusi ketika compile time atau runtime) .
 Jawab:
 "this" menunjuk ke objek sebenarnya (Student), walau direferensikan sebagai Person
 Method isAsleep() yang dieksekusi dipilih saat runtime (bukan compile time), 
 karena Java memakai runtime polymorphism (dynamic class loading/late binding) untuk method yang dioverride
 Ini bukti dari pewarisan dan overriding dalam PBO*/