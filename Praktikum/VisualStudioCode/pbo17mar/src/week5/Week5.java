package week5;

import java.util.Scanner;

class Mahasiswa {
    String name;
    int usia;
    String nim;
    String jurusan;

    void isiData(String name, int usia, String nim, String jurusan) {
        this.name = name;
        this.usia = usia;
        this.nim = nim;
        this.jurusan = jurusan;
    }
    void tampilkanInfo(){
        if (name == null) {
            System.out.println("Belum ada data bos");
        } else {
            System.out.println("\n ====== Data Mahasiswa ======");
            System.out.println("Nama : " + name);
            System.out.println("Usia : " + usia);
            System.out.println("NIM : " + nim);
            System.out.println("Jurusan : " + jurusan);
            System.out.println(" =============================\n");
            
        }
    }
}

// //make inheritence
// class MahasiswaS2 extends Mahasiswa {
//     String judulTA;
//     void isiData(String name, int usia, String nim, String jurusan, String judulTA) {
//         super.isiData(name, usia, nim, jurusan);
//         this.judulTA = judulTA;
//     }
//     void tampilkanInfo(){
//         super.tampilkanInfo();
//         System.out.println("Judul TA : " + judulTA);
//     }
// }

public class Week5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        int pilihan;
        String name, nim, jurusan;
        int usia;
        do {
            System.out.println("Menu");
            System.out.println("1. Input Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Keluar");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama : ");
                    name = input.nextLine();
                    System.out.print("Masukkan Usia : ");
                    usia = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan NIM : ");
                    nim = input.nextLine();
                    System.out.print("Masukkan Jurusan : ");
                    jurusan = input.nextLine();
                    mhs.isiData(name, usia, nim, jurusan);
                    break;
                case 2:
                    mhs.tampilkanInfo();
                    break;
                case 3:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (pilihan != 3);
    }
}