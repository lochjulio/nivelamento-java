import java.util.Scanner;

public class n2ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio, fim;
        int duracao;

        inicio = sc.nextInt();
        fim = sc.nextInt();

        if (inicio < fim) {
            duracao = fim - inicio;
        }
        else {
            duracao = 24 - inicio + fim;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
