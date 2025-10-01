package jobsheet5;

import java.util.Scanner;

public class nestedUjianSkripsi07 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String pesan;

         System.out.print("Apakah mahasiswa sudah bebas kompen? (YA/TIDAK): ");
         String bebasKompen = sc.nextLine().trim();
         
         System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
         int bimbinganP1 = sc.nextInt();
         System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
         int bimbinganP2 = sc.nextInt();

         if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua Syarat Terpenuhi. Mahasiswa Boleh Mendaftar Ujian Skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log Bimbingan P1 Belum Mencapai 8 Kali dan P2 Kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log Bimbingan P1 Belum Mencapai 8 Kali";
            } else {
                pesan = "Gagal! Log Bimbingan P2 Belum Mencapai 4 kali";
            } 
         } else {
                pesan = "Gagal! Mahasiswa Masih Memiliki Tanggungan Kompen";
            }
        
            System.out.println(pesan);
    }
}