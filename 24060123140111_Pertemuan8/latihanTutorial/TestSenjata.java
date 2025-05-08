/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihantutorial;

/**
 * TestSenjata.java
 * Evia Auamara U N / 24060123140111
 * berisi implementasi pemanggilan methods dalam kelas
 */

public class TestSenjata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata mi16 = new Senjata("DOR");

        System.out.print("AK47 Menembak 3x : ");
        ak47.menembak(3);

        System.out.print("MI16 Menembak 1x : ");
        mi16.menembak(1);

        System.out.println("AK47 menusuk : " + ak47.menusuk());

        ak47.pasangBayonet();
        System.out.println("AK47 menusuk : " + ak47.menusuk());
        
    }
}
