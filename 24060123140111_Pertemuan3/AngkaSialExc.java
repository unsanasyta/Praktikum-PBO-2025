/*
 * File : AngkaSialExc.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13
 */

public class AngkaSialExc extends Exception {
    public AngkaSialExc() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }   
}