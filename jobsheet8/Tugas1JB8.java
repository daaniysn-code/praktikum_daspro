package jobsheet8;

public class Tugas1JB8 {
    public static void main(String[] args) {
        int jumlah;

        for (int n = 1; n<=5; n++){
            jumlah = 0;
            for (int i = 1; i <= n; i++){
                jumlah += i * i;
            }
            System.out.print("n = " + n + " => jumlah kuadrat = ");

            for (int j = 1; j <= n; j++){
                System.out.print(j * j);
                if (j < n){  
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + jumlah);
        }
    }
}
