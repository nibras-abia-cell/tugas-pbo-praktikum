
package TugasP7;

public class Mobil {
    String merk;
    int tahun;

    public Mobil(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    public void info() {
        System.out.println("Mobil " + merk + " tahun " + tahun);
    }
}