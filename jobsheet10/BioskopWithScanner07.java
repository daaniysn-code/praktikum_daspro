import java.util.Scanner;

public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int pilihan;

        while (true) {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            pilihan = sc.nextInt();
            sc.nextLine(); // membersihkan buffer

            if (pilihan == 1) {
                // Input data penonton
                while (true) {
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();

                    int baris, kolom;

                    // Loop untuk memastikan baris & kolom valid DAN kursi kosong
                    while (true) {
                        System.out.print("Masukkan Baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan Kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine(); // membersihkan buffer

                        // Validasi posisi kursi
                        if (baris < 1 || baris > penonton.length || 
                            kolom < 1 || kolom > penonton[0].length) {
                            System.out.println("Nomor baris atau kolom tidak tersedia! Silakan input ulang.");
                        } 
                        // Kursi sudah terisi
                        else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah ditempati oleh " 
                                + penonton[baris - 1][kolom - 1] + ".");
                            System.out.println("Silakan pilih baris dan kolom lain.");
                        } 
                        // Valid dan kosong
                        else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil ditambahkan!");
                            break; // keluar dari loop baris-kolom
                        }
                    }

                    System.out.print("Input penonton lainnya? (ya/tidak): ");
                    String next = sc.nextLine();
                    if (next.equalsIgnoreCase("tidak")) {
                        break;
                    }
                }

            } else if (pilihan == 2) {
                // Tampilkan daftar penonton
                System.out.println("\n=== Daftar Penonton ===");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }

            } else if (pilihan == 3) {
                System.out.println("Terima kasih! Program selesai.");
                break;

            } else {
                System.out.println("Pilihan menu tidak valid! Silakan pilih 1–3.");
            }
        }

        sc.close();
    }
}
