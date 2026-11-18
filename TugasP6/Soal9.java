
package TugasP6;

public class Soal9 {
    static void jalankan() {
        Input.judul("SOAL 9: Dua macam perulangan");
        int[] age = {12, 4, 5, 2, 6};
        System.out.println("Perulangan for:");
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
        System.out.println("Perulangan for-each:");
        for (int x : age) {
            System.out.println(x);
        }
    }
}
