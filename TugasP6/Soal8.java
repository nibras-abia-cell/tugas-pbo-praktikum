
package TugasP6;

public class Soal8 {
    static void jalankan() throws InterruptedException {
        Input.judul("SOAL 8: Banyak thread");
        System.out.println("Thread utama: " + Thread.currentThread().getName());
        int jumlah = Input.bacaInt("Jumlah thread anak: ");
        Thread[] ts = new Thread[jumlah];
        for (int i = 0; i < jumlah; i++) {
            ts[i] = new Pekerja(i + 1);
            ts[i].start();
        }
        for (Thread t : ts) t.join();         // tunggu semua thread anak selesai
        System.out.println("Semua thread anak selesai");
    }
}
