
import static java.lang.System.out;

class Indentificador {

    public static void main(String[] args) {
        ingresso nomePessoa = new ingresso();
        ingresso idadePessoa = new ingresso();

        nomePessoa.setternome("João");
        idadePessoa.setteridade(15);

        if (idadePessoa.getteridade() >= 18) {
            out.println("Pode ver bebas");
            out.println(nomePessoa.getternome());
        } else if (idadePessoa.getteridade() < 18) {
            out.println("Nem vem que não tem mane");
            out.println(nomePessoa.getternome());
        }
    }

}
