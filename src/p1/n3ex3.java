package p1;

import java.util.Scanner;

public class n3ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool  = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Fim");
        System.out.print("Digite seu código: ");

        int cod = sc.nextInt();

        while (cod != 4) {
            if (cod == 1) {
                alcool = alcool + 1;
            } else if (cod == 2) {
                gasolina = gasolina + 1;
            } else if (cod == 3) {
                diesel = diesel + 1;
            }

            cod = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
