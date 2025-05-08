/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanab;

/**
 * Main.java
 * Evia Auamara U N / 24060123140111
 * berisi implementasi pemanggilan methods dalam kelas
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Menggunakan Datum
        Datum<Kucing> datumKucing = new Datum<>(new Kucing("Kucing Anggora"));
        Datum<Anjing> datumAnjing = new Datum<>(new Anjing("Anjing Golden Retriever"));
        Datum<Burung> datumBurung = new Datum<>(new Burung("Burung Dara"));

        System.out.println("----------Simulasi dengan Datum----------");
        datumKucing.getIsi().gerak();
        datumKucing.getIsi().bersuara();

        datumAnjing.getIsi().gerak();
        datumAnjing.getIsi().bersuara();

        datumBurung.getIsi().gerak();
        datumBurung.getIsi().bersuara();

        // Menggunakan ContohMetodeGeneric
        System.out.println("\n-------Simulasi dengan ContohMetodeGenerik-------");
        ContohMetodeGenerik.simulasi(new Kucing("Kucing Anggora"));
        ContohMetodeGenerik.simulasi(new Anjing("Anjing Golden Retriever"));
        ContohMetodeGenerik.simulasi(new Burung("Burung Dara"));
    }
}