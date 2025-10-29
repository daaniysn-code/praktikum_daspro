package jobsheet8;

import java.util.Scanner;

public class Tugas3JB8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, cabang, totPel, totItem, pelanggan, totCabang, item;

        System.out.print("Masukkan jumlah cabang Kafe: ");
        cabang = sc.nextInt();

        totPel = 0;
        totItem = 0;

        System.out.println("\n==== Input Penjualan Setiap Cabang ====");

        for (i = 1; i <= cabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Masukkan jumlah pelanggan: ");
            pelanggan = sc.nextInt();
            totPel += pelanggan;

            totCabang = 0;

            for (j = 1; j <= pelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item: ");
                item = sc.nextInt();
                totCabang += item;
            }
            System.out.println("Cabang " + i + ": " );
            System.out.println("- Pelanggan: " +pelanggan + " orang" );
            System.out.println("- Item terjual: " +totCabang);
            totItem += totCabang;
        }

        System.out.println("\nTotal seluruh cabang: " +cabang + " Cabang");
        System.out.println("Pelanggan " +totPel + " orang");
        System.out.println("Item terjual: " +totItem + " item");
    }
}