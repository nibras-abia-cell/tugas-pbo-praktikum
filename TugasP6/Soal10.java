
package TugasP6;

public class Soal10 {
    static void jalankan() {
        Input.judul("SOAL 10: Data campuran");
        Object[] data = {19, 0.2, 'C', "Java", true};
        for (Object o : data) {
            System.out.println(o + " -> " + o.getClass().getSimpleName());
        }
    }
}
