
package TugasP7;


import java.util.Scanner;

public class Soal3 {
    public int tebak(int bulan, int tanggal) {
        int hasil = ((bulan * 5 + 6) * 4 + 9) * 5 + tanggal;
        return hasil - 165;   // contoh: 14 Januari -> 114
    }

    public void jalankan(Scanner in) {
        System.out.print("Bulan lahir (1-12): ");
        int bulan = in.nextInt();
        System.out.print("Tanggal lahir     : ");
        int tgl = in.nextInt();
        System.out.println("Hasil akhir = " + tebak(bulan, tgl));
    }
}
