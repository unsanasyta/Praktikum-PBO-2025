/* Nama File    : CivitasAkademika.java
 * Deskripsi    : berisi atribut dan method dalam class Civitas Akademika
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 25 Maret 2025
 */

public class CivitasAkademika {
    private String nama;
    private String email;

    public CivitasAkademika() {

    }

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public void setNama(String nama) {
        this.nama = nama; 
    }

    public String getNama() { 
        return nama; 
    }
    
    public void setEmail(String email) { 
        this.email = email; 
    }
    
    public String getEmail() { 
        return email; 
    }
    
    public void printInfo() {
        System.out.println("Nama        : " + nama);
        System.out.println("Email       : " + email);
    }  
}
