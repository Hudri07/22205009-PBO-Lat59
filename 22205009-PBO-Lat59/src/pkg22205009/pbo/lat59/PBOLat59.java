package pkg22205009.pbo.lat59;

/**
 * Nama : Asmalik Hudri 
 * Prodi : Teknik Informatika 
 * Semester : 3 
 * Matakuliah :Pemrograman Berorientasi Objek (PBO)
 */
//Kelas untuk mempresentasikan karakter
class Karakter {

    protected String nama;
    protected String peran;
    
    //Konstruktor untuk inisialisasi karakter dengan nama dan peran
    public Karakter(String nama, String peran) {
        this.nama = nama;
        this.peran = peran;
    }

    //Method Getter untuk mendapatkan nama karakter
    public String getNama() {
        return nama;
    }

    //Method Getter untuk mendapatkan peran karakter
    public String getPeran() {
        return peran;
    }
}

//Kelas turunan untuk karakter utama dengan tambahan atribut tim
class KarakterUtama extends Karakter {

    private String tim;

    //Konstruktro untuk inisialisasi karakter utama dengan nama, peran, dan tim
    public KarakterUtama(String nama, String peran, String tim) {
        super(nama, peran);
        this.tim = tim;
    }

    //Method Getter untuk mendapatkan tim karakter utama
    public String getTim() {
        return tim;
    }

    //Metode untuk menampilkan informasi karakter utama
    public void tampilKarakterUtama() {
        System.out.println("Nama Karakter : " + getNama());
        System.out.println("Peran: " + getPeran());
        System.out.println("Tim: " + getTim() + "\n");
    }

}

// Kelas turunan untuk karakter pendukung dengan tambahan atribut hubungan
class KarakterPendukung extends Karakter {

    private String hubungan;    //Variabel untuk menyimpan hubungan

    // Konstruktor untuk inisialisasi karakter pendukung dengan nama, peran, dan hubungan
    public KarakterPendukung(String nama, String peran, String hubungan) {
        super(nama, peran);
        this.hubungan = hubungan;
    }

    // Method Getter untuk mendapatkan hubungan karakter pendukung
    public String getHubungan() {
        return hubungan;
    }

    // Metode untuk menampilkan informasi karakter pendukung
    public void tampilKarakterPendukung() {
        System.out.println("Nama Karakter : " + getNama());
        System.out.println("Peranan sebagai : " + getPeran());
        System.out.println("Hubungan dengan Tokoh Utama : " + getHubungan());
        System.out.println("");
    }

}

// Kelas utama untuk menjalankan program
public class PBOLat59 {

    public static void main(String[] args) {
        System.out.println("===== KARAKTER UTAMA =====");
         // Membuat objek karakter utama Conan
        KarakterUtama conan = new KarakterUtama("Shinichi Kudo/Conan Edogawa",
                "Detektif", "Detektif Cilik");
        conan.tampilKarakterUtama();

         // Membuat objek karakter utama ran
        KarakterUtama ran = new KarakterUtama("Ran Mouri", "Ketua klub karate",
                "Tidak bergabung dengan tim, tetapi sering membantu tim detektif cilik");
        ran.tampilKarakterUtama();

         // Membuat objek karakter utama kogoro
        KarakterUtama kogoro = new KarakterUtama("Kogoro Mouri", "Detektif Swasta",
        "Detektif Cilik");
        kogoro.tampilKarakterUtama();

        System.out.println("===== KARAKTER PENDUKUNG =====");
         // Membuat objek karakter pendukung sonoko
        KarakterPendukung sonoko = new KarakterPendukung("Sonoko Suzuki",
                "remaja perempuan biasa yang centil dan suka mencari perhatian remaja laki-laki yang menarik",
                "Sahabat Ran");
        sonoko.tampilKarakterPendukung();

        // Membuat objek karakter pendukung genta
        KarakterPendukung genta = new KarakterPendukung("Genta Kojima",
                "pendiri Grup Detektif Cilik", "teman dari Shinichi Kudo/Conan Edogawa");
        genta.tampilKarakterPendukung();

        // Membuat objek karakter pendukung mitsuhiko
        KarakterPendukung mitsuhiko = new KarakterPendukung("Mitsuhiko Tsuburaya",
                "Seorang anggota Grup Detektif Cilik", "Teman dari Shinichi Kudo");
        mitsuhiko.tampilKarakterPendukung();

        // Membuat objek karakter pendukung eri
        KarakterPendukung eri = new KarakterPendukung("Eri Kisaki",
                "Seorang pengacara (Ratu Pengacara)", "Ibu dari Ran Mouri");
        eri.tampilKarakterPendukung();

        // Membuat objek karakter pendukung kazuha
        KarakterPendukung kazuha = new KarakterPendukung("Kazuha Toyama",
                "Ahli alkido", "Teman dekat dengan Ran Mouri");
        kazuha.tampilKarakterPendukung();

        // Membuat objek karakter pendukung heiji
        KarakterPendukung heiji = new KarakterPendukung("Heiji Hattori",
                "Ahli menyelidiki kasus dan petarung kendo",
                "Teman dekat dengan Conan Edogawa/ Shinich");
        heiji.tampilKarakterPendukung();

        // Membuat objek karakter pendukung ai
        KarakterPendukung ai = new KarakterPendukung("Ai Haibara",
                "Seorang anggota Organisasi Berbaju Hitam yang berkhianat",
                "Teman dari Conan Edogawa");
        ai.tampilKarakterPendukung();
        
        // Membuat objek karakter pendukung hiroshi
        KarakterPendukung hiroshi = new KarakterPendukung("Hiroshi Agasa",
                "Seorang profesor linglung yang menemukan beberapa perangkat untuk membantu Conan",
                "Dia sering membantu Grup Detektif");
        hiroshi.tampilKarakterPendukung();
        
        // Membuat objek karakter pendukung ayumi
        KarakterPendukung ayumi = new KarakterPendukung("Ayumi Yoshida",
                "anggota Grup Detektif Cilik", "teman Conan");
        ayumi.tampilKarakterPendukung();

    }
}
