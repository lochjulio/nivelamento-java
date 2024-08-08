import java.util.Scanner;

public class n2ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Cachorro Quente - R$ 4,00");
        System.out.println("2. X-Salada - R$ 4,50");
        System.out.println("3. X-Bacon - R$ 5,00");
        System.out.println("4. Torrada - R$ 2,00");
        System.out.println("5. Refrigerante - R$ 1,50");

        int cod = sc.nextInt();
        int qte = sc.nextInt();
        double total = 0;

        if (cod == 1) {
            total = qte * 4.00;
        }
        else if (cod == 2) {
            total = qte * 4.50;
        }
        else if (cod == 3) {
            total = qte * 5.00;
        }
        else if (cod == 4) {
            total = qte * 2.00;
        }
        else if (cod == 5) {
            total = qte * 1.50;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}