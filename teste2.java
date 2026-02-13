
import static java.lang.System.out;
import java.util.Scanner;

class teste2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String repeat = "Sim";
        while (repeat.equals("Sim")) {
            out.print("Somar ou subtrair?");
            String comando = teclado.nextLine();

            int numero1;
            int numero2;

            if (comando.equalsIgnoreCase("Somar")) {
                out.print("Primeiro numero:");
                numero1 = teclado.nextInt();

                out.print("Segundo numero:");
                numero2 = teclado.nextInt();

                teclado.nextLine();

                int soma = numero1 + numero2;

                out.println("A soma de " + numero1 + " + " + numero2 + " é igual a: " + soma);
            } else if (comando.equalsIgnoreCase("Subtrair")) {
                out.print("Primeiro numero:");
                numero1 = teclado.nextInt();

                out.print("Segundo numero:");
                numero2 = teclado.nextInt();

                teclado.nextLine();

                int sub = numero1 - numero2;

                out.println("A subtração de " + numero1 + " - " + numero2 + " é igual a: " + sub);
            } else {
                out.println("Não tem essa opção");
            }

            out.println("Repetir?");
            repeat = teclado.nextLine();

        }
        out.print("Programa encerrado!");
    }
}
