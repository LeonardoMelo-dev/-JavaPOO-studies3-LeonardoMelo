
package basicojava.animal;


public class Animal {
    private String nome;
    private float comprimento ;
    private int qtdDePatas;
    private String cor;
    private String ambiente;
    private double velocidadeMdia;
    
    public Animal(){
        
    }

     public Animal(String nome, float comprimento, int qtdDePatas, String cor, String ambiente, double velocidadeMdia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.qtdDePatas = qtdDePatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMdia = velocidadeMdia;
    }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getQtdDePatas() {
        return qtdDePatas;
    }

    public void setQtdDePatas(int qtdDePatas) {
        this.qtdDePatas = qtdDePatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidadeMdia() {
        return velocidadeMdia;
    }

    public void setVelocidadeMdia(double velocidadeMdia) {
        this.velocidadeMdia = velocidadeMdia;
    }
    
    public String  imprimir(){
        return "Nome: " + nome + "\nComprimento: " + comprimento + " cm " +"\nPatas: "+ qtdDePatas + 
                "\nCor: " + cor + "\nAmbiente: " + ambiente + "\nVelocidade: " + velocidadeMdia + " m/s\n";
    }
}
