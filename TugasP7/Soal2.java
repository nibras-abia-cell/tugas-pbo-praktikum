
package TugasP7;

import java.util.Scanner;

public class Soal2 {
    public int hitungKeliling(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }

    public void jalankan(Scanner in) {
        System.out.print("Panjang: ");
        int p = in.nextInt();
        System.out.print("Lebar  : ");
        int l = in.nextInt();
        System.out.println("Keliling = " + hitungKeliling(p, l));
    }
}
