package TugasP6;

import java.util.Arrays;

public class Soal3 {
    static void jalankan() {
        Input.judul("SOAL 3: Array dinamis");
        int n = Input.bacaInt("a. Jumlah elemen array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {                                  
            arr[i] = Input.bacaInt("b. Elemen ke-" + i + ": ");
        }

        int max = arr[0], min = arr[0], iMax = 0, iMin = 0;            
        double total = 0;
        int sumGanjil = 0, sumGenap = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) { max = arr[i]; iMax = i; }
            if (arr[i] < min) { min = arr[i]; iMin = i; }
            total += arr[i];
            if (i % 2 == 1) sumGanjil += arr[i]; else sumGenap += arr[i];
        }
        System.out.println("c. Terbesar: " + max + " (indeks " + iMax + ")");
        System.out.println("   Terkecil: " + min + " (indeks " + iMin + ")");
        System.out.println("d. Rata-rata: " + total / n);
        System.out.println("e. Jumlah elemen indeks ganjil (NPM genap): " + sumGanjil);
        System.out.println("f. Jumlah elemen indeks genap  (NPM ganjil): " + sumGenap);
        System.out.println("g. Hasil langkah e = " + sumGanjil + " -> "
                + (sumGanjil % 2 != 0 ? "ganjil" : "genap"));
        Arrays.sort(arr);                                              
        System.out.println("h. Array terurut: " + Arrays.toString(arr));
    }
}
