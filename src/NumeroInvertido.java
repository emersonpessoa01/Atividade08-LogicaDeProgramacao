import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String invertido = new StringBuilder(String.valueOf(numero)).reverse().toString();

        System.out.println("Número invertido: " + invertido);

        scanner.close();  // Fecha o scanner
    }
}
