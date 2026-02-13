import static java.lang.System.out;

class getter {
    
      public static void main(String[] args) {
          setter nome = new setter();
          setter idade = new setter();
          setter endereço = new setter();
        
          nome.setternome("paminondas");
          idade.setteridade(47);
          endereço.setterendereço("AQUELA RUA LA OHHHH");

          out.println (nome.getternome());
          out.println (idade.getteridade());
          out.println (endereço.getterendereço());
      }
}