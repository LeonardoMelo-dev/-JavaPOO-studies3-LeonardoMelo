
package basicojava.animal;

public class Mamifero extends Animal {
      
    private String alimento;
    
    public Mamifero(){
        super();
        
    }

    public Mamifero(String nome, float comprimento, int qtdDePatas, String cor, String ambiente, float velocidadeMdia ) {
       super(nome , comprimento , qtdDePatas , cor , ambiente , velocidadeMdia);
        System.out.println("O nome é: ");
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    public String relatorio(){
        return super.imprimir() + "Alimentação: " + alimento + "\n";
    }
}
