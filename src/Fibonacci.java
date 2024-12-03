import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número de termos da série de Fibonacci
        System.out.print("Digite o número de termos da série de Fibonacci: ");
        int n = scanner.nextInt();

        // Calcula a série de Fibonacci
        long fibonacci = 0;
        long anterior = 0;
        long proximo = 1;
        long soma= 0;

        System.out.print("Série de Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci + " ");
            soma += fibonacci;
            fibonacci = anterior + proximo;
            anterior = proximo;
            proximo = fibonacci;
        }
        System.out.println("\nSoma dos primeiros " + n + " números da sequência de Fibonacci: " + soma);

        scanner.close();


    }
}
