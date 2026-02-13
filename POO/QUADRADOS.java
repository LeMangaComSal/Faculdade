import java.util.Scanner;
import static java.lang.System.out;

//tenta com Math.pow depois.

public class QUADRADOS {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int qd1;
        int qd2;
        int qd3;

        out.println("Insira um valor:");
        qd1 = teclado.nextInt();

        int valor1 = qd1*qd1;

        out.println("Insira o segundo valor:");
        qd2 = teclado.nextInt();

        int valor2= qd2*qd2;

        out.println("Insira o terceiro valor:");
        qd3 = teclado.nextInt();

        int valor3= qd3*qd3;

        int resultado = valor1 + valor2 + valor3;

        out.println("O valor de " + qd1 + " " + qd2 + " " + qd3 + " é igual a " + resultado );
    }


}
