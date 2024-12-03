import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        do {
            System.out.println("\n=== Menu de Exercícios ===");
            System.out.println("1. Calculadora Simples");
            System.out.println("2. Verificação de Palíndromos");
            System.out.println("3. Sequência de Fibonacci");
            System.out.println("4. Inversão de Número");
            System.out.println("5. Verificação de Anagramas");
            System.out.println("6. Jogo de Adivinhação");
            System.out.println("7. Contador de Palavras");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                escolha = scanner.nextInt();
                scanner.nextLine(); // Consome a quebra de linha restante

                switch (escolha) {
                    case 1:
                        CalculadoraSimples.main(null, scanner);
                        break;
                    case 2:
                        Palindromo.main(scanner);
                        break;
                    case 3:
                        Fibonacci.main(scanner);
                        break;
                    case 4:
                        NumeroInvertido.main(scanner);
                        break;
                    case 5:
                        Anagrama.main(scanner);
                        break;
                    case 6:
                        JogoAdivinhacao.main(scanner);
                        break;
                    case 7:
                        ContadorPalavras.main(scanner);
                        break;
                    case 0:
                        System.out.println("Saindo... Obrigado por usar o programa!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); // Limpa a entrada inválida
            }
        } while (escolha != 0);

        scanner.close();
    }
}
