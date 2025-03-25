/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 25 Maret 2025
 */

public class Mahasiswa extends CivitasAkademika {
    private String NIM;
    private int semester;
    private Fakultas fakultas;
    private static int counter = 0;

    public Mahasiswa() {

    }

    public Mahasiswa(String nama, String email, String NIM, int semester, Fakultas fakultas) {
        super(nama, email);
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
        counter++;
    }
    
    public void setNIM(String NIM) { 
        this.NIM = NIM; 
    }

    public String getNIM() { 
        return NIM; 
    }

    public void setSemester(int semester) { 
        this.semester = semester; 
    }
    
    public int getSemester() { 
        return semester; 
    }

    public void setFakultas(Fakultas fakultas) { 
        this.fakultas = fakultas; 
    }
    
    public Fakultas getFakultas() { 
        return fakultas; 
    }

    public float hitungUKT() { 
        return fakultas.getTarifUKT() * (float) Math.pow(0.95, semester - 1);
    }

    public static int getCounter() { 
        return counter; 
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIM         : " + NIM);
        System.out.println("Semester    : " + semester);
        System.out.println("Fakultas    : " + fakultas.getNama());
        System.out.println("Tarif UKT   : Rp " + hitungUKT());
    }
}
