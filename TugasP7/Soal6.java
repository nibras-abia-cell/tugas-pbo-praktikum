
package TugasP7;

public class Soal6 {
    public void jalankan() {
        Civitas[] daftar = { new Dosen("Pak Budi"), new Mahasiswa("Ani"), new Staff("Bu Siti") };
        for (Civitas c : daftar) c.tampil();
        System.out.println("Hubungan: Dosen, Mahasiswa, Staff adalah turunan (is-a) dari Civitas.");
    }
}
