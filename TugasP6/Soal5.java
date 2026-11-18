
package TugasP6;


public class Soal5 {
    static void jalankan() {
        Input.judul("SOAL 5: Penjumlahan matriks");
        int baris = Input.bacaInt("Jumlah baris : ");
        int kolom = Input.bacaInt("Jumlah kolom : ");
        int[][] A = new int[baris][kolom];
        int[][] B = new int[baris][kolom];
        int[][] C = new int[baris][kolom];
        System.out.println("Isi matriks A:");
        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++)
                A[i][j] = Input.bacaInt("A[" + i + "][" + j + "] = ");
        System.out.println("Isi matriks B:");
        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++)
                B[i][j] = Input.bacaInt("B[" + i + "][" + j + "] = ");
        System.out.println("Hasil A + B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
