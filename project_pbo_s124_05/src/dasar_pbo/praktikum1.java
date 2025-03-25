package dasar_pbo;

import java.util.Scanner;

public class praktikum1 {
public static void main(String[] args) throws Exception {
      

      Scanner input2 = new Scanner(System.in);
      String nameUser = "" , nomorKTP = "" , noTelp = "" , tempatTujuan = "" , waktuBerangkat = "" , nomorBus = "" ,kodeTiket="";
      System.out.print("Masukkan nama anda : ");
      nameUser = input2.nextLine();
      System.out.print("Masukkan nomor KTP anda : ");
      nomorKTP = input2.nextLine();
      System.out.print("Masukkan nomor telepon anda : ");
      noTelp = input2.nextLine();
      System.out.print("Masukkan tempat tujuan anda : ");
      tempatTujuan = input2.nextLine();
      System.out.print("Masukkan waktu berangkat : ");
      waktuBerangkat = input2.nextLine();
      System.out.print("Masukkan kode tiket bus : ");
      kodeTiket = input2.nextLine();
      System.out.print("Masukkan nomor bus : ");
      nomorBus = input2.nextLine();
   
      System.out.println("==================================");

if (tempatTujuan.equals("A") && waktuBerangkat.equals("Pagi") ){
  System.out.println("Nama : " + nameUser + "\nNomor KTP : " + nomorKTP + "\nNomor Telepon : " + noTelp + "\nTempat Tujuan : " + tempatTujuan + "\nWaktu Berangkat : " + waktuBerangkat + "\nNomor Bus : " + nomorBus);
  System.out.println("==================================");

  if (kodeTiket.equals("A")){
    System.out.println("Harga Tiket : " + 100000);
    System.out.println("Pajak 11% jadi totalnya " + 100000 * 0.11 + "total bayar" + 100000 * 0.11 + 100000);
  } else if (kodeTiket.equals("B")){ {
    System.out.println("Harga Tiket : " + 200000);
    System.out.println("Pajak 11% jadi totalnya " + 200000 * 0.11 + "total bayar" + 200000 * 0.11 + 200000);
  }}

} else if (tempatTujuan.equals("B") ){
  System.out.println("Nama : " + nameUser + "\nNomor KTP : " + nomorKTP + "\nNomor Telepon : " + noTelp + "\nTempat Tujuan : " + tempatTujuan + "\nWaktu Berangkat : " + waktuBerangkat + "\nNomor Bus : " + nomorBus);
  if (kodeTiket.equals("A")){
    System.out.println("Harga Tiket : " + 500000);
    System.out.println("Pajak 11% jadi totalnya " + (500000 * 0.11) + "total bayar "+ (500000 * 0.11 + 500000));
  } else if (kodeTiket.equals("B")){ {
    System.out.println("Harga Tiket : " + 550000);
    System.out.println("Pajak 11% jadi totalnya " + (500000 * 0.11) + "total bayar "+ (500000 * 0.11 + 500000));
  }

} else if (tempatTujuan.equals("C") ){
  System.out.println("Nama : " + nameUser + "\nNomor KTP : " + nomorKTP + "\nNomor Telepon : " + noTelp + "\nTempat Tujuan : " + tempatTujuan + "\nWaktu Berangkat : " + waktuBerangkat + "\nNomor Bus : " + nomorBus);
  if (kodeTiket.equals("A")){
    System.out.println("Harga Tiket : " + 700000);
    System.out.println("Pajak 11% jadi totalnya " + (700000 * 0.11) + "total bayar "+ (700000 * 0.11 + 700000));
  } else if (kodeTiket.equals("B")){ {
    System.out.println("Harga Tiket : " + 750000);
    System.out.println("Pajak 11% jadi totalnya " + (750000 * 0.11) + "total bayar "+ (750000 * 0.11 + 750000));
  }
}  else if (tempatTujuan.equals("D") ){
  System.out.println("Nama : " + nameUser + "\nNomor KTP : " + nomorKTP + "\nNomor Telepon : " + noTelp + "\nTempat Tujuan : " + tempatTujuan + "\nWaktu Berangkat : " + waktuBerangkat + "\nNomor Bus : " + nomorBus);
  if (kodeTiket.equals("A")){
    System.out.println("Harga Tiket : " + 900000);
    System.out.println("Pajak 11% jadi totalnya " + (900000 * 0.11) + "total bayar "+ (900000 * 0.11 + 900000));
  } else if (kodeTiket.equals("B")){ {
    System.out.println("Harga Tiket : " + 950000);
    System.out.println("Pajak 11% jadi totalnya " + (950000 * 0.11 )+ "total bayar "+ (950000 * 0.11 + 950000));
  }
}
else {
  System.out.println("Maaf, data yang anda masukkan salah");
}

    
    }
} } }}
