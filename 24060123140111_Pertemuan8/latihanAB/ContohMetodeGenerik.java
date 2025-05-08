/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanab;

/**
 * Kucing.java
 * Evia Auamara U N / 24060123140111
 * berisi atribut dan method dalam kelas ContohMetodeGenerik
 */

public class ContohMetodeGenerik {
    public static <T extends Anabul> void simulasi(T anabul) {
        anabul.gerak();
        anabul.bersuara();
    }
}