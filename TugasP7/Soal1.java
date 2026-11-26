
package TugasP7;

public class Soal1 {
    public void jalankan() {
        System.out.println("Kelas = cetak biru, objek = wujud nyata kelas di memori.");
        System.out.println("Tahap: deklarasi -> instansiasi (new) -> inisialisasi (konstruktor).");
        Mobil m = new Mobil("Toyota", 2020);
        m.info();
    }
}
