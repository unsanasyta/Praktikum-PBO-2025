/* Nama File    : IResize.java
 * Deskripsi    : -
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 11 Maret 2025
 */

public interface IResize {
    // Menambah ukuran menjadi 10% lebih besar
    void zoomIn();
    
    // Mengurangi ukuran menjadi 10% lebih kecil
    void zoomOut();
    
    // Menskalakan ukuran sesuai dengan input percent yang diberikan
    void zoom(int percent);
}