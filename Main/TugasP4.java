package Main;

import java.util.Scanner;

public class TugasP4 {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        System.out.println("=== LATIHAN STRUKTUR KONTROL ===");
        System.out.println("1. Genap / Ganjil");
        System.out.println("2. Kode hari");
        System.out.println("3. Gaji bersih karyawan");
        System.out.println("4. Tahun kabisat");
        System.out.println("5. Pendapatan salesman");
        System.out.println("6. Kasir sederhana (if-else)");
        System.out.println("7. Luas bangun datar (switch-case)");
        System.out.print("Nomor soal: ");
        int pilih = in.nextInt();
        System.out.println();

        switch (pilih) {
            case 1: Soal1.jalankan(in); break;
            case 2: Soal2.jalankan(in); break;
            case 3: Soal3.jalankan(in); break;
            case 4: Soal4.jalankan(in); break;
            case 5: Soal5.jalankan(in); break;
            case 6: Soal6.jalankan(in); break;
            case 7: Soal7.jalankan(in); break;
            default: System.out.println("Nomor soal tidak ada.");
        }
    }
}

// SOAL 1: Menentukan bilangan genap atau ganjil (operator modulus)
class Soal1 {
    static void jalankan(Scanner in) {
        System.out.print("Masukkan bilangan: ");
        int n = in.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " adalah bilangan GENAP");
        } else {
            System.out.println(n + " adalah bilangan GANJIL");
        }
    }
}

// SOAL 2: Kode hari -> nama hari
class Soal2 {
    static void jalankan(Scanner in) {
        System.out.print("Masukkan kode hari (1-7): ");
        int kode = in.nextInt();
        String hari;

        switch (kode) {
            case 1: hari = "Senin"; break;
            case 2: hari = "Selasa"; break;
            case 3: hari = "Rabu"; break;
            case 4: hari = "Kamis"; break;
            case 5: hari = "Jumat"; break;
            case 6: hari = "Sabtu"; break;
            case 7: hari = "Minggu"; break;
            default: hari = "Kode hari tidak valid";
        }
        System.out.println("Hari: " + hari);
    }
}

// SOAL 3: Gaji bersih karyawan
class Soal3 {
    static void jalankan(Scanner in) {
        in.nextLine(); 
        System.out.print("NIK            : ");
        String nik = in.nextLine();
        System.out.print("Nama           : ");
        String nama = in.nextLine();
        System.out.print("Kode golongan (1-4) : ");
        int kode = in.nextInt();

        long gajiPokok;
        String status;
        switch (kode) {
            case 1: gajiPokok = 1200000; status = "Menikah"; break;
            case 2: gajiPokok = 1500000; status = "Belum menikah"; break;
            case 3: gajiPokok = 1750000; status = "Cerai"; break;
            case 4: gajiPokok = 2000000; status = "Menikah dan punya anak"; break;
            default:
                System.out.println("Kode golongan tidak valid.");
                return;
        }

        int jumlahAnak = 0;
        if (kode == 4) { 
            System.out.print("Jumlah anak    : ");
            jumlahAnak = in.nextInt();
        }

        double tunjPasangan = 0;
        if (kode == 1 || kode == 4) {
            tunjPasangan = 0.10 * gajiPokok;
        }

        double tunjAnak = 0.05 * gajiPokok * jumlahAnak;

        double tunjangan = tunjPasangan + tunjAnak;
        double gajiBersih = gajiPokok + tunjangan;

        System.out.println("\n----- SLIP GAJI -----");
        System.out.println("NIK                : " + nik);
        System.out.println("Nama               : " + nama);
        System.out.println("Status             : " + status);
        System.out.println("Gaji pokok         : Rp" + gajiPokok);
        System.out.println("Tunjangan pasangan : Rp" + tunjPasangan);
        System.out.println("Tunjangan anak     : Rp" + tunjAnak);
        System.out.println("Total tunjangan    : Rp" + tunjangan);
        System.out.println("Gaji bersih        : Rp" + gajiBersih);
    }
}

// SOAL 4: Menentukan tahun kabisat
class Soal4 {
    static void jalankan(Scanner in) {
        System.out.print("Masukkan tahun: ");
        int tahun = in.nextInt();

        if ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0) {
            System.out.println(tahun + " adalah tahun KABISAT");
        } else {
            System.out.println(tahun + " BUKAN tahun kabisat");
        }
    }
}

// SOAL 5: Pendapatan salesman (uang jasa + komisi)
class Soal5 {
    static void jalankan(Scanner in) {
        System.out.print("Masukkan penjualan hari ini: Rp");
        double penjualan = in.nextDouble();

        double jasa, komisi;
        if (penjualan <= 2000000) {
            jasa = 100000;
            komisi = 0.10 * penjualan;
        } else if (penjualan <= 5000000) {
            jasa = 200000;
            komisi = 0.15 * penjualan;
        } else {
            jasa = 300000;
            komisi = 0.20 * penjualan;
        }

        double pendapatan = jasa + komisi;
        System.out.println("Uang jasa  : Rp" + jasa);
        System.out.println("Komisi     : Rp" + komisi);
        System.out.println("Pendapatan : Rp" + pendapatan);
    }
}

// SOAL 6: Kasir sederhana (if-else)
class Soal6 {
    static void jalankan(Scanner in) {
        System.out.print("Punya kartu member? (y/t): ");
        String jawab = in.next();
        boolean member = jawab.equalsIgnoreCase("y");

        System.out.print("Total belanja : Rp");
        double total = in.nextDouble();
        System.out.print("Uang diberikan: Rp");
        double uang = in.nextDouble();

        double diskon = 0;
        if (member) {
            if (total > 500000) {
                diskon = 50000;
            } else if (total > 100000) {
                diskon = 15000;
            }
        } else {
            if (total > 100000) {
                diskon = 10000;
            }
        }

        double bayar = total - diskon;

        System.out.println("\n----- STRUK -----");
        System.out.println("Total belanja : Rp" + total);
        System.out.println("Diskon        : Rp" + diskon);
        System.out.println("Harus dibayar : Rp" + bayar);

        if (uang >= bayar) {
            System.out.println("Uang diberikan: Rp" + uang);
            System.out.println("Kembalian     : Rp" + (uang - bayar));
        } else {
            System.out.println("Uang kurang   : Rp" + (bayar - uang));
        }
    }
}

// SOAL 7: Luas bangun datar dengan menu (switch-case)
class Soal7 {
    static void jalankan(Scanner in) {
        System.out.println("=== MENU LUAS BANGUN DATAR ===");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Pilih menu: ");
        int menu = in.nextInt();

        switch (menu) {
            case 1: // persegi: s x s
                System.out.print("Sisi: ");
                double s = in.nextDouble();
                System.out.println("Luas persegi = " + (s * s));
                break;
            case 2: // segitiga: 1/2 x alas x tinggi
                System.out.print("Alas  : ");
                double alas = in.nextDouble();
                System.out.print("Tinggi: ");
                double tinggi = in.nextDouble();
                System.out.println("Luas segitiga = " + (0.5 * alas * tinggi));
                break;
            case 3: // lingkaran: pi x r x r
                System.out.print("Jari-jari: ");
                double r = in.nextDouble();
                System.out.println("Luas lingkaran = " + (Math.PI * r * r));
                break;
            case 4: // trapesium: 1/2 x (a + b) x t
                System.out.print("Sisi sejajar a: ");
                double a = in.nextDouble();
                System.out.print("Sisi sejajar b: ");
                double b = in.nextDouble();
                System.out.print("Tinggi        : ");
                double t = in.nextDouble();
                System.out.println("Luas trapesium = " + (0.5 * (a + b) * t));
                break;
            case 5: // layang-layang: 1/2 x d1 x d2
                System.out.print("Diagonal 1: ");
                double d1 = in.nextDouble();
                System.out.print("Diagonal 2: ");
                double d2 = in.nextDouble();
                System.out.println("Luas layang-layang = " + (0.5 * d1 * d2));
                break;
            default:
                System.out.println("Menu tidak tersedia.");
        }
    }
}
