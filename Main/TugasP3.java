package Main;

import java.io.*;
import java.util.Scanner;

public class TugasP3 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Pilih soal:");
        System.out.println("1. Gaji bersih");
        System.out.println("2. DataInputStream/DataOutputStream");
        System.out.println("3. Scanner (3a) / BufferedReader (3b)");
        System.out.println("4. Gaya sentripetal");
        System.out.println("5. Total buah");
        System.out.println("6. Selisih waktu");
        System.out.println("7. Waktu cetak novel");
        System.out.print("Nomor soal: ");
        String pilih = in.nextLine().trim();

        switch (pilih) {
            case "1": Soal1.main(args); break;
            case "2": Soal2.main(args); break;
            case "3a": Soal3Scanner.main(args); break;
            case "3b": Soal3BufferedReader.main(args); break;
            case "4": Soal4.main(args); break;
            case "5": Soal5.main(args); break;
            case "6": Soal6.main(args); break;
            case "7": Soal7.main(args); break;
            default: System.out.println("Pilihan tidak ada.");
        }
    }
}
// SOAL 1: Gaji bersih pegawai
class Soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nomor Induk Karyawan : ");
        String nik = in.nextLine();
        System.out.print("Nama Karyawan        : ");
        String nama = in.nextLine();
        System.out.print("Alamat               : ");
        String alamat = in.nextLine();
        String jabatan = "Manajer";

        long p1 = 2000000; // gaji pokok
        long p2 = 300000;  // tunjangan jabatan
        long p3 = 200000;  // tunjangan istri
        long p4 = 150000;  // tunjangan anak

        long totalGaji = p1 + p2 + p3 + p4;
        double pajak = 0.10 * (p1 + p2 + p3 + p4);
        double gajiBersih = totalGaji - pajak;

        System.out.println("\n----- SLIP GAJI -----");
        System.out.println("Nomor Induk Karyawan : " + nik);
        System.out.println("Nama Karyawan        : " + nama);
        System.out.println("Alamat               : " + alamat);
        System.out.println("Jabatan              : " + jabatan);
        System.out.println("Gaji Pokok           : " + p1);
        System.out.println("Tunjangan Jabatan    : " + p2);
        System.out.println("Tunjangan Istri      : " + p3);
        System.out.println("Tunjangan Anak       : " + p4);
        System.out.println("Total Gaji           : " + totalGaji);   
        System.out.println("Pajak Penghasilan    : " + pajak);       
        System.out.println("Gaji Bersih          : " + gajiBersih);  
    }
}

// SOAL 2: DataInputStream dan DataOutputStream
class Soal2 {
    @SuppressWarnings("deprecation") 
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(System.in);
        DataOutputStream out = new DataOutputStream(System.out);

        out.writeBytes("Nama          : ");
        out.flush();
        String nama = in.readLine();

        out.writeBytes("Total Belanja : ");
        out.flush();
        double totalBelanja = Double.parseDouble(in.readLine());

        out.writeBytes("Diskon (%)    : ");
        out.flush();
        double diskon = Double.parseDouble(in.readLine());

        double total = totalBelanja - (totalBelanja * diskon / 100);

        out.writeBytes("Bayar         : ");
        out.flush();
        double bayar = Double.parseDouble(in.readLine());

        double kembalian = bayar - total;

        out.writeBytes("\n----- STRUK -----\n");
        out.writeBytes("Nama          : " + nama + "\n");
        out.writeBytes("Total Belanja : " + totalBelanja + "\n");
        out.writeBytes("Diskon (%)    : " + diskon + "\n");
        out.writeBytes("Total         : " + total + "\n");
        out.writeBytes("Bayar         : " + bayar + "\n");
        out.writeBytes("Kembalian     : " + kembalian + "\n");
        out.flush();
    }
}

// SOAL 3: Perbedaan Scanner dan BufferedReader
//
// Scanner:
//  - Bisa langsung membaca tipe data: nextInt(), nextDouble(), dst.
//  - Memecah input berdasarkan token (spasi) dan mendukung regex.
//  - Buffer kecil (1 KB), lebih lambat untuk input besar.
//  - Tidak melempar IOException yang wajib ditangani.
//
// BufferedReader:
//  - Hanya membaca String (readLine()), konversi dilakukan manual
//    (Integer.parseInt, dst).
//  - Buffer lebih besar (8 KB), lebih cepat untuk input besar.
//  - Wajib menangani IOException.
//  - Perlu dibungkus InputStreamReader untuk membaca System.in.

// memakai Scanner
class Soal3Scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = in.nextLine();
        System.out.print("Umur : ");
        int umur = in.nextInt();
        System.out.println("[Scanner] " + nama + ", " + umur + " tahun");
    }
}

// memakai BufferedReader
class Soal3BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nama : ");
        String nama = br.readLine();
        System.out.print("Umur : ");
        int umur = Integer.parseInt(br.readLine()); 
        System.out.println("[BufferedReader] " + nama + ", " + umur + " tahun");
    }
}

// SOAL 4: Gaya sentripetal  Fc = (m * v^2) / r
class Soal4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Massa (m)         : ");
        double m = in.nextDouble();
        System.out.print("Kecepatan (v)     : ");
        double v = in.nextDouble();
        System.out.print("Jari-jari (r)     : ");
        double r = in.nextDouble();

        double fc = (m * v * v) / r;
        System.out.println("Gaya sentripetal  : " + fc);
    }
}

// SOAL 5: Total buah Ibu Sisca (BufferedReader + InputStreamReader)
class Soal5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Jumlah mangga dibeli       : ");
        int mangga = Integer.parseInt(br.readLine());       
        System.out.print("Jumlah tetangga            : ");
        int tetangga = Integer.parseInt(br.readLine());     
        System.out.print("Jambu per tetangga         : ");
        int jambuPerTetangga = Integer.parseInt(br.readLine()); 
        System.out.print("Mangga busuk (dikembalikan): ");
        int busuk = Integer.parseInt(br.readLine());        

        int jambu = tetangga * jambuPerTetangga;  
        int manggaSisa = mangga - busuk;          
        int totalBuah = manggaSisa + jambu;       

        System.out.println("Mangga sisa : " + manggaSisa);
        System.out.println("Total jambu : " + jambu);
        System.out.println("Total buah  : " + totalBuah);
    }
}

// SOAL 6: Selisih waktu antara waktu pertama dan kedua
// Caranya: ubah ke detik, kurangkan, lalu ubah kembali ke jam:menit:detik
class Soal6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Waktu pertama");
        System.out.print("Jam    : ");
        int j1 = in.nextInt();
        System.out.print("Menit  : ");
        int m1 = in.nextInt();
        System.out.print("Detik  : ");
        int d1 = in.nextInt();

        System.out.println("Waktu kedua");
        System.out.print("Jam    : ");
        int j2 = in.nextInt();
        System.out.print("Menit  : ");
        int m2 = in.nextInt();
        System.out.print("Detik  : ");
        int d2 = in.nextInt();

        int detik1 = j1 * 3600 + m1 * 60 + d1;
        int detik2 = j2 * 3600 + m2 * 60 + d2;
        int selisih = Math.abs(detik2 - detik1);

        int jam = selisih / 3600;
        int menit = (selisih % 3600) / 60;
        int detik = selisih % 60;

        System.out.println("Selisih waktu: " + jam + " jam " + menit
                + " menit " + detik + " detik");
    }
}

// SOAL 7: Waktu pencetakan novel (kecepatan 1 lembar/detik)
class Soal7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Banyaknya novel          : ");
        long jumlahNovel = in.nextLong();
        System.out.print("Tebal per novel (lembar) : ");
        long lembarPerNovel = in.nextLong();

        long totalDetik = jumlahNovel * lembarPerNovel;

        long hari = totalDetik / 86400;
        long sisa = totalDetik % 86400;
        long jam = sisa / 3600;
        sisa = sisa % 3600;
        long menit = sisa / 60;
        long detik = sisa % 60;

        System.out.println("Waktu yang dibutuhkan: " + hari + " hari "
                + jam + " jam " + menit + " menit " + detik + " detik");
    }
}

