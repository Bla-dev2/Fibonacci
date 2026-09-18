import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de termos (N): ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("O valor de N deve ser maior que zero hein.");
            scanner.close();
            return;
        }

        long term1 = 0;
        long term2 = 1;

        System.out.print("Sequência: ");
        for (int i = 1; i <= num; i++) {
            System.out.print(term1 + (i == num ? "" : ", "));
            long proximoTermo = term1 + term2;
            term1 = term2;
            term2 = proximoTermo;
        }

        scanner.close();
    }
}