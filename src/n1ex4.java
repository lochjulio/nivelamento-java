import java.util.Scanner;

public class n1ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, hrs;
        double valor, salario;

        System.out.print("Digite seu numero: ");
        num = sc.nextInt();
        System.out.print("Digite seu número de horas trabalhadas: ");
        hrs = sc.nextInt();
        System.out.print("Digite o valor que recebe por hora: ");
        valor = sc.nextDouble();

        salario = hrs * valor;

        System.out.println("NÚMERO = " + num);
        System.out.printf("SALÁRIO = R$ %.2f%n", salario);

        sc.close();
    }
}
