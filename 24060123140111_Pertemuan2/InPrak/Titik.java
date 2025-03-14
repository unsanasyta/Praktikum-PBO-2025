/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 18 Februari 2025
 */

public class Titik{
    /*************ATRIBUT*************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*************METHOD*************/
    Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    //konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    //print jumlah titik
    void printCount(){
        System.out.println("Jumlah titik = " + counterTitik);
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset absis titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    //mengembalikan nilai kuadran
    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0; // 0 menunjukkan titik berada di sumbu atau pusat
        }
    }

    //mengembalikan nilai jarak pusat
    double getJarakPusat() {
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    //mengembalikan nilai jarak dua titik
    double getJarak(Titik T) {
        return Math.sqrt(((absis-T.absis)*(absis-T.absis)) + ((ordinat-T.ordinat)*(ordinat-T.ordinat)));
    }

    //menrefleksikan absis
    void refleksiX() {
        ordinat = ordinat * (-1);
    }

    //menrefleksikan ordinat
    void refleksiY() {
        absis = absis * (-1);
    }

    //mengembalikan titik refleksi terhadap sumbu X
    Titik getRefleksiX() {
       Titik T1 = new Titik(absis, ordinat * (-1));
       return T1;
}

    //mengembalikan titik refleksi terhadap sumbu Y
    Titik getRefleksiY() {
        Titik T1 = new Titik(absis * (-1), ordinat);
        return T1;
}

    //end class Titik

}