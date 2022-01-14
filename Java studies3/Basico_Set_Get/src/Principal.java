import javax.swing.JOptionPane;

public class Principal {
	
	
	public static void main(String[] args){
		
		int numero = 0;
		double saldo = 0;
		int limite = 0;
		double depositar = 0;
		double transferir = 0;
		int i;
		int escolha = 0;
		int choice = 0;
		int quantidade = 0;
		int escolhaDeposito;
		int continua = 0;
		
		// Entrar com a quantidade de cliente
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cliente: "));
		
		// Irá criar uma var conta1 to tipo vet é irá guarda a quantidade definida pelo cliente
		Conta conta1[] = new Conta[quantidade];
		
		
		// irá fazer uma repetição usando a quantidade como base do vetor
		for( i = 0; i < quantidade; i++) {
			
			// Armazena as informações digitada pelo cliente
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: " +(i+1)));
			saldo = Integer.parseInt(JOptionPane.showInputDialog("Digite o saldo atual: "+ (i+1)));
			limite = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite: "+ (i+1)));
			
			choice = Integer.parseInt(JOptionPane.showInputDialog("Deseja fazer o deposito? (1- sim/ 2 - não)"));
			
				if(choice == 1)
					depositar = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do depositar: "+ (i+1)));
			
			//Salva toda informação digitada nas var acima dentro da classe  conta usando um vetor como base
			conta1[i] = new Conta(numero , saldo , limite);
			// Salva o deposito digitado
			conta1[i].depositar(depositar);
		
			// Mostra as informações
			System.out.println("\n" + conta1[i].getInfo());
			
		}

		for(i = 0 ; i < quantidade; i++)
		{
			System.out.println("Escolha a Conta: "+ conta1[i].getNumero());
		}
		
		do
			{
				continua = JOptionPane.showConfirmDialog(null, "Deseja realizar outro deposito: ");
			
				transferir = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da transferencia: "));
				escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha a conta que ira sair o deposito: "));
				escolhaDeposito = Integer.parseInt(JOptionPane.showInputDialog("Escolha a conta que irá receber o deposito: "));
				conta1[escolha].transferir(conta1[escolhaDeposito], transferir);
	
				JOptionPane.showMessageDialog(null, conta1[escolha].getSaldo());
				JOptionPane.showMessageDialog(null, conta1[escolhaDeposito].getSaldo());
			
		}while(continua == JOptionPane.YES_OPTION);
	}
}
