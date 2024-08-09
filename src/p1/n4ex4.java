package p1;

import java.util.Scanner;

public class n4ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //qte

        for (int i=0; i<N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b == 0) {
                System.out.println("Divisão impossivel");
            }
            else {
                double resultado = (double) a / b;
                System.out.printf("%.1f%n", resultado);
            }
        }

        sc.close();
    }
}