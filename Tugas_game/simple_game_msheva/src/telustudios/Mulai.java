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
        // Scene scene9 = new Scene(
        //     "Kamu berhasil mengalahkan penjaga kuil dan mendapatkan peta rahasia!\n" +
        //     "Peta itu menunjukkan tiga jalur berbeda untuk keluar dari hutan ini.",
        //     "Ikuti jalur ke utara melalui pegunungan", endingGood, 0, 50,
        //     "Ikuti jalur ke timur melalui rawa-rawa", endingBad, 30, 0,
        //     "Ikuti jalur ke barat melalui gua", endingGood, 10, 20
        // );
        
        // // Scene 8 - Kuil Kuno
        // Scene scene8 = new Scene(
        //     "Kamu menemukan sebuah kuil kuno di tengah hutan.\n" +
        //     "Di dalam kuil tampak ada harta karun, tapi dijaga oleh makhluk berbahaya.",
        //     "Lawan penjaga kuil untuk mendapatkan harta", scene9, 20, 40,
        //     "Coba menyelinap masuk saat penjaga tertidur", scene9, 0, 30,
        //     "Tinggalkan kuil dan cari jalan lain", endingBad, 0, 10
        // );
        
        // // Scene 7 - Jembatan Tali
        // Scene scene7 = new Scene(
        //     "Kamu menemukan jembatan tali yang tampak rapuh melintasi jurang yang dalam.\n" +
        //     "Di seberang jurang tampak ada sebuah bangunan tua.",
        //     "Seberangi jembatan dengan hati-hati", scene8, 10, 20,
        //     "Cari jalan lain untuk menyeberang", scene8, 0, 15,
        //     "Kembali dan ambil rute berbeda", endingBad, 0, 5
        // );
        
        // // Scene 6 - Persimpangan
        // Scene scene6 = new Scene(
        //     "Kamu tiba di persimpangan tiga arah.\n" +
        //     "Jalan setapak ke kiri menuju ke lembah, lurus menuju ke perbukitan,\n" +
        //     "dan jalan ke kanan menuju area yang lebih gelap.",
        //     "Ambil jalan ke kiri menuju lembah", scene7, 0, 15,
        //     "Lanjutkan lurus menuju perbukitan", endingBad, 10, 5,
        //     "Ambil jalan ke kanan menuju area gelap", scene8, 15, 25
        // );
        
        // // Scene 5 - Sungai
        // Scene scene5 = new Scene(
        //     "Kamu menemukan sungai dengan air jernih.\n" +
        //     "Di tepi sungai ada perahu kecil yang ditambatkan. Di seberang sungai terlihat jalan setapak.",
        //     "Gunakan perahu untuk menyeberang", scene6, 0, 10,
        //     "Berenang menyeberangi sungai", scene6, 15, 25,
        //     "Cari jalan lain di sepanjang tepi sungai", scene7, 5, 15
        // );
        
        // Scene 4 - Pondok
     Scene scene4 = new Scene(
            "Kamu tiba di padang rumput luas. Di kejauhan tampak beberapa jalur berbeda.\n" +
            "Kamu juga melihat beberapa hewan liar merumput dengan tenang.",
            "Berjalan menyusuri tepi padang rumput", endingBad, 0, 10, null,
            "Ambil jalan pintas melintasi padang rumput", endingGood, 5, 15,null,
            "Beristirahat sejenak dan mengamati sekitar", endingGood, 0, 5,null
        );
        
        // Scene 3 - Padang Rumput
        Scene scene3 = new Scene(
            "Kamu tiba di padang rumput luas. Di kejauhan tampak beberapa jalur berbeda.\n" +
            "Kamu juga melihat beberapa hewan liar merumput dengan tenang.",
            "Berjalan menyusuri tepi padang rumput menggunakan obor", scene4, 0, 10, "Item sedang dipakai",
            "Ambil jalan pintas melintasi padang rumput", endingGood, 5, 15,null,
            "Beristirahat sejenak dan mengamati sekitar", scene4, 0, 5,null
        );
        
        // Scene 2 - Gua
        Scene scene2 = new Scene(
            "Kamu menemukan sebuah gua kecil. Dari dalam terdengar suara aneh.\n" +
            "Di depan gua terdapat beberapa benda yang bisa berguna.",
            "Masuk ke dalam gua untuk menyelidiki", scene3, 10, 20, null,
            "Ambil Item obor yang ada di depan gua", scene3, 0, 10,"Obor",
            "Abaikan gua dan lanjutkan perjalanan", scene3, 5, 5, null
        );
        
        // Scene 1 - Awal Petualangan
        Scene scene1 = new Scene(
            "Kamu terbangun di tengah hutan lebat. Kamu tidak ingat bagaimana bisa sampai di sini.\n" +
            "Di sekitarmu ada tiga jalan setapak berbeda yang bisa kamu ambil.",
            "Ambil jalan setapak ke kiri yang tampak gelap", scene2, 5, 10, null,
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