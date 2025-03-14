/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 18 Februari 2025
 */

 public class Garis {
    /*************ATRIBUT*************/
    Titik X1;
    Titik X2;
    static int counterGaris = 0;

    /*************METHOD*************/
    //konstruktor dengan parameter masukan titik awal dan titik akhir.
    Garis(Titik X1, Titik X2){
        this.X1 = new Titik(X1.getAbsis(), X1.getOrdinat());
        this.X2 = new Titik(X2.getAbsis(), X2.getOrdinat());
        counterGaris++;
    }

    //konstruktor untuk membuat garis (0,0),(1,1)
    Garis() {
        this.X1 = new Titik(0, 0);
        this.X2 = new Titik(1, 1);
        counterGaris++;
    }

    //mengembalikan nilai X1
    Titik getX1() {
        return X1;
    }  

    //mengembalikan nilai X2
    Titik getX2() {
        return X2;
    }  

    //mengembalikan nilai counterGaris
    static int getCounterGaris() {
        return counterGaris;
    }

    //mengeset absis titik dengan nilai baru x
    void setX1(double x, double y) {
        X1.setAbsis(x);
        X1.setOrdinat(y);
    }

    //mengeset ordinat titik dengan nilai baru y
    void setX2(double x, double y) {
        X2.setAbsis(x);
        X2.setOrdinat(y);
    }

    //menghitung panjang garis
    double panjangGaris() {
        return Math.sqrt(Math.pow(X2.getAbsis() - X1.getAbsis(), 2) + Math.pow(X2.getOrdinat() - X1.getOrdinat(), 2));
    }

    //menghitung gradien garis
    double gradien() {
        return (X2.getOrdinat() - X1.getOrdinat()) / (X2.getAbsis() - X1.getAbsis());
    }

    //mendapatkan titik tengah
    Titik titikTengah() {
        double tengahX = (X1.getAbsis() + X2.getAbsis()) / 2;
        double tengahY = (X1.getOrdinat() + X2.getOrdinat()) / 2;
        return new Titik(tengahX, tengahY);
    }

    //mengecek apakah sejajar dengan garis lain
    boolean sejajar(Garis g) {
        return this.gradien() == g.gradien();
    }
    
    //mengecek apakah tegak lurus dengan garis lain
    boolean tegakLurus(Garis g) {
        return this.gradien() * g.gradien() == -1;
    }

    //menampilkan ke layar titik awal dan titik akhir garis
    void printGaris() {
        System.out.println("Garis dari (" + X1.getAbsis() + ", " + X1.getOrdinat() + ") ke (" + X2.getAbsis() + ", " + X2.getOrdinat() + ")");
    }

    //menampilkan persamaan garis dalam bentuk string y = mx + c
    String getPersamaan() {
        double var1 = this.gradien();
        double var3 = this.X2.getOrdinat() - var1 * this.X2.getAbsis();
        String var5 = "y = " + var1 + " x";
        if (var3 > 0.0) {
           var5 = var5 + " + " + var3;
        }
        if (var3 < 0.0) {
           var5 = var5 + " - " + Math.abs(var3);
        }
        return var5;
     }
}
