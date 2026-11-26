
package TugasP7;

import java.util.Scanner;

public class Soal7 {
    public void jalankan(Scanner in) {
        in.nextLine(); 
        System.out.print("Nama  : ");
        String nama = in.nextLine();
        System.out.print("NPM   : ");
        String npm = in.nextLine();
        System.out.print("Kelas : ");
        String kelas = in.nextLine();
        new DataMahasiswa(nama, npm, kelas).tampil();
    }
}
