

public class Calculo {

	private String nome;
	public int idade;
	
//	public Calculo(String nome, int idade)
//	{
//		this.nome = nome;
//		this.idade = idade;
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade()
	{
		return idade;
	}
	
	public void setIdade(int idade)
	{
		this.idade = idade;
	}
	
	public void getInfo()
	{
		System.out.println("O nome �: " + getNome() + "\nIdade: " + getIdade());
	}
}
