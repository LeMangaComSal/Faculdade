import java.util.Scanner;
import static java.lang.System.out;

class exerciciodemulaveia1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        String exec = "Sim";

        while (exec.equals("Sim")) {
            out.println("Fala o valor:");
        double valor = teclado.nextDouble();
        teclado.nextLine();


        if (valor >= 0 && valor <= 25) {
            out.println("Intervalo [0 , 25] ");
        } else if (valor > 25 && valor <= 50) {
            out.println("Intervalo (25 , 50]");
        } else if (valor > 50 && valor <= 75) {
            out.println("Intervalo (50, 75]");
        } else if (valor > 75 && valor <= 100) {
            out.println("Intervalo (75 , 100]");
        } else {
            out.println("Esse valor não existe");
        }
        out.println("Repetir?(Sim/Não)");
        exec = teclado.nextLine();
    }
    out.println("Programa encerrado!!");
    }
}
