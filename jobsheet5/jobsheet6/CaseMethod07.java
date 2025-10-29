import java.util.Scanner;

public class CaseMethod07 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        //Input data diri Mahasiswa
        System.out.println("===== INPUT DATA MAHASISWA ====");
        System.out.print("Masukkan Nama Anda: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM Anda: ");
        String NIM = input.nextLine();

        //Input Mata Kuliah pertama
        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS: ");
        int UTS1 = input.nextInt();
        double FixUTS1 = UTS1 * 0.3;
        System.out.print("Nilai UAS: ");
        int UAS1 = input.nextInt();
        double FixUAS1 = UAS1 * 0.4;
        System.out.print("Nilai Tugas: ");
        int Tugas1 = input.nextInt();
        double FixTugas1 = Tugas1 * 0.3;

        //Input Mata Kuliah kedua
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS: ");
        int UTS2 = input.nextInt();
        double FixUTS2 = UTS2 * 0.3;
        System.out.print("Nilai UAS: ");
        int UAS2 = input.nextInt();
        double FixUAS2 = UAS2 * 0.4;
        System.out.print("Nilai Tugas: ");
        int Tugas2 = input.nextInt();
        double FixTugas2 = Tugas2 * 0.3;

        //Menghitung Nilai
        double nilai1 = FixUTS1 + FixUAS1 + FixTugas1;
        double nilai2 = FixUTS2 + FixUAS2 + FixTugas2;
        double rata2 = (nilai1 + nilai2) / 2;

        //Ternary Operator untuk Status Mata Kuliah
        String Status1 = (nilai1 >= 60) ? "LULUS" : "TIDAK LULUS";
        String Status2 = (nilai2 >= 60) ? "LULUS" : "TIDAK LULUS";

        //Konversi nilai menjadi nilai huruf Mata Kuliah 1
        String Grade1 = " ";
        if (nilai1 > 80 && nilai1 <= 100) {
            Grade1 = "A";
        } else if (nilai1 > 73 && nilai1 <= 80) {
            Grade1 = "B+";
        } else if (nilai1 > 65 && nilai1 <= 73) {
            Grade1 = "B";
        } else if (nilai1 > 60 && nilai1 <= 65) {
            Grade1 = "C+";
        } else if (nilai1 > 50 && nilai1 <= 60) {
            Grade1 = "C";
        } else if (nilai1 > 39 && nilai1 <= 50) {
            Grade1 = "D";
        } else if (nilai1 >= 0 && nilai1 <= 39) {
            Grade1 = "E";
        } else {
            System.out.println("!!");
        }

        //Konversi nilai menjadi nilai huruf Mata Kuliah 2
        String Grade2 = " ";
        if (nilai2 > 80 && nilai2 <= 100) {
            Grade2 = "A";
        } else if (nilai2 > 73 && nilai2 <= 80) {
            Grade2 = "B+";
        } else if (nilai2 > 65 && nilai2 <= 73) {
            Grade2 = "B";
        } else if (nilai2 > 60 && nilai2 <= 65) {
            Grade2 = "C+";
        } else if (nilai2 > 50 && nilai2 <= 60) {
            Grade2 = "C";
        } else if (nilai2 > 39 && nilai2 <= 50) {
            Grade2 = "D";
        } else if (nilai2 >= 0 && nilai2 <= 39) {
            Grade2 = "E";
        } else {
            System.out.println("!!");
        }

        //Nested If untuk Status Kelulusan Semester
        String StatusSemester;
        if (nilai1 >= 60 && nilai2 >= 60) {
            if (rata2 >= 70) {
                StatusSemester = "LULUS";
            } else {
                StatusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            StatusSemester = "TIDAK LULUS";
        }
        
        //Output
        System.out.println("\n=============================== HASIL PENILAIAN AKADEMIK ==============================");
        System.out.println("Nama:" + nama);
        System.out.println("NIM:" + NIM);

        System.out.println("\nMata Kuliah \t\tUTS \tUAS \tTugas \tNilai Akhir \tNilai Huruf \tStatus");
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.printf("Algoritma Pemrograman \t%s \t%s \t%s \t%.2f \t\t%s \t\t%s\n", UTS1, UAS1,
                Tugas1, nilai1, Grade1, Status1);
        System.out.printf("Struktur Data \t\t %s \t %s \t %s \t %.2f \t\t%s \t\t%s\n", UTS2, UAS2, Tugas2,
                nilai2, Grade2, Status2);

        System.out.printf("\nRata-rata Nilai Akhir\t: %.2f\n", rata2);
        System.out.println("Status Semester \t: " + StatusSemester);

        input.close();
    }
}