/* Nama File    : MMain.java
 * Deskripsi    : aplikasi driver class dosen, kendaraan, mata kuliah, dan mahasiswa
 * Pembuat      : Evia Auamara U N
 * Tanggal      : 25 Februari 2025
 */

public class MMain {
        public static void main(String[] args) {
            Dosen dosen1 = new Dosen("A01", "Johnny S. Kom., M. Kom.", "Informatika");
            Dosen dosen2 = new Dosen("A02", "Jake S. Kom., M. Cs.", "Informatika");
            Dosen dosen3 = new Dosen("B01", "Inha S.T., M. T", "Teknik Industri");
            Dosen dosen4 = new Dosen("C01", "Anna S. Si., M. T.", "Teknologi Sains Data");

            MataKuliah matkul1 = new MataKuliah("MK01", "Dasar Pemrograman", 4);
            MataKuliah matkul2 = new MataKuliah("MK02", "Metode Numerik", 3);
            MataKuliah matkul3 = new MataKuliah("MK03", "Pengantar Industri", 2);
            MataKuliah matkul4 = new MataKuliah("MK04", "Statistika", 3);
            MataKuliah matkul5 = new MataKuliah("MK05", "Kalkulus 1", 2);
            MataKuliah matkul6 = new MataKuliah("MK06", "Bahasa Inggris", 3);
            MataKuliah matkul7 = new MataKuliah("MK07", "Pendidikan Agama", 2);
            MataKuliah matkul8 = new MataKuliah("MK08", "Kewarganegaraan", 3);
            MataKuliah matkul9 = new MataKuliah("MK09", "Olahraga", 1);
            MataKuliah matkul10 = new MataKuliah("MK10", "Fisika Dasar", 3);

            Kendaraan kendaraan1 = new Kendaraan("K 1818 U", "Mobil");
            Kendaraan kendaraan2 = new Kendaraan("J 03 L", "Mobil");
            Kendaraan kendaraan3 = new Kendaraan("AA 3 RI", "Mobil");
            Kendaraan kendaraan4 = new Kendaraan("N 13 L", "Motor");          
            
            Mahasiswa mhs1 = new Mahasiswa("40111", "Unsa Nasyta", "Informatika");
            Mahasiswa mhs2 = new Mahasiswa("40115", "Jeonghyeon Lee", "Informatika");
            Mahasiswa mhs3 = new Mahasiswa("30117", "Giselle", "Teknik Industri");
            Mahasiswa mhs4 = new Mahasiswa("20119", "Daniel Kim", "Teknologi Sains Data");

            mhs1.setDosenWali(dosen1);
            mhs2.setDosenWali(dosen2);
            mhs3.setDosenWali(dosen3);
            mhs4.setDosenWali(dosen4);

            mhs1.setKendaraan(kendaraan1);
            mhs2.setKendaraan(kendaraan2);
            mhs3.setKendaraan(kendaraan3);
            mhs4.setKendaraan(kendaraan4);

            mhs1.addMatKul(matkul1);
            mhs1.addMatKul(matkul2);
            mhs1.addMatKul(matkul4);
            mhs1.addMatKul(matkul5);
            mhs1.addMatKul(matkul6);
            mhs1.addMatKul(matkul7);
            mhs1.addMatKul(matkul8);
            mhs1.addMatKul(matkul9);

            mhs2.addMatKul(matkul1);
            mhs2.addMatKul(matkul2);
            mhs2.addMatKul(matkul4);
            mhs2.addMatKul(matkul5);
            mhs2.addMatKul(matkul6);
            mhs2.addMatKul(matkul7);
            mhs2.addMatKul(matkul8);
            mhs2.addMatKul(matkul9);

            mhs3.addMatKul(matkul2);
            mhs3.addMatKul(matkul3);
            mhs3.addMatKul(matkul4);
            mhs3.addMatKul(matkul5);
            mhs3.addMatKul(matkul6);
            mhs3.addMatKul(matkul7);
            mhs3.addMatKul(matkul8);
            mhs3.addMatKul(matkul9);
            mhs3.addMatKul(matkul10);

            mhs4.addMatKul(matkul1);
            mhs4.addMatKul(matkul2);
            mhs4.addMatKul(matkul4);
            mhs4.addMatKul(matkul5);
            mhs4.addMatKul(matkul6);
            mhs4.addMatKul(matkul7);
            mhs4.addMatKul(matkul8);
            mhs4.addMatKul(matkul9);
            mhs4.addMatKul(matkul10);

            mhs1.printMhs();
            mhs2.printMhs();
            mhs3.printMhs();
            mhs4.printMhs();

            dosen1.printDosen();
            dosen2.printDosen();
            dosen3.printDosen();
            dosen4.printDosen();

            matkul1.printMatKul();
            matkul2.printMatKul();
            matkul3.printMatKul();
            matkul4.printMatKul();
            matkul5.printMatKul();
            matkul6.printMatKul();
            matkul7.printMatKul();
            matkul8.printMatKul();
            matkul9.printMatKul();
            matkul10.printMatKul();

            kendaraan1.printKendaraan();
            kendaraan2.printKendaraan();
            kendaraan3.printKendaraan();
            kendaraan4.printKendaraan();
            System.out.println("------------------------------------------------");

            mhs1.printDetailMhs();
            mhs2.printDetailMhs();
            mhs3.printDetailMhs();
            mhs4.printDetailMhs();
        }
}
