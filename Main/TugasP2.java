package Main;

public class TugasP2 {
    public static void main(String[] args) {

        System.out.println(" Soal 1: Operator Increment ");
        Increment.jalankan();

        System.out.println("\n=== Soal 2: Luas Persegi Panjang ");
        PersegiPanjang.jalankan();

        System.out.println("\n=== Soal 3: Persamaan Kuadrat ");
        PersamaanKuadrat.jalankan();

        System.out.println("\n=== Soal 4: Operasi Matematika ");
        OperasiMatematika.jalankan();

        System.out.println("\n Soal 5: Luas Segitiga ");
        Segitiga.soal5();

        System.out.println("\n Soal 6: Pythagoras dan Keliling ");
        Segitiga.soal6();

        System.out.println("\n Soal 7: Ubah String ");
        UbahString.jalankan();

        System.out.println("\n Soal 8: Waktu Tempuh Cahaya ");
        WaktuCahaya.jalankan();


        System.out.println("\nSoal 9: Konversi Suhu ");
        KonversiSuhu.jalankan();
    
}

// ---------------------------------------------------------
// SOAL 1: Program untuk mengilustrasikan operator increment
// ---------------------------------------------------------
class Increment {
    static void jalankan() {
        int a = 5;
        System.out.println("a = " + a);
        System.out.println("a++ (post) = " + a++); 
        System.out.println("a sekarang = " + a);   
        System.out.println("++a (pre) = " + ++a);  
    }
}

// ---------------------------------------------------------
// SOAL 2: Luas persegi panjang (panjang = 50, lebar = 45)
// ---------------------------------------------------------
class PersegiPanjang {
    static void jalankan() {
        int panjang = 50, lebar = 45;
        int luas = panjang * lebar;
        System.out.println("Luas = " + luas); 
    }
}

// ---------------------------------------------------------
// SOAL 3: Persamaan kuadrat b^2 - 4ac (a = 2, b = 10, c = 5)
// ---------------------------------------------------------
class PersamaanKuadrat {
    static void jalankan() {
        int a = 2, b = 10, c = 5;
        int d = (b * b) - (4 * a * c);
        System.out.println("b^2 - 4ac = " + d); 
    }
}

// ---------------------------------------------------------
// SOAL 4: Penjumlahan,
}
class OperasiMatematika {
    static void jalankan() {
        int x = 22, y = 33;
        System.out.println("Penjumlahan = " + (x + y));          
        System.out.println("Pengurangan = " + (x - y));          
        System.out.println("Perkalian   = " + (x * y));         
        System.out.println("Pembagian   = " + ((double) x / y)); 
    }
}

// ---------------------------------------------------------
// SOAL 5 dan 6: Class Segitiga (a = 6, b = 8)
// ---------------------------------------------------------
class Segitiga {
    // SOAL 5: Luas segitiga
    static void soal5() {
        int a = 6, b = 8;
        double luas = 0.5 * a * b;
        System.out.println("Luas segitiga = " + luas); 
    }

    // SOAL 6: Cari sisi miring c (Pythagoras), lalu hitung keliling
    static void soal6() {
        int a = 6, b = 8;
        double c = Math.sqrt(a * a + b * b); 
        double keliling = a + b + c;         
        System.out.println("Nilai c = " + c);
        System.out.println("Keliling = " + keliling);
    }
}

// ---------------------------------------------------------
// SOAL 7: Ubah string menjadi huruf kecil dan huruf besar
// ---------------------------------------------------------
class UbahString {
    static void jalankan() {
        String a = "Saya Belajar Java";
        String b = "Saya Belajar Java";
        a = a.toLowerCase(); // saya belajar java
        b = b.toUpperCase(); // SAYA BELAJAR JAVA
        System.out.println(a);
        System.out.println(b);
    }
}

// ---------------------------------------------------------
// SOAL 8: Waktu tempuh cahaya Bumi-Bulan dan Bumi-Matahari
//         (kecepatan cahaya = 300.000 km/s)
// ---------------------------------------------------------
class WaktuCahaya {
    static void jalankan() {
        double kecepatan = 300000;         
        double jarakBulan = 384400;        
        double jarakMatahari = 152100000;  

        double waktuBulan = jarakBulan / kecepatan;       
        double waktuMatahari = jarakMatahari / kecepatan; 

        System.out.println("Bumi ke Bulan    = " + waktuBulan + " detik");
        System.out.println("Bumi ke Matahari = " + waktuMatahari + " detik ("
                + (waktuMatahari / 60) + " menit)");
    }
}

// ---------------------------------------------------------
// SOAL 9: Konversi suhu (C = 10, F = 15, R = 5)
// ---------------------------------------------------------
class KonversiSuhu {
    static void jalankan() {
        double C = 10, F = 15, R = 5;

        System.out.println("C ke F = " + (C * 9 / 5 + 32));
        System.out.println("F ke C = " + ((F - 32) * 5 / 9));

        System.out.println("C ke R = " + (C * 4 / 5));
        System.out.println("R ke C = " + (R * 5 / 4));

        System.out.println("F ke R = " + ((F - 32) * 4 / 9));
        System.out.println("R ke F = " + (R * 9 / 4 + 32));
    }
}