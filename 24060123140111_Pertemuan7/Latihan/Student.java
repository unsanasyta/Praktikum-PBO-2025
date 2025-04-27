/* Nama File    : Student.java
 * Deskripsi    : berisi atribut dan method dalam class Student
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 22 April 2025
 */

public class Student extends Person{
    public Student(String name){
        super(name);
    }

    @Override
    public boolean isAsleep(int hr){ 
        return 2 < hr && 8 > hr;
    }
}