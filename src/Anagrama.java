import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine().toLowerCase();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine().toLowerCase();

        char[] array1 = palavra1.toCharArray();
        char[] array2 = palavra2.toCharArray();

        // Ordena as letras da primeira palavra
        Arrays.sort(array1);

        // Ordena as letras da segunda palavra
        Arrays.sort(array2);

        // Compara as duas arrays
        if (Arrays.equals(array1, array2)) {
            System.out.println("As palavras são anagramas.");
        } else {
            System.out.println("As palavras não são anagramas.");
        }
    }
}
