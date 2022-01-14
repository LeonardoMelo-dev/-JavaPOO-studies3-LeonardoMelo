public abstract class Funcionario implements Pessoa
{
    public String nome;
    public int cpf;
    public int data;
    public String cargo;
    public int contrato;

    public Funcionario (String nome, int cpf, int data, String cargo, int contrato)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
        this.cargo = cargo;
        this.contrato = contrato;
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

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
