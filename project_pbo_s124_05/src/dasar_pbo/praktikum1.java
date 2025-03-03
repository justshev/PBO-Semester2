package dasar_pbo;

import java.util.Scanner;

public class praktikum1 {
public static void main(String[] args) throws Exception {
       int index;
       for(index = 0; index < 10; index++){
           System.out.println("Hello World! " + index);
       }
       Scanner input = new Scanner(System.in);
       String kat = "",nama="";
       int nilai;
         System.out.print("Masukkan nama anda : ");
            nama = input.nextLine();
            System.out.print("Masukkan nilai anda : ");
            nilai = input.nextInt();
      if (nilai >= 85){
        kat = "anda lulus";
      } else {
        kat = "anda tidak lulus";
      }
      System.out.println("==================================");
      System.out.println("Nama : " + nama + "\nNilai : " + nilai + "\nKeterangan : " + kat);
      System.out.println("==================================");

    }
}
