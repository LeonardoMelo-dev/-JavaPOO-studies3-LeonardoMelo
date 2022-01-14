public class Cliente implements Pessoa
{
    public String nome;
    public int cpf;
    public int data;
    public String contaCliente;



    public Cliente(String nome, int cpf, int data, String contaCliente)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
        this.contaCliente = contaCliente;
    }

    public String toString()
    {
        return "\n\nCliente: "+this.nome+"\ncpf: "+this.cpf+"\nData de nascimento: "+this.data+"\nConta do cliente: "+this.contaCliente;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getData() {
        return data;
    }

    @Override
    public void setData(int data) {
        this.data = data;
    }

    public String getContaCliente() {
        return contaCliente;
    }

    public void setContaCliente(String contaCliente) {
        this.contaCliente = contaCliente;
    }
}
