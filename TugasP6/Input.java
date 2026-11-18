
package TugasP6;

import java.util.*;
public class Input {
    static Scanner in = new Scanner(System.in);

    static int bacaInt(String pesan) {
        System.out.print(pesan);
        return Integer.parseInt(in.nextLine().trim());
    }

    static String bacaString(String pesan) {
        System.out.print(pesan);
        return in.nextLine();
    }

    static String bacaBaris() {
        return in.nextLine();
    }

    static void judul(String teks) {
        System.out.println("\n==================================================");
        System.out.println(teks);
        System.out.println("==================================================");
    }
}
