import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(50) + 1;
        int palpite;

        System.out.println("Tente adivinhar o número entre 1 e 50!");

        while(true) {
            System.out.println("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if(palpite == numeroSecreto){
                System.out.println("Parabéns! Você acertou!");
                break;
            }else{
                System.out.println("Errooooouu! Tente novamente...");
            }
        }

        scanner.close();
    }
}
