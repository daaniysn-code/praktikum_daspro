package jobsheet8;

import java.util.Scanner;

public class NilaiKelompok7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, nilai, kelompokTertinggi = 0;
        float totalNilai, rataNilai, maxRata = 0;

        System.out.println("==== Program Penilaian Tugas Kelompok ====");
        System.out.println("Terdapat 6 kelompok dalam 1 kelas");
        System.out.println("Setiap kelompok akan dinilai oleh 5 kelompok lainnya!");
        System.out.println("Silahkan masukkan nilai dengan rentan 1 - 100.\n");

        i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai dari kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai Kelompok" + i + "= " + rataNilai);

            if (rataNilai > maxRata) {
                maxRata = rataNilai;
                kelompokTertinggi = i;
            }
            i++;
        }

        System.out.println("\nKelompok dengan rata-rata tertinggi adalah Kelompok: " + kelompokTertinggi);
        System.out.println("Dengan rata-rata nilai: " + maxRata);
    }
}