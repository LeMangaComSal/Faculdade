
import static java.lang.System.out;
import java.util.Scanner;


class Tempo {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int hora;
        int minuto;

        out.println("Coloque a hora");
        hora = teclado.nextInt();
        out.println("Coloque os minutos");
        minuto = teclado.nextInt();

        int resultado = hora*60+minuto;

        out.printf("A conversão de %dh%d, para minutos é %d minutos", hora, minuto, resultado);

    }
}