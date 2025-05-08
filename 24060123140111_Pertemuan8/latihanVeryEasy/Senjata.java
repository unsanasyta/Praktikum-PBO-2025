/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanveryeasy;

/**
 *
 * @author ASUS
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    // Constructor to initialize the weapon sound (bunyi)
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false; // Default to false when weapon is not firing
        this.peluru = 0; // Default to 0 bullets
    }

    // Getter for bunyi
    public String getBunyi() {
        return bunyi;
    }

    // Setter for bunyi
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    // Getter for peluru (bullets)
    public int getPeluru() {
        return peluru;
    }

    // Setter for peluru (bullets)
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    // Getter for menusuk (bayonet)
    public boolean isMenusuk() {
        return menusuk;
    }

    // Setter for menusuk (bayonet)
    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    // Method to simulate firing the weapon
    public void menembak() {
        if (peluru > 0) {
            System.out.println(bunyi);
            peluru--; // Reduce one bullet after firing
        } else {
            System.out.println("Tidak ada peluru!");
        }
    }

    // Method to simulate if the weapon is firing or not with bayonet
    public String menusuk() {
        if (this.menusuk) {
            return "Bayonet Terpasang";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }

    // Method to simulate bayonet attachment
    public void pasangBayonet() {
        this.menusuk = true; // Set menusuk to true when bayonet is attached
    }
}
