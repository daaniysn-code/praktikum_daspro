package jobsheet8;

import java.util.Scanner;

public class Triangle07 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);

        int n, j, i = 1;

        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();

        while (i <= n) {
            j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}