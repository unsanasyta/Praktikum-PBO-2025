/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanveryeasy;

/**
 *
 * @author ASUS
 */
public class TestSenjata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create two weapon objects with different sound effects
        Senjata ak47 = new Senjata("TAR");
        Senjata mi16 = new Senjata("DOR");

        // Print the current number of bullets in AK47
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());

        // Simulate reloading the AK47
        System.out.println("AK47 mengisi peluru ");
        ak47.setPeluru(5);

        // Print the number of bullets after loading
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());

        // Simulate firing the AK47
        System.out.println("AK47 menembak");
        ak47.menembak();

        // Print the remaining bullets
        System.out.println("Sisa Peluru: " + ak47.getPeluru());
    }
    
}
