import java.util.Scanner;

public class NumeroInvertido {
    public static void main(Scanner args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String invertido = new StringBuilder(String.valueOf(numero)).reverse().toString();

        System.out.print("Número invertido: " + invertido);


    }
}
