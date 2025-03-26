package telustudios;
import java.util.Scanner;

public class Mulai {

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membuat karakter pemain
        System.out.println("Selamat datang di Petualangan Hutan Misteri!");
        System.out.print("Masukkan nama karaktermu: ");
        String playerName = scanner.nextLine();
        Character player = new Character(playerName, 100);
        
        // Inisialisasi scene-scene (harus dibuat dari bawah ke atas karena reference)
        // Scene akhir
        Scene endingGood = new Scene(
            "Akhirnya kamu berhasil menemukan jalan keluar dari hutan misteri ini!\n" +
            "Dengan harta karun di tangan, kamu kembali ke desa sebagai pahlawan.\n" +
            "SELAMAT! Kamu telah menyelesaikan petualangan!",
            null, null, 0, 0,null,
            null, null, 0, 0,null,
            null, null, 0, 0, null
        );
        
        Scene endingBad = new Scene(
            "Kamu tidak berhasil menemukan jalan keluar...\n" +
            "Kegelapan hutan semakin pekat dan kamu tersesat selamanya.\n" +
            "GAME OVER!",
            null, null, 0, 0,null,
            null, null, 0, 0,null,
            null, null, 0, 0,null
        );
        
        // Scene 9 - Jalan Keluar
        Scene scene9 = new Scene(
            "Kamu berhasil mengalahkan kerajaan dan mendapatkan pedang sakti!\n" +
            "Pedang sakti itu bisa berbicara dan  menunjukkan tiga jalur berbeda untuk keluar dari hutan ini.",
            "Ikuti jalur ke utara melalui pegunungan", endingGood, 0, 50,null,
            "Ikuti jalur ke timur melalui rawa-rawa", endingBad, 30, 0,null,
            "Ikuti jalur ke barat melalui gua", endingGood, 10, 20,null
        );
        
        // // Scene 8 - Kerajaan Terbengkalai
        Scene scene8 = new Scene(
            "Kamu menemukan sebuah Kerajaan terbengkalai di tengah area persawhaan.\n" +
            "Di dalam kerajaan tampak ada pedang sakti, tapi dijaga oleh makhluk berbahaya.",
            "Lawan penjaga kerajaan untuk mendapatkan harta", scene9, 40, 40,null,
            "Coba menyelinap masuk saat penjaga tertidur", scene9, 0, 30,null,
            "Tinggalkan kerjaaan dan cari jalan lain", endingBad, 0, 10,null
        );
        
        // // Scene 7 - Jembatan Tali
        Scene scene7 = new Scene(
            "Kamu menemukan jembatan tali yang terlihat rapuh melintasi jurang yang dalam.\n" +
            "Di seberang jurang tampak ada sebuah bangunan tua.",
            "Seberangi jembatan dengan hati-hati", scene8, 10, 20,null,
            "Cari jalan lain untuk menyeberang", scene8, 0, 15,null,
            "Tidak berani dan coba untuk memutar arah", endingBad, 0, 5,null
        );
        
        // // Scene 6 - Persimpangan
        Scene scene6 = new Scene(
            "Kamu tiba di persimpangan tiga arah.\n" +
            "Jalan setapak ke kiri menuju ke persawahan, lurus menuju ke hutan,\n" +
            "dan jalan ke kanan menuju area terlarang.",
            "Ambil jalan ke kiri menuju persawahan", scene7, 0, 15,null,
            "Lanjutkan lurus menuju perbukitan", endingBad, 25, 5,null,
            "Ambil jalan ke kanan menuju area terlarang", scene8, 0, 25,null
        );
        
        // // Scene 5 - Sungai
        Scene scene5 = new Scene(
            "Kamu menemukan sungai besar .\n" +
            "Di tepi sungai ada perahu kecil yang ditambatkan. Di seberang sungai terlihat jalan setapak.",
            "Gunakan perahu untuk menyeberang", scene6, 0, 10,null,
            "Berenang menyeberangi sungai", scene6, 25, 25,null,
            "Cari jalan lain di sepanjang tepi sungai", scene7, 5, 15,null
        );
        
        // Scene 4 - Sabana
     Scene scene4 = new Scene(
            "Kamu tiba di sabana rumput yang luas sekali. Kamu merasa bingung karena kamu tidak tau mau pergi kemana .\n" +
            "Disini kamu juga melihat beberapa hewan liar yang sedang memakan rerumputan",
            "Berjalan menyusuri tepi padang rumput", scene5, 0, 10, null,
            "Mencoba menggangu hewan liar ", scene5, 35, 15,null,
            "Mencoba menyusuri melewati kebun jagung", scene5, 5, 5,null
        );
        
        // Scene 3 - Fenomena anomali
        Scene scene3 = new Scene(
            "Tiba tiba kamu melihat orang berkepala sapi yang muncul dari dalam rumah tersebut.\n" +
            "Kamu pun terkaget dan ingin lari dari tempat tersebut.",
            "Berjalan menyusuri tepi padang rumput menggunakan obor", scene4, 0, 20, null,
            "Ambil jalan pintas melintasi padang rumput", scene4, 19, 15,null,
            "Beristirahat sejenak dan mengamati sekitar", scene4, 0, 5,null
        );
        
        // Scene 2 - Gua
        Scene scene2 = new Scene(
            "Kamu menemukan sebuah gubuk kecil seperti rumah warga akan tetapi , dari dalam terdengar suara aneh.\n" +
            "Kamu menemukan beberapa item untuk membantu kamu dalam petualangan ini.",
            "Cuek dan tidak mau mengambil item", scene3, 15, 10, null,
            "Ambil Item obor yang ada di depan gubuk", scene3, 0, 20,"Obor",
            "Mencoba menggunakan tangan kosong", scene3, 10, 20, null
        );
        
        // Scene 1 - Awal Petualangan
        Scene scene1 = new Scene(
            "Kamu terbangun di tengah hutan lebat yang terletak di dearah Jawa. Kamu kaget dengan suasana hutan yang sangat mencekam.\n" +
            "Sekarang kamu ingin bergerak dan memutuskan jalan mana yang akan kamu pilih.",
            "Ambil jalan setapak ke kiri yang tampak gelap", scene2, 15, 10, null,
            "Ambil jalan setapak ke tengah yang lebih lebar", scene3, 0, 5, null,
            "Ambil jalan setapak ke kanan yang menuju ke atas bukit", scene4, 10, 15, null
        );
        
        // Memulai cerita
        Story story = new Story(scene1, player);
        story.start();
        
        scanner.close();
    }
}
}