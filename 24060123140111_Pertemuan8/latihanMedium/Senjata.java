/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmedium;

/**
 * Senjata.java
 * Evia Auamara U N / 24060123140111
 * berisi atribut dan method dalam kelas Senjata
 */

public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    // Konstruktor
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
        this.menusuk = false;
    }

    // Getter bunyi
    public String getBunyi() {
        return bunyi;
    }

    // Getter peluru
    public int getPeluru() {
        return peluru;
    }

    // Getter menusuk
    public boolean isMenusuk() {
        return menusuk;
    }

    // Setter bunyi
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    // Setter menusuk
    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    // Setter peluru
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}