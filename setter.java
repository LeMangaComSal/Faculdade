public class setter {

    private String nome;
    private int idade;
    private String endereço;
    
    public void setternome (String nome) {
      this.nome = nome.toUpperCase();
    }

    public String getternome (){
        return nome;
    }
      
    public void setteridade (int idade) {
       this.idade = idade;
    }
    public int getteridade (){
        return idade;
    }
    public void setterendereço (String endereço) {
        this.endereço= endereço.toLowerCase();
    }
    public String getterendereço() {
        return endereço;
    }
}   