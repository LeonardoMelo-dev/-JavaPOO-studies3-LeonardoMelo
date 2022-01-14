import javax.swing.JOptionPane;
import java.util.ArrayList;

public class SistemaBancario {
    public static void main(String[] args)
    {
        int numConta;
        String tipo;
        String dono;
        Double saldo = 0d;
        boolean status = false;

        ArrayList<ClienteBanco> arrayClientebanco = new ArrayList<ClienteBanco>();
        ArrayList<EnderecoCliente> enderecoClienteArrayList = new ArrayList<EnderecoCliente>();
        ArrayList<ContaBanco> arrayContaBanco = new  ArrayList<ContaBanco>();

        int i;
        int pergunta;
        int continua = JOptionPane.YES_OPTION;
        int escolha;
        int escolhaOP;
        int escolhaContaTrasferencia;
        int escolhaAbrir;
        double quantidade;
        int contDebitoMes=0;

        String nome;
        int CPF;
        int idade;

        String rua;
        String cidade;
        String estado;


        for(i=0; continua == JOptionPane.YES_OPTION; i++) {

            continua = JOptionPane.showConfirmDialog(null, "Deseja criar uma nova conta: ");
            if(continua == JOptionPane.YES_OPTION) {
                numConta = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta: "));
                escolha = JOptionPane.showConfirmDialog(null, "Deseja criar uma conta corrente? ('Yes' para corrente ou 'No' para poupança)");
                if (escolha == JOptionPane.YES_OPTION) {
                    tipo = "CC";
                    System.out.println("Tipo escolhido: Conta corrente");
                }
                else {
                    tipo = "CP";
                    System.out.println("Tipo escolhido: Conta poupança");
                }

                dono = JOptionPane.showInputDialog("Dono da conta: ");
                nome = JOptionPane.showInputDialog("Nome do cliente: ");
                CPF = Integer.parseInt(JOptionPane.showInputDialog("CPF do Cliente: "));
                idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do cliente: "));

                ClienteBanco clienteBanco = new ClienteBanco(nome, CPF, idade);
                arrayClientebanco.add(clienteBanco);

                rua = JOptionPane.showInputDialog("Rua: ");
                cidade = JOptionPane.showInputDialog("Cidede: ");
                estado = JOptionPane.showInputDialog("Estado: ");

                EnderecoCliente enderecoCliente = new EnderecoCliente(rua, cidade ,estado);
                enderecoClienteArrayList.add(enderecoCliente);

                ContaBanco contaBanco = new ContaBanco(numConta, tipo, dono, saldo, status, clienteBanco, enderecoCliente);
                arrayContaBanco.add(contaBanco);
                pergunta = JOptionPane.showConfirmDialog(null, "Deseja abrir a conta?");
                arrayContaBanco.get(i).abrirConta(pergunta);
                JOptionPane.showMessageDialog(null, arrayContaBanco.get(i).relatorioConta());


            }
            else {
                System.out.println("Operação finalizada!");
            }
        }

        do {
            continua = JOptionPane.showConfirmDialog(null, "Deseja acessar uma conta?");
            if(continua == JOptionPane.YES_OPTION) {
                escolha = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da conta a acessar?"));
                for (i = 0; i < arrayContaBanco.size(); i++) {
                    if (escolha == arrayContaBanco.get(i).getNumConta()) {
                        if (arrayContaBanco.get(i).getStatus() == true) {
                            JOptionPane.showMessageDialog(null, "Bem vindo " + arrayContaBanco.get(i).getDono(), "Conta acessada com sucesso", JOptionPane.INFORMATION_MESSAGE);
                            contDebitoMes++;
                            JOptionPane.showMessageDialog(null, "Sua conta está com um debito mensal de: " + arrayContaBanco.get(i).calcQuantDeve(contDebitoMes) + "R$");
                            do {
                                escolhaOP = Integer.parseInt(JOptionPane.showInputDialog("Qual operação deseja realizar?\n1) depositar     4) verificar saldo\n2) sacar            5)Fechar Conta\n3) transferir     6) Pagar mensalidade\n0) Sair da conta"));
                                if(escolhaOP == 1) {
                                    quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade que deseja depositar: "));
                                    arrayContaBanco.get(i).depositar(quantidade);
                                }
                                else if(escolhaOP == 2) {
                                    quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade que deseja sacar: "));
                                    arrayContaBanco.get(i).sacar(quantidade);
                                }
                                else if(escolhaOP == 3) {
                                    quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade que deseja trasferir: "));
                                    escolhaContaTrasferencia = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta que recebera o deposito: "));
                                    for (int j = 0; j < arrayContaBanco.size(); j++) {
                                        if (arrayContaBanco.get(j).getNumConta() == escolhaContaTrasferencia) {
                                            arrayContaBanco.get(i).transferir(arrayContaBanco.get(j), quantidade);
                                        } else {

                                        }
                                    }
                                }
                                else if(escolhaOP == 4) {
                                    JOptionPane.showMessageDialog(null, "Seu saldo é de " + arrayContaBanco.get(i).getSaldo());
                                }
                                else if(escolhaOP == 5) {
                                    arrayContaBanco.get(i).fecharConta();
                                }

                                else if(escolhaOP == 6) {
                                    arrayContaBanco.get(i).pagarMensal(contDebitoMes);
                                    contDebitoMes = 0;
                                    arrayContaBanco.get(i).calcQuantDeve(contDebitoMes);
                                }
                            } while (escolhaOP != 0);
                        }
                        else {
                            escolhaAbrir = JOptionPane.showConfirmDialog(null, "Esta conta se encontrar fechada deseja abrila?");
                            arrayContaBanco.get(i).abrirConta(escolhaAbrir);
                        }
                    }
                    else {
                        System.out.println("Porcurando...");
                    }
                }
            }
            else {
                System.out.println("Operação finalizada");
            }

        }while (continua == JOptionPane.YES_OPTION);

    }
}