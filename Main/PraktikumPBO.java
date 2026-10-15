package Main;

public class PraktikumPBO {

    public static void main(String[] args) {
        SukaBelajar sb = new SukaBelajar();
        Unsur un = new Unsur();
        Informatika it = new Informatika();
        
        sb.tampil();
        System.out.println();
        un.tampil();
        System.out.println();
        it.tampil();
    }
    
}

class SukaBelajar{
    void tampil(){
        System.out.println("Saya suka Pemrograman Berorientasi Objek");
        System.out.println("Belajar Pemrograman Berorientasi Objek asik");
        System.out.println("Yuk kita enjoy Cihuyy");
    }
}

class Unsur {
    void tampil() {
        System.out.println("Universitas Suryakancana");
        System.out.println("Universitas Pilihan di Cianjur");
        System.out.println("Kuliah di Fakultas Teknik");
        System.out.println("Jurusan Teknik Informatika");
    }
}
class Informatika {
    void tampil() {
        System.out.println("Saya (isi nama Anda), adalah Mahasiswa Teknik Informatika");
        System.out.println("Jujur, Amanah, dan Informatikawan");
        System.out.println("Senang Belajar PBO");
    }
}