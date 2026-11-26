
package TugasP7;

public class Civitas {
    protected String nama;
    protected String status;

    public Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }

    public void tampil() {
        System.out.println("Nama: " + nama + " | Status: " + status + " Fakultas Teknik");
    }
}
