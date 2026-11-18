
package TugasP6;

public class Soal7 {
    static void jalankan() throws InterruptedException {
        Input.judul("SOAL 7: Kelas yang mewarisi Thread");
        KelasBaru t = new KelasBaru();
        t.start();                            // memulai eksekusi thread
        t.join();
    }
}
