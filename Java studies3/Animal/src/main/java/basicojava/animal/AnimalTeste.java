
package basicojava.animal;

public class AnimalTeste {

    public static void main(String args[]) {
       
       Mamifero mamifero = new Mamifero();
       Peixe tubarao = new Peixe();
       Mamifero ursocanada = new Mamifero();
       
       // caracteristicas tubarao - peixe
       tubarao.setNome("Tubarão");
       tubarao.setComprimento(300);
       tubarao.setQtdDePatas(0);
       tubarao.setCor("Cinzento");
       tubarao.setAmbiente("Mar");
       tubarao.setVelocidadeMdia(2);
       tubarao.setCaracterística("Barbatanas e cauda");
       
       // Caracteristicas mamifero - urso
        ursocanada.setNome("Urso-do-Canadá");
        ursocanada.setComprimento(180);
        ursocanada.setQtdDePatas(4);
        ursocanada.setCor("Vermelha");
        ursocanada.setAmbiente("Terra");
        ursocanada.setVelocidadeMdia(0.5);
        ursocanada.setAlimento("Mel");
        
       // Caracteristicas mamifero - camelo 
        mamifero.setNome("Camelo");
        mamifero.setComprimento(150);
        mamifero.setQtdDePatas(4);
        mamifero.setCor("Amarelo");
        mamifero.setAmbiente("Terra");
        mamifero.setVelocidadeMdia(2);
        mamifero.setAlimento("Cimento");
        
        System.out.println(mamifero.relatorio());
        System.out.println(ursocanada.relatorio());
       
        tubarao.dadosDosPeixes();
    }
}
