import java.util.Locale;
import java.util.Scanner;

public class n4ex8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            Double C = sc.nextDouble();
            Double F = 9.0 * C / 5.0 + 32;
            System.out.printf("Em Fahrenhait: %.1f%n", F);
            System.out.print("Deseja repetir? (s/n): ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }
}
