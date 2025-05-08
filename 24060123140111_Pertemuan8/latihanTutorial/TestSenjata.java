/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihantutorial;

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

        // Firing the AK47 weapon 3 times
        System.out.print("AK47 Menembak 3x : ");
        ak47.menembak(3);
        System.out.println(" ");

        // Firing the MI16 weapon 1 time
        System.out.print("MI16 Menembak 1x : ");
        mi16.menembak(1);
        System.out.println(" ");

        // Testing if AK47 has bayonet attached
        System.out.println("AK47 menusuk : " + ak47.menusuk());

        // Attaching bayonet to AK47 and firing again
        ak47.pasangBayonet();
        System.out.println("AK47 menusuk : " + ak47.menusuk());
        
    }
}
