/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanab;

/**
 * Burung.java
 * Evia Auamara U N / 24060123140111
 * berisi atribut dan method dalam kelas Burung
 */

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Cuit.");
    }
}