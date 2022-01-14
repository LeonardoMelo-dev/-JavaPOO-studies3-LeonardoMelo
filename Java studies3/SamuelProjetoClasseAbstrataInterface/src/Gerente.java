public class Gerente extends Funcionario
{

    private double bonusSalarial;

    public Gerente(String nome, int cpf, int data, String cargo, int contrato, double bonusSalarial)
    {
        super(nome, cpf, data, cargo, contrato);
        this.bonusSalarial = bonusSalarial;
    }

    public String toString()
    {
        return "\n\nGerente: "+this.nome+"\ncpf: "+this.cpf+"\nData de nascimento: "+this.data+"\nCardo: "+this.cargo+"\nBonusSalarial: "+this.contrato;
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

    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }
}
