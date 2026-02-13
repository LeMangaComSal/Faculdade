
import static java.lang.System.out;
import java.util.Scanner;

class numero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String exec = "Sim";

        while (exec.equals("Sim")) {
            out.print("Insira um numero:");
            int valor1 = teclado.nextInt();
            teclado.nextLine();

            out.print("Insira outro numero:");
            int valor2 = teclado.nextInt();
            teclado.nextLine();

            if (valor1 > valor2) {
                out.println("O valor 1 é maior | " + valor1);
            } else if (valor1 < valor2) {
                out.println("O valor 2 é maior | " + valor2);
            } else {
                out.println("O valores são iguais | " + valor1);
            }

            out.println("Repetir?");
            exec = teclado.nextLine();
        }
        out.print("Programa encerrado!");

    }

}
