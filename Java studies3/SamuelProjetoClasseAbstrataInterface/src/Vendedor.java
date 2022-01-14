public class Vendedor extends Funcionario
{
    public double metaDeVendas;

    public Vendedor(String nome, int cpf, int data, String cargo, int contrato, double metaDeVendas)
    {
        super(nome, cpf, data, cargo, contrato);
        this.metaDeVendas = metaDeVendas;
    }


    public String toString()
    {
        return "\n\nVendedor: "+this.nome+"\ncpf: "+this.cpf+"\nData de nascimento: "+this.data+"\nCardo: "+this.cargo+"\nContrato: "+this.contrato;
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

    public double getMetaDeVendas() {
        return metaDeVendas;
    }

    public void setMetaDeVendas(double metaDeVendas) {
        this.metaDeVendas = metaDeVendas;
    }


}
