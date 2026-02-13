import static java.lang.System.out;
import java.util.Scanner;

class velocidade {
    static void main() {
        Scanner teclado = new Scanner (System.in);

        double distancia;
        double tempo;

        out.println("Qual a distancia percorrida pelo piloto?");
        distancia = teclado.nextDouble();

        out.println("Qual o tempo do piloto?");
        tempo = teclado.nextDouble();

        double resultado = distancia/tempo;

        out.printf("A velocidade média foi de: 2f%.Km/h", resultado);


    }
}