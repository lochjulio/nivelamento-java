import java.util.Scanner;

public class n2ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        if (A % B == 0 | B % A == 0) {
            System.out.println("Múltiplos");
        }

        else {
            System.out.println("Não Múltiplos");
        }

        sc.close();
    }
}
