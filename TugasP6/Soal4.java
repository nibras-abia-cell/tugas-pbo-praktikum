
package TugasP6;


public class Soal4 {
    static void jalankan() {
        Input.judul("SOAL 4: Daftar nilai mahasiswa");
        int n = Input.bacaInt("Jumlah mahasiswa: ");
        String[] nama = new String[n];
        int[] nilai = new int[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            nama[i] = Input.bacaString("Nama  mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = Input.bacaInt("Nilai mahasiswa ke-" + (i + 1) + ": ");
            status[i] = nilai[i] <= 50 ? "Tidak Lulus" : "Lulus";
        }
        System.out.println("\n               Daftar Nilai Mahasiswa");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-5s %-18s %-8s %-12s%n", "No", "Nama", "Nilai", "Status");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d %-18s %-8d %-12s%n", i + 1, nama[i], nilai[i], status[i]);
        }
    }
}
