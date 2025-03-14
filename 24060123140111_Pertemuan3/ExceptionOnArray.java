/*
 * File : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class
 *              library Java
 * Nama / NIM : Evia Auamara U N / 24060123140111
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2]= 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up node...");
        }
    }
}