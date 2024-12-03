import java.util.Scanner;

public class ContadorPalavras {
    public static void main(Scanner args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.trim().split("\\s+");

        System.out.println("Número de palavras: " + palavras.length);

    }
}
