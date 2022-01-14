
public class Conta {
	
	private int numero;
	private double saldo;
	private double limite;
	
	
	public Conta(int numero , double saldo , double limite)
	{
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	void depositar(double valor)
	{
		saldo = saldo + valor;
		
	}
	
	
	void sacar ( double valor)
	{
		saldo = saldo - valor;
	}
	
	public int getNumero()
	{
		return this.numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getLimite()
	{
		return limite;
	}
	
	public void transferir(Conta outra, double valor)
	{
		this.sacar(valor);
		outra.depositar(valor);;
	}
	
	public String getInfo()
	{
		return "Conta numero: "+this.numero+"\nO saldo é: "+ getSaldo()+"\nLimite da conta é: "+getLimite();
	}
}
