package p1;

import java.util.Scanner;

public class n4ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        while (N < 0) {
            System.out.println("Positivo, por favor.");
            N = sc.nextInt();
        }

        for (int i=1; i<=N; i++) {
            int a = i;
            int b = i * i;
            int c = i * i * i;
            System.out.printf("%d %d %d%n", a, b, c);
        }

        sc.close();
    }
}