
package TugasP6;

import java.util.Arrays;

public class Soal2 {
    static void jalankan() {
        Input.judul("SOAL 2: Ubah nilai Suzuki");
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};
        System.out.println("Sebelum: " + Arrays.toString(mobil));
        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                mobil[i] = "Buggati";
                System.out.println("Indeks " + i + " diubah menjadi " + mobil[i]);
            }
        }
        System.out.println("Sesudah: " + Arrays.toString(mobil));
    }
}
