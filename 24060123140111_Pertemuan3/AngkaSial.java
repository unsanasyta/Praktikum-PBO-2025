/*
 * File : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri 
 *              Pengenalan klausa 'throw' dan 'throws'
 * Nama / NIM : Evia Auamara U N / 24060123140111
 */

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialExc{
        if (angka == 13) {
            throw new AngkaSialExc();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialExc ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }

/* PERTANYAAN : 
1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?  
2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 

JAWABAN : 
1. Baris 12 tidak akan dieksekusi jika angka adalah 13. Namun, jika angka bukan 13, maka baris ini akan dieksekusi.
Karena, Kode ini ada di dalam metode cobaAngka(int angka), Jika angka = 13, maka akan terjadi eksepsi sebelum mencapai baris ini karena:
if (angka == 13) {
throw new AngkaSialException();
}
Menyebabkan program akan langsung keluar dari metode dan masuk ke blok catch.
Artinya, baris 12 tidak akan dieksekusi jika angka adalah 13 tapi dieksekusi jika angka bukan 13

2. Baris 21 tidak dieksekusi karena setelah eksepsi terjadi, program langsung masuk ke catch, melewatkan semua kode berikutnya dalam blok try. Baris 21 tidak dieksekusi karena setelah eksepsi terjadi, 
karena baris 21 berada di dalam try setelah pemanggilan:
as.cobaAngka(13);
Ketika as.cobaAngka(13); dipanggil, Terjadi eksepsi (throw new AngkaSialException();).
Program langsung lompat ke blok catch.
Eksekusi tidak akan kembali ke dalam try setelah eksepsi terjadi. */
}