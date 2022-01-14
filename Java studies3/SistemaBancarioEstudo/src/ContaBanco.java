public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private Double saldo;
    private boolean status;
    private double debitosMes;
    private ClienteBanco clienteBanco;
    private EnderecoCliente enderecoCliente;


    public ContaBanco(int numConta, String tipo, String dono, Double saldo, boolean status, ClienteBanco clienteBanco, EnderecoCliente enderecoCliente)
    {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
        this.clienteBanco = clienteBanco;
        this.enderecoCliente = enderecoCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus()
    {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getDebitosMes() {
        return debitosMes;
    }

    public void setDebitosMes(double debitosMes) {
        this.debitosMes = debitosMes;
    }

    public boolean abrirConta(int pergunta)
    {
        if(pergunta == 0)
        {
            if (tipo.equals("CC"))
            {
                saldo = 50d;
            }
            else if (tipo.equals("CP"))
            {
                saldo = 150d;
            }
            status = true;
            System.out.println("Conta aberta com sucesso");
        }
        else
        {
            status = false;
            System.out.println("Conta fechada");
        }

        return status;
    }

    public boolean fecharConta()
    {
        if(saldo == 0 && debitosMes == 0)
        {
            System.out.println("Sua conta foi fechada com sucesso!");
            status = false;
        }
        else if(saldo>0)
        {
            System.out.println("Falha ao fechar a conta, saque todo o valor retante e tente novamente!");
        }
        else
        {
            System.out.println("Falha ao fechar a conta, pague seu debito e tente novamente!");
        }
        return status;
    }

    public Double depositar(double valor)
    {
        if (status==true)
        {
            saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
        }
        else
        {
            System.out.println("A operação falhou pois sua conta se encontra fechada no momento!");
        }

        return saldo;
    }

    public Double sacar(Double valor)
    {
        if(status==true)
        {
            if (saldo >= valor)
            {
                System.out.println("Saque realizado com sucesso!");
                saldo -= valor;
            }
            else
            {
                System.out.println("Saldo o insuficiente");
            }
        }
        else
        {
            System.out.println("Impossivel sacar");
        }
        return saldo;
    }

    public void transferir(ContaBanco outra, double quantidade)
    {
        if(status == true && outra.status == true && saldo>quantidade)
        {
            this.sacar(quantidade);
            outra.depositar(quantidade);
        }
        else
        {
            System.out.println("A trasferencia falhou");
        }
    }

    public Double calcQuantDeve(int contDebitoMes)
    {
        if(contDebitoMes >=1) {
            if (tipo == "CC") {
                debitosMes = contDebitoMes * 12f;
            } else if (tipo == "CP") {
                debitosMes = contDebitoMes * 20f;
            } else {
                System.out.println("Tipo invalido");
            }
        }
        else
        {
            debitosMes = 0;
            System.out.println("Sem nenhum debito pendente");
        }
        return debitosMes;
    }

    public Double pagarMensal(int contDebitoMes)
    {
        if (contDebitoMes > 0 && saldo > 0)
        {
            saldo -= debitosMes;
            System.out.println("Debito pago com sucesso!");
        }
        else if(saldo <= 0)
        {
            System.out.println("O pagamente da mensalidade falhou, saldo insuficiente!");
        }
        else
        {
            System.out.println("O debtito mensal ja foi pago");
        }
        return saldo;
    }

    public String relatorioConta()
    {
        return "\nConta:\nNumero: "+numConta+"\nTipo: "+tipo+"\nDono: "+dono+"\nSaldo: "+saldo+"\nStatus: "+status+"\nCliente: "+clienteBanco.mostrarCliente()+"\n Endereco: "+enderecoCliente.mostrarEndereco();
    }



}
