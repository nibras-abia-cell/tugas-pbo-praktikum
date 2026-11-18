
package TugasP6;

public class Soal6 {
    static void jalankan() {
        Input.judul("SOAL 6: Rata-rata dengan exception handling");
        try {
            int n = Input.bacaInt("Banyak bilangan: ");
            if (n <= 0) throw new ArithmeticException("jumlah bilangan harus lebih dari 0");
            double total = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Bilangan ke-" + i + ": ");
                total += Double.parseDouble(Input.bacaBaris().trim());
            }
            System.out.println("Rata-rata: " + total / n);
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan: input harus berupa bilangan!");
        } catch (ArithmeticException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        } finally {
            System.out.println("(Proses soal 6 selesai)");
        }
    }
}
