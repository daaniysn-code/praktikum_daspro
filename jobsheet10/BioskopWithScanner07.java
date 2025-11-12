import java.util.Scanner;

public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukan Nama: ");
            nama = sc.nextLine();
            System.out.print("Masukan Baris: ");
            baris = sc.nextInt();
            System.out.print("Masukan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (ya/tidak): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("tidak")) {
                break;
            }
        }
    }
}
