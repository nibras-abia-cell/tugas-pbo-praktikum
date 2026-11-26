
package TugasP7;

public class Soal5 {
    public int faktorial(int n) {
        if (n <= 1) return 1;
        return n * faktorial(n - 1);   // memanggil dirinya sendiri
    }

    public void jalankan() {
        System.out.println("5! = " + faktorial(5));
    }
}
