/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
public class App {
    
    public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing = 0;

        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing ditambah: " + jumlahKambing);
    }

    public static void main(String[] args) throws Exception {
        App kambingJantan = new App();
        kambingJantan.tambahKambing();
    }
}
