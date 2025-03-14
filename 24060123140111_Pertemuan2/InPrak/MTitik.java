/* Nama File    : MTitik.java
 * Deskripsi    : berisi aplikasi method dalam class Titik
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 18 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();

        Titik T3 = new Titik();
        Titik T2 = new Titik(3,5);
        System.out.println("Jumlah Objek Titik : " + Titik.getCounterTitik());
        System.err.println("Jumlah Objek Titik : " + T2.getCounterTitik());
        System.out.println("Kuadran T1 : " + T1.getKuadran());
        System.out.println("Jarak T1 ke pusat : " + T1.getJarakPusat());
        System.out.println("Kuadran T2 : " + T2.getKuadran());
        System.out.println("Jarak antara T1 dan T2 : " + T1.getJarak(T2));

        T1.refleksiX();
        System.out.print("Titik T1 setelah refleksi terhadap sumbu X : ");
        T1.printTitik();

        T1.refleksiY();
        System.out.print("Titik T1 setelah refleksi terhadap sumbu Y : ");
        T1.printTitik();

        Titik refleksiX = T1.getRefleksiX();
        System.out.print("Hasil refleksi T1 terhadap sumbu X (tanpa mengubah aslinya) : ");
        refleksiX.printTitik();

        Titik refleksiY = T2.getRefleksiY();
        System.out.print("Hasil refleksi T2 terhadap sumbu Y (tanpa mengubah aslinya) : ");
        refleksiY.printTitik();
    }
}
