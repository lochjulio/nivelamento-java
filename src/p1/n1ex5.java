package p1;

import java.util.Scanner;

public class n1ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod1, qte1, cod2, qte2;
        double valor1, valor2, total;

        System.out.print("Digite o código da primeira peça: ");
        cod1 = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        qte1 = sc.nextInt();
        System.out.print("Digite o valor: ");
        valor1 = sc.nextDouble();

        System.out.print("Digite o código da segunda peça: ");
        cod2 = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        qte2 = sc.nextInt();
        System.out.print("Digite o valor: ");
        valor2 = sc.nextDouble();

        total = qte1 * valor1 + qte2 * valor2;

        System.out.printf("VALOR A PAGAR R$ %.2f%n", total);

        sc.close();
    }
}
