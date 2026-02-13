import static java.lang.System.out;
import java.util.Scanner;


class ass {

    public static void main(String[] args) {
        int[] baguri = new int[10];
        baguri[0] = 1;
        baguri[1] = 3;
        baguri[2] = 5;
        baguri[3] = 7;
        baguri[4] = 9;
        baguri[5] = 11;
        baguri[6] = 13;
        baguri[7] = 15;
        baguri[8] = 17;
        baguri[9] = 19;

        for (int i = 0; i < baguri.length; i++) {
            out.println("Contagem de dois em dois " + baguri[i]);
        }

        out.println("Qual numero manda?");
        Scanner teclado = new Scanner(System.in);
        int comando = teclado.nextInt();
        boolean numero = false;
        for (int i = 0; i < baguri.length; i++) {
            int numeros = baguri[i];
            if (numeros == comando) {
                numero = true;
                break;
            }
        }
            if (numero == true) {
                out.println("Tem");
            } else {
                out.println("Não tem");
            }
            out.println("Acabou!");

    }
}


