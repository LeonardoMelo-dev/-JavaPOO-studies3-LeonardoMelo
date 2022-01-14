import javax.swing.*;
import javax.swing.JOptionPane;

public class AtividadeHeranca
{
    public static void main(String args[])
    {

        Mamifero mamifero = new Mamifero();
        Peixe tubarao = new Peixe();
        Mamifero ursocanada = new Mamifero();

        //Camelo
        mamifero.setNome("Camelo");
        mamifero.setComprimento(150);
        mamifero.setNumeroPatas(4);
        mamifero.setCor("Amarelo");
        mamifero.setAmbiente("Terra");
        mamifero.setVelocidadeMedia(2);
        //Tubarão
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setNumeroPatas(0);
        tubarao.setCor("Cinzento");
        tubarao.setAmbiente("Mar");
        tubarao.setVelocidadeMedia(1.5f);
        tubarao.setCaracteristica("Barbatanas e cauda");
        //Urso
        ursocanada.setNome("Urso-do-Canadá");
        ursocanada.setComprimento(180);
        ursocanada.setNumeroPatas(4);
        ursocanada.setCor("Vermelho");
        ursocanada.setAmbiente("Terra");
        ursocanada.setVelocidadeMedia(0.5f);
        ursocanada.setAlimento("Mel");
        //Imprimindo Informações
        mamifero.dados();
        tubarao.dadosPeixe();
        ursocanada.dadosMamifero();


    }
}
