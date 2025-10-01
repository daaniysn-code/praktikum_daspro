package jobsheet5;
import java.util.Scanner;
public class TUGAS3_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Pengguna WIFI : ");
        String pengguna = sc.nextLine();

        if (pengguna.equalsIgnoreCase("dosen")) {
            System.out.println("AKSES DIBERIKAN!");
        } else if (pengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.print("MASUKAN JUMLAH SKS ANDA : ");
            int sks = sc.nextInt();
            if (sks >= 12) {
                System.out.println("AKSES DIBERIKAN!");
            }else{
                System.out.println("AKSES DITOLAK!");
            }
        } 
    }
}