package Main;

    import java.util.Scanner;

public class TugasP5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

            System.out.println("1. Soal 1");
            System.out.println("2. Soal 2");
            System.out.println("3. Soal 3");
            System.out.println("4. Soal 4");
            System.out.println("5. Soal 5");
            System.out.println("6. Soal 6");
            System.out.println("7. Soal 7");
            System.out.println("8. Soal 8");
            System.out.println("0. Keluar");
            System.out.println("==========================================");
            System.out.print("Pilih nomor soal (0-8): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    soal1(scanner);
                    break;
                case 2:
                    soal2(scanner);
                    break;
                case 3:
                    soal3(scanner);
                    break;
                case 4:
                    soal4(scanner);
                    break;
                case 5:
                    soal5();
                    break;
                case 6:
                    soal6();
                    break;
                case 7:
                    soal7();
                    break;
                case 8:
                    soal8();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
    }

    public static void soal1(Scanner scanner) {
        System.out.print("Masukkan bilangan ke-1: ");
        int bil = scanner.nextInt();
        int maxVal = bil;
        int minVal = bil;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            bil = scanner.nextInt();
            if (bil > maxVal) maxVal = bil;
            if (bil < minVal) minVal = bil;
        }

        System.out.println("\nBilangan Terbesar: " + maxVal);
        System.out.println("Bilangan Terkecil : " + minVal);
    }

    public static void soal2(Scanner scanner) {
        System.out.print("Masukkan jumlah bilangan: ");
        int n = scanner.nextInt();
        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            double bil = scanner.nextDouble();
            total += bil;
        }

        double rataRata = total / n;
        System.out.println("\nTotal jumlah bilangan : " + total);
        System.out.println("Rata-rata            : " + rataRata);
    }

    public static void soal3(Scanner scanner) {
        System.out.print("Masukkan banyak baris : ");
        int baris = scanner.nextInt();
        int angka = 1;

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println();
        }
    }

    public static void soal4(Scanner scanner) {
        System.out.print("Masukkan banyak angka : ");
        int n = scanner.nextInt();
        int total = 0;
        int ganjil = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(ganjil + " ");
            total += ganjil;
            ganjil += 2;
        }

        System.out.println("\nTotal penjumlahan : " + total);
    }

    public static void soal5() {
        System.out.println("--- Half Triangle ---");
        int n1 = 5;
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n1 - i; j++) System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\n--- Full Triangle ---");
        int n2 = 3;

        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= n2 - i; j++) System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) System.out.print("*");
            System.out.println();
        }

        for (int i = n2 - 1; i >= 1; i--) {
            for (int j = 1; j <= n2 - i; j++) System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) System.out.print("*");
            System.out.println();
        }
    }

    public static void soal6() {
        for (int i = 0; i < 10; i++) {
            if (i == 0 || i == 1) {
                System.out.println(11);
            }
        }
    }

    public static void soal7() {
        System.out.println("--- Menggunakan i++ ---");
        int i = 0;
        while (i++ < 3) {
            System.out.println(i);
        }

        System.out.println("\n--- Menggunakan ++i ---");
        int j = 0;
        while (++j < 3) {
            System.out.println(j);
        }
    }

    public static void soal8() {
        int[] angka = {10, 20, 30, 40, 50};

        for (int x : angka) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
