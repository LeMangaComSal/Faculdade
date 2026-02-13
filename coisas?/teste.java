
import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

public class teste {

    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroPalpite = 0;
        int numeroAleatorio = new Random().nextInt(10) + 1;

        out.println("Bem vindo ao jogo");
        out.println("Insira um numero de 1 a 10:");
        int numeroEntrada = teclado.nextInt();
        numeroPalpite++;

        while (numeroEntrada != numeroAleatorio) {
            out.println("Você errou");
            out.println("Tente denovo");
            out.print("Insira um numero de 1 a 10:");
            numeroEntrada = teclado.nextInt();
            numeroPalpite++;
        }
        out.print("Você ganhou de ");
        out.println(numeroPalpite + " tentativas");
    }
}
