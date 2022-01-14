
package basicojava.animal;


public class Peixe extends Animal {
    
    private String característica;

    public Peixe(String nome, float comprimento, int qtdDePatas, String cor, String ambiente, float velocidadeMdia) {
        super(nome, comprimento, qtdDePatas, cor, ambiente, velocidadeMdia);
    }
    
    public Peixe(){
        super();
        
    }

    public String getCaracterística() {
        return característica;
    }

    public void setCaracterística(String característica) {
        this.característica = característica;
    }

    
    public void dadosDosPeixes(){
        System.out.println(super.imprimir() + "Caracteristicas: "+ característica);
    }
}
