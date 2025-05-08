/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanab;

/**
 * Kucing.java
 * Evia Auamara U N / 24060123140111
 * berisi atribut dan method dalam kelas Kucing
 */

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " berjalan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Meong.");
    }
}