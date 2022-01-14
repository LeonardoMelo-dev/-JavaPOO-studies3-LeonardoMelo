import javax.swing.*;

public class Abstrato_Interface
{
    public static void main(String[] args)
    {

        Cliente c = new Cliente("Carlos Maia", 88855552, 22122002, "carl@2211");
        Vendedor v = new Vendedor("Luiz Junior", 4553432, 28101990, "Auxiliar de vendas", 532322,12331);
        Gerente g = new Gerente("Kauan F. Martins", 2324433, 23121990, "Gerente geral", 222311,5000);


        JOptionPane.showMessageDialog(null,c+""+v+""+g);
    }
}
