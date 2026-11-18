
package TugasP6;

import java.util.Arrays;

public class Soal1 {
    static void jalankan() {
        Input.judul("SOAL 1: Tiga variasi array integer");
        int[] a = new int[5];                 
        a[0] = 1; a[1] = 2; a[2] = 3; a[3] = 4; a[4] = 5;
        int[] b = {10, 20, 30, 40, 50};       
        int[] c = new int[]{7, 8, 9};         
        System.out.println("Variasi 1: " + Arrays.toString(a));
        System.out.println("Variasi 2: " + Arrays.toString(b));
        System.out.println("Variasi 3: " + Arrays.toString(c));
    }
}
