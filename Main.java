import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos (N): ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("O valor de N deve ser maior que zero hein.");
            scanner.close();
            return;
        }

        long termo1 = 0;
        long termo2 = 1;

        System.out.print("Sequência: ");

        for (int i = 1; i <= num; i++) {

            System.out.print(
                    termo1 + (i == num ? "" : ", ")
            );

            long proximoTermo = termo1 + termo2;

            termo1 = termo2;
            termo2 = proximoTermo;
        }

        scanner.close();
    }
}