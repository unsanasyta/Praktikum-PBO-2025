/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihantutorial;

/**
 *
 * @author ASUS
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;

    // Constructor to initialize the weapon sound (bunyi)
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false; // Default to false when weapon is not firing
    }

    // Getter for bunyi
    public String getBunyi() {
        return bunyi;
    }

    // Setter for bunyi
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    // Getter for menusuk
    public boolean isMenusuk() {
        return menusuk;
    }

    // Setter for menusuk
    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    // Method to simulate firing the weapon
    public void menembak(int jumlah) {
        // Print out the firing sound repeated based on the 'jumlah' parameter
        for (int i = 0; i < jumlah; i++) {
            System.out.print(bunyi + " ");
        }
    }

    // Method to simulate if the weapon is firing or not
    public String menusuk() {  // Should return String, not void
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
