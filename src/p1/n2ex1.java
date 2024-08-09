package p1;

import java.util.Scanner;

public class n2ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N<0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("POSITIVO");
        }

        sc.close();
    }
}
