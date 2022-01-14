public class ClienteBanco {
    private String nome;
    private int CPF;
    private int idade;

    public ClienteBanco(String nome, int CPF, int idade)
    {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String mostrarCliente()
    {
        return "\nNome do cliente: "+nome+"\nCPF: "+CPF+"\nidade: "+idade;
    }
}
