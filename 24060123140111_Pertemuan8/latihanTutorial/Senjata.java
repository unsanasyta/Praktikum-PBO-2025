/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihantutorial;

/**
 * Senjata.java
 * Evia Auamara U N / 24060123140111
 * berisi atribut dan method dalam kelas Senjata
 */

public class Senjata {
    private String bunyi;
    private boolean menusuk;

    // Konstruktor
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
    }

    // Setter bunyi
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    // Getter bunyi
    public String getBunyi() {
        return bunyi;
    }

    // Setter menusuk
    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    // Getter menusuk
    public boolean isMenusuk() {
        return menusuk;
    }

    // Method menembak
    public void menembak(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.print(bunyi + " ");
        }
        System.out.println();
    }

    // Method pasang bayonet
    public void pasangBayonet() {
        menusuk = true;
        System.out.println("Bayonet Terpasang");
    }

    // Method menusuk
    public String menusuk() {
        if (!menusuk) {
            return "Gagal, belum pasang bayonet";
        } else {
            return "Jleb!";
        }
    }
}