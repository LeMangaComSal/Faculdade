import static java.lang.System.out;
import java.util.Scanner;

  class teste3 {
      public static void main(String[] args) {
          Scanner teclado = new Scanner (System.in);
          int numero = 0;
          String exec = "exec";
        
          while (exec.equals("exec")) {

          out.print("Subir ou descer?(A/D)");
          String comando = teclado.nextLine();

            if (comando.equalsIgnoreCase("A")) {
              out.println("Seu numero é:" + numero++);
             } else if (comando.equalsIgnoreCase("D")) {
              out.println("Seu numero é:" + numero--);
             } else {
              out.println("Essa opção não existe cara!!");
             }
        }
      }
    }

