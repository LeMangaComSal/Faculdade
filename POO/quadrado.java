import java.util.Scanner;
import static java.lang.System.out;


public class quadrado {
    static void main() {

        int numero;

        Scanner teclado = new Scanner(System.in);
        out.println("Insira um valor 'X'");
        numero = teclado.nextInt();

        int valor = numero*numero;

        out.println("Resultado é " + valor);

    }

}
