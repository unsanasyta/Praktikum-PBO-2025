public class MMain {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi = new Persegi(5, "Merah", "Hitam");
        System.out.println("Persegi:");
        persegi.printInfo();
        System.out.println("Luas: " + persegi.getLuas());
        System.out.println("Keliling: " + persegi.getKeliling());
        System.out.println("Diagonal: " + persegi.getDiagonal());
        System.out.println();

        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(10, "Biru", "Putih");
        System.out.println("Lingkaran:");
        lingkaran.printInfo();
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("Keliling: " + lingkaran.getKeliling());
    }
}
