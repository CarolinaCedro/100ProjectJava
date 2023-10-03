
import java.util.Random;
import java.util.Scanner;

public class Adivinha {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int tentativas = 0;
        int numeroGerado = 1;
        boolean acertou = false;

        numeroGerado = random.nextInt(100);

        while (!acertou) {
            System.out.println("Entre com um numero: ");
            int palpite = sc.nextInt();
            if (palpite == numeroGerado) {
                System.out.println("Você acerto !!! o numero gerado foi => " + numeroGerado);
                acertou = true;
            } else if (palpite < numeroGerado) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
            tentativas++;
        }

    }
}
